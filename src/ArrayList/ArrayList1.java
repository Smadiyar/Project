package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		
		
	// dog, cat, lion
		//ways t0 create ArrayList
		
		ArrayList list=new ArrayList();
		
		ArrayList list1=new ArrayList(10);
		//                            capacity
		
		ArrayList list2=new ArrayList(list1);
		//list2 will take value and capacity of list1
		
		ArrayList <Integer> list3=new ArrayList<>();
		
		
		ArrayList <Integer> list4=new ArrayList<Integer>();
		
		
		List list5=new ArrayList();
		
		
		
		
		
		
		List animal=new ArrayList();
		
		//add() method
		animal.add("Dog");
		animal.add("Cat");
		animal.add("Chicken");
		animal.add(1, "Parrot");
		animal.add(3, "Cow");
		animal.add(0, "Bird");
		
		System.out.println(animal);
		
		
		
		
		animal.add(true);// autoboxing
		animal.add(123); // cause of the autoboxing we can store the value. it will automatically converted 
		//to the object
		
		animal.add(Boolean.TRUE);// Wrapper Class Boolean object
		
		System.out.println(animal);
		
		
		//get() method
		
		System.out.println(animal.get(3));
		
		    // we also can use animal.size()
		for(int i=0; i<9; i++) {
			System.out.println("Animal kind is: " +animal.get(i));	
		}
		
		
		
		
		
		//remove() method
		
		animal.remove("Dog"); //key sensitive, it will remove from ArrayList
		animal.remove("Dog"); //after removing first time it will run and not throw element 
		animal.remove(5); // cause 10 is bigger than the size of ArrayList.
		//will give the runtime IndexOutOfBoundException
		
		animal.remove(2);
		
		System.out.println(animal);
		
		
		//set() method
		animal.set(1, "Cat");
		//will replace the element of thw arrayList on the specified location
		System.out.println(animal);
		
		
		
		
		//isEmpty() method
		System.out.println(animal.isEmpty());
		
		
		//size() method
		System.out.println(animal.size());
		
		
		//clear() method
		//animal.clear();
		
		
		//contains() method
		System.out.println(animal.contains("Cow"));
		System.out.println(animal.contains("O"));
		
		
		
		
		
		
		
		
		
  List <String> animal1=new ArrayList();
		
		//add() method
		animal1.add("Dog");
		animal1.add("Cat");
		animal1.add("Chicken");
		animal1.add(1, "Parrot");
		animal1.add(3, "Cow");
		animal1.add(0, "Bird");
		
		
		String[] str=animal1.toArray(new String[1]);
		
		System.out.println(str[0]);
		
		
		
    String [] app= {"Instagram", "Twitter", "Facebook"};

	List<String> appl=Arrays.asList(app);
	//Arrays.asList() method will convert from array to ArrayList
	System.out.println(appl.get(0));
		
		
		
	//IMPORTANT NOTE:
	//When we will convert from Array to ArrayList the size of the ArrayList is fixed.
	//We can not add value to ArrayList
	

		
		appl.set(0, "Snapchat");
		System.out.println(appl);
		
		
		
		
		
		List <Integer> nm=new ArrayList<>();
		nm.add(10);
		nm.add(4);
		nm.add(6);
		nm.add(8);
		System.out.println(nm);
		
	  Collections.sort(nm);//Will sort the ArrayList
		
		
		System.out.println(nm);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 
	

}
