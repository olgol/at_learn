package Task22;

class Nsphere extends Amodel {

    @Override
    public void setLength() {
        this.length = length;
    }

    @Override
    public void setWidth() {
        this.width = width;
    }

    @Override
    public void setHeight() {
        this.height = height;
    }

    public double getVolume_size(double volume_size) {
        volume_size = 4 / 3 * Math.PI * (this.length * this.width * this.height);
        return volume_size;
    }

    public double getSurface_size(double surface_size) {
        surface_size = 4 * Math.PI * Math.pow(Math.cbrt(this.length * this.width * this.height), 2);
        return surface_size;
    }


    public static void main(String[] args) {

        Nsphere nsphere = new Nsphere();
        nsphere.setHeight();
        nsphere.setLength();
        nsphere.setWidth();

    }

}
