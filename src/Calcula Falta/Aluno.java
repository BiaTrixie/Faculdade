import java.util.Scanner;

public class Aluno {
	// Atributos: dados que cada aluno do sistema deve ter (estado)
	String nome;
	double n1;
	double n2;
	double n3;
	double np;
	int faltas;

	// Métodos: ações que cada aluno permite executar
	void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("N1: " + n1);
		System.out.println("N2: " + n2);
		System.out.println("N3: " + n3);
		System.out.println("NP: " + np);
	}

	void lerDados() {
		try (Scanner console = new Scanner(System.in)) {
			System.out.print("Nome: ");
			nome = console.nextLine();
			System.out.print("N1: ");
			n1 = console.nextDouble();
			System.out.print("N2: ");
			n2 = console.nextDouble();
			System.out.print("N3: ");
			n3 = console.nextDouble();
			System.out.print("NP: ");
			np = console.nextDouble();
			System.out.print("Faltas: ");
			np = console.nextInt();
		}
	}

	double calcularMedia() {
		double mp = (n1 + n2) / 2;
		if (mp < 6.0) {
			mp = (mp + n3) / 2;
		}
		double mf = (mp + np) / 2;
		return mf;
	}

	boolean estaReprovadoPorFaltas() {
		// Se o aluno tiver mais de 20 faltas está reprovado
		if (faltas > 20)
			return true;
		else
			return false;

	}

}
