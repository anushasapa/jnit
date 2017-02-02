
public class FirstSingleTon {
     
	    private static FirstSingleTon name;
	    
	    public FirstSingleTon(){
	         
	    }
	    
	    public static FirstSingleTon getInstance()
	    {
	        if(name == null){
	        	name = new FirstSingleTon();
	        }
	        return name;
	    }
	    
	    public void getSomeThing()
	    {
	        
	        System.out.println("Singleton class");
	    }
	    public static void main(String a[]){
	    	FirstSingleTon obj = FirstSingleTon.getInstance();
	        obj.getSomeThing();
	    }
	
	
}
