import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a, b, c;    
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your monthly salary:");
        a = S.nextInt();
        System.out.println("Enter number of working days:");
        b = S.nextInt();
        c = a/b;
        System.out.println("Your per day salary is: " + c);
        
  
    }
}
