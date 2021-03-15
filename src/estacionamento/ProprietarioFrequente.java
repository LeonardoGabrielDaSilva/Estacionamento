package estacionamento;

public class ProprietarioFrequente implements Comparable<ProprietarioFrequente> {
	
	protected Proprietario proprietario;
	private int Contagem;
	
	
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public int getContagem() {
		return Contagem;
	}
	public void setContagem(int contagem) {
		Contagem = contagem;
	}
	@Override
	public int compareTo(ProprietarioFrequente prop) {
		if (this.getContagem() > prop.getContagem()) {
	          return -1;
	     }
	     if (this.getContagem() < prop.getContagem()) {
	          return 1;
	     }
	     return 0;
	}
	
	
}
