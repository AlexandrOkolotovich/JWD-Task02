package by.jwd.task02.entity;

public class VacuumCleaner implements Appliance{
    private String powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private String motorSpeedRegulation;
    private String cleaningWidth;

    public VacuumCleaner() {
    }

    public VacuumCleaner(String powerConsumption, String filterType, String bagType, String wandType, String motorSpeedRegulation, String cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public String getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(String motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public String getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(String cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VacuumCleaner that = (VacuumCleaner) o;

        if (!powerConsumption.equals(that.powerConsumption)) return false;
        if (!filterType.equals(that.filterType)) return false;
        if (!bagType.equals(that.bagType)) return false;
        if (!wandType.equals(that.wandType)) return false;
        if (!motorSpeedRegulation.equals(that.motorSpeedRegulation)) return false;
        return cleaningWidth.equals(that.cleaningWidth);
    }

    @Override
    public int hashCode() {
        int result = powerConsumption.hashCode();
        result = 31 * result + filterType.hashCode();
        result = 31 * result + bagType.hashCode();
        result = 31 * result + wandType.hashCode();
        result = 31 * result + motorSpeedRegulation.hashCode();
        result = 31 * result + cleaningWidth.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation='" + motorSpeedRegulation + '\'' +
                ", cleaningWidth='" + cleaningWidth + '\'' +
                '}';
    }
}
