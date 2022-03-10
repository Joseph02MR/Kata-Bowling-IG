public class BowlingGame {

    public int[] tiradas = new int[21];
    public int roll_actual = 0;


    public void tiradas (int n, int pins){
        for(int i=0 ; i < n ;i++){
            this.roll(pins);
        }
    }

    public void roll(int pins) {
        tiradas[roll_actual++] = pins;
    }

    public int score (){
        int score = 0;
        int index = 0;

        for(int juego = 0; juego < 10; juego++){
            //chuza
            if(tiradas[index] == 10){
                score += 10 + tiradas[index+1] + tiradas[index+2];
                index++;
            }
            else if(esJuegoSpare(index)){
                score += 10 + tiradas[index+2];
                index+=2;
            }
            else{
                score += tiradas[index] + tiradas[index+1];
                index+=2;
            }
        }
        return score;
    }

    private boolean esJuegoSpare(int index) {
        return tiradas[index] + tiradas[index +1]==10;
    }

    public void jugadaChuza(){
        roll(10);
    }

    public void jugadaSpare(){
        roll(5);
        roll(5);
    }


}

