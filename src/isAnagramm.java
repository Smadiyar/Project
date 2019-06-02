
public class isAnagramm {
	public static void main(String[] args) {
		String str1 = "forty five";
		String str2 = "over fifty";
		System.out.println("Is it anagram? "+isAnagram( str1, str2));
	}
		
	
	
	private static boolean isAnagram(String str1, String str2) {
	
		
		if(str1==str2) {
			return true;
		}
		if(str1==null || str2==null) {
			return false;
		}
		if(str1.length()!=str2.length()) {
			return false;
		}
		char[]str1Arr=str1.toLowerCase().toCharArray();
		char[]str2Arr=str1.toLowerCase().toCharArray();
		int [] count=new int[26];
		for (int i=0; i<str1Arr.length; i++) {
			count[str1Arr[i]-97]++;
			count[str2Arr[i]-97]--;
		}
		for(int i=0; i<26; i++) {
			if(count[i]!=0) {
				return false;
			}
			return true;
		}
		
		return false;
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
	

}
