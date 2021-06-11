package aula08.relembrando;

public class Cliente {

	private String nome;
	private int identificador; 
	//"para cada cliente X existe uma ordemPedido Y"
	private OrdemPedido ordem;
	
	public Cliente (String nomeConstrutor, int idConstrutor) {
		nome = nomeConstrutor;
		identificador = idConstrutor;
	}

	//Gets e Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
		
	}

	public OrdemPedido getOrdem() {
		return ordem;
	}

	public void setOrdem(OrdemPedido ordem) {
		this.ordem = ordem;
	}

	
	
	
}
