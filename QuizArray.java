package quiz;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizArray implements Serializable {


    public QuizArray () {
    }

    public static void main(String[] args) throws Exception {

        List<Quiz> questionList = new ArrayList<Quiz>();


        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------------------------");
        System.out.println("Tryck in en siffra för vad du vill göra");
        System.out.println("-------------------------------------------");
        System.out.println(" 1. Spela spelet ");
        System.out.println(" 2. Visa en lista med frågorna ");
        System.out.println(" 3. Lägg till en fråga ");
        System.out.println(" 4. Ta bort en fråga ");
        System.out.println(" 5. Redigera en fråga ");
        System.out.println("-------------------------------------------");

        int nr = input.nextInt();

        switch (nr) {
            case 1:
                // kod block
                break;
            case 2:
                //
                break;
            case 3:
                System.out.println("Skriv in frågan: ");

                break;
            case 4:
                // kod block
                break;
            case 5:
                // kod block
                break;
            default:
                // code block
        }


        //Writes to .ser
        //ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\Documents\\WORKSPACE\\EC_Utbildning\\Avancerad_java\\Assignment\\src\\questions.txt"));

        // Reads from .ser
        //ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\Documents\\WORKSPACE\\EC_Utbildning\\Avancerad_java\\Assignment\\src\\questions.txt"));

    }




}
