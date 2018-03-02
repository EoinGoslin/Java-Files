/*
The goal is to read in a number of fair coin tosses, and a target number of heads, 
and output the probability that the target number of heads in a 
row will be tossed at some point in the sequence, rounded to the nearest percent.
*/
import java.util.Scanner;
public class headsInRow{
    public static void main (String[] args){
        Scanner userScan = new Scanner(System.in);
        System.out.println("Enter number of coin tosses ");
        int coinToss = userScan.nextInt();
        System.out.println("Target number of heads");
        int target = userScan.nextInt();//say number is 5
        int head = 0;
        int sim = 1000000;
        int success = 0;
        int record = 0;

        //start simulation
        for(int i = 0; i < sim;i++){
            head = 0;
            record = 0;
            
            for(int j = 0; j < coinToss; j++){
                //throwing coins
                double random = Math.random();
                if(random > 0.5){//a head was thrown
                    head++;
                    if(head > record){//number in a row
                        record = head;//keep track of that number of heads
                }
                else {
                    head = 0;
                }

            }
            
        }//end of coin toss
        if(record >= target) {
            success++;
        }




    }
        System.out.println(success*100/sim);

    }

}