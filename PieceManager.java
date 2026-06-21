import java.util.ArrayList;
import java.util.Iterator;

public class PieceManager {
    public static void main(String[] args){
    
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println(numbers);

        Iterator<Integer> myIterator = numbers.iterator();

        while(myIterator.hasNext()){
            Integer num  =  myIterator.next();
            if(num == 30){
                myIterator.remove();
            }else {
                System.out.println(num);
            }
        }

    }
    
}
