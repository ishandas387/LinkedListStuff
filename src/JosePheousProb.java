
public class JosePheousProb {

	public int josepheousFunction(int numberOfPeople , int k){
		Node head = new Node();
		head.data= 1;
		Node last= head;
		for(int i=2;i<=numberOfPeople;i++){
			Node n = new Node();
			n.data=i;
			last.next=n;
			last=n;
		}
		last.next=head;
		
		Node toShift = head;
		Node temp= head;
		
		while(toShift.next != toShift){
			int count =1;
			while(count!=k){
				temp= toShift;
				toShift = toShift.next;
				count++;
			}
			temp.next= toShift.next;
			toShift = temp.next;
			
		}
		System.out.println("last position "+toShift.data);
		return toShift.data;
	}
}
