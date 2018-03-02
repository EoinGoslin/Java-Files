//find the mode from an input set of numbers
//The mode is the number that comes up the most in a set

import java.util.*;
public class findMode {
public static void main (String[] args) {

    //create Scanner and fill array
    Scanner userScan = new Scanner(System.in);    
    System.out.println("How many numbers? :");
    int len = userScan.nextInt();
    int[] array = new int[len];
    for(int i = 0; i < array.length; i++) {
        System.out.println("Enter a number :");
        array[i] = userScan.nextInt();
    }//end of filling array
    //1 5 4 8 7 5 4

    int mode = getCount(array[0], array);//get count of first element and assume comes up the most 
    int index = 0;
    int record = 0;
    for(int i = 1; i < array.length; i++) {
        int temp = getCount(array[i], array); 
       
        if(mode < temp) {//if temp has come up more times than update mode to be that value 
            mode = temp;
            index = i;
        }    
    }

    System.out.println("The mode is " + array[index]);
    
   
}

public static int getCount(int current, int[] array) {
    int count = 0; 
    
    for(int i = 0; i < array.length; i++) {
        if(array[i] == current) {
            count++;
        }
        
        
    }
    return count++;

    
}


}