import java.util.Stack;
class Reversearrayusingstack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int [] arr = {1,2,3,4,5,6,7,89};
        for(int i=0;i<arr.length;i++) {
            stack.push(arr[i]);
        }
        while(stack.empty()!=true) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}