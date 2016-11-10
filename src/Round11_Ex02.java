class outer2{
	private static int x=100;
	private int y=200;
	public static void disp(){
		System.out.println(x);
		}
	static class inner{
		private int a=300;
		 static int b=400;
		public void disp1(){
			System.out.print(x);       
		//System.out.println(y); static 내부에 non static 사용 불가
		System.out.println(a);
		System.out.println(b);
		disp(); //static 내부에 static method 사용가능
		}
	}
}
public class Round11_Ex02 {
	public static void main(String ar[]){
		outer2 ot=new outer2();
		outer2.inner oi= new outer2.inner();
		outer2.inner.b=500;
	}

}
