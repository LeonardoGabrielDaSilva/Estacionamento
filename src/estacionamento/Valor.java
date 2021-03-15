package estacionamento;

import java.util.Date;

public class Valor {

	private double valor;
	private int codigo;
	private Date data;
	
	public Valor() {
		
	}
	
	public Valor(double valor, int codigo, Date data) {
		setValor(valor);
		setCodigo(codigo);
		setData(data);
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}
