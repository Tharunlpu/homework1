public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = sc.nextInt();
        int temp1 = a;
        int rev = 0;
        while(a!=0) {
            int temp = a%10;
            a =a/10;
            rev = rev*10+temp;
        }
        if(temp1==rev) {
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}