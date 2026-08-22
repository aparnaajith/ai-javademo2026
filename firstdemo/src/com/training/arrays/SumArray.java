package com.training.arrays;

public class SumArray {

	public static void main(String[] args) {
		//int x=0;int y=20;
		//int z=0;
		//System.out.println(y+z);
		//int [] nums=null;//java.lang.NullPointerException:
		//nums[0]=100;

		int [] nums=new int [4];
		System.out.println(nums.length);//4
		System.out.println(nums[3]);//0
		//System.out.println(nums[4]);//java.lang.ArrayIndexOutOfBoundsException
		
		
		nums[0]=10;nums[1]=20;nums[2]=30;nums[3]=40;
	    int sum=0;
		for(int i=0;i<nums.length;i++)
	    {
	    	int val=nums[i];
	    	//sum=sum+val;
	    	//=sum+nums[i];
	    	sum+=nums[i];
	    	System.out.println(sum);
	     int total=0;
	     for(int num:nums) {
	    	// total=total+num;
	    	 total+=num;
	     }
	     System.out.println(total);
	     
	     String[] names= {"Priya","Roni","Riya"};
	     	
	     for(String str:names) {
	    	 System.out.println(str);
	    	 
	     }
	     
	    }
	}

}
