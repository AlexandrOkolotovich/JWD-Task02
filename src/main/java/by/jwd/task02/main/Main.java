package by.jwd.task02.main;

import by.jwd.task02.entity.Appliance;
import by.jwd.task02.entity.Oven;
import by.jwd.task02.entity.Speakers;
import by.jwd.task02.entity.TabletPC;
import by.jwd.task02.entity.criteria.Criteria;
import by.jwd.task02.entity.criteria.SearchCriteria;
import by.jwd.task02.output.PrintApplianceInfo;
import by.jwd.task02.service.ApplianceService;
import by.jwd.task02.service.ServiceFactory;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List <Appliance> appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        Criteria criteriaSpeakers = new Criteria(Speakers.class.getSimpleName());       //Speakers
        criteriaSpeakers.add(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString(), 2);

        appliance = service.find(criteriaSpeakers);

        PrintApplianceInfo.print(appliance);

        criteriaSpeakers = new Criteria(Criteria.class.getSimpleName());
        criteriaSpeakers.add(SearchCriteria.Speakers.CORD_LENGTH.toString(), 3);
        criteriaSpeakers.add(SearchCriteria.Speakers.FREQUENCY_RANGE.toString(), 3-4);
        criteriaSpeakers.add(SearchCriteria.Speakers.POWER_CONSUMPTION.toString(), 20);

        appliance = service.find(criteriaSpeakers);

        PrintApplianceInfo.print(appliance);

        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());           //Oven
        criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 33);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

        criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 40);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

    }
}
