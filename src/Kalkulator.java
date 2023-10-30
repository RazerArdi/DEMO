import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        num1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        num2 = scanner.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        double hasil;
        switch(operator) {
            case '+':
                hasil = num1 + num2; //PTambah
                break;
            case '-':
                hasil = num1 - num2; //Pkurang
                break;
            case '*':
                hasil = num1 * num2; //PKali
                break;
            case '/':
                hasil = num1 / num2; //PBagi
                break;
            default:
                System.out.printf("Operator %c tidak valid.", operator);
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + hasil);
    }
}
