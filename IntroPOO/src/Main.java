import model.Pessoa;

public class Main {
    public static void main(String[] args) {
//        int quantidade = 1000;
//
//        int[] idades = new int[quantidade];
//        String[] nomes = new String[quantidade];
//        double[] alturas = new double[quantidade];
//        boolean[] habilitacoes = new boolean[quantidade];

        int quantidadeDePessoas = 1000;
        Pessoa[] turma = new Pessoa[quantidadeDePessoas];

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome = "Pedro da Silva";
        p2.nome = "Alice da Silva";

        p1.idade = 23;
        System.out.println(p1.idade);
        p1.fazerAniversario();
        System.out.println(p1.idade);

        System.out.println("soma 2 + 4 = " + p1.somar(2, 4));

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        System.out.println(p1);
        System.out.println(p2);
    }
}

// Carro, Pessoa, User -> classe / molde / classificao / tipo
// fusca, joao, @juninruidadepura -> objeto / fruto do molde / variavel