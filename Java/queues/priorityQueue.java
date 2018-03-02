class priorityQueue{
	private int maxSize;
	private int[] queueArray;
	private int nItems;

	public priorityQueue(int size){ //Constructor
		maxSize = size;
		queueArray = new int[size];
		nItems = 0;
	}

	public void insert(int value){ //Inserts an element in it's appropriate place
		if(nItems == 0){
			queueArray[0] = value;
		}
		else{
			int j = nItems;
			while(j > 0 && queueArray[j-1] > value){
				queueArray[j] = queueArray[j-1]; //Shifts every element up to make room for insertion
				j--;
			}
			queueArray[j] = value; //Once the correct position is found the value is inserted
		}
		nItems++;
	}

	public int remove(){ //Remove the element from the front of the queue
		return queueArray[--nItems];
	}

	public int peek(){ //Checks what's at the front of the queue
		return queueArray[nItems-1];
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