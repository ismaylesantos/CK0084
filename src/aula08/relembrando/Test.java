package aula08.relembrando;

public class Test {

	public static void main(String[] args) {
		OrdemPedido ordem = new OrdemPedido();
		ordem.setNumPedido(5);
		
		Cliente maria = new Cliente("Maria", 0);
		
		maria.setOrdem(ordem);
		
		int pedido = maria.getOrdem().getNumPedido();
		
		System.out.println(pedido);
				
		
		
	}
}
