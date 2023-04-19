package targetSistemas;
import java.util.Scanner;
public class Atividade5 {

	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	      System.out.println("Digite uma palavra ou frase: ");
	      String palavra = scan.nextLine();

	      String palavraInvertida = "";
	      for (int i = palavra.length() - 1; i >= 0; i--) {
	         palavraInvertida += palavra.charAt(i);
	      }

	      System.out.println("A palavra/frase invertida é: " + palavraInvertida);
	   }
	

	}


