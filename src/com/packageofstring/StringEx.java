package com.packageofstring;

import javax.swing.Spring;

public class StringEx
{

	String a = "Dharani";
	String b = "Dharani";
	
	public boolean k()
	{
		
		if(a==b) {
		System.out.println("true");
		
	} else {
		System.out.println("false");
		}
		return true;
	}
	public static void strOper()
	{
		String c = "sduiuhsdsds2sojd@wsdojso8s4dsdsms@wew";
		
        
		System.out.println("the lower case of the string is "+ c.toLowerCase());
		System.out.println("the upper case of the string is "+ c.toUpperCase());
		System.out.println("the splitting of string is "+ c.split("w"));
		System.out.println("the subsequence is"+ c.subSequence(3, 18));
		if (c.startsWith("sd"))
		{
			System.out.println("yes it starts with sd");
		}
		else 
		System.out.println("no");
	
	    if (c.endsWith("ew"))
	    {
	    System.out.println("ends with ew");
	    	
	}
	    else
	    	System.out.println(("nope"));
	}
	
	public static void eqNConEx()
	{
		
		String d = "TeJ@";
		String e = "tEj@";
		System.out.println(d.replace("J", "$"));
		System.out.println("is empty? "+e.isEmpty());
		System.out.println(d.substring(1));	
		if (d.equals(e))
		{
		
		System.out.println("both are equal");
	}
		else
		System.out.println("not equal");
	
		if (d.equalsIgnoreCase(e))
		{
		System.out.println("equal");
		}
		else
			System.out.println("no");
		
		System.out.println("contact "+ d.concat(e));
		System.out.println("finding char "+ d.charAt(1));
		
		
		}
	
	

	public static void main(String[] args) {
		StringEx se = new StringEx();
		se.k();
		strOper();
		eqNConEx();
	}
	
	
}
