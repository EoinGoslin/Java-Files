import java.util.Scanner;
public class palindrome {
    public static void main (String[] args) {

        Scanner userScan = new Scanner(System.in);
  

        //create stack
        System.out.println("Enter the word : ");
        String word = userScan.nextLine();
        char[] array = new char[word.length()];
        stack myStack = new stack(word.length());
       for(int i = 0; i <word.length(); i++) {
           array[i] = word.charAt(i);//save in an array
           myStack.push(word.charAt(i));//send off to stack
           
       }

       //check if spelled same backwards
     
            if(palindrome(array, myStack)) {
                System.out.println("palindrome Yay");
            }
                else {
                    System.out.println("Not a palindrome");
                }
            }
    
public static boolean palindrome(char[] array, stack myStack) {
      for(int i = 0; i < array.length; i++){
           if(myStack.pop() != (array[i]))
           {
               return false;
           }
       }
       return true;
}
} 