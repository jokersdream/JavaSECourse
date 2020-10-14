
public class Trapezoid {
    private double height;
    private double upperbase;
    private double bottom;
    
    public Trapezoid(double height_, double upperbase_, double bottom_){
        height = height_;
        upperbase = upperbase_;
        bottom = bottom_;
    }
    
    public void setHeight(double height_){
        height = height_;
    }
    public double getHeight(){
        return height;
    }
    
    public void setUpperbase(double upperbase_){
        upperbase = upperbase_;
    }
    public double getUpperbase(){
        return upperbase;
    }
    
    public void setBottom(double bottom_){
        bottom = bottom_;
    }
    public double getBottom(){
        return bottom;
    }
    
    public double getArea(){
        return ((upperbase + bottom) * height / 2);
    }
}
