

public class Main {

    public static void main(String[] args) {
        // write your code here
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3, "red");
        circles[1] = new Circle(7, "violet");
        circles[2] = new Circle(9, "purple");
        System.out.println("Trước Resize: ");
        for (Circle circle : circles) {
            System.out.println("Diện tích cũ là: "+circle.getArea());
        }

        System.out.println("Sau Resize: ");
        for (Circle circle : circles) {
            circle.resize();
        }

    }
}
