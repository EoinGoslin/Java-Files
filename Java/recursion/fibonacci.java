public class fibonacci {
    public static void main (String[] args) {

    int num = 10;
    for(int i = 0; i < num; i++) {
        System.out.println(fib(i));
    }
  


    }
    public static int fib(int num) {
        if(num == 0||num ==1) {
            return 1;
        }
        else {
            return fib(num-1) + fib(num-2);
        }
    }
}