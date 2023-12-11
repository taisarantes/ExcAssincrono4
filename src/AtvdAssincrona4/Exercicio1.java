package AtvdAssincrona4;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int vetorNums[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numUsuario;
		boolean temNum = false;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numUsuario = leia.nextInt();
		
		for(int i = 0; i < vetorNums.length; i++) {
			if(vetorNums[i] == numUsuario) {
				System.out.printf("O número %d está na posição: %d", 
						numUsuario, i);
				temNum = true;
			} else {
				if(temNum == false && vetorNums[i] == vetorNums[(vetorNums.length - 1)]) {
					System.out.printf("O número %d não foi encontrado! Tente outro",
							numUsuario);
				}
			}
		}

	}
	
}
