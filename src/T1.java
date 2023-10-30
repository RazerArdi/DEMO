import java.util.Scanner;

public class T1 {

    public static void main(String[] args) {
        int pil;

        System.out.println("Pilih");
        System.out.println("1. 3,2,1\n2. 1 + 1");
        Scanner scan = new Scanner(System.in);
        pil = scan.nextInt();

        if (pil == 1) {
            for (int i = 0; i < 2; i++) {
                System.out.println(":");
            }
        } else if (pil == 2) {
            System.out.println(1 + 1);
        } else {
            System.out.println("Salah");
        }
    }
}

