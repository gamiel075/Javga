package oitavo;

public class principal {
	public static void main(String[] args) {
		 funcionarios  funcionariolist[] ={new  assalariado("mario",3500),
				 new horista("luigi",100,40.5f),
				 new comissionado("carlo",5000,0.05f)};
		
		
		 funcionarios f;
		 for(int i=0;  i<funcionariolist.length;i++) {
			 f = funcionariolist[i];
			 System.out.println(f.nome + " salario" +  f.pagamento());
			 
			 
		 }
	}

}
