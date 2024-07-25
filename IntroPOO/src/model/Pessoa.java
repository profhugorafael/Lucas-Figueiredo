package model;

// definindo o molde
public class Pessoa {
    // atributos (tem)
    public int idade;
    public String nome;
    public double altura;
    public boolean habilitado;

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