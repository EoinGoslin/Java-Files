import java.util.Scanner;
public class Luhns {
    public static void main (String[] args)
    {

       //create Scanner object
       Scanner userScan = new Scanner(System.in);
       System.out.println("Enter credit card Number : ");
       String number = userScan.nextLine();//Have taken in the credit card number

       if(number.equals("0"))
       {
           System.out.println("INVALID");

       }
       else {

       

       //loop through every number starting from furthest
       //right digit, and one one in from that
       //e.g. 12345 - would start from 4
        //Every second digit, multiply by 2
        int digit = 0, total = 0;

        for(int i = 0; i < number.length()-1; i++)
        {
            digit = Integer.parseInt(""+number.charAt(number.length()-i-2));//skips furthest last digit
            //save into digit, a converted (from String to int) digit from number taken in

            //check if it is every second digit
            //if it is, multiply by two

            if(i%2==0)
            {
                digit=digit*2;//multiply value by two
                

            }

            //then check if value greater than 9, if it is, add both parts of number
            //e.g. 16 = 1+6 = 7
            //OTHER OPTION
            //Because credit card numbers only go up to 9
            //if doubled, Max will ever be is 18, so just -9 the value if original value greater than 9
            //E.g. 16-9 = 7

            if(digit>9){
                digit = digit-9;
            }
            //Next, just have to add up all of the digits
            total += digit;





        } //end of for loop

        //To check if valid/invalid, must now add on last digit from number taken in
        //to total
        //This is because last digit was not accounted for in for loop because every 
        //digit starting from furthest to right-1 is assessed in Luhn's Algorithm
        //If, after adding last number, total == 0, then is VALID, otherwise, INVALID

        if((total + Integer.parseInt(""+number.charAt(number.length()-1)))%10 ==0) {
            System.out.println("VALID credit card number");
        }
        else {
            System.out.println("INVALID credit card number");
        }
        

    }

    }




}