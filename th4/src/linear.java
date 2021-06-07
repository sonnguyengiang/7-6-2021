import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("phương trình có dạng a.x + b = c");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a = ");
        double a = scanner.nextDouble();

        System.out.println("b = ");
        double b = scanner.nextDouble();

        System.out.println("c = ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("đáp án là \n", answer);
        }
        else {
            if (b == c) {
                System.out.println("Có vô số nghiệm");
            }
            else {
                System.out.println("không có nghiệm nào");
            }
        }
    }
}
