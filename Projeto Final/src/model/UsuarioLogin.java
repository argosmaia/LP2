package model;

public class UsuarioLogin {
	private Usuario usuario;
	private Login logins;
	
	public UsuarioLogin() {
		
	}	
	
	public UsuarioLogin(String nome, String codigo, int cargaHoraria, String coordenador, String login, String password) {
		usuario = new Usuario(nome, codigo, cargaHoraria, coordenador);
		logins = new Login(login, password);
	}
	
	public UsuarioLogin(Usuario usuario, Login login) {
		this.usuario = usuario;
		this.logins = login;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Login getLogin() {
		return logins;
	}

	public void setLogin(Login login) {
		this.logins = login;
	}
}
