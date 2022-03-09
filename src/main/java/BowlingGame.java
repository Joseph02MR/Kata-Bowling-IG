public class BowlingGame {

    public int score =0;


    public void tiradas (int n, int pins){
        for(int i=0 ; i < n ;i++){
            this.roll(pins);
        }
    }

    public void roll(int pins) {
        score += pins;
    }

    public int score (){
        return score;
    }

}

