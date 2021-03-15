package estacionamento;

import java.util.Date;

public class VeiculosEstacionados {
	
	protected Veiculo veiculo;
	private Date horarioEntrada;
	private int numeracaoVaga;
	protected Funcionario funcionario;
	
	
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Date getHorarioEntrada() {
		return horarioEntrada;
	}
	public void setHorarioEntrada(Date horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}
	public int getNumeracaoVaga() {
		return numeracaoVaga;
	}
	public void setNumeracaoVaga(int numeracaoVaga) {
		this.numeracaoVaga = numeracaoVaga;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
	
}
