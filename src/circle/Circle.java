package circle;

public class Circle {
    private double radius = 1;
    private String color = "red";
    public static double area;


    public Circle(double radius) {
        this.radius = radius;
    }
public Circle () {
}
    private double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setArea() {
        area = radius*Math.pow(radius,2)*Math.PI;
    }
    public static double getArea() {
        return area;
    }

}
