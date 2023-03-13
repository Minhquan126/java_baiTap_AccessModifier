package circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("Nhap ban kinh");
        double radius = scanner.nextDouble();
        circle.setRadius(radius);

        System.out.println(circle.getArea());
    }
}
