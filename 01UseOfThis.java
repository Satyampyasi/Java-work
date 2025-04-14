public class 01UseOfThis{
     String name ;
     Char gender;
     double no ;
     String Rollno;
     double eng,math,science,sst,hin;
  public   String  setdetail(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter details of student: ");
    System.out.println("Enter name of student: ");
    this.name = sc.nextLine();
    System.out.println("Enter the age of student: ");
    this.age = sc.nextInt();
    System.out.println("Enter mobile number: ");
    this.mobileNo = sc.nextLong();
    System.out.println("Enter the rollNo: ");
    this.rollNo = sc.nextInt();
    System.out.println("Enter the gender: ");
    this.gender = sc.next().charAt(0);
    System.out.println("Enter marks scored in english: ");
    this.eng = sc.nextDouble();
    System.out.println("Enter marks scored in math: ");
    this.math = sc.nextDouble();
    System.out.println("Enter marks scored in sst: ");
    this.sst = sc.nextDouble();
    System.out.println("Enter marks scored in science: ");
    this.science = sc.nextDouble();
    System.out.println("Enter marks scored in hindi: ");
    this.hin = sc.nextDouble();
    System.out.println();
       } 
 public void dissplay(){
     System.out.println("Name: "+this.name);
     System.out.println("Age: "+this.age);
     System.out.println("Mobile no: "+this.mobileNo);
     System.out.println("Roll no.: "+this.rollNo);
     System.out.println("Gender: "+this.gender);
     System.out.println("Marks scored in subjects: ");
     System.out.println("English: "+this.eng);
     System.out.println("Mathematics: "+this.math);
     System.out.println("Science: "+this.science);
     System.out.println("SST: "+this.sst);
     System.out.println("Hindi: "+this.hin);
     System.out.println();
     }
     public void generateReport(){
     setdetail();
     dissplay();
     double totalMarks = this.eng+this.math+this.sst+this.science+this.hin;
     System.out.println("Total marks scored: "+totalMarks);
     System.out.println();
     }

     public static void main(String[] args ){
          01UseOfThis s1 = new 01UseOfThis();
          01UseOfThis s2 = new 01UseOfThis();
          s1.generateReport();
          s2.generateReport();

     }
}
