import java.util.Scanner;

 class SistemaNumeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 0; 
        int soma = 0;  
        int maximo = Integer.MIN_VALUE; 
        int minimo = Integer.MAX_VALUE; 

        while (true) {

            System.out.print("Digite um número (ou -1 para terminar): ");
            int numero = entrada.nextInt(); 

            if (numero == -1) {
                break;
            }

            contador++;

            soma += numero;

            if (numero > maximo) {
                maximo = numero; 
            }

            if (numero < minimo) {
                minimo = numero; 
            }
        }

        if (contador > 0) {

            double media = (double) soma / contador;

            System.out.println("Quantidade de números digitados: " + contador);
            System.out.println("Maior número digitado: " + maximo);
            System.out.println("Menor número digitado: " + minimo);
            System.out.println("Média dos números digitados: " + media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

        entrada.close();
    }
}
