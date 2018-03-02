public class Selection {
    public static void main (String[] args) {

//create array
int[] array = {7,2,8,5,4};
System.out.println("Array before being sorted :");
printArray(array);
selection(array);
printArray(array);

}

public static void printArray(int[]array) {
    for(int i = 0; i < array.length;i++) {
        System.out.println(array[i]);
    }
    System.out.println("---------------");
}

public static void selection(int[]x) {

    
    for (int i=0; i<x.length-1; i++) {
        int minIndex = i;      // Index of smallest remaining value.
        for (int j=i+1; j<x.length; j++) {//j will be slot after i, run for 
            if (x[minIndex] > x[j]) {//compare current smallest against next element, if next min bigger, save location of the new smallest
                minIndex = j;  // Remember index of new minimum
            }
        }
        if (minIndex != i) { //if not already in its correct place, then swap elements
            //...  Exchange current element with smallest remaining.
            int temp = x[i];//save old min
            x[i] = x[minIndex];//old min becomes new min - new min became j previously
            x[minIndex] = temp;//old min is now swapped
        }
    }
} //end of outer*/


}





