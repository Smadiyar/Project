package GoodFriday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
	public static void main(String[] args) {
		//convert();
	List<Character> listWithChars=convert();
		Task3 array=new Task3();
		
		char[] c=array.convertToArray(listWithChars);
		System.out.println("CharArray: "+Arrays.toString(c));
		
	//	ArrayList remainChar=new ArrayList();
	
//		String longLongWord="WeHaveBeenGoingOverWhileLoopFor10TimesAndItIsFun";
//		
//		for(int i=0; i<longLongWord.length(); i++) {
//			remainChar.add(longLongWord.charAt(i));
//		}
//		System.out.println("ArrayList: "+ remainChar);
//		
//		
//		Object [] arr=remainChar.toArray(new Object[0]);
//		System.out.println(Arrays.toString(arr));
		
		
	}	
		
		public static List<Character> convert() {
			
	String longLongWord="WeHaveBeenGoingOverWhileLoopFor10TimesAndItIsFun";
	
	List<Character> list=new ArrayList<>();
	
	for(int i=0; i<longLongWord.length(); i++) {
		list.add(longLongWord.charAt(i));
	}
			System.out.println("Chars in ArrayList: "+list);
			return list;
			
		}
		
		
	public char [] convertToArray(List<Character>listOfChars) {
		char[] charArray=new char[listOfChars.size()];
		for(int i=0; i<charArray.length; i++) {
			charArray[i]=listOfChars.get(i);
		}
		return charArray;
	}
	

}
