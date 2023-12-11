package AtvdAssincrona4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int[3][3];
		Scanner leia = new Scanner(System.in);
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite o valor para a posição "
						+ "[" + linha + "][" + coluna + "]");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		System.out.println("Elementos da diagonal principal: " 
		+ matriz[0][0] + "," + matriz[1][1] + "," + matriz[2][2]);

		System.out.println("Elementos da diagonal secundária: " 
		+ matriz[0][2] + "," + matriz[1][1] + "," + matriz[2][0]);

		System.out.println("Soma dos elementos da diagonal principal: " 
		+ (matriz[0][0] + matriz[1][1] + matriz[2][2]));

		System.out.println("Soma dos elementos da diagonal secundaria: " 
		+ (matriz[0][2] + matriz[1][1] + matriz[2][0]));
	}

}
