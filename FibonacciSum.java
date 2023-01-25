class FibonacciSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        int first=0;
        int second=1;
        int i = 1;
        int sum=0;
        while(i<=n) {
           int next = first+second;
            first=second;
            second=next;
            sum =first+second+next;
            i++;
           
        }
         System.out.println("sum is : "+sum);
    }
}