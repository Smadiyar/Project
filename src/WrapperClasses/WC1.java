package WrapperClasses;

import java.util.ArrayList;

public class WC1 {

	public static void main(String[] args) {

		Integer in = new Integer(10);

		Long ln = new Long(40);
		Character ch = new Character('R');
		Boolean bl = new Boolean(true);
		System.out.println(in);

		Integer pnN = 4;

		Boolean bool = true;

		System.out.println(pnN);

		int num = 10;

		Integer num1 = num;

		// our number still primitive however We have assign primitive to the Integer
		// object.
		// This process called autoboxing......

		boolean str = true;

		Boolean bln = new Boolean(str);
		// Boolean bln=str; same

	
	
	Double db=2.4;
	
	Long lg=3l;
	
	Float fo=200f;
	
	//float ft=200; //if float has decimal point (20.5 we have to put letter f at the end)
	
	
	float ft=fo; //unboxing===>whaen we convert Wrapper class to primitive data type its called unboxing
	
	System.out.println(ft);
	
	
	ArrayList<Integer> arraiList=new ArrayList<Integer>();
	
	//storage , and it's not fixed size while array fixed
	//in array we can store primitive types, but in arrayList we can't,only objects
	
	
	
	
	
	
	
	
	
	
	}
}
