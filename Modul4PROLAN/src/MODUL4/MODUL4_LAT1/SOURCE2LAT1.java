package MODUL4.MODUL4_LAT1;
import java.util.Scanner;

public class SOURCE2LAT1 {
    public void squareRootOperation(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        double sqrtInput = scanner.nextDouble();
        double sqrtResult = Math.sqrt(sqrtInput);
        System.out.println("Hasil akar kuadrat dari " + sqrtInput + " adalah " + sqrtResult);
    }

    public void powerOperation(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        double base = scanner.nextDouble();
        System.out.print("Masukkan pangkat: ");
        double exponent = scanner.nextDouble();
        double powResult = Math.pow(base, exponent);
        System.out.println(base + " pangkat " + exponent + " adalah " + powResult);
    }

    public void logarithmOperation(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        double logInput = scanner.nextDouble();
        double logResult = Math.log(logInput);
        System.out.println("Logaritma natural dari " + logInput + " adalah " + logResult);
    }

    public void factorialOperation(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        int factInput = scanner.nextInt();
        long factResult = factorial(factInput);
        System.out.println("Faktorial dari " + factInput + " adalah " + factResult);
    }

    private long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
