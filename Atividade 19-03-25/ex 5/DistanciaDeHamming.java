import java.util.Scanner;

public class DistanciaDeHamming {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira cadeia de DNA: ");
        String dna1 = entrada.nextLine();

        System.out.print("Digite a segunda cadeia de DNA: ");
        String dna2 = entrada.nextLine(); 
        if (dna1.length() != dna2.length()) {
            System.out.println("As cadeias de DNA devem ter o mesmo comprimento.");
        } else {
            int distancia = calcularDistanciaHamming(dna1, dna2);

            System.out.println("A distância de Hamming entre as duas cadeias de DNA é: " + distancia);
        }


        entrada.close();
    }


    public static int calcularDistanciaHamming(String dna1, String dna2) {


        int distancia = 0;


        for (int i = 0; i < dna1.length(); i++) {
    
            if (dna1.charAt(i) != dna2.charAt(i)) {
       
                distancia++;
            }
        }

     
        return distancia;
    }
}