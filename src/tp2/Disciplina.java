package tp2;

public class Disciplina {

	//Declarando array de 10 posições do tipo Aluno
	private Aluno[] alunos = new Aluno[10];
	
	public void adicionarAluno (Aluno alunoNovo, int posicao) {
		//Esse é o modo mais simples, sem tratamento de erro. 
		//Veremos isso nas próximas aulas
		alunos[posicao] = alunoNovo;
	}
	
	public double getMediaNota1() {
		double somaDasNotas = 0;
		//São 10 se eu adicionar 10 alunos, porém pode ter menos alunos no array
		int qteAlunos = 0;
		/*Nota: esse formato abaixo é igual à for(int i = 0; i< 10; i++)
		A diferença é que usando essa estrutura (foreach) eu não preciso especificar 
		que tem que ir até 10. O foreach percorre cada elemento do array
		*/ 
		for (Aluno aluno : alunos) {
			if(aluno != null) { // Verificando se na posição tem ou não aluno
				somaDasNotas += aluno.nota1;
				qteAlunos++;
			}
		}
		return somaDasNotas/qteAlunos;
	}
	
	public double getMediaNota2() {
		double somaDasNotas = 0;
		//São 10 se eu adicionar 10 alunos, porém pode ter menos alunos no array
		int qteAlunos = 0;
		for(int i = 0; i< 10; i++) {
			if(alunos[i] != null) { // Verificando se na posição tem ou não aluno
				somaDasNotas += alunos[i].nota2;
				qteAlunos++;
			}
		}
		return somaDasNotas/qteAlunos;
	}
	
	public void imprimeSucessorEAntecessor(int posição) {
		//lembre que 9 é a última posição de um vetor de 10 elementos
		if (posição < 0 || posição > 9) {
			System.out.println("Essa posição está fora do array");
			return;
		}
		
		if(posição-1 < 0) {
			System.out.println("Não existe antecessor");
		}else if (alunos[posição-1] == null) {
			System.out.println("Nessa posição, não tem aluno");
		}else {
			System.out.println("Antecessor: "+alunos[posição-1].getNome());
		}
		
		if(posição+1 > 9) {
			System.out.println("Não existe sucessor");
		}else if (alunos[posição+1] == null) {
			System.out.println("Nessa posição, não tem aluno");
		}else {
			System.out.println("Sucessor: "+alunos[posição+1].getNome());
		}		
		
	}
	
}
