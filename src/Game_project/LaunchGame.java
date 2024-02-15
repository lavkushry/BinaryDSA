package Game_project;

import java.util.Scanner;

class Guesser
{
    int guessNum;
   int gussingNumber(){
        System.out.println("Guesser Kindly guess the Number");
        Scanner scan = new Scanner(System.in);
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class Player
{
    int guessNum;
    int gussingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player! Kindly guess the Numeber");
        guessNum=scan.nextInt();
        return guessNum;
    }
}
class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
       numFromGuesser= g.gussingNumber();

    }
    void collectNumFromPlayers()
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 =p1.gussingNumber();
        numFromPlayer2 =p2.gussingNumber();
        numFromPlayer3 =p3.gussingNumber();

    }
    void compare()
    {
        if (numFromGuesser==numFromPlayer1)
        {
            if(numFromGuesser== numFromPlayer2 && numFromGuesser ==numFromPlayer3){
                System.out.println("Sab ne Shi Ans Diya ! Sub Winner hain Bhai");
            } else if (numFromGuesser==numFromPlayer2) {
                System.out.println("Player1 and Player2 Jeet gye");
            }else if (numFromGuesser==numFromPlayer3) {
                System.out.println("Player1 and Player3 Jeet gye");
            }else {
                System.out.println("Player1 Won the game");
            }

        }
        else if (numFromGuesser==numFromPlayer2)
        {
            if(numFromGuesser== numFromPlayer3)
            {
                System.out.println("Player2 and Player3 jeet gye");
            }else{
                System.out.println("Player2 Won the game");
            }

        } else if (numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player3 Won the game");
        }else {
            System.out.println("Aap game haar gye");
        }

    }
}
public class LaunchGame {
    public static void main(String[] args) {
        System.out.println("Game Started");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();

    }
}
