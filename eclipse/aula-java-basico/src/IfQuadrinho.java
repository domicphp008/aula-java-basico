import java.util.Scanner;

public class IfQuadrinho {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
	System.out.println("Digite a Quantidade de Ovos:");
	int ovos= scan.nextInt();
		
		
		if (ovos > 6){
			System.out.println("É mais ");
		}else{
			System.out.println("É menos ovos do que 6 o pedido da mulher");
		}
		

	}

}
