class Circle {

    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getLength(){
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    // write methods here
}