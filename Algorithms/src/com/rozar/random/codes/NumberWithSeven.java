package com.rozar.random.codes;

public class NumberWithSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// numbersWithSeven(800);
		numbers(8000);
	}
	
	public static void numbers(int number){
		for(int i = 7 ; i < number ; ){	
			System.out.println(i+" ");
			int temp = i + 3;
			if(i == 67){
				System.out.println();
			}
			if(temp % 10 == 0){
				boolean result = false;
				int temp2 = temp;
				int count = 0 ;
				do{
					int tempR = temp2 % 10;
					int tempQ = temp2 / 10;
					if(tempR == 7){
						result = true;
					}
					temp2 = tempQ;
					count++;
				}while(temp2 > 0);
				if(result){
					for(int j = 0 ; j < 10 * (count - 1); j++){
						System.out.println(temp+" ");
						temp = temp + 1;
					}
					i = i + 10 * (count);
					
				}else{					
					// System.out.println(i+" ");
					i = i + 10;
				}
				count = 0;
			}
			else{
				// System.out.println(i+" ");
				i = i + 10;
			}
		}
	}
	
}
