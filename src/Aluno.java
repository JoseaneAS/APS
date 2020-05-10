public class Aluno {
	
	private String nomeCompleto;
	private int matricula;
	private int cpf;
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setcpf(int cpf) {
		this.cpf = cpf;
	}
	 
	
	public void ImprimirNome() {
		System.out.println("Aluno: Joseane Alves");
	}
	
	public void ImprimirMatricula() {
		System.out.println("Matricula: 123456");
	}
	
	public void ImprimirCpf() {
		System.out.println("Cpf: 001.100.010.00");
	}

	public Aluno() {
	
		this.nomeCompleto = "Leonardo Silveira";
		this.matricula = 123456;
		System.out.println("Aluno: "+ this.nomeCompleto);
		System.out.println("Matricula: " +this.matricula);
	}	
	
	public Aluno(String nomeCompleto, int cpf) {
	
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
	}
}
