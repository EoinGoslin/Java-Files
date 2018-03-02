
/*
 * A linked list is similar to an array, it holds values. However, links in a linked list do not have indexes.
 * With a linked list you do not need to predetermine it's size as it grows and shrinks as it is edited.
 * This is an example of a singly linked list. Elements can only be added/removed at the head/front of the list.
*/
class LinkedList{
	private Link head; //Head refers to the front of the list

	public LinkedList(){
		head = null;
	}

	public void insertHead(int x){	//Insert an element at the head
		Link newLink = new Link(x); //Create a new link with a value attached to it
		newLink.next = head; 		//Set the new link to point to the current head
		head = newLink; 			//Now set the new link to be the head
	}

	public void deleteHead(){ //Delete the element at the head
		//Link temp = head;
		head = head.next; //Make the second element in the list the new head, the Java garbage collector will later remove the old head
		//return temp;
	}

	public boolean isEmpty(){ //Returns true if list is empty
		return(head == null);
	}

	public void display(){ //Prints contents of the list
		Link current = head;
		while(current!=null){
			current.displayLink();
			current = current.next;
		}
		System.out.println();
    }
        public int getLength(){//get length of LinkedList
            int count = 0;
            Link current = head;
            while(current!=null){
                count++;//increment everytime there is a Link
                current = current.next;
            }
            return count;
        }
        public Link getLink(){
            return head;
        }
        public void findMiddle(){
            //create on pointer to traverse at half the speed compared to other
            //and another to traverse all the links, by time this Link reaches end, middle link will be at middle element
            Link middle = head;//This pointer will move at half speed e.g.i%2 ==0 then increment
            Link current = head;//This will always move up one element in the List
            int length = 0;
            while(current.next!=null){
                length++;
                if(length%2==0){
                    middle = middle.next;//increment middle every second iteration of length
                }
                current = current.next;
            }//end of while loop
            if(length%2==1){
                middle = middle.next;
            }
            System.out.println("length of LinkedList: " + length);
            System.out.print("middle element of LinkedList : ");
            middle.displayLink();
            



        }
           

}

class Link{
	public int value;
	public Link next; //This is what the link will point to

	public Link(int valuein){
		value = valuein;
	}

	public void displayLink(){
		System.out.print(value+" ");
	}
}

//Example
public class SinglyLinkedList{
	public static void main(String args[]){
		LinkedList myList = new LinkedList();

		System.out.println(myList.isEmpty()); //Will print true

		myList.insertHead(5);
		myList.insertHead(7);
        myList.insertHead(10);
        myList.insertHead(20);
        myList.insertHead(30);
        myList.insertHead(40);
        

		myList.display(); // 10(head) --> 7 --> 5

        
        myList.display();

        /*myList.display(); // 7(head) --> 5
        int length = myList.getLength();
        System.out.println(length);*/
        myList.findMiddle();
        

       
        
        
    }
    
}
