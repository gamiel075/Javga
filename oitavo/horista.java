package oitavo;

public class horista extends funcionarios{
	int horas;
	float valorHoras;
	
	public horista(String nome,int horas, float valorHoras) {
		super(nome);
		this.horas = horas;
		this.valorHoras = valorHoras;
		
		
	}
	
	public float pagamento() {
		return  horas * valorHoras;
	}
	
	
	
	

}
