import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args){

//		ArrayList<Object> al = new ArrayList<Object>();		
//		al.add(2);
//		al.add(null);
//		al.add(2);
//		System.out.println(al);
//		al.remove(1);
//		System.out.println(al);
//		al.add("M");
//		System.out.println(al);
//		al.add(1,4);
//		System.out.println(al);
	    
		ArrayList<Object> l = new ArrayList<Object>();
		for (int i=0;i<=10;i++)
			l.add(i);
			System.out.println(l);
		Iterator<Object> itr = l.iterator();
		while(itr.hasNext())
		{
			Integer i= (Integer) itr.next();
		
			if((i%2==0))
		
			System.out.println(i);
		else
		itr.remove();
		}
		System.out.println(l);
		
	}
}
