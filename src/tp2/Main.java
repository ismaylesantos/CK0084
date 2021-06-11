package tp2;


// Desenvolvedor: Ismayle Santos
public class Main {

	public static void main(String[] args) {
		
		// Itens 1) e 2)
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Joao");
		aluno1.setId(45);
		aluno1.nota1 = 3.5;
		aluno1.nota2 = 6.5;
		System.out.println(aluno1.retornaMedia());
		System.out.println("Passou: "+aluno1.passou());
		
		// Itens 3) e 4) 
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Maria");
		aluno2.nota1 = 7.5;
		aluno2.nota2 = 7.5;
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Ana");
		aluno3.nota1 = 8.5;
		aluno3.nota2 = 10;
		Disciplina disciplina = new Disciplina();
		// Adicionando aluno nas posições do Array
		disciplina.adicionarAluno(aluno1, 0);
		disciplina.adicionarAluno(aluno2, 1);
		disciplina.adicionarAluno(aluno3, 2);
		
		//média da turma
		System.out.println("Média da Nota1: " +disciplina.getMediaNota1());
		
		System.out.println("Média da Nota2: " +disciplina.getMediaNota2());
		
		// imprimindo Sucessor e antecessor
		System.out.println("------");
		disciplina.imprimeSucessorEAntecessor(0);
		System.out.println("------");
		disciplina.imprimeSucessorEAntecessor(1);
		System.out.println("------");
		disciplina.imprimeSucessorEAntecessor(2);
	}
}
