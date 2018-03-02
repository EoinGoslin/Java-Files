
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
        public void getLength(){//get length of LinkedList
            int count = 0;
            Link current = head;
            while(current!=null){
                count++;//increment everytime there is a Link
                current = current.next;
            }
            System.out.println(count);
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
            
            System.out.print("middle element of LinkedList : ");
            middle.displayLink();
            



        }

        public void deleteMiddle() {
            Link middle = head;
            Link current = head;
            Link previous = head;//will be one before middle element
            int count = 0;
            while(current!=null){//gets middle element
                count++;
                if(count % 2==0) {
                    middle = middle.next;//will move at half speed compared to current
                }
                current = current.next;
            }
            while(previous.next!=middle){
                previous = previous.next;//will go up to middle element, and get one before
            }

            if(count%2==1){//if uneven number of elements, then a clear middle element
        
                previous.next = middle.next;
              
             }
             if(count%2==0){//if even number, delete middle two
                current = head;
                while(current.next!=previous){
                    current = current.next;
                }
                //current is one before middle, so skip next two Links
                //current.displayLink();
                current.next = middle.next;
        
             }
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
public class deleteMiddle{
	public static void main(String args[]){
        LinkedList myList = new LinkedList();
        //delete middle element of LinkedList
        //if even number, delete two middle elements

		System.out.println(myList.isEmpty()); //Will print true

		myList.insertHead(5);
		myList.insertHead(7);
        myList.insertHead(10);
        myList.insertHead(20);
        myList.insertHead(30);
        myList.insertHead(70);
        myList.insertHead(95);
        
        myList.getLength();

		myList.display(); // 10(head) --> 7 --> 5

        
       /* myList.findMiddle();
        myList.deleteMiddle();
        myList.display();
        myList.getLength();
        

        /*myList.display(); // 7(head) --> 5
        int length = myList.getLength();
        System.out.println(length);*/
       // myList.findMiddle();
        //myList.deleteMiddle();
        //myList.display();*/

        
        

       
        
        
    }
    
}
