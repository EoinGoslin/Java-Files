//The goal is to read in a number and to output the nearest prime.
//If two primes are equidistant then output the lower one.
import java.util.Scanner;
public class closestPrime {
     public static int counter = 0;
    public static void main (String[] args) {
        Scanner userScan = new Scanner(System.in);
        System.out.println("Enter a number...please");
        int number = userScan.nextInt();
        int[] array = new int[number*2];
        //need to get primes up until that number
        for(int i = 2; i < array.length; i ++) {
            if(primeChecker(i)) {
                fillArray(array, i);
            }
        }
        int higher = 0, index = 0;

  
        for(int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
            if(array[i] > number) {
                higher = array[i];
                index = i;
                break;
            }
        }
        int lower = array[index-1];//prime before number
        int diff1 = higher - number;
        int diff2 = number - lower;
        if(diff1 < diff2)  
        System.out.println(higher);
        else if(diff1 == diff2) {
            System.out.println(lower);
        } else {
                System.out.println(lower);

        }

    }
    public static boolean primeChecker(int x) {//check if given number a prime 
        for(int i = 2; i <= Math.sqrt(x); i++) {
            if(x%i==0) 
            return false;
        }
        return true;
    }
    public static void fillArray(int[] array,int x) {
       
        array[counter] = x;
        counter++;

    }
}