package oitavo;

public class comissionado extends funcionarios {
	float vendas;
	float comissao;
	
	public comissionado(String nome, float vendas, float comissao) {
		super(nome);
		this.vendas = vendas;
		this.comissao = comissao;
		
		
		
		
	}
	
	public float pagamento() {
		return vendas* comissao;
		
	
	}
	
	

}
