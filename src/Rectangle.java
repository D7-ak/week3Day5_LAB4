public class Rectangle extends Shape{
    private double width;
    private double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return height*width;
    }

    @Override
    public double calculateCircumference() {
        return 2*(height+width);
    }

    @Override
    public String toString() {
         String area = String.format("%.2f",calculateArea());
         String perimeter = String.format("%.2f",calculateCircumference());
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area='" + area + '\'' +
                ", perimeter='" + perimeter + '\'' +
                '}';
    }
}
