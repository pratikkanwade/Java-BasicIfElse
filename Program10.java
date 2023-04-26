// Real time example using if else
// check that given year is leap year or not.
class Program{
	public static void main(String[] args){
		int n=2017;
		if(((n%4==0) && (n%100!=0)) || (n%400 == 0)){
			System.out.println("Leap year");
		}
		else{
			System.out.println("Not leap year");
		}
	}
}

