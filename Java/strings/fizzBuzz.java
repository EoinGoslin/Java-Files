/*
Write a Java program that prints out the integers from 1 to 100. [7 marks]
For the multiples of three print “Fizz” instead of the number and
for the multiples of five print “Buzz”. For numbers which are
multiples of both three and five print “Fizzbuzz”*/
public class fizzBuzz {
    public static void main (String[] args) {
        int x = 100;
        for(int i = 1; i<=x; i++){
            if(i%3==0 && i%5==0)
            System.out.println("FizzBuzz");
            else if(i%3==0)
            System.out.println("Fizz");
            else if(i%5==0)
            System.out.println("Buzz");
            else
            System.out.println(i);

        }


    }
}