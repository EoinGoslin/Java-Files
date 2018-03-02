import java.util.Scanner;
/*
*create scanner
*create an array and fill with any amount of numbers
*create a double for stroring sum
*use sum of all numbers/array.length to get Math.abs avg
*Assume first element is closest - double closest
*create an index for recording location of closest of average
*Check each element
*keep updating the closest
*/
public class closestToAvg {
    public static void main (String[] args) {

        Scanner userScan = new Scanner(System.in);
        System.out.println("How many numbers");
        int length = userScan.nextInt();
        int[] array = new int[length];
        double sum = 0;//used for getting sum of the array
        
        for(int i = 0; i <array.length; i++) {
            System.out.println("Enter a number :");
            array[i] = userScan.nextInt();
            sum+=array[i];
        }//has filled the array

        double average = sum/array.length;
        //assume first element is the closest to average
        double closest = array[0] - average;
        int index = 0;

        for(int i = 0; i < array.length;i++) {
            if(Math.abs(array[i] - average) < closest) {
                closest = Math.abs(array[i] - average);
                index = i;
            }
        }

        System.out.println("The closest to the average is " + array[index]);
        







    }



}