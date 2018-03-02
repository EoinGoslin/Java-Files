class Queueclass{
	private int maxSize;
	private int[] queueArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queueclass(int size){ //Constructor
		maxSize = size;
		queueArray = new int[size];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public boolean insert(int x){ //Inserts an element at the rear of the queue
		if(isFull())
			return false;
		if(rear == maxSize-1) //If the back of the queue is the end of the array wrap around to the front
			rear = -1;
		rear++;
		queueArray[rear] = x;
		nItems++;
		return true;
	}
	
	public int remove(){ //Remove an element from the front of the queue
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}	
		int temp = queueArray[front];
		front++;
		if(front == maxSize) //Dealing with wrap-around again
			front = 0;
		nItems--;
		return temp;
	}
	
	public int peekFront(){ //Checks what's at the front of the queue
		return queueArray[front];
	}
	
	public int peekRear(){ //Checks what's at the rear of the queue
		return queueArray[rear];
	}
	
	public boolean isEmpty(){ //Returns true is the queue is empty
		return(nItems == 0);
	}
	
	public boolean isFull(){ //Returns true is the queue is full
		return(nItems == maxSize);
	}
	
	public int getSize(){ //Returns the number of elements in the queue
		return nItems;
	}
}

public class Queue{
    public static void main (String[] args){
        Queueclass queue = new Queueclass(2);
        queue.insert(30);
        queue.insert(40);
        System.out.println(queue.insert(78));
        System.out.println(queue.remove() + " " + queue.remove());

    }
}