package Board;

import Interfaces.models;

public class Board {
    int height;
    int width;
    int[][] matriz; //[alto][ancho]

    public Board(int v){matriz = new int[v][v];}
    public Board(int height, int width){matriz = new int[height][width]; this.height = height; this.width = width;}

    public int[][] getMatriz(){
        return matriz;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }

    public Error setSelection(models.Selection s){
        if (isUsed(s)){
            return new Error("Espacio en uso"); 
        }
        matriz[s.getY()][s.getX()] = s.getPlayerId();
        return null;
    }

    private boolean isUsed(models.Selection s){
        return matriz[s.getY()][s.getX()] == 0;
    }

    public boolean isLinked(models.Selection s){
        for (int i = -1; i<=1; i++){
            for (int g = -1; g <= -1;g++){
                if (matriz[s.getY()+i][s.getX()+g] == s.getPlayerId()){
                    return true;
                }
            }
        }
        return false;
    }


    
}
