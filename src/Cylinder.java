public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
    }
    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return 2 * Math.PI * getRadius() *(getRadius() + height);
    }
    @Override
    public String toString(){
        return "The cylinder's radius = "
                + getRadius()
                + ", height = "
                + height
                + ", color: "
                + getColor()
                + ", area = "
                + getArea();
    }
}
