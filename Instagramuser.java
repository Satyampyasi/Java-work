public class Instagramuser {
     boolean isPrivateAcoount,isCloseFriend,isFollowing;

        static String canViewStory(boolean isPrivateAcoount,boolean isCloseFriend ,boolean isFollowing){
              if( )
        }
        public static void main(String[] args) {
          Instagramuser u1 = new Instagramuser();
          Instagramuser u2 = new Instagramuser();

       u1.isPrivateAcoount = true;
       u1.isCloseFriend=true;
       u1.isFollowing = true;
       
       u2.isPrivateAcoount=false;
       u2.isCloseFriend = false;
       u2.isFollowing=false;
     

          System.out.println( u1.canViewStory());   
          System.out.println(u2.canViewStory());  
          

        }
}
