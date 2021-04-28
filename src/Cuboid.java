
//inheritance method
// child class of Rectangle
// rectangel,cuboid , mainpool area

public class Cuboid extends Rectangle{// calling parent class
    double height;
// method with return value
    public double getHeight(){
        return height;
    }
// conductor with argument
    public Cuboid(double width,double length,double height){

        super(width, length);// calling parent class conductor with parameters
        if(height<0){
            this.height=0;

        }else {
            this.height=height;
        }

    }

    public double getVolume(){
        double voulme = height * super.getArea();
        return voulme;
    }
}
