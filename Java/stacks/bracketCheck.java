import java.util.Scanner;
public class bracketCheck {
    public static void main (String[] args) {

            Scanner scan= new Scanner(System.in);
            System.out.println("Enter number of rows");
            int n= scan.nextInt(); scan.nextLine();//number of strings to input
      
            
            for (int i=0; i<n; i++){
                System.out.println("Enter brackets");
                String brackets= scan.nextLine();
                System.out.println(isBalanced(brackets));
            }




    }

    public static String isBalanced(String word){

        if(word.isEmpty()){
            return "Yes";
        }

        charStack myStack= new charStack(word.length());

        for(int i =0; i < word.length(); i++){
            char current= word.charAt(i);
        
            if(current=='{'||current=='['||current=='('){
                myStack.push(current);
                
            }

            if((current=='}'||current==']'||current==')')) {
                    if(myStack.isEmpty()){
                        return "No";

                    }
                    char last = myStack.peek();
                    if(current=='}'&& last == '{'||current==']'&& last == '['||current==')'&&last == '(') { 
                    myStack.pop();
                    }
                    else return "No";

            }
              
       
       
        }

        return myStack.isEmpty()? "Yes":"No";


    }



    
}