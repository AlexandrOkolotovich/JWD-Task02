package by.jwd.task02.reader;

import java.io.IOException;
import java.util.List;

public interface ReaderOfAllDevices {
    public List<String> takeAll() throws IOException;
}
