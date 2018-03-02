//sort an array using bubble sort
//Eoin Goslin
import java.util.Scanner;




public class bubble {
    //create Scanner and take in numbers from stdinput
    //create static Scanner so accessible in fillArray method
   static Scanner userScan = new Scanner(System.in);
    public static void main (String[] args){//start of main
        
    
        System.out.println("Please enter amount of numbers :");
        int length = userScan.nextInt();
        int[] array = new int[length];

        fillArray(array);
        bubbleArray(array);//send of to be sorted
        printArray(array);
       
    }
    public static void fillArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.println("Enter a number :");
            a[i] = userScan.nextInt();
            
        }
       
    }
    public static void bubbleArray(int[] a){
        int limit = a.length;
        for(int i = 0; i < a.length;i++){
            limit--;
            for(int j = 0; j <limit; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        
    }
    public static void printArray(int[]a){
        for(int i = 0; i < a.length;i++){
            System.out.println(a[i]);
        }
    }
}
