
public class Tryouts {

	public interface Try{
		
	}
	public static Integer c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 10;
		Integer b = 10;
		Integer c = 1000;
		Integer d = 1000;
				
		if(a == b)
			System.out.println("Success");
		if(c == d)
			System.out.println("Fail");
		
	}
	Try data = new Try(){
		String str = "sdfsdf";
		void prt(){
			System.out.println("prt");
		}		
	};
}
