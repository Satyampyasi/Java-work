public class AdmissionChecker {

          static boolean isEligible(int marks,boolean activity){
               if(marks>=80 && activity == true){
                    return  true;
               }
               else return false;
           }
           public static void main(String[] args) {
               int marks = 95;
               boolean extracurricular = true;
                if(isEligible(marks,extracurricular)){

                   System.out.println("Eligible for admission");                    
                }
                else System.out.println("Not eligible for admission");
           }
}
