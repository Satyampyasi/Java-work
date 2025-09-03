public class SpeedMonitor{
     int speed ;
     String checkspeed(int speed){
        return speed>80? "Overspeed ":"speed within limit";
     }
     public static void main(String[] args) {
          SpeedMonitor s1= new SpeedMonitor();
          s1.speed = 45;
          System.out.println(s1.checkspeed(s1.speed)); 
     }
}