package Programming;

public class Characters {

	public static void main(String[] args) 
	{
		
//		for(char i='a';i<='z';i++)
//		{
//			if(i!='a'&& i!='i' && i!='e' && i!='o' && i!='u' )
//			{
//				System.out.print(i);
//			}
//			
//		}
//		
//		String s1="abc";
//		String s2="xyz";
//		String s3="xyz";
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
		
//		int S1 = 123;
//		String S2 = "xyz";
//		String S3 = "xyz";
//
//		System.out.println(System.identityHashCode(S1));
//		System.out.println(System.identityHashCode(S2));
//		System.out.println(System.identityHashCode(S3));
		
		
	
//		        int[] arr = {1, 5, 7};
//		        
//		        for (int i = 1; i <= 10; i++) 
//		        {
//		            boolean isExcluded = false;
//		            for (int j = 0; j < arr.length; j++) 
//		            {
//		                if (arr[j] == i) 
//		                {
//		                    isExcluded = true;
//		                    break;
//		                }
//		            }
//		            
//		            if (isExcluded==false) 
//		            {
//		                System.out.println(i);
//		            }
//		        
//		    
//		        }
		       // Input abcd
		      //  output ab bc cd 
		        String s="abcd";
		        for (int i = 0; i < s.length(); i++) 
		        {
		        	try {
		        		 CharSequence q = s.subSequence(i, i+2);
			        	 System.out.println(q);
		        	}
		        catch (Exception e) 
		        	{
					
				}
				}
		     
		        
		        String w="";
		        for (int i = 0; i < s.length(); i++) 
		        {
		        try {
		        				        
			        	 w =""+ s.charAt(i)+s.charAt(i+1);
				        System.out.println(w);
					}
		        
		        catch (Exception e) 
		        {
					//System.out.println(w);
				}
		        }
		        
		         
		       
	}
		

	

}
