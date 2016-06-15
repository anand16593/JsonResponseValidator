package com.jsonresponse;

import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonValidatorClass 
{
	 public static void main(String[] args) throws Exception
	    {  
		   JSONParser parser = new JSONParser();  
		   
		   //You can change json response from JsonResponseFile.txt to check correctness of Program
		   Object obj = parser.parse(new FileReader("JsonResponseFile.txt"));  
		   JSONObject jsonObject = (JSONObject) obj;  
		    
		   String user_id = (String) jsonObject.get("userId");  
		   ResponseUtil.isAlphanumeric(user_id);		 

		   String  account = (String)jsonObject.get("accountId"); 
		   ResponseUtil.isNumreic(account);			

		   String code = (String) jsonObject.get("code");  
		   System.out.println("Provied account code is  \""+code+"\"");  
	   	   	
	   } 
}
