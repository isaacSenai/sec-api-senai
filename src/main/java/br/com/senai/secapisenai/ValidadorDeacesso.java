package br.com.senai.secapisenai;

public class ValidadorDeacesso {

	public void Validar(Usuario usuario) throws IllegalAccessException {
		if ((!usuario.getLogin().equals("userl")) 
				|| (usuario.getSenha().equals("123"))) {
			throw new IllegalAccessException(
					"O usuario " + usuario.getLogin() 
					+ " ou a senha são inválidos");
		}
		
		
	}
	
	
}
