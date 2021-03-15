package estacionamento;

public class Veiculo {

	protected Proprietario proprietario;
	protected Modelo modelo;
	private String cor;
	private String placa;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String cor, String placa, Modelo modelo, Proprietario proprietario) {
		setProprietario(proprietario);
		setModelo(modelo);
		setCor(cor);
		setPlaca(placa);
	}
	
	
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
}
