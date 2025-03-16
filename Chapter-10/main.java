import java.util.Queue;
import java.util.LinkedList;
public class Main
{
	public static void main(String[] args)
	{
		Queue<Character> q = new LinkedList<>();
		
		 // To add from rear **
		 q.add('5');
		 q.offer('A');
		 q.offer('x');
		 q.offer('z');
		 q.offer('@');
		 
		 System.out.println(q);
		 
		 // Front Element 
		 System.out.println(q.peek());
		 System.out.println(q.element());
		 
		 // Removing Front Element
		 System.out.println("Element removed is " + q.poll());
		 q.remove();
		 System.out.println(q);
	}
}
