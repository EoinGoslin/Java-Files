//The goal is to read in a number N and output the distance between 
//the prime number that preceeds it, and the prime that follows it. If the number itself happens to be prime,
// then output the distance to the subsequent prime.
// For example, if N is 7, then output 4, because the next prime is 11, which is 4 away.
import java.util.Scanner;
public class primeDiff {
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
            if(array[i] > number) {
                higher = array[i];
                index = i;
                break;
            }
        }
        int lower = array[index-1];
        int answerYay = higher-lower;
        System.out.println(answerYay);

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