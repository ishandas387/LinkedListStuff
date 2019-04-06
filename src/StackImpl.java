
/**
 * Implementing a stack with linked list. 
 * Node class already defined
 * @author ishan
 *
 */
public class StackImpl {

	Node head;
	int size;
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public int getSize(){
		return size;
	}
	
	public void push(int data){
		if(head == null){
			head = new Node();
			head.data = data;
			head.next=null;
		}
		else{
			Node n = new Node();
			n.data= head.data;
			n.next=null;
			head.next=n;
			head.data=data;
			
		}
		
		size++;
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("stack is empty");
		}
		Node n = head;
		
		head = n.next;
		size--;
		return n.data;
	}
	
	public int peek(){
		return head.data;
	}
	
	public void display(){
		if(size==0){
			System.out.println("stack empty");
			return;
		}
		Node n = head;
		while(n!=null){
			System.out.println(n.data);
			n= n.next;
		}
	}
}
