
public class ContaEmpresarial extends Conta {
	private double LimiteEmprestimo;
	private double LimiteSaque;

	public ContaEmpresarial() {
	}

	public ContaEmpresarial(int numeroConta, String nomeTitula, int idade, double saldoDaConta, double LimiteEmprestimo,
			double LimiteSaque) {
		super(numeroConta, nomeTitula, idade, saldoDaConta);
		this.LimiteEmprestimo = LimiteEmprestimo;
		this.LimiteSaque = LimiteSaque;
	}

	public double getLimiteEmprestimo() {
		return LimiteEmprestimo;
	}

	public double getLimiteSaque() {
		return LimiteSaque;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		LimiteEmprestimo = limiteEmprestimo;
	}

	public void setLimiteSaque(double limiteSaque) {
		LimiteSaque = limiteSaque;
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		super.depositar(valor);
		saldoDaConta -= 50.00;
	}

	@Override
	public void Sacar(double valor) {
		// TODO Auto-generated method stub
		super.Sacar(valor);
		saldoDaConta += 5.00;
	}
	
	public void extratoE() {
		System.out.println("\nExtrato das Contas Empresariais: " );
	    System.out.println("Número da Conta: " + getNumeroConta());
	    System.out.println("Nome do Titular: " + getNomeTitula());
	    System.out.println("Idade do Titular: " + getIdade());
	    System.out.println("Saldo da Conta: " + getSaldoDaConta());
	    System.out.println("Limite de Empréstimo: " + getLimiteEmprestimo());
	    System.out.println("Limite de Saque: " + getLimiteSaque());
		}

	
	
	
}
