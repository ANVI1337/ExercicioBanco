import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char looping = 's';
		char looping1 = 's';
		char looping2 = 's';


		// upcasting
		ContaEmpresarial ContaE = new ContaEmpresarial();
		ContaPessoaFisica ContaPF = new ContaPessoaFisica();
		ContaPoupanca ContaP = new ContaPoupanca();

		while (looping != 'n') {

			System.out.println("Conta Empresarial.");
			System.out.println("Por favor informe o numero da conta: ");
			int NumeroContaE = scanner.nextInt();
			ContaE.setNumeroConta(NumeroContaE);

			System.out.println("por favor informe o nome do titular: ");
			String nomeTitular = scanner.nextLine();
			ContaE.setNomeTitula(nomeTitular);
			scanner.nextLine();

			System.out.println("Por favor digite sua idade: ");
			int Idade = scanner.nextInt();
			ContaE.setIdade(Idade);

			System.out.println("Por favor informe o saldo da conta: ");
			double SaldoContaE = scanner.nextDouble();
			ContaE.depositar(SaldoContaE);

			System.out.println("Por favor informe o valor do emprestimo: ");
			double EmprestimoContaE = scanner.nextDouble();
			ContaE.depositar(EmprestimoContaE);

			System.out.println("Por favor informe o saque que será feito: ");
			double LimiteDeSaqueE = scanner.nextDouble();
			ContaE.Sacar(LimiteDeSaqueE);

			System.out.println("Deseja informar mais uma conta empresarial?  (s/n)");
			looping = scanner.next().charAt(0);
		}

		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------");

		
		
		while (looping1 != 'n') {

			System.out.println("Conta Pessoa Fisica.");
			System.out.println("Por favor informe o numero da conta: ");
			int NumeroContaPF = scanner.nextInt();
			ContaPF.setNumeroConta(NumeroContaPF);

			System.out.println("por favor informe o nome do titular: ");
			String nomeTitularPF = scanner.nextLine();
			ContaPF.setNomeTitula(nomeTitularPF);
			scanner.nextLine();


			System.out.println("Por favor digite sua idade: ");
			int IdadePF = scanner.nextInt();
			ContaPF.setIdade(IdadePF);

			System.out.println("Por favor informe o saldo da conta: ");
			double SaldoContaPF = scanner.nextDouble();
			ContaPF.depositar(SaldoContaPF);

			System.out.println("Por favor informe o valor do emprestimo: ");
			double EmprestimoContaPF = scanner.nextDouble();
			ContaPF.depositar(EmprestimoContaPF);

			System.out.println("Por favor informe o saque que será feito: ");
			double LimiteDeSaquePF = scanner.nextDouble();
			ContaPF.Sacar(LimiteDeSaquePF);

			System.out.println("Deseja informar mais uma conta de Pessoa Fisica ?  (s/n)");
			looping = scanner.next().charAt(0);
		}
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------");

		while (looping2 != 'n') {

			System.out.println("Conta Poupanca.");
			System.out.println("Por favor informe o numero da conta: ");
			int NumeroContaP = scanner.nextInt();
			ContaP.setNumeroConta(NumeroContaP);

			System.out.println("por favor informe o nome do titular: ");
			String nomeTitularP = scanner.nextLine();
			ContaP.setNomeTitula(nomeTitularP);
			scanner.nextLine();


			System.out.println("Por favor digite sua idade: ");
			int IdadeP = scanner.nextInt();
			ContaP.setIdade(IdadeP);

			System.out.println("Por favor informe o saldo da conta: ");
			double SaldoContaP = scanner.nextDouble();
			ContaP.depositar(SaldoContaP);

			System.out.println("Por favor informe o saque que será feito: ");
			double SaqueP = scanner.nextDouble();
			ContaP.Sacar(SaqueP);

			System.out.println("Deseja informar mais uma conta de Poupança ?  (s/n)");
			looping = scanner.next().charAt(0);
		}
		
		ContaE.extratoE();
		ContaPF.extratPF();
		ContaP.extratoP();

		scanner.close();
	}

}
