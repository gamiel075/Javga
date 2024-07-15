package oitavo;

public class assalariado extends funcionarios {
	float salario;
	
	public assalariado(String nome, float salario) {
		super(nome);
		this.salario = salario;
	}
	
	public float pagamento() {
		return salario;
	}

}

