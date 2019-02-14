import java.util.ArrayList;

public class NumberSorter {

    private ArrayList<Integer> numbers;

    public NumberSorter(){
        numbers = new ArrayList<>();
    }


    public void addNumber(int number){
        numbers.add(number);
        System.out.println("The number " + number + " has been added.");
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }
}
