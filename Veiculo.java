/*	1.Criar uma classe Veículo com placa e ano de fabricação
	2.Criar os construtores padrao e com todos os atributos
	3.Criar os getters e setters
	--------------------------------
	4.Criar uma classe oficina que instancia 2 veículos:
		- um sem valores
		- outro com os atributos
	5. exibir os 2
	6. modificar aquele sem valores e exibi-lo
*/

public class Veiculo{
	private String placa;	// Encapsulamento, os modificadores de accesso para os atributos
	private int anoFabricacao; //sempre private
	
	public Veiculo(){	//método Construtor Padrão
					    //Sobrecarga de Construtor
		this.placa = "XXX0000";	//quando muda o numero de parametros,
		this.anoFabricacao = 0;  //placa = pode ser null
	}
	
	public Veiculo(String placa, int anoFabricacao){	//método construtor, permite a inicialização de um objeto
		this.placa = placa;                             //assignatura sempre public
		this.anoFabricacao = anoFabricacao;				// construtor com todos os parametros.
	}
	
		
	// metodos modificadores -> setters
	
	public void setPlaca(String placa){      
		this.placa = placa;
	}
	
	public void setAnoFabricacao(int anoFabricacao){ 
		this.anoFabricacao = anoFabricacao;
	}

	
	//métodos de acesso -> getters
	
	public String getPlaca(){	//do tipo certo
		return this.placa;		//placa é string entao getplaca é string
	}
	
	public int getAnoFabricacao(){  //() sempre vazio porque so tem o return
		return this.anoFabricacao;
	}
	
	
}