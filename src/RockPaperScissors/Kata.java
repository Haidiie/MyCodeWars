package RockPaperScissors;

public class Kata {

    public static String rps(String p1, String p2) {
        String r = "rock"; String s = "scissors"; String p = "paper";
        if (p1 == r && p2 == r || p1 == s && p2 == s || p1 == p && p2 == p){
            return "Draw!";
        }
        else if (p1 == r && p2 == s|| p1 == s && p2 == p || p1 == p && p2 == r){
            return "Player 1 won!";
        }
        else if (p1 == s && p2 == r || p1 == p && p2 == s || p1 == r && p2 == p){
            return "Player 2 won!";
        }
        else return null;
    }

}
