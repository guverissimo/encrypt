package org.example;

import java.util.Scanner;

public class Helpers {
    Scanner scanner = new Scanner(System.in);

    public String aumentaTexto(String texto) {
        return texto.toUpperCase();
    }

    public String pegaTexto(String frase) {
        System.out.println(frase);
        scanner.nextLine();
        String mensagem = scanner.nextLine();
        return mensagem;
    }
    public int pegaInteiro(String frase) {
        System.out.println(frase);
        while (true) {
            int escolha = 0;

            if(scanner.hasNextInt()) {
                escolha = scanner.nextInt();
                return escolha;
            }else {
                System.out.println("Escolha uma opção válida!");
                scanner.nextLine();
            }
        }
    }
    public void imprimeTitulo(String titulo) {
        System.out.println();
        System.out.println();
        System.out.println("****** " + titulo + " ******");
        System.out.println();
    }

    public void imprimeMensagem(String mensagem, String mensagemEncripitada) {
        this.imprimeTitulo("Encrypt");
        System.out.println("Sua mensagem foi processada com sucesso!");
        System.out.println();
        System.out.println("Mensagem original: ");
        System.out.println(mensagem);
        System.out.println();
        System.out.println("Mensagem criptografada: ");
        System.out.println(mensagemEncripitada);
        System.out.println();
    }
}
