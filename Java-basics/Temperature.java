import java.util.Scanner;

class Temperature {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.print("Please enter temp in Celsius: ");

        float tempC = temp.nextFloat();
        float tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);
    }
}