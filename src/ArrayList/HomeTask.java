package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HomeTask {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
// Create the application for picnic organization.
		ArrayList<String> names=new ArrayList();
		System.out.println("Welcome! \nPlease enter your name: ");
// if person wanna come to picnic ad his/her name to the list
		for(int i=0; i<5; i++) {
			names.add(scn.nextLine());
		}
		
		 for(int i=0; i<names.size(); i++) {
			 System.out.print(names.get(i)+" "); 
		 }
		 
		 
 // after adding person to the list if he/she doesn’t wanna come anymore delete person from list.		 
		 names.remove(1);
 // if you wanna replace the person with another person you should be able to replace the person from list.
		names.set(2, "Kay");
		
// If you wanna see the all list. You should be able to print all of them.	
		for(int i=0; i<names.size(); i++) {
			 System.out.print(names.get(i)+" "); 
		 }
		   
// if you wanna check the person is coming to the picnic or not	
		boolean answ=names.contains("Hannah");
		System.out.println(answ);
		
 // Sort the persons with alphabetical order	
		Collections.sort(names);
		System.out.println(names);
		
		
		
		
		
		
		
		
		
		
	}

}
