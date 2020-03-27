package javaPrac;



public class Fibonacci {
	
	 
	public static void main(String[] args) {
		
	// writing code for fibonacci series
		
		fib(4);
	    

	}
	
	static void fib(int n)
	{
		int num_0 = 0;
		int num_1 =1;
		int num =0;
		
		num = num_1;
		
		if(n==1) {
			System.out.println(num_0);
		}
		else if(n==2)
		{
			System.out.println(num_0);		
		System.out.println(num_1);
		
		}
		
		else
		{
			System.out.println(num_0);
			System.out.println(num_1);
			int temp = 0;
			int sum = 0;
			for (int i = 0; i <=n-3 ; i++) {
				
				sum = num + temp;
				temp=num;
				
				System.out.println(sum);
				num = sum;
			}
		}
		
		
		
	}
}


