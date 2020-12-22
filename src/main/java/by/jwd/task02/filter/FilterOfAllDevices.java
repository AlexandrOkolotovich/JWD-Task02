package by.jwd.task02.filter;

import by.jwd.task02.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface FilterOfAllDevices {
    public List<String> filter(Criteria criteria) throws IOException;
}
