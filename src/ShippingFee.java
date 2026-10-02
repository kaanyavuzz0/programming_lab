import java.util.Scanner;

public class ShippingFee {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the service type (1- Standard, 2- Express, 3-Same-day)");
        int serviceType = inp.nextInt();
        int pricePerKg= 0;
        int billedKg = 0;
        int fee;
        if (serviceType == 1 || serviceType ==2 || serviceType ==3) {
            System.out.println("enter the package weight in grams: ");
            int grams = inp.nextInt();

            if (serviceType == 1){
                pricePerKg = 10;
            }
            else if (serviceType== 2) {
                pricePerKg = 16;
            }
            else if (serviceType == 3) {
                pricePerKg = 24;
            }
            // kg yuvarlama 1000 e böl kalan varsa 1 arttır.
            if (grams %1000 != 0) {
                billedKg = grams / 1000 + 1;
                System.out.println("billed weight: " + billedKg);
            }
            else {
                billedKg = grams /1000;
                System.out.println("billed weight: " + billedKg);
            }
        }
        else {
            System.out.println("Invalid service type.");
        }
        if (billedKg <= 2) {
            fee = (2 * pricePerKg);
            System.out.println("Fee: " + fee);
        }
        else if (billedKg >=3 && billedKg <= 10) {
            fee = (billedKg * pricePerKg);
            System.out.println("Fee: " + fee);
        }
        else {
            fee = 10 * pricePerKg + (billedKg-10)*pricePerKg/2;
            System.out.println("Fee: "+ fee);
        }
    }
}


