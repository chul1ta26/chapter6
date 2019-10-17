public class OddSum {

    public static int oddSum(int n){
        return ((n==1)?(1):(n*oddSum(n-2)));
    }
}
