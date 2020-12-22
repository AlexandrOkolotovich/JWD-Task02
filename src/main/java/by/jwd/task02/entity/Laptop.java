package by.jwd.task02.entity;

import java.util.Objects;

public class Laptop implements Appliance{
    private String batteryCapacity;
    private String os;
    private String memoryRom;
    private String systemMemory;
    private String cpu;
    private String displayInchs;

    public Laptop() {
        super();
    }

    public Laptop(String batteryCapacity, String os, String memoryRom, String systemMemory, String cpu, String displayInchs) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInchs = displayInchs;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(String memoryRom) {
        this.memoryRom = memoryRom;
    }

    public String getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(String systemMemory) {
        this.systemMemory = systemMemory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(String displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;

        if (!batteryCapacity.equals(laptop.batteryCapacity)) return false;
        if (!os.equals(laptop.os)) return false;
        if (!memoryRom.equals(laptop.memoryRom)) return false;
        if (!systemMemory.equals(laptop.systemMemory)) return false;
        if (!cpu.equals(laptop.cpu)) return false;
        return displayInchs.equals(laptop.displayInchs);
    }

    @Override
    public int hashCode() {
        int result = batteryCapacity.hashCode();
        result = 31 * result + os.hashCode();
        result = 31 * result + memoryRom.hashCode();
        result = 31 * result + systemMemory.hashCode();
        result = 31 * result + cpu.hashCode();
        result = 31 * result + displayInchs.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity='" + batteryCapacity + '\'' +
                ", os='" + os + '\'' +
                ", memoryRom='" + memoryRom + '\'' +
                ", systemMemory='" + systemMemory + '\'' +
                ", cpu='" + cpu + '\'' +
                ", displayInchs='" + displayInchs + '\'' +
                '}';
    }
}
