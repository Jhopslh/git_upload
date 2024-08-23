package com.cathaybk.practice.nt01900440.b;

public class Practice1 {
	
	public static void main(String[] args) {
		for(int i = 1 ; i<=9 ; i++) {
			for(int j = 2; j<=9 ; j++ ) {
				if(j*i<10) {
					System.out.print(j+"*"+i+"= "+j*i+" ");
				} else {
					System.out.print(j+"*"+i+"="+j*i+" ");
				}
			}
			System.out.print("\n");
		}
	}

}
