
public class Solution1 {

	    public int reverse (int x) {
	   
	    	int y;
	    	if(x==0) y=0;
	    	
	    	else try {    String str1=Integer.toString(x);
	    
	   if(str1.endsWith("0")) 
		   str1=str1.substring(0, str1.length()-1);


	   if(str1.startsWith("-")) {
	    	str1=str1.substring(1, str1.length());
	    	System.out.println(str1);
	    	str1=str1+"-";
	    }
	   
	    StringBuffer str2=new StringBuffer(str1);
	    StringBuffer str3=str2.reverse();
	    String str4=str3.toString();
	    y=Integer.parseInt(str4);
	    }catch(Exception e) {y=0;}
	    
	    	
	    	
	        return y;
	    }
	public static void main(String[] args) {
		
		Solution1 re=new Solution1();
	
		
		int q=re.reverse(123489596);
		
		System.out.println(q);
		
		
		
	}
	
	
	}