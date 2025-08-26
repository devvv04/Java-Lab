// discount bill calculate, if bill is 2000 + ,20% discount, if bill is 1000-2000, 10% discount otherwise no discount
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        double a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter pre-discount bill amount: ");
        a = s.nextInt();
        if (a >= 2000){
            a = a - (0.2 * a);
            System.out.println("20% discount, discounted bill : " +a);
        }
        else if(1000<=a && a<= 2000){
            a = a - (0.1*a);
            System.out.println("10% discount, discounted bill : " +a);
        }
        else{
            System.out.println("No Discount");
        }
    }
}
