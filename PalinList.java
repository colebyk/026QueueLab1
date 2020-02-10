import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalinList {
	private Queue<String> queue;
	private Stack<String> stack;
	private String[] palinListArray;
	
	
	public PalinList(String palinList) {
		queue = new LinkedList<String>();
		stack = new Stack<String>();
		palinListArray = palinList.split(" ");
	}
	
	public void testList() {
		for (int i = 0; i < palinListArray.length; i++) {
			stack.add(palinListArray[i]);
			queue.add(palinListArray[i]);
		}
		
		for (int i = 0; i< palinListArray.length; i++) {
			if (stack.pop().equals(queue.remove())) {
				// do nothing
			} else {
				System.out.println("Not a palin list");
				System.exit(0);
			}
		}
		System.out.println("the entered list is a palin list");
		
	}
}
