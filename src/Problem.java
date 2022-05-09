public class Problem {
    //instance variables
    private final int points;
    private final double answer;
    private final int timeS;
    private final String problem;
    public Problem(int p, double a, int t, String pr){
        //setup
        points = p;
        answer = a;
        timeS = t;
        problem = pr;
    }
    //getter methods

    public int getPoints() {
        return points;
    }

    public String getProblem() {
        return problem;
    }

    public int getTimeS() {
        return timeS;
    }

    public double getAnswer() {
        return answer;
    }

    //for testing purposes
    @Override
    public String toString(){
        return (points + " " + answer + " " + timeS + " " + problem);
    }
}

