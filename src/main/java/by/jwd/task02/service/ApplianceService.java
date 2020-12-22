package by.jwd.task02.service;

import by.jwd.task02.entity.Appliance;
import by.jwd.task02.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceService {
    List<Appliance> find(Criteria criteria) throws IOException;
}
