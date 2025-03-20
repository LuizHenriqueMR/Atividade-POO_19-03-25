import java.util.Scanner;

class ResistorColorCode {

    public static int pegarValorDaCor(String cor) {
        switch (cor.toLowerCase()) {
            case "preto":
                return 0; 
            case "marrom":
                return 1; 
            case "vermelho":
                return 2; 
            case "laranja":
                return 3; 
            case "amarelo":
                return 4; 
            case "verde":
                return 5; 
            case "azul":
                return 6; 
            case "violeta":
                return 7; 
            case "cinza":
                return 8; 
            case "branco":
                return 9; 
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite as cores do resistor (separadas por espaços):");
        String coresDigitadas = entrada.nextLine(); 

        String[] cores = coresDigitadas.split(" ");

        if (cores.length >= 2) {
            int primeiraCor = pegarValorDaCor(cores[0]);
            int segundaCor = pegarValorDaCor(cores[1]);

            if (primeiraCor == -1 || segundaCor == -1) {
                System.out.println("Erro: uma das cores que você digitou não é válida.");
            } else {
                int valorDoResistor = primeiraCor * 10 + segundaCor;
                System.out.println("O valor do resistor é: " + valorDoResistor);
            }
        } else {
            System.out.println("Erro: você precisa digitar pelo menos duas cores.");
        }

        entrada.close();
    }
}