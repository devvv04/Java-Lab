import java.util.Scanner;
class Main {


    public static void main(String[] args) {
        int a,b,c;
            Scanner S = new Scanner(System.in);
        System.out.println("Enter fuel per liter cost:");
        a = S.nextInt();
        System.out.println("Fuel purchased:");
        b = S.nextInt();
        c = a*b;
        System.out.println("Price to pay:" +c);
    }
}
