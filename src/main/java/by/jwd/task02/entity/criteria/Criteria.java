package by.jwd.task02.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {
    private String groupSearchName;
    private Map<String, Object> criteria = new HashMap<String, Object>();

    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    public String getGroupSearchName() {
        return groupSearchName;
    }

    public void setGroupSearchName(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    public Map<String, Object> getCriteria() {
        return criteria;
    }

    public void setCriteria(Map<String, Object> criteria) {
        this.criteria = criteria;
    }

    public void add(String searchCriteria, Object object){
        criteria.put(searchCriteria, object);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Criteria criteria1 = (Criteria) o;

        if (!groupSearchName.equals(criteria1.groupSearchName)) return false;
        return criteria.equals(criteria1.criteria);
    }

    @Override
    public int hashCode() {
        int result = groupSearchName.hashCode();
        result = 31 * result + criteria.hashCode();
        return result;
    }
}
