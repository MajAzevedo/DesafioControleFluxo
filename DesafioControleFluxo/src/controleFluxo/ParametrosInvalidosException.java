package controleFluxo;

public class ParametrosInvalidosException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void exception(Exception exception) {
		System.out.println("O parametro1 é maior que o parametro 2!");
	}

	
}
