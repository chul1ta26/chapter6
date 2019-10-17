public class Divisible {

    /**
     A method to test if the first argument is divisible by the second argument
     @param n the integer to be divided
     @param m the integer to divide
     @ return true if m is not `0` and n is divisible by m
     */
    public boolean isDivisible(int n, int m){
        return (m != 0  && n % m ==0);
    }

}
