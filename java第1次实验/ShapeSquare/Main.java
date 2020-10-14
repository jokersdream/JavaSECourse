
public class Main {
    public static void main(String args[]) {
        Circle cir = new Circle(10);
        Trapezoid tra = new Trapezoid(5, 4, 6);
        
        System.out.println("Now we have a Circle with "+ cir.getRadio()+" radios");
        System.out.println("And a Trapezoid with "+tra.getHeight()+" heights, "+tra.getUpperbase()+" upperbases, "+tra.getBottom()+" bottoms");
        
        System.out.println("A little caculate:");
        System.out.println("cir's area = "+cir.getArea());
        System.out.println("tra's area = "+tra.getArea());
    }
}
