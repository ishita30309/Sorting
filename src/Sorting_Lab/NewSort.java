package Sorting_Lab;
import java.util.*;
public class NewSort 
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
		for(int i=1;i<n;i++)
		{
			int current=arr[i];
			int j=i-1;
			while(arr[j]>current && j>0)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
