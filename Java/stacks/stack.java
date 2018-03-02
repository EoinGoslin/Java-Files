import java.util.Scanner;
public class stack
{ 

		private int maxSize;
		private char[] stack;
		private int top;
		
		public stack(int s)
		{
			maxSize = s;//set stack length
			stack = new char [maxSize];//create array to store the stack
			top = -1;//no items in the stack as default
		}
		
		public void push(char j)//placing an item on the stack
		{
			top++;//increment top, new item being placed in stack
			stack[top] = j;//set the top to be the top item in the stack
		}
		
		public char pop()
		{
			return stack[top--];//will return first item on stack and then decrement top because an item was removed
		}
		
		public char peek()
		{
			return stack[top];//will just show top item in the array
		}
		
		public boolean isEmpty()
		{
			return (top == -1);//true, if no items in the stack(top starts at -1)
		}
		
		public boolean isFull()
		{
			return (top == maxSize-1);//if top item is at the top of the array, then stack is full return true
		}
		
		public void makeEmpty()
		{
			top = -1;//will reset stack, stops old items being able to be accessed and so Java will overwrite these items as more are put on and old ones removed
		}
		
		
}