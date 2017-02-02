public class Enummethd {
	
		 enum family{
				
				mom,dad,son
			}
		 family b;
		public Enummethd(family b){
			this.b=b;
		}
		public void showenum(){
			 switch(b){
				case mom:
					System.out.println("nice");
					break;
				case dad:
					System.out.println("bad");
					break;
				case son:
					System.out.println("good");
		             break;		
				default :
					System.out.println("nothing is good");
					break; 
		 }
		}
		 public static void main(String[] args){
			 Enummethd first = new Enummethd (family.mom);
		first.showenum();
		
		}
}
