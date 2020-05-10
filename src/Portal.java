public class Portal {

	public static void main(String[] args) {
	

		System.out.println("PORTAL DO ALUNO - UNIFAMETRO");
		System.out.println("-----------------------------");
		System.out.println("ALUNO 1");
		System.out.println("-----------------------------");
		Aluno a1  = new Aluno();
		System.out.println("-----------------------------");

		System.out.println("ALUNO 2");
		System.out.println("-----------------------------");
		a1.ImprimirNome();
		a1.ImprimirMatricula();
		a1.ImprimirCpf();
		
		Aluno b1 = new Aluno("Maria Luana", 123569);
		System.out.println("-----------------------------");

		System.out.println("ALUNO 3");
		System.out.println("-----------------------------");
		System.out.println("Nome: "+b1.getNomeCompleto());
		System.out.println("CPF: "+b1.getCpf());
	}

}
