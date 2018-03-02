/*
The goal is to read in a number of fair coin tosses, and the probability that a given coin toss will produce heads,
and output the probability that the majority of coin tosses will be heads, rounded to the nearest percent.
*/
import java.util.Scanner;
public class targetHead {
    public static void main (String[] args){
        Scanner userScan = new Scanner(System.in);
        System.out.println("Enter number of coin tosses :");
        int tossNumber = userScan.nextInt();
        System.out.println("Enter probability of heads :");
        int probability = 60;
        int success = 0;//every time target number of heads is reached
        int head = 0;

        //start of simulation
        for(int i = 0; i< 100; i++) {
            //in the simulation
            //if greater than .5 then it is heads
            head = 0;
            for(int j = 0; j < tossNumber; j++){
                //throwing a coin
                double random = Math.random();

                if(random > 0.5) {//a head was thrown
                    head++;
                }




            }
            if(head)
            //5 throws has been completed

          




        }

    }
}