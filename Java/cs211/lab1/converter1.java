/**
 * file: converter1.java
 * project: lab1
 * author: eoin 17252409
 * email: eoingoslin@gmail.com
 * created: Sunday, 18th February 2018 4:24:31 pm
 * modified: Sunday, 18th February 2018 7:09:34 pm
 * filepath: /home/eoin/Desktop/java/javaPrac/cs211/lab1/converter1.java
 * comment: comment
 */
//
import java.util.Scanner;


public class converter1 {

    public static void main (String [] args){
        
        Scanner userScan = new Scanner(System.in);
        

        System.out.println("Enter a sentence: ");//take in the sentence
        String sen = userScan.nextLine();
        String[] array = new String[sen.length()];
        
        convertASCII(array, sen);
        //now have an array of al the ASCII characters of each letter in each slot of the array
        /*---------------------------------------------------------*/
        //part 2, print out the letter grequency
        int[]ASCIIarray = new int[256];//each block signifies a letter
        //value in each block will be how many times that number appeared
        fillASCII(ASCIIarray, sen);
        showFrequency(ASCIIarray);

     
    }

    public static void convertASCII(String[] array, String input) {
        for(int i = 0; i < input.length(); i++){
            int num = (int)(input.charAt(i));
            String a = Integer.toBinaryString(num);
            array[i] = a;
            System.out.println(array[i]);
        }
       
    }

    public static void fillASCII(int[] ASCIIarray, String sen){
        for(int i = 0; i < sen.length();i++){
            int checkNum = (int)sen.charAt(i);//i.e. T = 84 
            ASCIIarray[checkNum]++;//increment slot 84 as a T appeared
            
        }
    }

    public static void showFrequency(int[]ASCIIarray) {
        //go through whole ASCII array and print each letter
        char letter = ' ';
        for(int i = 0; i < ASCIIarray.length;i++){
            if(ASCIIarray[i]>0){
                letter = (char)(i);
                System.out.println("The letter '" + letter + "' appeared " + ASCIIarray[i] + " times");
            }
        }
    }
}

