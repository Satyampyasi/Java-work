package certificate_coding;

class Tester24 {
    
	
	   public static int[] findLeapYears(int year){
		   int leap_year[] = new int[15];
		   int currentYear = year;
		   int count=0;
		    while(count<15) {
		    	 if (currentYear % 400 == 0 || (currentYear % 100 != 0 && currentYear % 4 == 0)) {
		    		 leap_year[count]=currentYear;
		    		 count++;
		    	 }
		    	 currentYear++;
		    }
	     
	       
		    return leap_year;
	         }
	     
	       
	   
	    
	   public static void main(String[] args) {
	       int year = 2000;
		   int[] leapYears;
		   leapYears=findLeapYears(year);
		   for ( int index = 0; index<leapYears.length; index++ ) {
		       System.out.println(leapYears[index]);
		   }
	    }
	}
