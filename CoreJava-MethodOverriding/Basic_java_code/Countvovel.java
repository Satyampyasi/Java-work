public class Countvovel{
      static  String noofvovels( String name){
         int  flag =0;
         int  consonant =0;
         int digit=0;
         String name1 = name.toLowerCase();
          for(int i=0;i<name.length();i++){
        if( name1.charAt(i)== 'a'|| name1.charAt(i)== 'e' ||name1.charAt(i)== 'i'|| name1.charAt(i)== 'o' ||name1.charAt(i)== 'u')flag++;
        else if(Character.isDigit(name1.charAt(i)))  digit++;
        else consonant++ ;

          }
          return   " Total number of vovels in "+name+ " is :" +flag  +" %n Consonant is "+consonant+"%n Digit is:="+digit;
      }


     public static void main(String[] args) {
          String name = "satyame458";
           System.out.printf(noofvovels(name));
     }
}

