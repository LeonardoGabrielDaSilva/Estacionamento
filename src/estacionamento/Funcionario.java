package estacionamento;

public class Funcionario extends Pessoa {

	private String senha;

	public Funcionario() {

	}

	public Funcionario(String nome, String email, String telefone, String senha) {
		super(nome, email, telefone);
		setSenha(senha);
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
