package by.jwd.task02.entity;

import java.util.Objects;

public class Oven implements Appliance{
    private String powerConsumption;
    private String weight;
    private String capacity;
    private String depth;
    private String height;
    private String width;

    public Oven() {
    }

    public Oven(String powerConsumption, String weight, String capacity, String depth, String height, String width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
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

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
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

        Oven oven = (Oven) o;

        if (!powerConsumption.equals(oven.powerConsumption)) return false;
        if (!weight.equals(oven.weight)) return false;
        if (!capacity.equals(oven.capacity)) return false;
        if (!depth.equals(oven.depth)) return false;
        if (!height.equals(oven.height)) return false;
        return width.equals(oven.width);
    }

    @Override
    public int hashCode() {
        int result = powerConsumption.hashCode();
        result = 31 * result + weight.hashCode();
        result = 31 * result + capacity.hashCode();
        result = 31 * result + depth.hashCode();
        result = 31 * result + height.hashCode();
        result = 31 * result + width.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", weight='" + weight + '\'' +
                ", capacity='" + capacity + '\'' +
                ", depth='" + depth + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                '}';
    }
}
