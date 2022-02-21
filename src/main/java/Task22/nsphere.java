package Task22;

class Nsphere extends Amodel {
    private static double nradius;

    public double getVolume_size() {
        return 4 / 3 * Math.PI * (this.length * this.width * this.height);
    }

    public double getSurface_size() {
        return 4 * Math.PI * Math.pow(Math.cbrt(this.length * this.width * this.height), 2);
    }

    public static void main(String[] args) {

        nradius = 50;

        Nsphere nsphere = new Nsphere();
        nsphere.setHeight(nradius);
        nsphere.setLength(nradius);
        nsphere.setWidth(nradius);

        System.out.printf("Обьем шара = %s ", nsphere.getVolume_size());
        System.out.printf("Площадь поверхности шара = %s ", nsphere.getSurface_size());

    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }
}
