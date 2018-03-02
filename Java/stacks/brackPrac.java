import java.util.Scanner;
/*take in numbers of instructions
each one line at a time as a single string e.g.
3
[[][][]
[][][]
{{]}}
*/
    public class brackPrac {
    public static void main (String[] args){
        Scanner userScan = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int number = userScan.nextInt();userScan.nextLine();
        
        for(int i = 0; i < number; i++){//run until no more instructions
        System.out.println("Enter brackets :");
        String word = userScan.nextLine();
        
        if(bracketChecker(word)){
            System.out.println("Is Valid");
        } else {
            System.out.println("Not Valid");
        }

    }

}//end of main 
    public static boolean bracketChecker(String word){
        if(word.isEmpty()){
            return true;
        }
        stack myStack = new stack(word.length());
        for(int i = 0; i< word.length();i++){
            char current = word.charAt(i);
            
            //check all opening brackets
            if(current == '{'|| current=='['||current=='('){
                myStack.push(current);
            }
            if(current=='}'||current==']'||current == ')'){
                if(myStack.isEmpty()){
                    return false;
                }
                char last = myStack.peek();
                if(current=='{' && last == '}'|| current == ']' && last == '['|| current == ')' && last == '(') {
                    myStack.pop();
                } else {
                    return false;
                }
            }


        }
            //check if after checking brackets they all matched and popped off
            return myStack.isEmpty()? true:false;
            

    }


}