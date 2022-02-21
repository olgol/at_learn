package Task22;

class Parallelepiped extends Amodel {

    public static void main(String[] args) {

        Parallelepiped parallelepiped = new Parallelepiped();

        parallelepiped.setHeight(10);
        parallelepiped.setLength(10);
        parallelepiped.setWidth(10);

        System.out.printf("Обьем параллелипипеда = %s",parallelepiped.getVolume_size());
        System.out.printf("Площадь поверхности параллелипипеда = %s", parallelepiped.getSurface_size());

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


