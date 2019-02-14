import java.util.ArrayList;
import java.util.Collections;

public class NumberSorter {

    private ArrayList<Integer> numbers;

    public NumberSorter(){
        numbers = new ArrayList<>();
    }


    public void addNumber(int number){
        numbers.add(number);

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
    public String getAllNumbersSmallestToLargest(){
        Collections.sort(numbers);

        StringBuilder stringBuilder = new StringBuilder();
        for(Integer value: numbers){
            stringBuilder.append(value.toString() + " ");
        }

        return stringBuilder.toString();
    }

    public String getAllNumbersLargestToSmallest(){
        Collections.sort(numbers);
        Collections.reverse(numbers);

        StringBuilder stringBuilder = new StringBuilder();
        for(Integer value: numbers){
            stringBuilder.append(value + " ");
        }

        return stringBuilder.toString();
    }


    public int getAverage(){
        int sum = 0;
        for(Integer number : numbers){
            sum += number;
        }

        return sum/numbers.size();
    }

    public void displayAverage(){}


    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }
}
