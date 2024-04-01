package org.example;

import java.util.HashMap;
import java.util.Map;

public class CodigoMorse {
    Helpers helper = new Helpers();
    private static final Map<Character, String> morseCodeMap = new HashMap<>();

    static {
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");
        morseCodeMap.put('1', ".----");
        morseCodeMap.put('2', "..---");
        morseCodeMap.put('3', "...--");
        morseCodeMap.put('4', "....-");
        morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "-....");
        morseCodeMap.put('7', "--...");
        morseCodeMap.put('8', "---..");
        morseCodeMap.put('9', "----.");
        morseCodeMap.put('0', "-----");


        // Adicione mais caracteres e seus códigos Morse conforme necessário
    }

    public void escolher() {
        helper.imprimeTitulo("Código Morse");
        System.out.println("Escolha uma opção para processar sua frase: ");
        System.out.println("1 - Encripitar");
        System.out.println("2 - Desencripitar");
        int escolha = helper.pegaInteiro("Escolha uma opção(1/2): ");
        String mensagem = helper.pegaTexto("Digite a mensagem: ");
        switch (escolha) {
            case 1:
                this.encrypt(mensagem);
                break;
            case 2:
                this.encrypt(mensagem);
                break;
            default:
                System.out.println("Escolha uma opção válida! (1/2)");
        }
    }

    public String encrypt(String mensagem) {
        StringBuilder mensagemEncripitada = new StringBuilder();

        String mensagemUpperCase = helper.aumentaTexto(mensagem);

        for (char letra : mensagemUpperCase.toCharArray()) {
            if (morseCodeMap.containsKey(letra)) {
                mensagemEncripitada.append(morseCodeMap.get(letra));
            } else if (letra == ' ') {
                mensagemEncripitada.append("/ ");
            }
        }
        return mensagemEncripitada.toString();
    }
}
