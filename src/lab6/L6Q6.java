package lab6;

public class L6Q6 {
    public static void main(String[] args) {
        System.out.println("First 20 palindromic prime: ");
        String palindromicPrime = "";
        for (int i = 1, count = 1; count <= 20; i++) {
            if (isPalindromicPrime(i)) {
                palindromicPrime += i + ", ";
                count++;
            }
        }
        System.out.println(palindromicPrime.substring(0,palindromicPrime.length()-2));

        System.out.println();
        System.out.println("First 20 emirp: ");
        String emirp = "";
        for(int i =1, count =1;count <=20;i++){
            if(isEmirp(i)) {
                emirp += i + ", ";
                count++;
            }
        }
        System.out.println(emirp.substring(0,emirp.length()-2));
    }
    public static boolean isPrime(int a){
        if(a==1) return false;
        for(int i=2;i<=a/2;i++){
            if((a%i)==0)
                return false;
        }
        return true;
    }
    public static String reverse (int b){
        String reverse = "";
        while (b!=0) {
            reverse += ""+b % 10 ;
            b = b / 10;
        }
        return reverse;
    }
    public static boolean isPalindromicPrime(int c){
        if(!isPrime(c)) return false;
        String num = Integer.toString(c);
        return reverse(c).equals(num);
    }

    public static boolean isEmirp(int d){
        if(isPalindromicPrime(d)) return false;
        if(!isPrime(d)) return false;
        return isPrime(Integer.parseInt(reverse(d)));
    }
}
