package Player;

import java.lang.reflect.Array;

public class Player{
    public class Selection extends Player{
        int x; 
        int y; 
        int player_symbol;
        

        public Selection(int x, int y){
            this.x=x; 
            this.y=y;
        }

        public int getX() {
            return x;
        }

        public int getY() {

            return y;
        }

        public int getPlayerId(){
            return player_symbol;
        }

        public void setPos(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    int symbol;
    Selection[] selections;
    int selection_counter;
    boolean isWinner;

    public Player() {
        this.selections = new Selection[50];
        this.selection_counter = 0;
        this.isWinner = false;
    }

    public boolean isWinner(){
        return isWinner;
    }

    public void setSymbol(int symbol){
        this.symbol = symbol;
    }

    public int getSymbol(){
        return symbol;
    }

    public void setPlayerSelection(int x, int y){
        selections[selection_counter++].setPos(x, y);
    }

    public Selection[] getPlayerSelections(){
        return this.selections;
    }

    public boolean haveSelections(){
        return Array.getLength(selections) == 0;
    }



}
