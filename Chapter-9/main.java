import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Stack<Integer>st = new Stack<>();
		st.push(2);
		st.push(12);
		st.push(22);
		st.push(32);
		
	    System.out.println(st);
	    System.out.println(st.peek());
	    
	    st.pop();
	    st.pop();
	    
	    System.out.println(st.search(12));
	    st.clear();
	    System.out.println(st.isEmpty());
	    // one of the important feature in stack is search()
	    // which returns element at one based indexing **
	}
}
