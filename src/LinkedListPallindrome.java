import java.util.LinkedList;
import java.util.Stack;

/**
 * Check if a linked list is pallindrome
 * @author ishan
 *
 */
public class LinkedListPallindrome {

	public static void main(String[] args) {
		LinkedList<String> linkedListOfStrings = new LinkedList<>();
		linkedListOfStrings.add("C");
		linkedListOfStrings.add("T");
		linkedListOfStrings.add("C");
		
		System.out.println(checkIfPallindromeWithStack(linkedListOfStrings));
		
	}

	/**
	 * O(n) and space O(n)
	 * @param linkedListOfStrings
	 * @return
	 */
	private static boolean checkIfPallindromeWithStack(LinkedList<String> linkedListOfStrings) {
		Stack<String> stack = new Stack<>();
		for(String s : linkedListOfStrings){
			stack.push(s);
		}
		
		for(String s : linkedListOfStrings){
			if(!stack.pop().equals(s)){
				return false;
				
			}
		}
		return true;
	}
}
