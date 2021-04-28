
// single inheritance
// child class of circle
public class Cylinder extends Circle {
    double height;
    public Cylinder(double radius,double height){
        super(radius);// calling parent class contructor with key word super
        if(height<0){
            this.height=0;
        }
        else
            this.height=height;
    }
// method with return type
    public double getHeight() {
        return height;
    }
//
    public double getVolume(){
        double volume = super.getArea()*height;// calling parent class method with keyword super
        return volume;
    }
}
