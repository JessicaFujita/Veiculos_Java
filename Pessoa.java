public class Pessoa{
	private String nome;	// Encapsulamento
	private int idade;
	
	public Pessoa(String n, int i){	//método construtor
		nome = n;
		idade = i;
	}
	
	public Pessoa(){	//método Construtor Padrão
						//Sobrecarga de Construtor
		nome = null;	//quando muda o numero de parametros
		idade = 0;
	}	
	
	// metodos modificadores -> setters
	
	public void setNome(String n){
		nome = n;
	}
	
	public void setIdade(int i){
		idade = i;
	}

	
	//métodos de acesso -> getters
	
	public String getNome(){
		return nome;
	}
	
	public int getIdade(){
		return idade;
	}
	
	
}