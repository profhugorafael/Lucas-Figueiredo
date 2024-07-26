import model.Conta;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("Hugo", "111.222.333-44");

        // c1.saldo += 200; // c1.saldo = c1.saldo + 200;

        c1.setSaldo(c1.getSaldo() + 200);

        System.out.println(c1.verCpf());

        System.out.println(c1.verNome());
    }
}

//        int x = 10;
//
//        x++; // x += 1; // x = x + 1
//        x += 5;
//        x -= 20; // x = x - 20
//        x *= 2; // x = x * 2
