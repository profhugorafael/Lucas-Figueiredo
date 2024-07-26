package model;

// definindo o molde
public class Pessoa {
    // atributos (tem)
    public String nome;
    public int idade;
    public double altura;
    public boolean habilitado;

    // construtor padrao
    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public Pessoa( String nome, int idade, double altura, boolean habilitado) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.habilitado = habilitado;
    }

    // metodo (faz)
    public double somar(double a, double b) {
        return a + b;
    }

    public void fazerAniversario() {
        idade++;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", altura=" + altura +
                ", habilitado=" + habilitado +
                '}';
    }
}