class  SatyamCompany{
static double flattaxrate = 7.5f;;
double  basicsalary,bonus;
   

 public static void main(String[] args){


 
 SatyamCompany Emp1 = new SatyamCompany();
 SatyamCompany Emp2 = new SatyamCompany();

Emp1.basicsalary=4500;
Emp1.bonus =500;

Emp2.basicsalary =6500;
Emp2.bonus = 600;


double Emp1final = Emp1.basicsalary+Emp1.bonus - (Emp1.flattaxrate *(Emp1.basicsalary+Emp1.bonus)/100);

double Emp2final = Emp2.basicsalary+Emp1.bonus - (Emp2.flattaxrate *(Emp2.basicsalary+Emp2.bonus)/100);



System.out.println(" final salary of employe1 "+Emp1final);
System.out.println(" final salary of employe1 "+Emp2final);

if(Emp1final>5000){
  System.out.println(" Eliogible for premium  employe 1");
}
else {
System.out.println(" not eligible fro premim employe 1");
}

if(Emp2final>5000){
  System.out.println(" Eliogible for premium employe 2 ");
}
else {
System.out.println(" not eligible fro premim employe 1");
}


}

}