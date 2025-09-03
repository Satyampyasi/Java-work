public class CurrencyConvert {
     static  double getdollarrate(int rupes){
          return  rupes*81.5;
     }
     public static void main(String[] args) {
          TravelAgency f1 = new TravelAgency();
          f1.displaycoverted();
     }
}
class TravelAgency{
void displaycoverted(){
System.out.println(CurrencyConvert.getdollarrate(45)); 
}

}