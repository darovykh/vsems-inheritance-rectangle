import java.util.Objects;

public class Monitor extends Rectangle {

    private int frequency;
    private int resolution;

    public Monitor() {
    }

    public Monitor(int length, int width, int frequency, int resolution) {
        super(length, width);
        this.frequency = frequency;
        this.resolution = resolution;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return frequency == monitor.frequency && resolution == monitor.resolution;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), frequency, resolution);
    }

    public int getFramesPerHour(){
        return this.frequency * 60 * 60;
    }

    public int getDotsOnMonitor() {
        return this.getArea() * resolution;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "frequency=" + frequency +
                ", resolution=" + resolution +
                '}';
    }
    
}
