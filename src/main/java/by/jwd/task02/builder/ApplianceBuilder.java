package by.jwd.task02.builder;

import by.jwd.task02.builder.parser.ApplianceParser;
import by.jwd.task02.entity.Appliance;
import by.jwd.task02.entity.factory.ApplianceFactory;

import java.util.*;

public class ApplianceBuilder {
    public List<Appliance> build(List<String> filteredApplianceData) {

        List<Appliance> appliances = new ArrayList<Appliance>();

        ApplianceParser applianceParser = new ApplianceParser();
        Map<String, String> valueOptionAppliance = new HashMap<String, String>();
        ApplianceFactory applianceFactory = new ApplianceFactory();

        Appliance appliance;
        final String COLON = " : ";

        Iterator<String> iterator = filteredApplianceData.listIterator();
        String applianceData = null;

        while (iterator.hasNext()) {

            applianceData = iterator.next();

            String[] typeAndOptionAppliance = applianceData.split(COLON);
            String typeAppliance = typeAndOptionAppliance[0];
            String optionAppliance = typeAndOptionAppliance[1];

            valueOptionAppliance = applianceParser.parse(optionAppliance);
            appliance = applianceFactory.createAppliance(typeAppliance, valueOptionAppliance);
            appliances.add(appliance);

        }
        return appliances;
    }
}
