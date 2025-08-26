// Online Java Compiler
//bitwise,logical and shift operator
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a,b,c,d,e,g,r,l;
     
         Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
         a = s.nextInt();
         System.out.println("Enter second number");
          b = s.nextInt();
          System.out.println("Bitwise operator: ");
          c = a & b;
          System.out.println("a bitwise and b is:"+c);
          d = a | b;
          System.out.println("a bitwise or b is:"+d);
          e = a ^ b;
          System.out.println("a bitwise xor b is:"+e);
          System.out.println("");
          System.out.println("Logical operator: ");
          int x,y,z;
          System.out.println("Enter x number");
         x = s.nextInt();
         System.out.println("Enter another y number");
          y = s.nextInt();
          System.out.println("Enter another z number");
          z = s.nextInt();
          if (x>y && x>z){
               System.out.println("x is largest");
          }
          else if(y>x && y>z){
               System.out.println("y is largest ");
          }
          else{
               System.out.println("z is largest");
          }
           System.out.println("");
         System.out.println("Shift operator: ");
          System.out.println("Enter a number: ");
          g = s.nextInt();
          r = g>>1;
          l = g<<1;
          System.out.println("Right shift: "+r);
          System.out.println("Left shift "+l);
    }
}
