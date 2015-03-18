package nyc.c4q.hoshikoo;

import java.util.Scanner;
public class Hangman {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        SecretWord sw = new SecretWord("CAT");
        Drawing dr = new Drawing();
        char userInput;

        System.out.println("Let's Play Hangman!");
        int j=0;

        System.out.println("Word: " + sw.toString());
        //System.out.println(sw.reveal());
        System.out.println(dr.get(0));
        System.out.println("Misses: " + 0);
        System.out.print("Guess: ");
        userInput = input.next().toCharArray()[0];
            if (sw.isLetter(userInput)) {
                for (int i = 0; i < 6; i++) {

                    System.out.println("Word: " + sw.toString());
                    //System.out.println(sw.reveal());
                    System.out.println(dr.get(i));

                    System.out.println("Misses: " + j);
                    System.out.print("Guess: ");
                    userInput = input.next().toCharArray()[0];
                    System.out.print(userInput);
                    //if(sw.isLetter(userInput)){
                    //  sw.set(userInput);
                    //}
                }
            }else{
                    j++;
                System.out.println(dr.get(j));
                System.out.println(j);
            }
        }
}

       /* System.out.println("Word: "+sw.toString());
        System.out.println(sw.reveal());
        System.out.println(dr.get(0));
        System.out.println(sw.isLetter('A'));
        sw.set('A');
        System.out.println(sw.toString());
        sw.set('C');
        System.out.println(sw.toString());

        System.out.println(dr.get(6));*/

