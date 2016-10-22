
public class Main {

	public static void main(String[] args){	
		
		Fibonacci fun = new Fibonacci();
		int k = 10;
		int result = fun.runFib(k);
		System.out.println(result);

	}	
}

class Fibonacci{
	
	private static int [] fib;
	
	public Fibonacci(){
		fib  = new int[50];
		fib[0] = 0;
		fib[1] = 1;		
	}
	
	int runFib(int n) 
	{
		if(n !=0 && fib[n] != 0) return fib[n];
		
        if (n <= 1) return n;
        
        else return fib[n] =  runFib(n-1) + runFib(n-2);
    }
}
