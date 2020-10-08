import java.util.Random;
import java.util.Scanner;

public class SnakeEyes {

    public static void main(String[] args) {
        //roll 1 & 2
        boolean noSnake = true;
        int score = 0;
        int maxr = 6;
        int rolls = 0;
        int testAmount = 0;
        int totalRolls = 0;
        int totalScore = 0;
        float overFour = 0;
        Random randomGen = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input amount of test:");
        int testTotal = scan.nextInt();
        while (!(testTotal == testAmount)){
            while (noSnake) {
                int r1 = randomGen.nextInt(maxr+1);
                int r2 = randomGen.nextInt(maxr+1);
                
                if (r1 == 1 && r2 == 1){
                        noSnake = false;
                }
                
                score = score + r1 + r2;
                rolls+= 1;
                //System.out.println(rolls);
            }
            totalRolls = totalRolls + rolls;
            totalScore = totalScore + score;
            if (rolls > 4) overFour = overFour + 1;

            score = 0;
            rolls = 0;

            testAmount+=1;
            noSnake = true;
        }

        float percentFour = overFour/testTotal;
        percentFour = percentFour*100;
        int averageRolls = totalRolls/testTotal;
        int averageScore = totalScore/testTotal;
        System.out.println("Average rolls: "+averageRolls);
        System.out.println("Average score: "+averageScore);
        System.out.println("Percent over 4 rolls: "+percentFour+"%");
    }
    
}