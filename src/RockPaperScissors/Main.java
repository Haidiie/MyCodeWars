package RockPaperScissors;

public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.rps("rock", "scissors")); // Player 1 won!
        System.out.println(Kata.rps("scissors", "paper")); // Player 1 won!
        System.out.println(Kata.rps("paper", "rock")); // Player 1 won!
        System.out.println(Kata.rps("scissors", "rock")); // Player 2 won!
        System.out.println(Kata.rps("paper", "scissors")); // Player 2 won!
        System.out.println(Kata.rps("rock", "paper")); // Player 2 won!
        System.out.println(Kata.rps("scissors", "scissors")); // Draw!
        System.out.println(Kata.rps("rock", "rock")); // Draw!
        System.out.println(Kata.rps("paper", "paper")); // Draw!
    }
}
