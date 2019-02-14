import java.util.ArrayList;
import java.util.Collections;

public class NumberSorter {

    private ArrayList<Integer> numbers;

    public NumberSorter(){
        numbers = new ArrayList<>();
    }


    public void addNumber(int number){
        numbers.add(number);

        System.out.println("The number " + number + " has been added.");
    }

   public int getSmallestNumber(){
        Collections.sort(numbers);
       return numbers.get(0);
   }

   public int getLargestNumber(){
        Collections.sort(numbers);
        Collections.reverse(numbers);
        return numbers.get(0);
   }
    public void displayNumbersSmallestToLargest(){}

    public void displayNumbersLargestToSmallest(){}

    public void displayAverage(){}


    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }
}
