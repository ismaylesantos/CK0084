package aula06;

public class Carro {
  
	private boolean status;
	private int qteLibras;
	
  //o método ligar está usando uma estrutura de condicional de IF/Else
  public void ligar(String status) {
      // if sem chaves
	  if (status == "a")
    	  System.out.println("Recebi a");
	  
	  //bloco if-else
	  if (status == "on") { 
          // Se a variável for igual a "on", a frase abaixo será escrita
          System.out.println("Carro Ligado");
      } else{
          // Se a variável for diferente de "on", nenhuma frase será exibida
          System.out.println("Carro Desligado");
      }
	  
	  //bloco if-else
	  if (status == "d") { 
          // Se a variável for igual a "on", a frase abaixo será escrita
          System.out.println("Recebi d");
      } else if (status == "b"){
          // Se a variável for diferente de "on", nenhuma frase será exibida
          System.out.println("Recebi b");          
      } else {
    	  System.out.println("Não é nem b nem d");
      }
  }
  
  //o método verificarCalibre está usando uma estrutura condicional de Switch/case
  public void verificarCalibre(int qtdLibras) {
      //De acordo com cada resposta será verificado qual mensagem deve aparecer
      switch (qtdLibras) {
          case 20:
              System.out.println("Pneus com poucas libras");
              break;
          case 30:
              System.out.println("Pneus com q quantidade ideal de libras");
              break;
          case 40:
              System.out.println("Pneus com q quantidade excessiva de libras");
              break;
          default:
              System.out.println("Informe 20, 30 ou 35!");
              break;
          }
  }
  
  //o método calibrarFor está usando uma estrutura de repetição FOR
  public void calibrarFor(int libras) {
      //Enquanto o i não for menor ou igual a 35 ele irá apresentar a mensagem
      for (int i = libras; i <= 35; i++) {
          System.out.println("O pneu não está calibrado, pois está com "+i+" libras");
          System.out.println("print 1");
          System.out.println("print 2");          
      }
         // System.out.println("O pneu está calibrado!");
  }
  
  //o método calibrarWhile está usando uma estrutura de repetição While
  public void calibrarWhile(int libras){
      //Enquanto a variável libras não for menor que 35 ele irá apresentar a mensagem
      while (libras <= 35){ 
          System.out.println("O pneu não está calibrado, "+libras+" libras");
          libras++; // = libras = libras + 1
      }
          System.out.println("O pneu está calibrado!!!");
  }
  
  //o método calibrarWhile está usando uma estrutura de repetição Do While
  public void calibrarDoWhile(int libras){
      //Enquanto a variável libras não for menor que 35 ele irá apresentar a mensagem
      do{
          System.out.println("O pneu não está calibrado, pois está com "+libras+" libras");
          libras++;
      }while(libras <35 );
          System.out.println("O pneu está calibrado!");
  }
  
  public void modelosDeCarroArray() {
      //[] - são inseridos em uma variável que referecia um array
      String[] modelosA = new String[4];
      
      //Outra maneira de fazer uma declaração de array
      String[] modelosB;
      modelosB = new String[4];

      modelosA[0] = "oi";
      modelosA[1] = "ola";
      System.out.println(modelosA[0]);
      System.out.println(modelosA[1]);
      
      
      //{} - inicializar valores em um array sua declaração
      String[] modelosC = {"Gol","Crossfox","Uno","Palio"};


      System.out.println(modelosC[0]);
     
  }
  
  	public boolean isStatus() {
	  return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getQteLibras() {
		return qteLibras;
	}

	public void setQteLibras(int qteLibras) {
		this.qteLibras = qteLibras;
	}
}
