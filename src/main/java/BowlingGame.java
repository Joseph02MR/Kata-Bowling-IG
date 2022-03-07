public class BowlingGame {

    public int score =0;
    public int [] rolls = new int[21];
    public int rollactual =0;
    public BowlingGame bowlingObj;

    public void tiradas (int n, int pins){
        for(int i=0 ; i < n ;i++){
            bowlingObj.roll(pins);
        }
    }

    public void roll(int pins) {
        score += pins;
    }

    public int score (){
        return score;
    }


}

