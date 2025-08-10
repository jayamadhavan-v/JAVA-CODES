package com.Basic_Problems;
public class UdemyNodes {
    public static void main(String[] args) {
        /*
        int  newValue = 50;// assignment operator
        if( newValue == 50){//relational operator
            System.out.println("here i had used equal to == operator");
        }
        //doing boolean operation
        boolean iscar = false;
        if (iscar){
            System.out.print("if ");
        }
        else {
            System.out.println ("else");
        }
         */
        /// / ternary operator
       /*
        String myNameIs = "Jayamadhavan";
        boolean checking = myNameIs == "Jayamadhavan" ? true : false;
        System.out.print(checking);


        */
        ///  Eligible for voting problem by using the ternary operator
        /*

        Scanner sc =  new Scanner(System.in);
        int input = sc.nextInt();
        String eligible = input >= 18 ? "you are eligible for voting " : "you are not eligible for voting ";
        System.out.print(eligible );

         */

        /// challenge
        /*

        double val1 = 20, val2 = 80, val3 = 100;
        //System.out.print(val1);
        double sumOfValues = (val1 + val2) * val3;
        System.out.println(sumOfValues);
        double remainderOfThree = sumOfValues % 40.00;
        System.out.println(remainderOfThree);
        boolean result = remainderOfThree == 0 ? true : false;
        System.out.println(result);

          */

        /// Method Challenges
        String [] playerNames = {"madhavan1","madhavan2","madhavan3","madhavan4"};
        int [] playerScores = {1500,900,400,90};
         for(int i=0;i < playerScores.length ;i++){
             int highScorePosition = calculateHighScorePosition(playerScores[i]);
             displayHighScorePosition(playerNames[i],highScorePosition);
         }

    }///end of filerWriterConcept psvm
    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println( playerName + " managed to get into position " +
                highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000){
            return 1;
        } else if(playerScore < 1000 && playerScore >= 500){
            return 2;
        } else if (playerScore < 500 && playerScore >= 100) {
            return 3;
        } else return 4;
    }
}
