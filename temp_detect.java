import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int temp;
           Scanner s = new Scanner(System.in);
        System.out.println("Enter Temperature:");
        temp = s.nextInt();
        if (temp<=0){
            System.out.println("Freezing");
        }
        else if (0<temp & temp<20){
            System.out.println("Cold");
        }
        else if(21<temp & temp<35){
            System.out.println("normal");
        }
        else{
        System.out.println("Hot");
        }
    }
}
