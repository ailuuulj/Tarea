package Game;

import java.time.LocalTime;
import Interfaces.models;
import Interfaces.models.Player;

public class Game {

    LocalTime created_at;
    LocalTime game_duration;
    static final int LINKS = 3;

    public Game() {
        this.created_at = LocalTime.now();
    }

    public boolean isWin(models.Player p, models.Board b){
        if (!p.haveSelections()) { return false; }

        int select_ctr = p.getSelectionCounter(); 
        if (select_ctr < LINKS){ return false; }

        models.Selection[] s = p.getPlayerSelections();
        int links = 0;
        for (int i=0;i<select_ctr && links < LINKS;i++){
            if (b.isLinked(s[i])){
                links++;
            }
        }
        return links == LINKS;
    }

    public void endGame() {
        LocalTime endgame_at = LocalTime.now();

        int played_hours = endgame_at.getHour() - this.created_at.getHour();
        int played_minutes = endgame_at.getMinute() - this.created_at.getMinute();
        int played_seconds = endgame_at.getSecond() - this.created_at.getSecond();

        this.game_duration = LocalTime.of(played_hours, played_minutes, played_seconds);
    }

    public LocalTime getGameDuration(){
        return this.game_duration;
    }

    public InitGame(Player p1, Player p2, Board b){
        while (!p1.isWinner() && !p2.isWinner()){
            
        }
    }
}
