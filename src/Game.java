import java.util.TimerTask;
import java.util.ArrayList;
public class Game extends TimerTask {

    int bathCapacity;
    ArrayList<Problem> problems;
    int i = 0;

    public Game(int b, ArrayList<Problem> p){
        super();
        bathCapacity = b;
        problems = p;

    }
    @Override
    public void run(){
        ClearScreen();
        System.out.print(i);
        i++;

    }
    private void ClearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
