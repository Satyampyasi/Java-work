public class Countvovel{
      static  String noofvovels( String name){
         int  flag =0;
          for(int i=0;i<name.length();i++){
                 if( name.charAt(i)== 'a'|| name.charAt(i)== 'e' ||name.charAt(i)== 'i'|| name.charAt(i)== 'o' ||name.charAt(i)== 'u' ||name.charAt(i)== 'A'|| name.charAt(i)== 'E'|| name.charAt(i)== 'I'||  name.charAt(i)== 'O'||name.charAt(i)== 'U'){
                    flag++;
                 }

          }
          return   " Total number of vovels in "+name+"is" +flag;
      }


     public static void main(String[] args) {
          String name = "satyame";
           System.out.println(noofvovels(name));
     }
}

