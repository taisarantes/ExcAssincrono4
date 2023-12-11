package AtvdAssincrona4;

import java.util.Scanner;

public class Exercicio1 {
	 public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);

	        int[] vetorNums = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
	        int index = 0;
	        boolean temNum = false;

	        System.out.println("Digite o numero que você deseja encontrar:");
	        int numero = leia.nextInt();

	        while (index < vetorNums.length) {
	            if (vetorNums[index] == numero) {
	                temNum = true;
	                break;
	            }
	            index++;
	        }

	        if (temNum) {
	            System.out.printf("O número %d está na posição: %d", numero, index);
	        } else {
	            System.out.printf("O numero %d não foi encontrado! Tente outro", numero);
	        }
	    }
	
}
