import javax.swing.JOptionPane;

public class Trabalhadores {

	public static void main(String[] args) {
		new Empresa();
	    }

	}

	class Empresa {

	    private Trabalhador trab[];
	    private int N;

	    Empresa() {  
	        N = 5;
	        trab = new Trabalhador[5];
	        trab[0] = new Trabalhador("123.456", "João", 25, 'M', "Rua X, 234", 2000f);
	        trab[1] = new Trabalhador("999.456", "Luiza", 22, 'F', "Rua Y, 111", 4000f);
	        trab[2] = new Trabalhador("885.456", "Ana", 29, 'F', "Rua Z, 345", 5000f);
	        trab[3] = new Trabalhador("222.456", "Pedro", 51, 'M', "Rua T, 231", 1000f);
	        trab[4] = new Trabalhador("777.456", "Caio", 21, 'M', "Rua A, 784", 2000f);

	       float soma = 0.0f;
	        for (int i = 0; i < N; i++) {
	            soma += trab[i].getSalario();
	        }
	        System.out.println("A média dos salários dos " + N + " trabalhadores é R$ " + soma / N);

	       int qt = 0;
	        soma = 0.0f;
	        for (int i = 0; i < N; i++) {
	            if (trab[i].getSexo() == 'F') {
	                soma += trab[i].getSalario();
	                qt++;
	            }
	        }
	        if (qt != 0) {
	            System.out.println("A média dos salários das mulheres é R$ " + (soma / qt));
	        }

	        Trabalhador trM = null;
	        float maior = 0.0f;
	        for (int i = 0; i < N; i++) {
	            if (trab[i].getSalario() > maior) {
	                maior = trab[i].getSalario();
	                trM = trab[i];
	            }
	        }
	        System.out.println("O trabalhador com maior salário na empresa é: \n" + trM.toString());

	        int qh = 0, qm = 0;
	        for (int i = 0; i < N; i++) {
	            if (trab[i].getSexo() == 'F') {
	                qm++;
	            }
	            if (trab[i].getSexo() == 'M') {
	                qh++;
	            }
	        }
	        System.out.println("A qtde. de homens da empresa é " + qh);
	        System.out.println("A qtde. de mulheres da empresa é " + qm);
	        if (qh > qm) {
	            System.out.println("A empresa tem mais homens que mulheres.");
	        } else {
	            System.out.println("A empresa tem mais mulheres que homens.");
	        }

	    }

	    public Trabalhador lerNovoTrabalhador(int num) {
	        String cpf, nome, endereco;
	        int idade;
	        float salario;
	        char sexo;

	        cpf = JOptionPane.showInputDialog(null, "Digite o CPF", "CPF - trabalhador " + num, JOptionPane.INFORMATION_MESSAGE);
	        nome = JOptionPane.showInputDialog(null, "Digite o nome", "Nome - trabalhador " + num, JOptionPane.INFORMATION_MESSAGE);
	        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade", "Idade - trabalhador " + num, JOptionPane.INFORMATION_MESSAGE));
	        sexo = JOptionPane.showInputDialog(null, "Digite o sexo (F ou M)", "Sexo - trabalhador " + num, JOptionPane.INFORMATION_MESSAGE).toUpperCase().charAt(0);
	        endereco = JOptionPane.showInputDialog(null, "Digite o endereço", "Endereço - trabalhador " + num, JOptionPane.INFORMATION_MESSAGE);
	        salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o salário", "Salário - trabalhador " + num, JOptionPane.INFORMATION_MESSAGE));

	        Trabalhador trab = new Trabalhador(cpf, nome, idade, sexo, endereco, salario);
	        return trab;
	    }

	}
