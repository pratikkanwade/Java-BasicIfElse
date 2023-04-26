// calculate profit or loss.
// Write a program that takes the cost price (take it hardcoded) and calculated its profit or loss 

class Program{
	public static void main(String[]args){
		int sellingPrice=1000;
		int costPrice=1000;
		int c;
		int a;

		if(costPrice<sellingPrice){
			c=sellingPrice-costPrice;
			System.out.println("Profit of"+c);
		}
		else if(costPrice>sellingPrice){
			a=costPrice-sellingPrice;
			System.out.println("Loss of"+a);
		}
		else if(costPrice==sellingPrice){
			System.out.println("No profit no Loss");
		}

	}
}
