import java.util.Scanner;
class Main {
    
    public static void main(String[] args) {
        int bs;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee's basic salary:");
        bs = s.nextInt();
        double d;
        double t;
        if (bs > 10000){
           d = 0.05 * bs;
           t = 0.10 * bs;
       }
        else{
        d = 0.03*bs;
        t = 5000;
        }
        double total = bs + d + t;
         System.out.println("Total Salary = " +total);
        
            
    }
}
