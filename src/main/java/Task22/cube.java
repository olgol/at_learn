package Task22;

class Cube extends Parallelepiped {
    @Override
    public double getVolume_size() {
        return this.length * this.width * this.height;
    };

    @Override
    public double getSurface_size(){
        return 2*(this.length * this.width + this.width* this.height + this.height* this.length );
    };

    public static void main(String[] args) {

        double size;

        Cube cube = new Cube();
        cube.setHeight();
        cube.setWidth();
        cube.setLength();

    }

}
