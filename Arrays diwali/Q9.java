public class Q9 
{
    public static void sequenceSeries(int N)
    {
    	for (int i=1;i<=N;i++)
    	{
    	    if (i % 2 == 0)
    	    {
    		    System.out.print(i*i);
    	    }
    	    else
    		{
    		    System.out.print(i*i*i);
    	    }
    	    if (i<N){
    	        System.out.print(",");
			}
    	}
    }
    
    public static void main(String args[])
    {
    	int N = 6;
    	sequenceSeries(N);
    }
}