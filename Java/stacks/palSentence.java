import java.util.Scanner;


public class palSentence {
    public static void main (String[] args) {
        Scanner userScan = new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String word = userScan.nextLine();
        if(palCheck(word)) {
            System.out.println("Is a palandromic sentence");
        } else {
            System.out.println("Is not a palandromic sentence");
        }
        
        
    }//end of main
    public static boolean palCheck(String word){
        String newWord = word.toLowerCase();//make lower case first
        String end = "";
        String result = newWord.replace(" ", "");
        charStack stack = new charStack(result.length());
        for(int i = 0; i < result.length();i++){//send all of to stack to be later popped in reverse order
            stack.push(result.charAt(i));
        }
        for(int i = 0; i < result.length(); i++){
            if(result.charAt(i)==stack.peek()){
                stack.pop();
            } else {
                return false;
            }


        }
        return stack.isEmpty()? true:false;
    }
}
