import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String[] args){

        ArrayList<Integer> mArrayList = new ArrayList<Integer>();
        mArrayList.add(12);
        mArrayList.add(8);
        mArrayList.add(80);
        mArrayList.add(90);
        mArrayList.add(23);
        mArrayList.add(86);
        mArrayList.add(34);

        Iterator<Integer> myIterator = mArrayList.iterator();

        while(myIterator.hasNext()){
           
            Integer number = myIterator.next();
            if(number  <= 50){
                myIterator.remove();
                 
               
            }else{
                System.out.println(number);

            }
            
        }

    }
    
}
