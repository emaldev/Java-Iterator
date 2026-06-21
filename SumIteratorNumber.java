import java.util.ArrayList;
import java.util.Iterator;
public class SumIteratorNumber {
     public static void  main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
           
        int sum = 0;
        Iterator<Integer> myIterator = numbers.iterator();
        while(myIterator.hasNext()){
            Integer num  = myIterator.next();
            sum += num;
            

            
        }
        System.out.println("This is the sum number of ArrayList: " + sum);


     }
}
