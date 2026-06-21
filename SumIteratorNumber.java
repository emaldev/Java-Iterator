import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class SumIteratorNumber {
     public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int number;
        

    
        for(int i = 0; i  < 5; i++){
            System.out.println("Enter number " + (i + 1) + ": ");
            number = input.nextInt();
            numbers.add(number);
        }
           
        int sum = 0;
        Iterator<Integer> myIterator = numbers.iterator();
        while(myIterator.hasNext()){
            Integer num  = myIterator.next();
            sum += num;
            

            
        }
        System.out.println("This is the sum number of ArrayList: " + sum);


     }
}
