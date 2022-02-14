public class main {
    public static void main(String[] args) {
        Circle testC = new Circle();
        System.out.println(testC);
        testC = new Circle(1,"red");
        System.out.println(testC);

        Cylinder testc = new Cylinder();
        System.out.println(testc);
        testc = new Cylinder(1,5,"blue");
        System.out.println(testc);
    }
}
