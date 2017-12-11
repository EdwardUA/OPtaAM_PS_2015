package myJavagit;

public class oneClass {
	
	
	
	public int powr(int a, int n)
	{ int res=1;
		for (int i=1; i<=n; i++)
		{	res=res*a;}
	     return res; 
			
	}
	
	public int fact(int a)
	{	
		if (a == 0) return 1;	
		 return a * fact(a-1);
		    	 
		 
		 
	}

}