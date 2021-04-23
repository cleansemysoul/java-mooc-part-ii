
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        while(this.numbers.size() < 7){
           int random = this.random.nextInt(40)+1;
           if(!this.numbers.contains(random)){
               this.numbers.add(random);
           }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        for(int e : numbers){
            if(e ==number){
                return true;
            }
        }
        return false;
    }
}
