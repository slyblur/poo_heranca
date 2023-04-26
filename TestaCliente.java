package POO;

public class TestaCliente {

	public static void main(String[] args) {
		
		double saldoC1 = 10000.36;
		double saldoC2 = 50000.41;
		
		
		// instanciar 2 objetos derivados da SUBClasse PF
		
		
		
		SUB_PF cliente1 = new SUB_PF ("Killua Zoldyack aka irmão do Illumi", "Mansão dos Zoldyak", "killuahunter@gmail.com",
				1196365466, 16, "M", false, "46987456233", "PF", true);
		
		
		SUB_PF cliente2 = new SUB_PF ("Gon Hunter Freecs", "Floresta de Pin Wik", "Não possui email",
				11583697, 19, "M", true, "66976233", "PF", true);
		
		
		
		System.out.println("Dados do Cliente 01: ");
		cliente1.validarDOC();
		cliente1.visualizar();
		System.out.println("Saldo atual Conta Corrente: \n$"+saldoC1);
		
		
		System.out.println("\n\nDados do Cliente 02: ");
		cliente2.validarDOC();
		cliente2.visualizar();		
		System.out.println("Saldo atual Conta Corrente: \n$"+saldoC2+"\n\n");
		
		
		
		
		// instanciar 2 objetos derivados da SUBClasse PJ
		
		
		SUB_PJ empresaX = new SUB_PJ("HUNTER Games", "Shopping da Colmeia", "gameshunter@live.com",
				1196365466, 16, "Nao se aplica", true, null, "PJ", false, "0000");
			
		
		SUB_PJ empresaY = new SUB_PJ("Açaí do Kojima", "Avenida Machiavelica 125", "acaikoji@live.com",
				1196365466, 2, "Nao se aplica", true, null, "PJ", false, "49698644000194");
		
		System.out.println("Dados da Empresa X: ");
		empresaX.validarDOC();
		empresaX.visualizar();
		System.out.println("Imposto mensal: \n$"+saldoC1);
		
		System.out.println("\n\nDados da Empresa Y: ");
		empresaY.validarDOC();
		empresaY.visualizar();
		System.out.println("Imposto anual: \n$"+saldoC2+"\n\n");
		
		
		cliente1.finaliza();
		
		// fim do programa.

	}

}
