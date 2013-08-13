
public class DivToZero {
	public static void main(String[] args){
		int number = 70000;
		int factor = 17;
		System.out.println(lastTwo(number,factor));
	}
	public static String lastTwo(int number, int factor){
		String strNumber = String.valueOf(number);		
		strNumber = strNumber.substring(0, strNumber.length()-2);
		int temp = Integer.parseInt(strNumber);
		for(int i=0;i<99;i++){
			if(i<10){				
				if(Integer.parseInt(strNumber+"0"+i)%factor == 0){
					return i+"";
				}
			}else
				if(Integer.parseInt(strNumber+i)%factor == 0){
					return i+"";
				}
		}
		System.out.println(strNumber);
		return "No Possible number";
	}
}
