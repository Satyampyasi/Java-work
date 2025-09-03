 class Furniture {
     String material;
     String color;
     String brand;
     public static void  isfoldeable(String foldeable ){
          
            if(foldeable.equals("yes") )  {
                   System.out.println("you can fold");
            }
            else {
               System.out.println("you cannot fold");
            }
     }

     public static void main(String[]args){
          Furniture  studytable= new Furniture();
          studytable.material ="plastic";
          studytable.color = "blue";
          studytable.brand= "ajelo";
          String foldeable ="yes";
           
          isfoldeable(foldeable);

           System.out.println("material of tabel is "+studytable.material);
           System.out.println("Color of the tabel is "+studytable.color);
     }
}
