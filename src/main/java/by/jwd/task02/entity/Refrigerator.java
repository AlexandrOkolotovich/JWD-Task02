package by.jwd.task02.entity;

public class Refrigerator implements Appliance{
    private String powerConsumption;
    private String weight;
    private String freezerCapacity;
    private String overallCapacity;
    private String height;
    private String width;

    public Refrigerator() {
    }

    public Refrigerator(String powerConsumption, String weight, String freezerCapacity, String overallCapacity, String height, String width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(String freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public String getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(String overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Refrigerator that = (Refrigerator) o;

        if (!powerConsumption.equals(that.powerConsumption)) return false;
        if (!weight.equals(that.weight)) return false;
        if (!freezerCapacity.equals(that.freezerCapacity)) return false;
        if (!overallCapacity.equals(that.overallCapacity)) return false;
        if (!height.equals(that.height)) return false;
        return width.equals(that.width);
    }

    @Override
    public int hashCode() {
        int result = powerConsumption.hashCode();
        result = 31 * result + weight.hashCode();
        result = 31 * result + freezerCapacity.hashCode();
        result = 31 * result + overallCapacity.hashCode();
        result = 31 * result + height.hashCode();
        result = 31 * result + width.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", weight='" + weight + '\'' +
                ", freezerCapacity='" + freezerCapacity + '\'' +
                ", overallCapacity='" + overallCapacity + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                '}';
    }
}
