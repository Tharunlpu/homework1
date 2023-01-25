class Sum10 {
    public static void main(String[] args) {
        int [] arr = {1,5,9,8,2,3,4,6,7,10,11,12,13,14,15,16,17};
        for(int i=0;i<arr.length;i++) {
            for(int j=i;j<arr.length;j++) {
                if(arr[i]+arr[j]==10) {
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
}