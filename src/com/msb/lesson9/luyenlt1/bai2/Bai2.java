package com.msb.lesson9.luyenlt1.bai2;
import java.util.Scanner;
public class Bai2 {
	public static void main(String[] args) {
		 // Nhap xau bat ky tu ban phim
		
	     System.out.println("Xin moi nhap xau bat ky: ");	 
	     Scanner input = new Scanner(System.in);	 	     
	     String xau = input.nextLine();
	     
	     //Chuyen xau thanh mang ky tu
	 
	     char[] xaudao = xau.toCharArray();
	 
	     //Dao xau
	 
	     for(int i=0;i<xau.length()/2;i++){	 
	          char temp = xaudao[i];	 
	          xaudao[i] = xaudao[xaudao.length-i-1];	 
	          xaudao[xaudao.length-i-1] = temp;	 
	     }
	 
	     //Chuyen mang thanh xau
	 
	     String result = String.valueOf(xaudao);	 
	     System.out.println("xau dao: " + result);	 
	     }
	 
	}

