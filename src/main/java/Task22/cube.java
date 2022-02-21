package Task22;

class Cube extends Parallelepiped {

    public static void main(String[] args)  {

        double size = 20;

        Cube cube = new Cube();
        cube.setHeight(size);
        cube.setWidth(size);
        cube.setLength(size);

        System.out.printf("Обьем куба = %s",cube.getVolume_size());
        System.out.printf("Площадь поверхности куба = %s", cube.getSurface_size());

    }

}
