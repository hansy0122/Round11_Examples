class outer3{
	private int x=100;
	private static int y=200;
	public void disp(){
		class inner{
			private int a=10;
			 // private static int b=30; ���� ������� �Բ� ���Ұ� 
			
			public void disp1(){
				System.out.println(a);
				System.out.println(x);
				System.out.println(y);
			}
		}
		inner in=new inner();
		in.disp1();
		
		
		
	}
}


public class Ronud11_Ex03 {
	public static void main(String ar[]){
		outer3 ot=new outer3();
		// outer.inner oi=ot.new inner(); �̷������� ���Ұ�
		ot.disp();
		
	}

}  
