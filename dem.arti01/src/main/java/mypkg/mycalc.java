package mypkg;

public class mycalc {
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public int diff(int a, int b)
	{
		return a-b;
	}
	public int prod(int a, int b)
	{
		return a*b;
	}

	public static void main(String[] args) {
		mycalc calc = new mycalc();
		System.out.println("sum is :"+calc.sum(10,20));
		System.out.println("diff is :"+calc.diff(10,20));
		System.out.println("Product is:"+calc.prod(10,20));

	}

}
