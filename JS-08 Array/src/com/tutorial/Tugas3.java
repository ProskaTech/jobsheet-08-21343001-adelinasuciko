/*
 * Created by: 21343001_ADELINA SUCIKO
 * Array multidimensi yang menyatakan isi sebuah buku alamat
 */

package com.tutorial;

public class Tugas3 {

	public static void main(String[] args) {
		
		String [][] entry = new String [][]
			       {{"Florence","735-1234", "Manila"},
			           {"Joyce", "983-3333", "Quezon City"},
			           {"Becca", "456-3322", "Manila"}};
			       
			        System.out.println("Name :"+ entry [0][0]);
			        System.out.println("Tel. # :"+ entry [0][1]);
			        System.out.println("Addres :"+ entry [0][2]);
			        
			        System.out.println("\nName :"+ entry [1][0]);
			        System.out.println("Tel. # :"+ entry [1][1]);
			        System.out.println("Addres :"+ entry [1][2]);
			        
			        System.out.println("\nName :"+ entry [2][0]);
			        System.out.println("Tel. # :"+ entry [2][1]);
			        System.out.println("Addres :"+ entry [2][2]);
			        
	}

}
