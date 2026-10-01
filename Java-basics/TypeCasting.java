import java.util.Scanner;

class TypeCasting {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        // type casting

        int num = (int)(67.56f);
//        System.out.println(num);

        // In expressions type promotion happens Automatically
//        int a = 257;
//        byte b = (byte)(a); // 729 % 728 = 1

//        byte a = 60;
//        byte b = 70;
//        byte c = 80;
//        int d = a * b / c;
//
//        System.out.println(d);

//        byte b = 67;
//        b = b * 2;

//        int number = 'A';
//        System.out.println("你好");

//        System.out.println(3 * 6);

        byte b = 55;
        char c = 'a';
        short s = 999;
        int i = 4981;
        float f = 82.67f;
        double d = 0.676767;
        double result = (f * b) + (i / c) - (d * s);

        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));

        System.out.println(result);
        }
}