import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter price of first item:");
        a = S.nextInt();
        System.out.println("Enter price of second item:");
        b = S.nextInt();
        System.out.println("Enter price of third item:");
        c = S.nextInt();
        d = a+b+c;
        System.out.println("Your total bill is:" +d);
    }
}
