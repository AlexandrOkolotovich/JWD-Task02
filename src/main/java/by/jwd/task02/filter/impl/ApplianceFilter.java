package by.jwd.task02.filter.impl;

import by.jwd.task02.builder.parser.ApplianceParser;
import by.jwd.task02.entity.criteria.Criteria;
import by.jwd.task02.filter.FilterOfAllDevices;

import java.util.*;

public class ApplianceFilter implements FilterOfAllDevices {
    public List<String> applianceData;

    public ApplianceFilter(List<String> applianceData) {
        this.applianceData = applianceData;
    }

    @Override
    public List<String> filter(Criteria criteria) {

        List<String> filteredApplianceData = new ArrayList<String>();
        Iterator<String> iterator = applianceData.iterator();

        while (iterator.hasNext()) {
            String appliance = iterator.next();

            if (containsAllCriteriaAppliance(appliance, criteria.getCriteria())) {
                filteredApplianceData.add(appliance);
            }
        }

        return filteredApplianceData;
    }

    public boolean containsAllCriteriaAppliance(String appliance, Map<String, Object> criteriaApplianceData) {

        Map<String, String> optionApplianceDate = new HashMap<String, String>();
        final String TYPE_OPTION_SPLIT = " : ";
        String[] typeAndOptionAppliance = appliance.split(TYPE_OPTION_SPLIT);
        String optionAppliance = typeAndOptionAppliance[1];

        ApplianceParser applianceParser = new ApplianceParser();
        optionApplianceDate = applianceParser.parse(optionAppliance);

        Set<String> nameCriteria = criteriaApplianceData.keySet();
        int counter = 0;

        for (String name : nameCriteria) {

            String valueCriteria = criteriaApplianceData.get(name).toString();

            if (valueCriteria.equals(optionApplianceDate.get(name))) {
                counter++;
            }
        }

        return counter == criteriaApplianceData.size();
    }

}
