package certificate_coding;

 class  Teacher{
	 String teacherName;
	 String subject;
	 double salary;
	public  Teacher( String teacherName, String subject, double salary){
		 this.teacherName=teacherName;
		 this.subject=subject;
		 this.salary=salary;
	 }
	 
	 public void setTeacherName(String teacher) { this.teacherName=teacher;} 
	 public String getTeacherName() {return teacherName;}
	 
	 public void setSubject(String sub) { this.subject=sub;}
	 public String getSubject() { return subject;}
	 
	 public void setSalary(double sal) { this.salary =sal;}
	 public double getSalary() { return salary;}
	 
	    
	}

 public	class Array_prog01 {
		public static void main(String[] args) {
		    // Implement your code here 
		     Teacher arr[]= new Teacher[4];
		     arr[0]= new Teacher( "Alex","Java Fundamentals",1200l);
		     arr[1]=new Teacher( "John","RDBMS",800l);
		     arr[2]= new Teacher( "Sam","Networking",900l);
		     arr[3]=new Teacher( "Maria","Python",900l);
		     for(int i =0;i<arr.length;i++) {
		    	System.out.print("Name : "+arr[i].getTeacherName()); 
		    	System.out.print(", Subject : "+arr[i].getSubject()); 
		    	System.out.print(", Salary : "+arr[i].getSalary()); 
		    	System.out.println();
		     }
		    
		}
	}


