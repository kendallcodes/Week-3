
public class HW {

	public static void main(String[] args) {

		
		
		  int[] ages = {3,9,23,64,2,8,28,93};
		  
		  int lastAge = ages[ages.length - 1]; int firstAge = ages[0];
		  
		  System.out.println("This is the difference " + (lastAge - ages[0]));
		  System.out.println("This is the sum " + sum(ages));
		  System.out.println("This is the average " + average(ages)); } 
	
		public static int sum(int [] values) { 
		int sum = 0; 
		for (int num : values) { sum+= num; }
		  return sum; }
		  
		  public static int average(int [] values) {
			  int average = 0;
			  average = sum(values)/values.length; 
		  return average;
		 
		 
		  String[] names = {"Sam", "Tommy", "Tim","Sally", "Buck", "Bob"};
		  
		  double averageNameLength = 0; double counter = 0;
		  
		  for (String name : names) { counter += name.length(); }
		  
		  averageNameLength = counter/names.length;
		  
		  System.out.println(averageNameLength);
		  
		  System.out.println("5.");
		  
		  int namesLength[] = new int[names.length]; 
		  for (int i = 0; i <= names.length - 1; i++)
		  { namesLength[i] = names[i].length();
		  System.out.println("The number of characters in " + names[i] + " is " +
		  namesLength[i]); }
		 



 
 
 public static String threeTimes(String, int n) {
	 
	 for (i = 0; ) 
		 return threeTimes("Hello", 3)
 };
 System.out.println(add("Kendall", "Davis"));  
 
 public static String add(String firstName, String lastName) {
	 new String = fullname; 
	 "firstName" + " " + "lastName" = fullName; 
	 return fullName;
	 }
 
 public static Boolean sumOf (int [] x) { 
	 int sum = 0;

	 for (int i = 0; i < x.length; i++)
	 {
	   sum = sum + x[i];
	   sum = newSum; 
	 }
	 if (newSum = 100) { 
		 return true; 
	 }
	 else { 
		 return false; 
	 }
	 System.out.println(sumOf());
 }

 	public static double average(double[] numbers) {
 		double sum = 0;
 		for (num : numbers) { 
 			sum += num}; 
 	
 		 (numbers / numbers.length); 
 		 
 	}
	 
 public static boolean compare(double [] x; double [] y) { 
	 
	if { 
		average(x[]) >= average(y[]); 
	}
	return true; 
	
	else {
		return false; 
	} 
 }
 boolean isHotOutside = true;
 double moneyinPocket = 0;
 System.out.println(willBuyDrink(isHotOutside, moneyinPocket));
 
 public static boolean willBuyDrink(boolean x, double y) { 
	 if (x = true && y > 10.50) { 
		 return true; }
	 else {
		 return false;
 }	
}

 
