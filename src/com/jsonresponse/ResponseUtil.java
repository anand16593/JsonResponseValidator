package com.jsonresponse;

public class ResponseUtil 
{	 
	 public static void isAlphanumeric(String user_id)
	   {
		 String pattern= "^[a-zA-Z0-9]+$";
	
		 if(user_id.equals(""))
			 System.out.println("Please provide a Alphanumeric User-Id");
		 else if(user_id.matches(pattern))
			 System.out.println("Provided User-Id is \""+user_id+"\" and it is valid Alphanumeric");
		 else 
			 System.out.println("Provided User-Id is \""+user_id+"\" and it is non-Alphanumeric,Please provider a valid alphanumerric User-Id ");
     }

	 public static void isNumreic(String account)
	   {
		 String pattern= "^[0-9]+$";
	
		 if(account.equals(""))
			 System.out.println("Please provider a numeric Account-Id");
		 else if(account.matches(pattern))
			 System.out.println("Provided Account-ID is \""+account+"\" and it is valid numeric");
		 else
			 System.out.println("Provied Account-ID is \""+account+"\" and it is non-numeric, Please provide a valid numeric Account-ID");
       }

}
