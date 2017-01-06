

import java.util.ArrayList;
import java.util.Scanner;

public class test
{

    public static void main(String args[])
    {
    	Scanner x=new Scanner(System.in);
    	System.out.println("enter the total elements");
    	int n=x.nextInt();
      int a[]=new int [n];
      int b[]=new int [n],i=0,j=0,c=0,d[]=new int [n],out=0;
      System.out.println("enter the elements");
      for(i=0;i<a.length;i++)
      {
    	  a[i]=x.nextInt();
      }
      for(i=0;i<a.length;i++)
      {
    	  for(j=i+1;j<a.length;j++)
    	  {
    		  if(a[i]==a[j])
    		  {
    			 b[c]=a[i];
    			 d[c]=j;
    			 if(c!=0)
    			 {
    				 if(d[c-1]>d[c])
    				 {
    					 out=b[c];
    				 }
    			 }
    			 if(c==0)
    				 out=b[0];
    			 c++;
    			 break;
    		  }
    	  }
    	  
      }
      System.out.println(out);
    }
}
