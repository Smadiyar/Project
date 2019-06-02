package GoodFriday;

public class Task2 {
	public static void main(String[] args) {
		String longLongWord="WeHaveBeenGoingOverWhileLoopFor10TimesAndItIsFun";
		String cut="";
		int count=0;
		int i=longLongWord.length()-1;
		
		while (i>=10) {
			cut=longLongWord.substring(0,i);
			i--;
			count++;
		}
		
		System.out.println(cut);
		System.out.println(count);
	}

}
