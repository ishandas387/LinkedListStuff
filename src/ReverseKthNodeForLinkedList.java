
public class ReverseKthNodeForLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedList list = new MyLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.print();
		
		reverse(list);
		reversekth(list,2);
	}

	private static void reverse(MyLinkedList list) {
		// TODO Auto-generated method stub
		list.reverse();
			
	}
	private static void reversekth(MyLinkedList list, int k) {
		// TODO Auto-generated method stub
		list.reverseKth(k);
			
	}

}
