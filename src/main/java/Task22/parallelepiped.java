package Task22;

class Parallelepiped extends Amodel {
    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }

    @Override
    public void setHeight() {

    }

    public double getVolume_size() {
        return this.length * this.width * this.height;
    };

    public double getSurface_size(){
        return 2*(this.length * this.width + this.width* this.height + this.height* this.length );
    };

    public static void main (String[] args) {


        Parallelepiped parallelepiped = new Parallelepiped();
        parallelepiped.setHeight();
        parallelepiped.setLength();
        parallelepiped.setWidth();


        }


    }


