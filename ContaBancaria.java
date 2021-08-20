package avaliacaoFinal;

public class ContaBancaria {

	private String numeroConta;
	private String banco;
	private String agencia;
	private String tipoConta;
	private float saldoAtual;
	private float limiteDisponivel;
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public float getSaldoAtual() {
		return saldoAtual;
	}
	public void setSaldoAtual(float saldoAtual) {
		this.saldoAtual = saldoAtual;
	}
	public float getLimiteDisponivel() {
		return limiteDisponivel;
	}
	public void setLimiteDisponivel(float limiteDisponivel) {
		this.limiteDisponivel = limiteDisponivel;
	}
	
	

}
