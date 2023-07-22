public class CalculateArea {
    static double PI = 3.14;
    double radius;

    public CalculateArea(double radius){
        this.radius = radius;
    }

    public static double calculateArea(double radius)
    {
        double area = PI * radius *radius;
        return area;

    }

   /* public double calculateArea(double radius)
    {
        double area = PI*radius;
        return area;
    }*/

    public static void main(String[] args) {
       // CalculateArea c1= new CalculateArea();
     //  System.out.println(c1.calculateArea(10));
        System.out.println(calculateArea(10));
    }

}
