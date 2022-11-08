package com.hackerEarthArraysAndString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinimumAndXorOr {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		if(1<=T && T<=1000) {
			while (T>0) {
				T--;
				int n=Integer.parseInt(br.readLine());
				if(1<=n && n<=100000) {
					String nums[] = br.readLine().split(" ");
					int a[]=new int[n];
					for(int i=0;i<n;i++) {
						int check=Integer.parseInt(nums[i]);
						if(0<=check && check<=1000000000) {
							a[i]=check;
						}		
					}
					Arrays.sort(a);
					int min=a[0] ^ a[1];
					for(int i=1;i<a.length-1;i++) {
							int num=a[i] ^ a[i+1];
							if(num<min) {
								min=num;
							}	
					}
					System.out.println(min);	
				}
			}
		}
	}
}
