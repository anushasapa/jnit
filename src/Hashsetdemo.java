import java.util.HashSet;


public class Hashsetdemo {

	public static void main(String[] args){
			HashSet<Object> h = new HashSet<Object>();
			
			h.add("Dad");
			h.add("Mom");
			h.add("Son");
			h.add("Daughter");
			h.add("Son");
			System.out.println(h);// insertion order not preserved
			
			
		}
	} 

