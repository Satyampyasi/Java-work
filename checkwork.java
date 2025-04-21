import java.util.Scanner;

class batter{
     String name;
     int run , matches;
     float batting_avg;

     batter(String name , int run ,int matches){
       
         if(run>0 && matches>0){
          this.run=run;
          this.matches = matches;
          this.name = name;
         }
         else System.out.println("bad player");
        
     }
     public void  computeBattingAverage(){
          batting_avg = run/matches;
          System.out.println("Batting average is: "+batting_avg);
     }
     public void getStatistics(){
          System.out.println("Name:"+name+"\nRuns:"+run+"\nMatches:"+matches);
     }
}

public class  checkwork{
     public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           String name = sc.nextLine();
           int run = sc.nextInt();
           int matches = sc.nextInt();
           batter b1  = new batter(name ,run,matches);
           b1.computeBattingAverage();
           b1.getStatistics();
     }
}
