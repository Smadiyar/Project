package ArrayList;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Collections;
public class HomeTAsk2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        ArrayList<String>name=new ArrayList<>();

        for(;;){
        	System.out.println("Welcome! \nPlease choose the one function from below: ");
            System.out.println("0 => add name, 1 => remove, 2 => replace, 3 =>finish");
            int in=input.nextInt();

            if (in==0){
                for (int i=0;i<2;i++){
                String na=input.nextLine();
                name.add(na);
            }
                }
            if (in==1){
                for (int i=0;i<2;i++){
                name.remove(input.nextLine());
                }
                }
            if (in == 2){
                for (int i=0;i<1;i++){

                name.set(input.nextInt(),input.nextLine());
            }
                }
            if (in==3){
                break;
            }
        }
            Collections.sort(name);
            System.out.println(name);
    }
}
