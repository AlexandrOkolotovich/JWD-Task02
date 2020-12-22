package by.jwd.task02.dao;

import by.jwd.task02.entity.Appliance;
import by.jwd.task02.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceDAO {
    List<Appliance> find(Criteria criteria) throws IOException;
}
