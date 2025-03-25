 class Employee {
  static String companyName ="TechCorp";
  int empid;
  String  empName;

  public static void main(String[] args){
     Employee Manager = new Employee();
     Employee developer = new Employee();

      Manager.empid =8454;
      Manager.empName ="Dk .rawat";


      developer.empid = 9898;
      developer.empName ="satyam";

     System.out.println("Manager detail ");
     System.out.println("Manager Compony name "+Employee.companyName);
     System.out.println("Manager name "+Manager.empName);
     System.out.println("Manager ID "+Manager.empid);
     System.out.println();

     System.out.println("Developer detail ");
     System.out.println("developer Compony name "+Employee.companyName);
     System.out.println("developer name "+developer.empName);
     System.out.println("developer ID "+developer.empid);


     Employee.companyName ="Newtechcrop";

     
     System.out.println("developer Compony name "+developer.companyName);
     System.out.println("manager Compony name "+Manager.companyName);
  
}
 }