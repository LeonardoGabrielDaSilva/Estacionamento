package estacionamento;

public class Vaga {

	private int numeracao;
	private boolean reservada;
	private String ocupado;
	
	public Vaga() {
		
	}
	
	public Vaga(int numeracao, boolean reservada, String ocupado) {
		setNumeracao(numeracao);
		setReservada(reservada);
		setOcupado(ocupado);
	}
	
	public int getNumeracao() {
		return numeracao;
	}
	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}
	public boolean isReservada() {
		return reservada;
	}
	public void setReservada(boolean reservada) {
		this.reservada = reservada;
	}
	public String getOcupado() {
		return ocupado;
	}
	public void setOcupado(String ocupado) {
		this.ocupado = ocupado;
	}
	
	
}
