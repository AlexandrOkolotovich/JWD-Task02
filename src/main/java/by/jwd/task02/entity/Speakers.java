package by.jwd.task02.entity;

public class Speakers implements Appliance{
    private String powerConsumption;
    private String numberOfSpeakers;
    private String frequencyRange;
    private String cordLength;

    public Speakers() {
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(String numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public String getCordLength() {
        return cordLength;
    }

    public void setCordLength(String cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Speakers speakers = (Speakers) o;

        if (!powerConsumption.equals(speakers.powerConsumption)) return false;
        if (!numberOfSpeakers.equals(speakers.numberOfSpeakers)) return false;
        if (!frequencyRange.equals(speakers.frequencyRange)) return false;
        return cordLength.equals(speakers.cordLength);
    }

    @Override
    public int hashCode() {
        int result = powerConsumption.hashCode();
        result = 31 * result + numberOfSpeakers.hashCode();
        result = 31 * result + frequencyRange.hashCode();
        result = 31 * result + cordLength.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", numberOfSpeakers='" + numberOfSpeakers + '\'' +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength='" + cordLength + '\'' +
                '}';
    }
}
