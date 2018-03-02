import java.util.Scanner;
public class nPrime {


public static void main (String[] args) {
Scanner userScan = new Scanner(System.in);

    System.out.println("How many numbers");
    int number = userScan.nextInt();//check for primes all the way up until 100
    /*System.out.println("What number Prime? :");
   // int pTarget = userScan.nextInt();*/

    //create an array to store all of the primes found
    int[]pArray = new int[number];//capable of storing all numbers in range
    int slot = 0;
    boolean prime = false;

    
    for(int i = 2; i <= number; i++) {
        
        prime = true;
        for(int j = i; j <number.length;j++) {

                if(i%j == 0) {
                    prime = false;
                }


        }
      



}

public static void printArray(int[]array) {
    for(int i = 0; i < array.length;i++) {
        System.out.println(array[i]);
    }
    System.out.println("---------------");
}






}