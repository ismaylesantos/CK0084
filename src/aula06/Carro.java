package aula06;

public class Carro {
  
	private boolean status;
	private int qteLibras;
	
  //o m�todo ligar est� usando uma estrutura de condicional de IF/Else
  public void ligar(String status) {
      // if sem chaves
	  if (status == "a")
    	  System.out.println("Recebi a");
	  
	  //bloco if-else
	  if (status == "on") { 
          // Se a vari�vel for igual a "on", a frase abaixo ser� escrita
          System.out.println("Carro Ligado");
      } else{
          // Se a vari�vel for diferente de "on", nenhuma frase ser� exibida
          System.out.println("Carro Desligado");
      }
	  
	  //bloco if-else
	  if (status == "d") { 
          // Se a vari�vel for igual a "on", a frase abaixo ser� escrita
          System.out.println("Recebi d");
      } else if (status == "b"){
          // Se a vari�vel for diferente de "on", nenhuma frase ser� exibida
          System.out.println("Recebi b");          
      } else {
    	  System.out.println("N�o � nem b nem d");
      }
  }
  
  //o m�todo verificarCalibre est� usando uma estrutura condicional de Switch/case
  public void verificarCalibre(int qtdLibras) {
      //De acordo com cada resposta ser� verificado qual mensagem deve aparecer
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
  
  //o m�todo calibrarFor est� usando uma estrutura de repeti��o FOR
  public void calibrarFor(int libras) {
      //Enquanto o i n�o for menor ou igual a 35 ele ir� apresentar a mensagem
      for (int i = libras; i <= 35; i++) {
          System.out.println("O pneu n�o est� calibrado, pois est� com "+i+" libras");
          System.out.println("print 1");
          System.out.println("print 2");          
      }
         // System.out.println("O pneu est� calibrado!");
  }
  
  //o m�todo calibrarWhile est� usando uma estrutura de repeti��o While
  public void calibrarWhile(int libras){
      //Enquanto a vari�vel libras n�o for menor que 35 ele ir� apresentar a mensagem
      while (libras <= 35){ 
          System.out.println("O pneu n�o est� calibrado, "+libras+" libras");
          libras++; // = libras = libras + 1
      }
          System.out.println("O pneu est� calibrado!!!");
  }
  
  //o m�todo calibrarWhile est� usando uma estrutura de repeti��o Do While
  public void calibrarDoWhile(int libras){
      //Enquanto a vari�vel libras n�o for menor que 35 ele ir� apresentar a mensagem
      do{
          System.out.println("O pneu n�o est� calibrado, pois est� com "+libras+" libras");
          libras++;
      }while(libras <35 );
          System.out.println("O pneu est� calibrado!");
  }
  
  public void modelosDeCarroArray() {
      //[] - s�o inseridos em uma vari�vel que referecia um array
      String[] modelosA = new String[4];
      
      //Outra maneira de fazer uma declara��o de array
      String[] modelosB;
      modelosB = new String[4];

      modelosA[0] = "oi";
      modelosA[1] = "ola";
      System.out.println(modelosA[0]);
      System.out.println(modelosA[1]);
      
      
      //{} - inicializar valores em um array sua declara��o
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
