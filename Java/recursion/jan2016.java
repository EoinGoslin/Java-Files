public class jan2016{
public static void main(String[] args){
System.out.println(method(14));
}
public static int method(int number){
if (number % 7 == 3){
return 5;
}
System.out.println("hello");
return method((number % 5) + 3) - 2;
}
}