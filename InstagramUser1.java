import java.util.Scanner;
public class  InstagramUser1{

static  boolean isFollowing,isCloseFriend,isPrivteAccount;

static String canViewStory(boolean isFollowing, boolean isCloseFriend, boolean isPrivteAccount ){
        return isFollowing && (!isPrivteAccount || isCloseFriend)? "Can view":"Cannot view";
 }
 public static void main(String[] args){
Scanner sc = new Scanner(System.in);
boolean  isFollowing = sc.nextBoolean();
boolean  isCloseFriend = sc.nextBoolean();
boolean  isPrivteAccount = sc.nextBoolean();
System.out.println(canViewStory(isFollowing,isCloseFriend,isPrivteAccount));
 } 
}