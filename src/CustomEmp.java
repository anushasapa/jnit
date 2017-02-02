import java.util.*;
public class CustomEmp implements Comparable<Object>{

	String name;
	int eid;
	CustomEmp(String name,int eid){
		this.name=name;
		this.eid=eid;
	}
	public String tostring(){
		return name+"--"+eid;
	}
	public int compareTo(Object obj){
		int eid1 = this.eid;
		CustomEmp e = (CustomEmp)obj;
		int eid2=e.eid;
		if(eid1<eid2){
			return -1;
		}else if(eid1>eid2){
			return 1;
			
		}else{
			return 0;
		}
	}
	
}
	class CompDemo{
		public static void main(String[] args){
			CustomEmp e1 = new CustomEmp("Anu",100);
			CustomEmp e2 = new CustomEmp("hhh",101);
			CustomEmp e3 = new CustomEmp("jjj",102);
			CustomEmp e4 = new CustomEmp("jjl",103);
			TreeSet<Object> t = new TreeSet<Object>();
			t.add(e1);
			t.add(e2);
			t.add(e3);
			t.add(e4);
			System.out.println(t);
			TreeSet<Object> t1 = new TreeSet<Object>(new MyComparator());
			t1.add(e1);
			t1.add(e2);
			t1.add(e3);
			t1.add(e4);
			System.out.println(t1);
		}
		
	}
	class MyComparator implements Comparator<Object>{
		public int compare(Object obj1, Object obj2){
			CustomEmp e1 = (CustomEmp)obj1;
			CustomEmp e2 = (CustomEmp)obj1;
			String s1 = e1.name;
			String s2 = e2.name;
			return s1.compareTo(s2);
		}
	}
