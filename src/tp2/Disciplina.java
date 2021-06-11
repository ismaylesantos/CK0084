package tp2;

public class Disciplina {

	//Declarando array de 10 posi��es do tipo Aluno
	private Aluno[] alunos = new Aluno[10];
	
	public void adicionarAluno (Aluno alunoNovo, int posicao) {
		//Esse � o modo mais simples, sem tratamento de erro. 
		//Veremos isso nas pr�ximas aulas
		alunos[posicao] = alunoNovo;
	}
	
	public double getMediaNota1() {
		double somaDasNotas = 0;
		//S�o 10 se eu adicionar 10 alunos, por�m pode ter menos alunos no array
		int qteAlunos = 0;
		/*Nota: esse formato abaixo � igual � for(int i = 0; i< 10; i++)
		A diferen�a � que usando essa estrutura (foreach) eu n�o preciso especificar 
		que tem que ir at� 10. O foreach percorre cada elemento do array
		*/ 
		for (Aluno aluno : alunos) {
			if(aluno != null) { // Verificando se na posi��o tem ou n�o aluno
				somaDasNotas += aluno.nota1;
				qteAlunos++;
			}
		}
		return somaDasNotas/qteAlunos;
	}
	
	public double getMediaNota2() {
		double somaDasNotas = 0;
		//S�o 10 se eu adicionar 10 alunos, por�m pode ter menos alunos no array
		int qteAlunos = 0;
		for(int i = 0; i< 10; i++) {
			if(alunos[i] != null) { // Verificando se na posi��o tem ou n�o aluno
				somaDasNotas += alunos[i].nota2;
				qteAlunos++;
			}
		}
		return somaDasNotas/qteAlunos;
	}
	
	public void imprimeSucessorEAntecessor(int posi��o) {
		//lembre que 9 � a �ltima posi��o de um vetor de 10 elementos
		if (posi��o < 0 || posi��o > 9) {
			System.out.println("Essa posi��o est� fora do array");
			return;
		}
		
		if(posi��o-1 < 0) {
			System.out.println("N�o existe antecessor");
		}else if (alunos[posi��o-1] == null) {
			System.out.println("Nessa posi��o, n�o tem aluno");
		}else {
			System.out.println("Antecessor: "+alunos[posi��o-1].getNome());
		}
		
		if(posi��o+1 > 9) {
			System.out.println("N�o existe sucessor");
		}else if (alunos[posi��o+1] == null) {
			System.out.println("Nessa posi��o, n�o tem aluno");
		}else {
			System.out.println("Sucessor: "+alunos[posi��o+1].getNome());
		}		
		
	}
	
}
