abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}


class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter(){
            return  a + b + c;
    }

    @Override
    double getArea() {
        double s = getPerimeter()/2.0;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}


class Rectangle extends Shape {
    double a;
    double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return 2.0 * (a + b);
    }

    @Override
    double getArea() {
        return a * b;
    }
}


class Circle extends Shape {
    double r;
    public Circle(double r){
        this.r = r;
    }

    @Override
    double getArea() {
        return Math.PI * r * r;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * r;
    }
}


