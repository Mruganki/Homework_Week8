
// method overridding run time polymorphisum
//Floor , carpet and calculator and main 4 class
public class Carpet {

    double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return this.cost;
    }
}
