
class Employee {
     String name;
     String address;
     double salary;
     String jobTitle;

Employee( String name,String address,double salary;String jobTitle;){
      this.name=name;
      this.address=address;
      this.salary=salary;
      this.jobTitle=jobTitle;
     }
     public double calculateBonus()(){
          return salary*0.10;
     }
     public String generatePerformanceReport(){
return "Name: "+name+"\nAddress: "+address+"\nsalary: "+salary+"\njobtitle: "+jobTitle;
     }
}


class Manager extends Employee{
     Manager(String name,String address,double salary;String jobTitle){
          super(name,address,salary,jobTitle);
          int totproject; 
     }
     @override 
     public double calculateBonus()(){
          return salary*3/20;
     }
     public void manageProjects() {

     }
}



















public class office {
     
}
