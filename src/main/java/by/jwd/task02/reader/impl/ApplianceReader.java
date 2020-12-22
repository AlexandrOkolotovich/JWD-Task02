package by.jwd.task02.reader.impl;

import by.jwd.task02.reader.ReaderOfAllDevices;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ApplianceReader implements ReaderOfAllDevices {
    public final File file;

    public ApplianceReader(String pathFile) {
        file = new File(pathFile);
    }

    public List<String> take(String nameGroupAppliance) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<String> applianceData = new ArrayList<String>();
        String appliance = null;

        while ((appliance = reader.readLine()) != null) {
            if (appliance.contains(nameGroupAppliance)) {
                applianceData.add(appliance);
            }
        }

        reader.close();
        return applianceData;
    }

    public List<String> takeAll() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<String> applianceData = new ArrayList<String>();
        String appliance = null;

        while ((appliance = reader.readLine()) != null) {
            if (!appliance.isEmpty()) {
                applianceData.add(appliance);
            }
        }

        reader.close();
        return applianceData;
    }
}
