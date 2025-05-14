public class YongestFinder{
     int age;
 
    
     static String findYoungest(int age1, int age2, int age3) {
         
         return (age1 < age2)
             ? (age1 < age3 ? "1st person is youngest" : "3rd person is youngest")
             : (age2 < age3 ? "2nd person is youngest" : "3rd person is youngest");
     }
 
     public static void main(String[] args) {
         YongestFinder f1 = new YongestFinder();
         YongestFinder f2 = new YongestFinder();
         YongestFinder f3 = new YongestFinder();
         
         
         f1.age = 25;
         f2.age = 15;
         f3.age = 45;
         

         System.out.println(findYoungest(f1.age, f2.age, f3.age));  
     }
 }
 