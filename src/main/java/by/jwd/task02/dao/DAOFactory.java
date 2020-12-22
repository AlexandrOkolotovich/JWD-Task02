package by.jwd.task02.dao;

import by.jwd.task02.dao.impl.ApplianceDAOImpl;

public class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();
    private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

    private DAOFactory(){}

    public ApplianceDAO getApplianceDAO(){
        return applianceDAO;
    }

    public static DAOFactory getInstance(){
        return instance;
    }
}
