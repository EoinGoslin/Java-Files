//find biggest number from an input using insertion sort to sort first
import java.util.Scanner;
public class findBiggestInsertion {
    public static void main (String[] args) {

        Scanner userScan = new Scanner(System.in);
        System.out.println("Please input how many numbers");
        int length = userScan.nextInt();
        System.out.println("What number biggest are you trying to find? :");
        int target = userScan.nextInt();
        //Take in all the numbers first
        //Then sort
        //then process which is biggest 
        //create an array to store all the numbers

        int[] array = new int[length];
        

        //fill array
        for(int i = 0; i < length; i++) {
            System.out.println("Enter a number :");
            array[i] = userScan.nextInt();
            
        }

        //then sort
        insertion(array);
        printArray(array);
        
        int biggest = findBiggest(target, array);
        System.out.println("The " + target + "biggest element is " + biggest);



    }

    public static void insertion(int[] array) {
        for(int outer = 1; outer<array.length; outer++) {
            int inner = outer;
            int temp = array[outer];
            while(inner > 0 && array[inner-1] >=temp) {//while one in array is bigger than one I popped out and saved before in temp
                array[inner] = array[inner-1];
                inner--;
            }

            array[inner] = temp;


        }
    }
        public static int findBiggest(int target ,int[]array) {
            //keep searching until target point in sorted array
            int answer = 0;
            for(int i = 0; i <target; i++) {
                answer = array[i];
            }
            return answer;
        }

        public static void printArray(int[]array) {
        for(int i = 0; i < array.length;i++) {
        System.out.println(array[i]);
        }
       
        }


}










