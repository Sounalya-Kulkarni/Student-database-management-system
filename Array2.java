package com;
import java.util.ArrayList;
public class Array2 {

	public static void main(String[] args) {
	ArrayList L=new ArrayList();
	L.add(10);
	L.add(1.2);
	L.add("hello");
	for(int i=0; i<L.size();i++) {
		System.out.println(L.get(i));
		
	}
	for(int i=L.size()-1; i>=0;i--) {
	System.out.println(L.get(i));	
	}

	}

}
