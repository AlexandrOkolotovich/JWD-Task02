package by.jwd.task02.builder.parser;

import java.util.HashMap;
import java.util.Map;

public class ApplianceParser {
    public Map<String, String> parse (String optionAppliance) {

        Map <String, String> valueOptionAppliance = new HashMap<String, String>();
        final String COMMA = ", ";
        final String EQUAL_SIGN = "=";
        String[] optionsAppliance = optionAppliance.split(COMMA);

        for (String option : optionsAppliance) {
            String[] nameAndValueOption = option.split(EQUAL_SIGN);
            String nameOption = nameAndValueOption[0];
            String valueOption = nameAndValueOption[1];
            valueOptionAppliance.put(nameOption, valueOption);
        }

        return valueOptionAppliance;

    }
}
