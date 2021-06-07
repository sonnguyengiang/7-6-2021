import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float weight;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều cao");
        height = scanner.nextFloat();

        System.out.println("nhập chiều rộng");
        weight = scanner.nextFloat();

        float area = weight * height;
        System.out.println("Diện tích là: " + area);
    }
}
