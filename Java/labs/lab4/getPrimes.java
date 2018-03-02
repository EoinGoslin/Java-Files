public class getPrimes {
    public static void main (String[] args) {
        int x = 100;//get primes up until 100
        for(int i = 2; i <=x; i++) {
            if(primeChecker(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean primeChecker(int x) {
        for(int i = 2; i <= Math.sqrt(x); i++) {//start at two cos 0 and 1 are not primes
        if(x%i == 0) {
            return false;
        }
        }
        
            return true;
        

        }
    }
