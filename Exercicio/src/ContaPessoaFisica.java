// conta do exercicio
public class ContaPessoaFisica extends Conta{
	private double LimiteEmprestimo;
	private double LimiteSaque;
	
	public ContaPessoaFisica() {
	}
	public ContaPessoaFisica(int numeroConta, String nomeTitula, int idade, double saldoDaConta, double limiteEmprestimo, double limiteSaque) {
		super(numeroConta, nomeTitula, idade, saldoDaConta);
		this.LimiteEmprestimo = limiteEmprestimo;
		this.LimiteSaque = limiteSaque;
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
		saldoDaConta -= 15.00;
	}
	@Override
	public void Sacar(double valor) {
		// TODO Auto-generated method stub
		super.Sacar(valor);
		saldoDaConta += 3.00;
	}
	
	public void extratPF() {
		System.out.println("\nExtrato das Contas de Pessoa Fisica: " );
	    System.out.println("Número da Conta: " + getNumeroConta());
	    System.out.println("Nome do Titular: " + getNomeTitula());
	    System.out.println("Idade do Titular: " + getIdade());
	    System.out.println("Saldo da Conta: " + getSaldoDaConta());
	    System.out.println("Limite de Empréstimo: " + getLimiteEmprestimo());
	    System.out.println("Limite de Saque: " + getLimiteSaque());
		}
	
	
	
	
	
	

}