import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int numero, quantidadesLidos = 0, soma = 0;
        int quantidadePositivos = 0, quantidadesNegativos = 0;

        do {
            System.out.println("Um número inteiro (Para sair aperte 0):");
            numero = Integer.parseInt(entrada.nextLine());

            if (numero > 0) {
                quantidadePositivos++;
            } else if (numero < 0) {
                quantidadesNegativos++;
            }

            soma += numero;

            if (numero != 0) {
                quantidadesLidos++;
            }
        }
        while(numero != 0);

        if (quantidadesLidos == 0){
            System.out.println("Não existe nenhum número informado.");
        }
        else{
            System.out.println("Quantidade de  positivos: " + quantidadePositivos);
            System.out.println("Quantidade de  negativos: " + quantidadesNegativos);
            System.out.println("Os números lidos somam-se: " + soma);
            System.out.println("A média  é: " + (soma * 1.0 / quantidadesLidos));


        }
    }
}
