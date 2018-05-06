package com.excript.aula0013;
//conversor de String para Double
//valor = Double.valueOf(def).doubleValue();
import java.util.Scanner;

public class Aula0013{
	public static void main(String[]args){
		int exp=0;
		
		do{System.out.println("(1)somar");
		   System.out.println("(2)subitrair");
		   System.out.println("(3)multiplicar");
		   System.out.println("(4)dividir");
		   System.out.println("(5)sair");
		   
		   exp = new Scanner(System.in).nextInt();
		   if(exp!=5){
			   if(exp==0||exp>5){
				   System.out.println("Operação inválida, tente novamento!");
			  }else{
				  System.out.println("Digite primeiro número:");
				  int num1 = new Scanner(System.in).nextInt();
				  System.out.println("Digite o segundo número:");
				  int num2 = new Scanner(System.in).nextInt();
			  
			 /* double result = 0;
			  if(exp==1){
				  result = num1+num2;
			  }else{
				  if(exp==2){
					  result = num1-num2;
				  }else{
					  if(exp==3){
						  result = num1*num1;
					  }else{
						  if(exp==4){
							  result = num1/num2;
						  }
					  }
				  }
			  }
			   System.out.println("Resultado da operação:"+result);*/
				  
				  
				  /*double result =0;
				  switch (exp){
				  case 1:result = num1+num2;
				  break;
				  case 2:result = num1-num2;
				  break;
				  case 3:result = num1*num2;
				  break;
				  case 4:result = num1/num2;
				  }
				 System.out.println("O resultado da operação:"+result);*/
				  
				  
	 double result = (exp==1)?(num1+num2):
					 (exp==2)?(num1-num2):
					 (exp==3)?(num1*num2):(num1/num2);
		   System.out.println("O resultado da operação"+result);
			  }
		   }
		}while(exp!=5);
	}
}