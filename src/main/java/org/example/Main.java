package org.example;

public class Main {
    public static void main(String[] args) {
        Helpers helper = new Helpers();
        CifraDeCesar cesar = new CifraDeCesar();

        while (true) {
            helper.imprimeLogo();
            System.out.println("Escolha uma opção para encriptar sua frase: ");
            System.out.println("1 - Cifra de César");
            System.out.println("2 - Código Morse");

            int escolha = helper.IntInput("Escolha uma opção(1/2): ");

            switch (escolha) {
                case 1:
                    cesar.escolher();
                    break;
                case 2:
                    System.out.println("escolheu a 2");
                    break;
                default:
                    System.out.println("Escolha uma opção válida! (1/2)");
            }

            return;
        }
    }
}
