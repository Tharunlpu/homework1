import java.util.*;
class Armstrong{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    System.out.println("Enter number : ");
    int a = sc.nextInt();
    int temp = a;
    int sum = 0;
    while(a!=0) {
        int r = a%10;
        sum = sum+(r*r*r);
        a=a/10;
    }
    if(temp==sum) {
        System.out.println("yes");
        
    }
    else{
        System.out.println("no");
    }
    }
}