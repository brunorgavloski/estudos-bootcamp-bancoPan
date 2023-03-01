import java.util.Scanner;

public class MinhaClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Digite seu ultimo nome: ");
		String segundoNome = scan.next();
		
		
		String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
		
		System.out.println(nomeCompleto);
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return "O meu nome completo é: " + primeiroNome.concat(" ").concat(segundoNome);
	}
}
