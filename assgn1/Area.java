public class Area {
    final double pi = 3.14;
    double area;

    public Area(int l, int b) {
        this.area = l * b;
        System.out.println("Area of rectangle: " + this.area);
    }

    public Area(int r) {
        this.area = pi * r * r;
        System.out.println("Area of square is: " + this.area);
    }

    public static void main(String[] args){
        Area a = new Area(5,8);
        System.out.println(a.area);
        Area ar = new Area(4);
        System.out.println(ar.area);
    }
}