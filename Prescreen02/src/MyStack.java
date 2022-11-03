import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
	private List<T> inner = new ArrayList<T>();
	private String name = "no name";
	
	public MyStack(String n){
		this.name = n;
	}
	public String getName(){
		return name;
	}

	public void push(T e) {
		inner.add(e);
	}

	public T pop() {
		return inner.remove(inner.size() - 1);
	}

	public T top() {
		return inner.get(inner.size() - 1);
	}

	/**
	 * @TODO: Print a line of elements in this stack from bottom to top. 
	 * 		  Elements should be separated by a space. 
	 *        Given the following input:
	 *        MyStack<Integer> stack = new new MyStack<Integer>();
	 *        stack.push(4); 
	 *        stack.push(3); 
	 *        stack.push(2);
	 *        
	 *        When calling stack.printStack(), print "|-4 3 2".
	 */
	public void printStack() {

		
	}

	public int size() {
		return inner.size();
	}
}
