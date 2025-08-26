//find the delivery charge, order less than 500, extra 50 charge.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total of order: ");
a = s.nextInt();
if (a>= 500){
    System.out.println("Free delivery");
}
else{
    a = a + 50;
    System.out.println("Extra 50 ruppees delivery charge, Final price is: "+a);
}
    }
}
