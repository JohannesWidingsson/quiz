package quiz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Person implements Serializable {

    int score;
    int playedGames;

   static ArrayList<Player> playerList = new ArrayList<>();

    public Player(String name, int age, String eMail, int score, int playedGames) {
        super(name, age, eMail);
        this.score = score;
        this.playedGames = playedGames;
    }





    public static void createPlayer(String name, String eMail, int age, int score, int played_games){
        Player player = new Player(name,age, eMail,score, played_games);
        playerList.add(player);
        System.out.println(playerList);
    }

    public static void createNewPlayer(){
        System.out.println("Create your character pls");
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your name");

        String name = scan.nextLine();
        System.out.println("Type your eMail");

        String eMail = scan.nextLine();
        System.out.println("type your age");

        int age = scan.nextInt();
        System.out.println("your score is 0");

        int score  = scan.nextInt();
        System.out.println("your playedgames is 0");

        int played_games = scan.nextInt();
        System.out.println("You have created your character");

        Player.createPlayer(name, eMail,age ,score, played_games );

    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eMail='" + eMail + '\'' +
                ", score=" + score +
                ", playedGames=" + playedGames +
                '}';
    }
}
