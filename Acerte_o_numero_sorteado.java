package ProvaN1;

import java.util.Random;
import java.util.Scanner;

public class Acerte_o_numero_sorteado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n, sorteado, palpite, tentativas=1;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println(" SEJA BEM VINDO AO PROGRMA...\n");
		System.out.println("-------------------- -------------------- ------ ACHE O NUMERO SORTEADO ------ -------------------- -------------------- --------------- \n ");
		
		System.out.println(" PRIMIEIRO VOCE IRA DIGITAR UM NUMERO SUPERIOR E O SISTEMA VAI SORTEAR UM NÚMERO DE 1 a 'N' (NUMERO ESCOLHIDO POR VOCE).");
		System.out.println(" DEPOIS É SO ADIVINHAR O NÚMERO SORTEADO NESSE INTERVALO.");
		System.out.println(" \n DIGITE UM LIMITE SUPERIOR: ");
		n = entrada.nextInt();
		while ( n <= 1  ) {	
			System.out.println(" ESSE NUMERO NÃO É VÁLIDO, DIGITE UM NUMERO INTEIRO MAIOR QUE 1.");	
			n = entrada.nextInt();
		}
		System.out.println(" O NÚMERO FOI SORTEADO, BOA SORTE.");
		
		sorteado = sorteia(1, n);
		
		

	do {	
		
	
		System.out.print("\n DÊ UM PALPITE:  ");
		palpite = entrada.nextInt();
		
	     
	   if ( palpite != sorteado ) {
		System.out.println(" \n ------------------------------------------------------------\n");
		System.out.println(" ERROUUUUUUUUUUUUUUUUUUUUU");
		System.out.println(" NÃO DESANIME '-', TENTE NOVAMENTE ツ ");
		
		if ( sorteado > palpite  ) {
		  System.out.print(" \n O NUMERO SORTEADO É MAIOR QUE " + palpite+".");
		tentativas++;
		}
	
		if ( sorteado < palpite  ) {
		  System.out.print("\n O NUMERO SORTEADO É MENOR QUE " + palpite + ".");
        tentativas++;		
		} 
		  
    }
	
	   
      
	System.out.println(" \n ------------------------------------------------------------\n");
		
		
		
    }while ( palpite != sorteado);
			
	
	
	System.out.println(" AUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU \n");
	System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\r\n"
			+ "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\r\n"
			+ "▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒\r\n"
			+ "▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒\r\n"
			+ "▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒\r\n"
			+ "▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄░░▒▒▒▒▒\r\n"
			+ "▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██▌░░▒▒▒▒\r\n"
			+ "▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░▄▄███▀░░░░▒▒▒\r\n"
			+ "▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░█████░▄█░░░░▒▒\r\n"
			+ "▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░▄████████▀░░░░▒▒\r\n"
			+ "▒▒░░░░░░░░░░░░░░░░░░░░░░░░▄█████████░░░░░░░▒\r\n"
			+ "▒░░░░░░░░░░░░░░░░░░░░░░░░░░▄███████▌░░░░░░░▒\r\n"
			+ "▒░░░░░░░░░░░░░░░░░░░░░░░░▄█████████░░░░░░░░▒\r\n"
			+ "▒░░░░░░░░░░░░░░░░░░░░░▄███████████▌░░░░░░░░▒\r\n"
			+ "▒░░░░░░░░░░░░░░░▄▄▄▄██████████████▌░░░░░░░░▒\r\n"
			+ "▒░░░░░░░░░░░▄▄███████████████████▌░░░░░░░░░▒\r\n"
			+ "▒░░░░░░░░░▄██████████████████████▌░░░░░░░░░▒\r\n"
			+ "▒░░░░░░░░████████████████████████░░░░░░░░░░▒\r\n"
			+ "▒█░░░░░▐██████████▌░▀▀███████████░░░░░░░░░░▒\r\n"
			+ "▐██░░░▄██████████▌░░░░░░░░░▀██▐█▌░░░░░░░░░▒▒\r\n"
			+ "▒██████░█████████░░░░░░░░░░░▐█▐█▌░░░░░░░░░▒▒\r\n"
			+ "▒▒▀▀▀▀░░░██████▀░░░░░░░░░░░░▐█▐█▌░░░░░░░░▒▒▒\r\n"
			+ "▒▒▒▒▒░░░░▐█████▌░░░░░░░░░░░░▐█▐█▌░░░░░░░▒▒▒▒\r\n"
			+ "▒▒▒▒▒▒░░░░███▀██░░░░░░░░░░░░░█░█▌░░░░░░▒▒▒▒▒\r\n"
			+ "▒▒▒▒▒▒▒▒░▐██░░░██░░░░░░░░▄▄████████▄▒▒▒▒▒▒▒▒\r\n"
			+ "▒▒▒▒▒▒▒▒▒██▌░░░░█▄░░░░░░▄███████████████████\r\n"
			+ "▒▒▒▒▒▒▒▒▒▐██▒▒░░░██▄▄███████████████████████\r\n"
			+ "▒▒▒▒▒▒▒▒▒▒▐██▒▒▄████████████████████████████\r\n"
			+ "▒▒▒▒▒▒▒▒▒▒▄▄████████████████████████████████\r\n"
			+ "████████████████████████████████████████████\r\n"
			+ "");
	System.out.println(" \n ------------------------------------------------------------\n");
	System.out.println(" PARABENS, VOCE ACERTOU");
	System.out.println(" FORAM UM TOTAL DE " + tentativas + " TENTATIVA(S)");
	System.out.println(" COMO PREMIO VC GANHOU UMA VIAGEM COM TUDO PAGO PARA LAS VEGAS.");
	System.out.println(" P.s. Tudo pago menos jogos em casino. Não abuse da sorte, um raio nao cai duas vezes no mesmo lugar ein.");
		
	}	
		
	public static int sorteia (int lmtinferior, int lmtsuperior ) {
 	Random rd = new Random();
	return rd.nextInt(lmtsuperior - lmtinferior + 1) + lmtinferior;
	}
	

}
