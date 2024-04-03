package org.example;

public class Main {
    public static void main(String[] args) {
        Helpers helper = new Helpers();
        CifraDeCesar cesar = new CifraDeCesar();
        CodigoMorse morse = new CodigoMorse();

        helper.imprimeTitulo("Encrypt");
        System.out.println("Escolha uma opção para encriptar sua frase: ");
        System.out.println("1 - Cifra de César");
        System.out.println("2 - Código Morse");

        int escolha = helper.pegaInteiro("Escolha uma opção(1/2): ");

        if (escolha == 1) {
            cesar.escolher();
        } else if (escolha == 2) {
            morse.escolher();
        }

    }
}
