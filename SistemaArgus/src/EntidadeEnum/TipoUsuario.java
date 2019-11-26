package EntidadeEnum;

public enum TipoUsuario {
	
	Administrador("Administrador"), Aluno("Aluno"), Direcao("Dire��o"), Pedagogo("Pedagogo"), Professor("Professor"),
	Secretaria("Secret�ria");
	
	private String tipo;

	private TipoUsuario(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return tipo;
	}
	

}
