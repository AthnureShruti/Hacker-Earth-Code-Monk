package com.hackerEarthArraysAndString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;

public class MonkAndRotation {
	 public static void main(String args[] ) throws Exception,NumberFormatException {
		 MonkAndRotation m=new MonkAndRotation();
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        // Scanner sc = new Scanner(System.in);
	        // int T = sc.nextInt();
	        int T = Integer.parseInt(br.readLine());
	       
	        if(1<=T && T<=20){
	            int N,K;
	            while(T!=0){
	                T--;
	                String[] inputs=br.readLine().split(" ");
	                N=Integer.parseInt(inputs[0]);
	                K=Integer.parseInt(inputs[1]);
	                
	                int[] arr= {};
	                if((1<=N && N<=100000) && (0<=K && K<=1000000))
	                	{
	                       arr=new int[N];
	                        String nums[] = br.readLine().split(" ");
	                        for (int i=0; i<N; i++) {
	                            int num = Integer.parseInt(nums[i]);
	                            if(0<=num && num<=1000000) 
	                                arr[i] = num;
	                        }
	                        int temp[]=new int[arr.length];
	                	    int x = 0;
	                	    
	                	   
	                	    for (int i = arr.length-K; i < arr.length; i++) {
	                	        temp[x] = arr[i];
	                	        x++;
	                	    }
	                	    for (int i = 0; i < arr.length-K; i++) {
	                			temp[x]=arr[i];
	                			x++;
	                		}

	                	    for (int i = 0; i < arr.length; i++) {
	                	        arr[i] = temp[i];
	                	    }
	                	    
	                	
	                    }
	                for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
	                }
	            }
	        }
	 }
	 
	               
	       

	
	
	
	
	
	
	    

	




























/*
 * public static void main(String[] args) throws IOException {
		MonkAndRotation m=new MonkAndRotation();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());// br.readLine();
		int a[];
		String string[];
		if(1<=T && T<=20) {
			int n,k;
			while (T>0) {
				T--;
				String[] inputs=br.readLine().split(" ");
				n=Integer.parseInt(inputs[0]);
				k=Integer.parseInt(inputs[1]);
				if((1<=n && n<=100000) && (0<=k && k<=1000000 )) {
					string=new String[n];
					a=new int[n];
					string=br.readLine().split(" ");
					for(int i=0;i<string.length;i++) {
						int num=Integer.parseInt(string[i]);
						if(0<=num && num<= 1000000) {
							a[i]=num;
						}
						
					}
					
					m.cyclicLeftShift(a, k);
				}
				
			}
		}
				
				


	}
	*/
 








