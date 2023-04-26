package POO;

public class SUB_PF extends clienteCLASS {
	
	String CPF;
	String categoria ="Pessoa Física";	// FISICA ou juridica
	boolean imposto = true;

	public SUB_PF(String nomecompleto, String endereco, String email, int telefone, int idade, String genero,
			boolean maiorde18, String CPF, String categoria, boolean imposto) {
		super(nomecompleto, endereco, email, telefone, idade, genero, maiorde18);
		this.CPF = CPF;
		this.categoria = categoria;
		this.imposto = imposto;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isImposto() {
		return imposto;
	}

	public void setImposto(boolean imposto) {
		this.imposto = imposto;
	}
	
	public void visualizar() {
		System.out.println("Nome Completo: "+getNomecompleto()+"\nCategoria: "+categoria+"\nCPF: "+CPF+
				"\nEndereço: "+getEndereco()+"\nIsento de imposto? "+imposto);		
	}
	
	public void finaliza() {
		System.out.println("Volte Sempre.");		
	}
	
	public void validarDOC() {
		
		if(getCPF().length() != 11) {
			System.out.println("\n--CPF Inválido!--");
		}else {
			System.out.println("\n--CPF Validado com sucesso--");
		}
	

}}
