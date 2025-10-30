public class Circle extends Shape{

    private double radius;
    private final double pi = Math.PI;


    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return pi*(radius*radius);
    }

    @Override
    public double calculateCircumference() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
         String area = String.format("%.2f",calculateArea());
         String Circumference = String.format("%.2f",calculateCircumference());
        return "Circle{" +
                "radius=" + radius +
                ", area='" + area + '\'' +
                ", Circumference='" + Circumference + '\'' +
                '}';
    }
}
