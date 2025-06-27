package wrapperClass_work;

class temperature{
	public static void main(String[] args) {
		Integer num =10; //primitive to wrapper class
		int n = num; // wrapper to primitive
		Integer j = Integer.valueOf(num);// using pre define static method 
		System.out.println(n+j);
	}
}
