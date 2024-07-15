package oitavo;

public abstract class funcionarios {
	String nome;
	
	
	public funcionarios(String nome) {
		
		super();
		this.nome= nome;	
		
	}
	
	public abstract float pagamento() {
		
		System.out.println("Processando pagamento");
		return 0;
	}

}
