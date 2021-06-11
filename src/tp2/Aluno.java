package tp2;

public class Aluno {
	private String nome;
	private int	id;
	private double	media;
	protected double nota1;
	protected double nota2;
		
	public void imprimeNome() {
		System.out.println(nome);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimeId() {
		System.out.println(id);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double retornaMedia() {
		calculaMedia();
		return media;
	}
	
	private void calculaMedia() {
		media = (nota1+nota2)/2;
	}

	public boolean passou() {
		if (media <= 7.0)
			return false;
		else
			return true;
				
	}

	public String getNome() {
		return nome;
	}
}
