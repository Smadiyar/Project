package GoodFriday;

public class Task1 {
	public static void main(String[] args) {
		String longLongWord="WeHaveBeenGoingOverWhileLoopFor10TimesAndItIsFun";
		
		whileLoop(longLongWord,10);
	}

//	static 
//    static 
//    static 

  public static String whileLoop(String longLongWord, int length){
	  String result="";
	  int num=10;
	  int count=1;
	  //if(longLongWord.length()>length) {
	  //int i=longLongWord.length()-1;

	  if(longLongWord.length()>num) {
  while(longLongWord.length()>=num) {
      result=longLongWord.substring(0, longLongWord.length()-1);
      count++;
  }
        System.out.println(result);
        //return result;
    }
	  else {
		  System.out.println("Sorry your word is too big");
	  }
	return null;
  }   
  
  }
	
	

