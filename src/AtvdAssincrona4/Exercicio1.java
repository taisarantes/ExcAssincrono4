package AtvdAssincrona4;

import java.util.Scanner;

public class Exercicio1 {
	 public static void main(String[] args) {
		 int vetorNums[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		 int numUsuario;
	     int index = 0;
	     boolean temNum = false;
	     Scanner leia = new Scanner(System.in);

	     System.out.println("Digite o numero que você deseja encontrar: ");
	     numUsuario = leia.nextInt();

	     while (index < vetorNums.length) {
	    	 if (vetorNums[index] == numUsuario) {
	    		 temNum = true;
	             break;
	         }
	         index++;
	     }
	     
	     if (temNum) {
	    	 System.out.printf("O número %d está na posição: %d", numUsuario, index);
	     } else {
	         System.out.printf("O numero %d não foi encontrado! Tente outro", numUsuario);
	     }
	 }
	
}
