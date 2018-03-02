/*The goal is to read in a list of students and exam scores into an
array and output the name of the student with the median score,
that is, the one which if you put them all in order would be in the
middle. For example the median of 40, 80, 20, 30 and 50 is 40,
because if you put them all in order 40 would be the middle
value, so output the name of the student who got 40. If there is
an even number of students, then output the name of the middle
two that comes first in alphabetical order.*/

/* sample input
4
Paul 18
Claire 94
David 34
John 25*/

import java.util.Scanner;
public class autumn2017 {

public static void main (String[] args) {
    Scanner userScan = new Scanner(System.in);
    System.out.println("How many students");
    int numbers = userScan.nextInt();userScan.nextLine();
    String[] studNames = new String[numbers];
    int[] studScores = new int[numbers];
for(int i = 0; i < numbers; i++) {
    System.out.println("Enter a name and an age: ");
    String[]students = userScan.nextLine().split(" ");
    
    studNames[i] = students[0];
    studScores[i] = Integer.parseInt(students[1]);
    
}//have names and students in two seperate arrays

   sortArrays(studScores, studNames);
    getMedian(studScores, studNames);
}

public static void sortArrays(int[] scores, String[] names) {

    int limit = scores.length;
    for(int i = 0; i < scores.length; i++){
        limit--;
        for(int j = 0; j < limit; j++){
            if(scores[j] > scores[j+1]) {
                int temp = scores[j+1];
                scores[j+1] = scores[j];
                scores[j] = temp;//swap scores 
                // have to swap names too
                String tempName = names[j+1];
                names[j+1] = names[j];
                names[j] = tempName;
            }
        }
    }

    for(int i = 0; i <scores.length; i++){
        System.out.println(scores[i] + " " + names[i]);
    }

    
}

public static void getMedian(int[] scores, String[] names) {
    //have to find middle number
     int medianLocation = ((scores.length)/2);//if 8 is 4
     if(medianLocation%2!=0){//even

     
     int median = 0;
     String medName = "";
   for(int i = 0; i <= medianLocation; i++) {
       median = scores[i];
       medName = names[i];
   }
   //System.out.println(medName + median);
   System.out.println("Name is " + names[medianLocation] + " and the score is " + scores[medianLocation]);
}
else {//if even
//medianLocation is the second middle one
//medianLocation-1 is the second middle one
int result = names[medianLocation-1].compareTo(names[medianLocation]);
if(result < 0)//medianLocation-1 less than medianLocation
{
    System.out.println(names[medianLocation-1] + scores[medianLocation-1]);
}
else {
        System.out.println(names[medianLocation] + "  " +  scores[medianLocation]);

}

}
}
}