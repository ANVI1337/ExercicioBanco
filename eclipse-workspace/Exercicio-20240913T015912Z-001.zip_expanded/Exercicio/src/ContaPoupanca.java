// conta do exercicio
public class ContaPoupanca extends Conta{
	private double rendimento = 0.07;
	
	public ContaPoupanca () {
	}

	public ContaPoupanca(int numeroConta, String nomeTitula, int idade, double saldoDaConta, double rendimento) {
		super(numeroConta, nomeTitula, idade, saldoDaConta);
		this.rendimento = rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}
	public final void atualizarSaldo() {
		saldoDaConta += saldoDaConta * rendimento;
	}
	public void extratoP() {
		System.out.println("\nExtrato de Contas Poupanca: " );
	    System.out.println("Número da Conta: " + getNumeroConta());
	    System.out.println("Nome do Titular: " + getNomeTitula());
	    System.out.println("Idade do Titular: " + getIdade());
	    System.out.println("Saldo da Conta: " + getSaldoDaConta());
	    System.out.println("Limite de Saque: " + getRendimento());
		}
	
	
	
}
