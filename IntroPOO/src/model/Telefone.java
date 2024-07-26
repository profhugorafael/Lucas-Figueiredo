package model;

public class Telefone {
    public String ddi;
    public String ddd;
    public String numero;

    public Telefone(String fullPhoneNumer) {
        // +55 (11) 91111-2222
        String[] dados = fullPhoneNumer.split(" ");
        ddi = dados[0];
        ddd = dados[1];
        numero = dados[2];
    }

}