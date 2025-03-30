public class YongestFinder{
     int age;
 
     // Static method to find the youngest person
     static String findYoungest(int age1, int age2, int age3) {
         // Compare the ages and return which person is the youngest
         return (age1 < age2)
             ? (age1 < age3 ? "1st person is youngest" : "3rd person is youngest")
             : (age2 < age3 ? "2nd person is youngest" : "3rd person is youngest");
     }
 
     public static void main(String[] args) {
         YongestFinder f1 = new YongestFinder();
         YongestFinder f2 = new YongestFinder();
         YongestFinder f3 = new YongestFinder();
         
         // Assigning ages to each person
         f1.age = 25;
         f2.age = 15;
         f3.age = 45;
         
         // Calling the static method to find the youngest
         System.out.println(findYoungest(f1.age, f2.age, f3.age));
     }
 }
 