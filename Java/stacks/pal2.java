import java.util.Scanner;
public class pal2 {
    public static void main (String[] args){
        //crete scanner and take in word
        Scanner userScan = new Scanner(System.in);
        String word = userScan.nextLine();
        stack myStack = new stack(word.length());
        for(int i = 0; i < word.length();i++){
            myStack.push(word.charAt(i));//push all off

        }
        if(palCheck(word, myStack)){
            System.out.println("Palindrome");
        } else {
            System.out.println("No");
        }
        




    }
    public static boolean palCheck(String word, stack myStack){
        for(int i = 0; i <word.length();i++){
            if(word.charAt(i)!=myStack.pop())
            return false;
        }
        return true;

    }
}