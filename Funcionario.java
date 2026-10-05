public class Funcionario {
    private String nome;
    private double salario;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            this.salario += this.salario * (percentual / 100);
            System.out.println("Salário de " + nome + " reajustado em " + percentual + "%.");
        } else {
            System.out.println("Erro: O percentual deve ser maior que zero.");
        }
    }
} 
    

