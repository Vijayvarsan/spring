package com.wipro;

public class mirrorEnds {
	public static void main(String[] args) {
	String string ="abXYZba";
	 int len=string.length();
	  String s="";
	  for(int i=0;i<=len/2;i++){
	    for(int j=len-1;j==len/2;j--){
	      if((string.substring(0,i).equals(string.substring(j)))){
	        s=string.substring(0,i);
	      }
	    }
	  }
	  System.out.println(s);
	}

}
