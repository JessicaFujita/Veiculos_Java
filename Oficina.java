public class Oficina{
	public static void main (String args[]){
	
	Veiculo v1 = new Veiculo();		          //sem valor, construtor padrão
	Veiculo v2 = new Veiculo("AA9876", 2010); //com atributos
		
	System.out.println ("A placa do veiculo 1 = " + v1.getPlaca() + " E o ano de Fabricacao = " + v1.getAnoFabricacao());
	System.out.println (v2.getPlaca() + " " + v2.getAnoFabricacao());
	
	v1.setPlaca("BB1234");
	v1.setAnoFabricacao(2000);
	
	System.out.println (v1.getPlaca() + " " + v1.getAnoFabricacao());
	
	}
}