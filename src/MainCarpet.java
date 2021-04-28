
//Floor , carpet and calculator and main :4 classes
// method overriding
/// method overridding run time polymorphisum
public class MainCarpet {

        public static void main(String[] args) {

            Carpet carpet = new Carpet(3.5);
            Floor floor = new Floor(2.75,4.0);

            Calculator calculator = new Calculator(floor,carpet);
            System.out.println("total=" +calculator.getTotalCost());
            carpet = new Carpet(1.5);
            floor = new Floor(5.4,4.5);
            calculator = new Calculator(floor,carpet);
            System.out.println("total" + calculator.getTotalCost());
        }
    }

