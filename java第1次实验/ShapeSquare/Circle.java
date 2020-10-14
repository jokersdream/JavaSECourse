public class Circle {
    private double radio;
    
    public Circle(double radioin){
        radio = radioin;
    }
    
    public void setRadio(double radioin){
        radio = radioin;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public double getArea(){
        return (radio * Math.PI * radio);
    }
}
