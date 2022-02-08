package Sorting_Lab;
import java.util.*;
public class BubbleSort 
{

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int n;
		n=obj.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
	    {
	        arr[i]=obj.nextInt();
	    }
	    int counter=0;
	    while(counter<n)
	    {
	        for(int i=0;i<n-counter-1;i++)
	        {
	            if(arr[i]>arr[i+1])
	            {
	                int temp=arr[i];
	                arr[i]=arr[i+1];
	                arr[i+1]=temp;
	            }
	        }
	        counter++;
	    }
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
		System.out.println();

	}

}
