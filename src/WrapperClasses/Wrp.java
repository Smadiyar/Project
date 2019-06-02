package WrapperClasses;

public class Wrp {
	public static void main(String[] args) {
		
		//converting string to int
		String num="12345";
		int convert=Integer.parseInt(num);
		System.out.println(convert+10);
		System.out.println(num+10);
		
		// when we will put "True" or "False" falue to int it will b erun time error
		
		
		
		//converting string to boolean
		boolean bln=Boolean.parseBoolean("True");
		boolean bln1=Boolean.parseBoolean("10");// by default its would be "false".
		System.out.println(bln);
		System.out.println(bln1);
		
		
		
		
		
		
	//converting String to Wrapper Class	
		String numb="1234";
		Integer num2=Integer.valueOf(numb);
		System.out.println(num2);
		
		
		
		
		
		//Converting String to Double
		//Sample1
		String dbl="25.99";
		
		//Converting String to primitive data type
		double dl1=Double.parseDouble(dbl);
		System.out.println(dl1);
		
		//Converting String to Object
		Double dbl2=Double.valueOf(dbl);
		System.out.println(dbl2);
		
		
		
		//Sample2
		String wy="True";
		
		//Converting String to primitive data type
		boolean my=Boolean.parseBoolean(wy);
		System.out.println(my);
		
		//Converting String to Object
		Boolean nu=Boolean.valueOf(wy);
		System.out.println(nu);
		
		
		
		
		
		//Unboxing
		Integer nullV=null;
		int nullVal=nullV;
		
		System.out.println(nullVal);
		//it will compile but will give NullPointerException
		
		
		
		
	}

}
