public class charStack {
        
        private int maxSize;
        private int top;
        private char[] charArray;

        public charStack(int s){
            maxSize=s;
            charArray= new char[maxSize];
            top= -1;
            
        }

        public void push(char x){
            top++;
            charArray[top]=x;
        }

        public char pop(){
            
            return charArray[top--];
        }

        public char peek(){
            
            return charArray[top];
        }

        public boolean isEmpty(){

            return (top==-1);
        }

        public boolean isFull(){
             
            return(top==maxSize-1);
        }

}


















