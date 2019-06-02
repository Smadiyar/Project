package StringBuilder;

public class StringBuilderTopic {
	public static void main(String[] args) {
		
		String alphabets="";
		 
		for(char character='a'; character<='z'; character ++) {
			alphabets+=character;
		}
		System.out.println(alphabets);
		
		
		
		
		StringBuilder builder=new StringBuilder();
		
		StringBuilder s1=new StringBuilder("Tech");
		StringBuilder s2=new StringBuilder(10);
		
		
		builder.append(15);
		
		builder.append(" String Builder ");
		
		builder.append(true);
		
		System.out.println(builder);
		
		s1.append("torial ").append(2019).append(" Best Summer ever.");
		System.out.println(s1);
		
		
		
		
		
		
		
		
		StringBuilder habbit=new StringBuilder();
		
		habbit.append("Purpose ");
		habbit.append("Self Confidence" );
		habbit.append("Enthusiasm ");
		habbit.append("Expertise ");
		habbit.append("Preperation ");
		habbit.append("Self Discipline ");
		habbit.append("Extraordinary performance ");
		System.out.println(habbit);
		
		
		
		
		
		
		StringBuilder success=new StringBuilder("Working Hard");
		
		success.append(" will not make you successful.");
		
		StringBuilder achievment=success.append(" Because thinking hard will make you successful");
		
		
		
		System.out.println(success);
		System.out.println(achievment);
		
		
		
		
		
		StringBuilder performance = new StringBuilder("Extraordinary");
		
		
		StringBuilder success1=performance.append(" working");
				
		success1=success1.append(" hard on java").append(" in 2019");
		
		System.out.println(performance);
		System.out.println(success1);
		
		
		
		System.out.println(performance==success1);
		
		
		
		
		
		
		
		
		StringBuilder location=new StringBuilder("Des Plaines 60018");
		
		char first=location.charAt(2);
		
		int number=location.indexOf("P");
		
		int length=location.length();
		String str=location.substring(12);
		
		
		System.out.println(str);
		System.out.println(location);
	
		
		
		
//		public boolean checkZipCode(String address) {
//		boolean zipcode1=false;
//		String onlyZip=address.substring(12);
//		
//		if(onlyZip.contentEquals("60018")) {
//			zipcode1=true;
//			return zipcode1;
//			
//		}
//		return zipcode1;
		
		
	
		
	
		int number3=6;
		
		
		StringBuilder car=new StringBuilder("Lexus");
		
		car.append(2019);
		car.insert(number3,"RX 450");
	
		System.out.println(car);
		
		
		
		
		
	//delete();	
		StringBuilder state=new StringBuilder("California 66");
		
		state.delete(11, 16);
		
		System.out.println(state);
		
		
		
		
		//deleteCharAt();
		
		state.deleteCharAt(9);
		System.out.println(state);
		
		
		
		
		
		
		String sta="Illinois";
		
		
		String str3="";
		
		
		for(int i=sta.length()-1; i>=0; i--) {
			str3+=sta.charAt(i);
		}
		System.out.println(str3);
		
		
		//reverse();
		
		StringBuilder sta1=new StringBuilder("Illinois");
		
		sta1.reverse();
		
		
		System.out.println(sta1);
		
		
		//toString();
		
		String state4=sta.toString();
		
		System.out.println(state4);
		
		
		
		
		
		
		
		StringBuilder capacity=new StringBuilder(10);
		StringBuilder capacity1=new StringBuilder("ClassRoom");
		
		System.out.println(capacity1);
		
		System.out.println(capacity);
		
		//capacity() ===>will give the value of the string 
		
		
		
		
		
		
		
		
		
		
		
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
