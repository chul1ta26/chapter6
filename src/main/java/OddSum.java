public class OddSum {

    public  int oddSum(int n){
        return ((n==1)?(1):(n*oddSum(n-2)));
    }
}
