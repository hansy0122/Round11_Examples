class outer{
	private int x=100;
	private static int a=400;
	inner in=new inner();
	//outer.inner in=this.new inner();this �� ��ü�̴�.
	public void bbb(){
	System.out.println(x);
	System.out.println(in.y);
	System.out.println(in.c);  //--> private �̴��� ��밡��. class ���� class�� �ڱ��ڽ��� class ���η� ���⶧���ε�. 
	
	}
	class inner{
		int y=200;
		private int c=123;
		 // static ���� �Ұ��� private static int b=500;
		public void aaa(){
			System.out.println(x);
			System.out.println(y);
			System.out.println(a);   //--> ���� static�� ��밡��
			
		}
	}
}
public class Round11_Ex01 {
	public static void main(String ar[]){
		outer ot=new outer();
		outer.inner oi=ot.new inner();
		// private�� ���� ��� �Ұ���System.out.println(ot.x);
		System.out.println(oi.y);
		System.out.println();
		oi.aaa();
		System.out.println();
		ot.bbb();
		
	}
	
}
