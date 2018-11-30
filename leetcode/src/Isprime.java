public class Isprime {
    public static int countPrimes(int n) {
        if(n == 0 || n == 1){
            return 0;
        }
        boolean[] isprime = new boolean[n];
        int res = 0;
        isprime[2] = true;
        for(int i = 2; i < n; i++){
            if(isprime[i] == true){
                res++;
            }
            for(int j = 2; i * j < n; j++){
                isprime[i * j] = true;
            }
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(countPrimes(10));

    }
}
