// floor, carpet & calculator method over riding example
///Floor , carpet and calculator and main :4 classes
public class Calculator {
// define variable by class name
    Floor floor;
    Carpet carpet;
// constructor
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
// method with retun type (calling mehtods from diffrent classes)
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }



}
