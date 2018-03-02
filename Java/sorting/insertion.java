public class insertion {
public static void main (String[] args) {

int[]array = {5,20,30,40,4,9};//array


printArray(array);
insertion(array);
printArray(array);








}

public static void printArray(int[]array) {
    for(int i = 0; i < array.length;i++) {
        System.out.println(array[i]);
    }
    System.out.println("---------------");
}

public static void insertion (int[] array) {

    for(int outer = 1; outer<array.length;outer++) {//start on 1 
        int inner = outer;
        int temp = array[outer];//on first time, outer will be second element
        while(inner > 0 && array[inner-1] >= temp){//first time array[inner-1], which is 1-1 = 0, so compare 0>=array[outer] which will be second element

            array[inner] = array[inner-1];//move up on to keep checking for slot to find
            inner--;
        }

        array[inner] = temp;//slot the element back in 
    }
}

}