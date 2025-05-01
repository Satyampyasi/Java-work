public class toStringUse {
       String name;
       int age;
       toStringUse(String name,int age){
       this.name=name;
       this.age=age;
       }
     
       public String toString(){
          return "Name: "+name+"\nAge: "+age;
       }
       public static void main(String[] args) {
          toStringUse f1 = new  toStringUse("satyam",22);
          System.out.println(f1);
       }
}
