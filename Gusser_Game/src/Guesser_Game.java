import java.util.Scanner;

    class Guesser{
         int guessNum;

         int getGuessNum(){
             Scanner scan = new Scanner(System.in);
             System.out.println("Kindly! Enter a number ");
             guessNum=scan.nextInt();
             return guessNum;
         }
    }

    class Player{
        int pguessNum;
        int getPguessNum(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Player Plz Guess a number ");
            pguessNum=scan.nextInt();
            return pguessNum;
        }
    }

    class Middle {
        int numFromGuesser;
        int numFromPlayer1;
        int numFromPlayer2;
        int numFromPlayer3;

        public void collectNumFromGuesser() {
            Guesser g = new Guesser();
            numFromGuesser = g.getGuessNum();
        }

        public void collectNumFromPlayers() {
            Player p1 = new Player();
            Player p2 = new Player();
            Player p3 = new Player();
            numFromPlayer1 = p1.getPguessNum();
            numFromPlayer2 = p2.getPguessNum();
            numFromPlayer3 = p3.getPguessNum();
        }


        void Compare() {
            if (numFromGuesser == numFromPlayer1) {
                if (numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer3) {
                    System.out.println("All Three won the Game.....");
                } else if (numFromGuesser == numFromPlayer2) {
                    System.out.println("Player 1 And Player2  won the Game");

                } else if (numFromGuesser == numFromPlayer3) {
                    System.out.println("Player 1 And Player3 won the game");
                } else
                    System.out.println("Player 1 won the Game...");
            }
             else if (numFromGuesser == numFromPlayer2) {
                if (numFromGuesser == numFromPlayer3) {
                    System.out.println("Player 2 And Player3 won the Game...");
                } else
                    System.out.println("Player2 won the Game...");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player3 won the Game...");
            }
             else{
                System.out.println("Game lost, Try Again.....");
        }
    }


            
        }



class Guesser_Game{
    public static void main(String[] args) {
        Middle u = new Middle();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.Compare();
    }
}
