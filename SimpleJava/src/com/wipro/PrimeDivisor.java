package com.wipro;

import java.util.ArrayList;
import java.util.List;

public class PrimeDivisor {
	public static void main(String[] args) {
	int input1=9;
	List <Integer> num1=new ArrayList<Integer>();
	List<Integer> num =new ArrayList<Integer>();
	int j=0;
	for(int i=1;i<=input1/2;i++){
		if(input1%i==0) {
			num.add(j,i);
			j++;
		}
	}
	System.out.println(num);
	
	for(int k=0;k<num.size();k++){
		for(int l=2;l<=num.get(k);l++){
			if(num.get(k)%l==0){
				break;			
				}
		else {
			int c=0;
			num1.add(c,num.get(k));
			c++;			
		}
		}
		}
		System.out.println(num1);
		int max=num1.get(0);
		for(int m=0;m<num1.size();m++){
			if(num1.get(m)>max)
				max=num1.get(m);
		}
		if(max>1 && max<input1) {
			System.out.println(max);
		}else {
		System.out.println(-1);
		}
}
}
