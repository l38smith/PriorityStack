package davis.l;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class PriorityStack< T extends Comparable<T>> {
	
	private List <T> st;
	
	public PriorityStack() {
	st = new LinkedList<> ();
		
}

public void push(T pushValue) { // method to push
	
	st.add(pushValue );
	Collections.sort(st);
}
public T peek() {
	if (st.isEmpty()) {
		return null;}
	else {
		return st.get(0);
 }
}
public T pop() {     // method to pop
	T retval = peek();
	st.remove(0);
	return retval;
}

public boolean isEmpty() {  // empty
	return st.isEmpty();
	
}
public int size() {
return st.size();

}
 }


