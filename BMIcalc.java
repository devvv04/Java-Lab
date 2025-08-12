import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        float weight, height, bmi;
        Scanner S = new Scanner(System.in);

        System.out.println("Enter your weight in kg:");
        weight = S.nextFloat();

        System.out.println("Enter your height in m:");
        height = S.nextFloat();

        bmi = weight / (height * height);

        System.out.println("BMI: " + bmi);
    }
}
