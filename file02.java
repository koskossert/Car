import java.util.Scanner;

public class Main {

    public static void main(String[] args) {// так включаются программы,
        // просто запомнить
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        sc.close();
        System.out.println("Квадрат числа:" + (a * a));

    }
}