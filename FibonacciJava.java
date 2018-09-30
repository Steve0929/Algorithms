
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
     public static void main (String[] args) throws java.lang.Exception
     {
       int aux,j,n;
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese un n ");
       n = sc.nextInt();
       System.out.println("Serie de Fibonacci hasta n es: ");
       j=0;
       for(int i = 0; i<=n ; i++){
       	aux = fibonacci(j);
       	j++;
       	System.out.println(aux);
       	
       }
	  
	
     }
     
     public static int fibonacci(int n){
     	int f1 = 0;
     	int f2 = 1;
     	int fibo = 0;
     	
     	if(n==0){
     	   return 0;
     	}
     	
     	if(n==1){
     	   return 1;
     	}
     	
     	for(int i = 2; i <=n; i++){
	    fibo = f1+f2;
	    f1= f2;
	    f2= fibo;
     	}
     	
     	return fibo;
     	
     }
}