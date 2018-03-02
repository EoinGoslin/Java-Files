import java.util.Scanner;
public class sieve {

public static void main (String[] args) {

    int number = 10;
    boolean prime = true;
    int[] array = new int[number];

    for(int i = 2; i <= number; i++) {
        prime = true;

        for(int j = 2; j <=i/2; j++) {
            if(i%j==0) {
                prime = false;
                break;
            }
        }

        if(prime == true && number!=1) {
            //prime found
            array[i-2] = i;
            
        }





    }//end of outer

    for(int i = 0; i <number;i++) {
        System.out.println(array[i]);
    }




}









}