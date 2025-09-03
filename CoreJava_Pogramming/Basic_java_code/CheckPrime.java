public class CheckPrime {
      static String isprime(int num ){
             int flag =0;
             for(int i=1;i<=num;i++){
                    if(num%i==0) flag++;
             }
             if( flag<3) return "This is  prime number";
             else return "THis is not prime number";
      }
      public static void main(String[] args) {
          int num =12;
                System.out.println(isprime(num));  
      }
}
