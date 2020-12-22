package by.jwd.task02.dao.impl;

import by.jwd.task02.builder.ApplianceBuilder;
import by.jwd.task02.dao.ApplianceDAO;
import by.jwd.task02.entity.Appliance;
import by.jwd.task02.entity.criteria.Criteria;
import by.jwd.task02.filter.impl.ApplianceFilter;
import by.jwd.task02.reader.impl.ApplianceReader;

import java.io.IOException;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    public List<Appliance> find(Criteria criteria) throws IOException {

        String pathToBD = "resources/appliances_db.txt";

        ApplianceReader applianceReader = new ApplianceReader(pathToBD);
        List<String> applianceData;

        if (criteria.getGroupSearchName()==null) {
            applianceData = applianceReader.takeAll();
        } else {
            applianceData = applianceReader.take(criteria.getGroupSearchName());
        }

        ApplianceFilter applianceFilter = new ApplianceFilter (applianceData);
        List <String> filteredApplianceData = applianceFilter.filter (criteria);

        ApplianceBuilder applianceBuilder = new ApplianceBuilder();
        List <Appliance> appliances = applianceBuilder.build(filteredApplianceData);


        return appliances;

    }
}
