package Interfaces;


public class models{
    public abstract interface Selection{
        int getX();
        int getY();
        int getPlayerId();
        void setPos(int x, int y);

    }

    public abstract interface Player {
        void setPlayerSelection(int x, int y);
        Selection[] getPlayerSelections();
        boolean haveSelections();
        int getSelectionCounter();
        int getId();
        boolean isWinner();
    }

    public abstract interface Board {
        int getHeight();
        int getWidth();
        int[][] getMatriz();
        Error setSelection();
        boolean isLinked(Selection s);
    }

}


