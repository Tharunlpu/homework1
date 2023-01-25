import java.util.*;
class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        int rev = 0;
        while(a!=0) {
            int temp = a%10;
            a = a/10;
            rev = rev*10+temp;
        }
        System.out.println("reverse of number is : "+rev);
    }
}