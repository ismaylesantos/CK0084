package aula11.exceptions;

public class SemLetraBException extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "N�o existe letra B na frase";
	}
}
