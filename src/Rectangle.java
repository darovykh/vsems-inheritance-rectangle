import java.util.Objects;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return length == rectangle.length && width == rectangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    public int getArea(){
        return this.getLength() * this.getWidth();
    }

    public int getPerimetr(){
        return 2 * (this.getLength() + this.getWidth());
    }

    public double getDiagonal(){
        return Math.sqrt(this.getLength() * this.getLength()+ this.getWidth() * this.getWidth());
    }

    public double getRadiusOfCircumscribedCircle() {
        return Math.sqrt(this.getLength() * this.getLength()+ this.getWidth() * this.getWidth())/2;
    }

    public boolean isSquare() {
        return this.getLength() == this.getWidth();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

}
