package com.rozar.random.codes;

public class AutoBoxing {

	public Integer value;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Integer a = -129;  
	      Integer b = -129;
		/*int a = 12234;
		int b = 12234;*/
	      Integer c = 128;  
	      Integer d = 128;  
	      // Integer s = Integer.valueOf(127);
	      a.intValue();
	   
	      
	      
	      
	      System.out.println("a == b: " + (a == b)); //true
	      // System.out.println(a+" "+b);
	      System.out.println("c == d: " + (c == d)); //false
	      // System.out.println(c+" "+d);
	      
	      /*int j = 5;
	        Integer K = null;//new Integer(5);
	        Integer L = new Integer(5);
	        int m = 5;
	        if (j == m)
	        {
	            System.out.println("j is equal to m");
	        }
	        if (j == K)
	        {
	            System.out.println("j is equal to K");
	        }
	        if (K == L)
	        {
	            System.out.println("K is equal to M");
	        }
	        if (K == m)
	        {
	            System.out.println("K is equal to m");
	        }*/
	}

}
