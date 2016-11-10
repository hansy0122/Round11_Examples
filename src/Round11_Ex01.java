class outer{
	private int x=100;
	private static int a=400;
	inner in=new inner();
	//outer.inner in=this.new inner();this 는 객체이다.
	public void bbb(){
	System.out.println(x);
	System.out.println(in.y);
	System.out.println(in.c);  //--> private 이더라도 사용가능. class 내부 class는 자기자신의 class 내부로 보기때문인듯. 
	
	}
	class inner{
		int y=200;
		private int c=123;
		 // static 선언 불가능 private static int b=500;
		public void aaa(){
			System.out.println(x);
			System.out.println(y);
			System.out.println(a);   //--> 밖의 static은 사용가능
			
		}
	}
}
public class Round11_Ex01 {
	public static void main(String ar[]){
		outer ot=new outer();
		outer.inner oi=ot.new inner();
		// private는 직접 사용 불가능System.out.println(ot.x);
		System.out.println(oi.y);
		System.out.println();
		oi.aaa();
		System.out.println();
		ot.bbb();
		
	}
	
}
