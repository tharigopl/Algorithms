
public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int denominator = 2;
		int numerator = 82;
		int mask = 0x1; 
		Integer quotient = 0; 
		
		

		while (denominator <= numerator) { 
			denominator <<= 1; 
			mask <<= 1; 
		} 

		while (mask > 1) { 
			denominator >>= 1; 
			mask >>= 1; 
			if (numerator >= denominator) { 
				numerator -= denominator; 
				quotient |= mask; 
			} 
		} 
		System.out.println(quotient);
	}

}
