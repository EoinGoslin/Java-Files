public class practice {

public static void main(String[] args) {
    int x = 5; 
    System.out.println(method(x-1));
}
public static int method(int number){
if (number >= 30){
return 12;
}
System.out.println("hello");
return method(number + 5) - 2;
}

}