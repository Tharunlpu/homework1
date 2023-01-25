import java.util.*;
class Bitwise {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1 : ");
        int a = sc.nextInt();
        System.out.println("enter number 2 : ");
        int b = sc.nextInt();
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("after swapping");
        System.out.println("num1 is : "+a+"\nnum2 is : "+b);
    }
}