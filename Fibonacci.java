import java.util.*;
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        int first=0;
        int second=1;
        int i = 1;
        while(i<=n) {
            System.out.print(first+",");
            int next = first+second;
            first=second;
            second=next;
            i++;
        }
    }
}