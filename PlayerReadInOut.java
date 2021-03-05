package quiz;

import java.io.*;

public class PlayerReadInOut {

    public static void main(String[] args) throws Exception {

        Player player1 = new Player("Anders Andersdotter", 32, "abc@gmail.com", 3000, 2);

        //Writes to .ser
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\Documents\\WORKSPACE\\EC_Utbildning\\Avancerad_java\\Assignment\\src\\player.ser"));

        out.writeObject(player1);
        out.flush();
        out.close();

        // Reads from .ser
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\Documents\\WORKSPACE\\EC_Utbildning\\Avancerad_java\\Assignment\\src\\player.ser"));

        Player a = (Player) in.readObject();

        System.out.println("---------------------------");

        System.out.println("Name: " +a.name + " \n"
                + "Age: " + a.age + " years old \n"
                + "Email: " + a.eMail + " \n"
                + "Score: " + a.score + " points" + " \n"
                + "Number of games played: " + a.playedGames);
        System.out.println("---------------------------");

        in.close();
    }

}
