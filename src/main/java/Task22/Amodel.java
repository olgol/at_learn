package Task22;

public abstract class Amodel {
    Double length, width, height;

    public abstract void setLength(double length);
    public abstract void setWidth(double width);
    public abstract void setHeight(double height);

    public double getVolume_size() {
        return this.length * this.width * this.height;
    }

    public double getSurface_size() {
        return 2 * (this.length * this.width + this.width * this.height + this.height * this.length);
    }

}
