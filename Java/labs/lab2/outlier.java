import java.util.Scanner;
public class outlier {
public static void main (String[] args) {
Scanner userScan = new Scanner(System.in);
//take in in first three numbers
int num1 = userScan.nextInt();
int num2 = userScan.nextInt();
int num3 = userScan.nextInt();

//get average
int avg = (num1 + num2 + num3)/3;

//get difference by minus indiviudual numbers from average
//need to use Math.abs
int OneDiff = Math.abs((num1 - avg));
int TwoDiff = Math.abs((num2 - avg));
int ThreeDiff = Math.abs((num3 - avg));

//check which one is bigger to get outlier
if(OneDiff > TwoDiff && OneDiff > ThreeDiff) {
    System.out.println("Outlier is " + num1);
}
else if(TwoDiff > OneDiff && TwoDiff > ThreeDiff) {
        System.out.println("Outlier is " + num2);

}
else if(ThreeDiff > TwoDiff && ThreeDiff > OneDiff) 
{
        System.out.println("Outlier is " + num3);

}
else {
        System.out.println("No outlier");

}







}




}