import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class NumberIterator {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int num;
        ArrayList<Integer> numbers = new ArrayList<Integer>();


        for(int i = 0; i < 5; i++){
            System.out.println("Enter number : " + (i + 1) + ": ");
            num = input.nextInt();

            numbers.add(num);

        }

        Iterator<Integer> myIterator = numbers.iterator();

        while(myIterator.hasNext()){
            Integer i = myIterator.next();
            if(i % 2 != 0){
                myIterator.remove();
            }else{
               
                System.out.println("this is my even number :>" + i);
            }
        }


    }
    
}
