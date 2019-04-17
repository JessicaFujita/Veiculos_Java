public class TestePessoa{
	public static void main(String args[]){
		Pessoa p1;
		p1 = new Pessoa();
		p1.setNome("Bia");
		p1.setIdade(18);
		System.out.println (p1.getNome());
		System.out.println (p1.getIdade());
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Ana");
		p2.setIdade(28);
		System.out.println(p2.getNome());
		System.out.println(p2.getIdade());
		
		Pessoa p3 = p1;
		p1 = p2;
		p2 = new Pessoa();
		Pessoa p4 = new Pessoa ("Gil", 20);
		System.out.println(p1.getNome());
		System.out.println(p1.getIdade());

		System.out.println(p2.getNome());
		System.out.println(p2.getIdade());

		System.out.println(p3.getNome());
		System.out.println(p3.getIdade());


		System.out.println(p4.getNome());
		System.out.println(p4.getIdade());

	}
}