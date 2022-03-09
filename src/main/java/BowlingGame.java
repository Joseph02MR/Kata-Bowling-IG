public class BowlingGame {


    public int [] rolls = new int[21];
    public int rollactual =0;

    public void tiradas (int n, int pins){
        for(int i=0 ; i < n ;i++){
            this.roll(pins);
        }
    }

    public void roll(int pins) {
        rolls[rollactual++] =pins;
    }

    public int score (){
        int score =0;
        int index=0;
        for(int i=0;i< 10; i++)
        {
            if (rolls[index] == 10) {
                score+=10 + rolls[index +1] +rolls[index +2];
                index ++;
            }
            else if(EsSpare(index)){ //spares
                score += 10 + rolls[index + 2];
                index +=2;
            }
            else
            {
                score += rolls[index] + rolls[index + 1];
                index+=2;
            }
        }
        return score;
    }

        public boolean EsSpare(int index){
        return rolls[index] + rolls[index + 1]==10;
        }

}

