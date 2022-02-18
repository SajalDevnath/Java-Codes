package com.javacodes;
import java.util.LinkedList;
public class Player {
    static LinkedList<Player> players = new LinkedList<Player>();
    String name;
    int playerID, round1Score, round2Score;
    Player(int id, String name, int m1, int m2){
        playerID = id;
        this.name = name;
        round1Score = m1;
        round2Score = m2;
    }
    @Override
    public String toString(){
        return "name: "+ name;
    }

    public static void main(String[] args) {
        players.add(new Player(3, "Aman",65,85));
        players.add(new Player(6, "Syed",80,50));
        players.add(new Player(8, "Anu",73,78));
        players.add(new Player(4, "Rhea",48,50));
        players.add(new Player(1, "Raj",75,44));
        for(Player p: players){
            if((p.round1Score + p.round2Score)/2 < 60){
                players.remove(p);
            }
        }
        System.out.println("Qualified players: ");
        for(Player p : players){
            System.out.println(p);
        }
    }
}
