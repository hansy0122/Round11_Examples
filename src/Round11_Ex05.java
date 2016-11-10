import java.io.*;
class Person{
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	private String name;
	private int[] jumin;
	
		Person(){
			jumin=new int[14];
		}
		
		
		
		//입력
		public void in() throws IOException{
			System.out.print("이름을 입력하세요");
			name=in.readLine();
			System.out.print("주민등록번호를 입력하세요");
			for(int i=0;i<jumin.length;i++){
				jumin[i]=System.in.read()-48;
			}
			in.readLine();
		}
		
		
		
		
		//주민등록번호 검증기 
		
		public boolean che(){
			boolean check=false;
			int hap = 0;
			float temp = 0;
			float temp1 = 0;
			int cre = 2;
			for(int i = 0; i < jumin.length - 1; ++i) {
				if(i == 6) continue;
				hap += jumin[i] * cre++;
				if(cre == 10) cre = 2;
			}				
			temp = (int)(hap / 11.0f) * 11.0f + 11.0f - hap;
			temp1 = temp - (int)(temp / 10.0f) * 10.0f;				
			if(temp1 != jumin[13]) check = true;
			return check;
		}
	
		class Score{
			private int sub[];
			private String subn[];
			private float avg;
			private char grade;
			
			Score(){
				sub=new int[5];
				subn=new String[]{"국어","영어","수학"};
				
			}
			
			//입력
			public void inpp()throws IOException{
				System.out.println("성적을 입력하세요");
				for(int i=0;i<3;i++){
					System.out.println(subn[i]);
					sub[i]=Integer.parseInt(in.readLine());
					sub[3]+=sub[i];
					
				}
				sub[4]=1;
					
				
			}
			public void cal(){
				int avg=sub[3]/3;
				
				switch(avg/10) {
			
				case(10):case(9): grade='A';break;
				case(8):grade='B';break;
				case(7):grade='C';break;
				default:grade='F';break;
				}
				
			}
			//학점계산
			
			
			//출력
			public void disp(){
				System.out.println(name);
				for(int i=0;i<3;i++){
				System.out.println(subn[i]+"의 점수는"+sub[i]);
				}
				System.out.println("총업"+sub[3]);
				System.out.println("반 등수"+sub[4]);
				System.out.println("학점은"+grade);
			}
		}
}
public class Round11_Ex05 {
	
	public static void main(String ar[]) throws IOException{
		Person han=new Person();
		han.in();
		if(han.che()==true){
			Person.Score scoo=han.new Score();
			scoo.inpp();
			scoo.cal();
			scoo.disp();
			}
			else {
				System.out.println("잘못된 주민등록번호");
			}
		
		
		
	}

}
