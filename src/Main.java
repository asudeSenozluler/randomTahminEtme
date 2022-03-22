import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random(100);

        try (Scanner scanner = new Scanner(System.in)) {
            int number = (int) (Math.random() * 100) + 1;
            int tahmin=0;
            while (number !=tahmin ) {

                System.out.println("Bir sayı girin: ");
                tahmin = scanner.nextInt();
                if (tahmin > number) {
                    System.out.println("DAHA KÜÇÜK BİR SAYI GİRİN...");
                } else if (tahmin < number) {
                    System.out.println("DAHA BÜYÜK BİR SAYI GİRİN...");
                }
                else
                System.out.println("!!TEBRİKLER!!.............");

               


                // write your code here
            }
        }
    }
}

