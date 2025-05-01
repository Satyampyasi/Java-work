class social_media{
     public void message(){
          System.out.println("send text message");
     }
}
class facebook extends social_media{
     @Override
     public void message(){
          System.out.println(" Send pic , msg , vedio , link etc");
     }
}

public class overriding {
      public static void main(String[] args) {
          facebook f1 = new facebook();
          f1.message();
      }
}
