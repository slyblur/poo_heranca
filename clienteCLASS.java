package POO;

public class clienteCLASS {

	//criar atributos
	
	private String nomecompleto, endereco, email;
	private int telefone, idade;
	private String genero;
	private boolean maiorde18;
	
	
	//criar o método construtor, que irá inicializar o programa.
	
	
	public clienteCLASS(String nomecompleto, String endereco, String email, int telefone, int idade, String genero,
			boolean maiorde18) {
		super();
		
		this.nomecompleto = nomecompleto;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.idade = idade;
		this.genero = genero;
		this.maiorde18 = maiorde18;
	}
		
	
	public clienteCLASS(String nomecompleto, int idade, String genero, boolean maiorde18) {
		super();
		this.nomecompleto = nomecompleto;
		this.idade = idade;
		this.genero = genero;
		this.maiorde18 = maiorde18;
	}

	// criar metodos Getters and setters para todos atributos
	

	public String getNomecompleto() {
		return nomecompleto;
	}

	public void setNomecompleto(String nomecompleto) {
		this.nomecompleto = nomecompleto;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isMaiorde18() {
		return maiorde18;
	}

	public void setMaiorde18(boolean maiorde18) {
		this.maiorde18 = maiorde18;
	}
	
	
	// criar um metodo para imprimir todos os atributos na tela.
	
	public void visualizar() {
		System.out.println("Nome do Cliente: "+nomecompleto);
		System.out.println("Idade do Cliente: "+this.getIdade());
		System.out.println("Genero do Cliente: "+this.getGenero());
		System.out.println("Email do Cliente: "+this.getEmail());
		System.out.println("Telefone Cliente: "+this.getTelefone());
		System.out.println("Endereço do Cliente: "+this.getEndereco());
		System.out.println("Maior de idade? "+this.isMaiorde18());
	}
	
	
	
}
