public class addNum {
    public static void main (String[] args) {

        int x = 10;
        int y = 20;
        System.out.println(addition(x,y));
        
    }

public static int addition(int a, int b) {
    int sum = 0;
        int carry = 0;
        
    
if(b==0) {
return a;
} else {
sum = a^b;
carry = (a&b)<<1;
return addition(sum,carry);
}
}
}