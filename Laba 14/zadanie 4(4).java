package myJavagit;


public class rootClass
{
	   public static void main(String args[]) 
	   {
	        System.out.println("Yes, I did it:)");
	        int a=5;
	        double b=5.3;
	        if (a>b) { System.out.println("max="+a); }
	        else { System.out.println("max="+b);}
	    	               
	       /**********i?aee??aiiy iiaiai eeano ? ciaoia?aiiy noaiai?*************/  
	        
	        oneClass myObj = new oneClass();
		  	   int i=5, j=6;
			   System.out.println("res = " + myObj.powr(i, j));
			   int res;
			   res=myObj.fact(6);
			   System.out.println("res = " +res );
	        
	       /**********?iaioa c ianeaaie*************/  	        
			int n=10;
			int []Bmass = new int [n];
	        
	       massClass massOb = new massClass();
	       massOb.createmass(Bmass, n);
	       massOb.printmass(Bmass, n);

	       System.out.println();
	       /**********static*************/	       
			
			stClass.ink();
			stClass B = new stClass();
						       
	        System.out.println("static met = "+ B.funk());
	        
	        stClass.ink();
	        stClass.ink();
	        stClass.ink();
	        stClass.ink();
	        stClass.ink();
	        
	        System.out.println("static met = "+ B.funk());
	       
	        stClass.ink();
	        stClass.ink();
	        stClass.ink();
	        stClass.ink();
	        stClass.ink();
	        
	    //  System.out.println("static met = "+ B.ink());
	        System.out.println("static met = "+ B.funk());
	       
	   }
}