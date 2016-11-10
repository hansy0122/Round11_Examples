 class inner4{
	 public void aaa(){
		 System.out.println("aaa");
	 }
	 public void bbb(){
		 System.out.println("bbb");
	 }
	 public void ccc(){
		 System.out.println("ccc");
	 }
 }
public class Round11_Ex04 {
	public static void main(String ar[]){
		final int x=123;
		inner4 in=new inner4(){
			public void bbb(){
				System.out.println("ddd");
				System.out.println(x);
				ddd();//이렇게 사용해야함.
			}
			public void ddd(){ 
				System.out.println("eee");
			}
		};
		in.aaa();
		in.bbb();
		in.ccc();
		// in.ddd(); --> 사용은 못하네 ;;?
		
		
		
		
	}

}
