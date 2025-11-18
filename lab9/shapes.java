class Shape{
    public void area(){
    }
    public void perimeter(){
    }
}

class circle extends Shape{
    double r;
    public circle(double r){
        this.r = r;
    }
    public void area(){
        System.out.println("circle area" + " - " + 3.14 * (r * r));
    }
    public void perimeter(){
        System.out.println("circle perimeter" + " - " + 2 * 3.14 * r);
    }
}

class rectangle extends Shape{
    double a;
    double b;
    public rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    public void area(){
        System.out.println("rectangle area" + " - " + a * b);
    }
    public void perimeter(){
        System.out.println("rectangle perimeter" + " - " + (a + b) * 2);
    }
}

class square extends rectangle{
    public square(double a){
        super(a, a);
    }
}

class triangle extends Shape{
    double a;
    double b;
    double c;
    public triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void area(){
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        System.out.println("triangle area" + " - " + s);
    }
    public void perimeter(){
        System.out.println("triangle perimeter" + " - " + (a + b + c));
    }
}

class ellipse extends Shape{
    double a;
    double b;
    public ellipse(double a, double b){
        this.a = a;
        this.b = b;
    }
    public void area(){
        System.out.println("ellipse area" + " - " + 3.14 * a * b);
    }
    public void perimeter(){
        double p = 3.14 * (3*(a+b) - Math.sqrt((3*a+b)*(a+3*b)));
        System.out.println("ellipse perimeter" + " - " + p);
    }
}

class lab{
    public static void main(String[] args){
        circle c = new circle(5);
        c.area();
        c.perimeter();

        rectangle r = new rectangle(4, 6);
        r.area();
        r.perimeter();

        square s = new square(5);
        s.area();
        s.perimeter();

        triangle t = new triangle(3, 4, 5);
        t.area();
        t.perimeter();

        ellipse e = new ellipse(4, 3);
        e.area();
        e.perimeter();
    }
}
