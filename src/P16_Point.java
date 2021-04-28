import java.awt.*;

public class P16_Point {

    int x, y;

    // constructor with no argmnt
    public P16_Point() {

    }

    //constructor with two argument
    public P16_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 4 methods created

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

// Methods with return value(Polymorphysum sub type method overloading)

    public double distance() {
        return Math.sqrt((0 - this.getX()) * (0 - this.getX()) + ((0 - this.getY()) * (0 - this.getY())));
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.getX()) * (x - this.getX()) + ((y - this.getY()) * (y - this.getY())));
    }

    public double distance(P16_Point another) {
        return Math.sqrt((another.getX()) * (another.getX()) + ((another.getY()) * (another.getY())));
    }

// main method

    public static void main(String[] args) {
        P16_Point first = new P16_Point(6, 5);
        P16_Point second = new P16_Point(3, 1);
        System.out.println("distance (0,0)= " + first.distance());
        System.out.println("distance (another)= " + first.distance(second));
        System.out.println("distance (2,2)= " + first.distance(2, 2));
        P16_Point point = new P16_Point();
        System.out.println(("distance()= " + point.distance()));
    }
}













