package by.jwd.task02.entity;

public class TabletPC implements Appliance{
    private String batteryCapacity;
    private String displayInches;
    private String memoryRom;
    private String flashMemoryCapacity;
    private String color;

    public TabletPC() {
    }

    public TabletPC(String batteryCapacity, String displayInches, String memoryRom, String flashMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(String displayInches) {
        this.displayInches = displayInches;
    }

    public String getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(String memoryRom) {
        this.memoryRom = memoryRom;
    }

    public String getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(String flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TabletPC tabletPC = (TabletPC) o;

        if (!batteryCapacity.equals(tabletPC.batteryCapacity)) return false;
        if (!displayInches.equals(tabletPC.displayInches)) return false;
        if (!memoryRom.equals(tabletPC.memoryRom)) return false;
        if (!flashMemoryCapacity.equals(tabletPC.flashMemoryCapacity)) return false;
        return color.equals(tabletPC.color);
    }

    @Override
    public int hashCode() {
        int result = batteryCapacity.hashCode();
        result = 31 * result + displayInches.hashCode();
        result = 31 * result + memoryRom.hashCode();
        result = 31 * result + flashMemoryCapacity.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }


}
