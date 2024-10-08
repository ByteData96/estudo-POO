package recursao.praticando.excecao;

//Crie um programa que tente dividir dois números e realizar operações
//com um array. Trate as múltiplas exceções usando try-catch.

import java.util.Scanner;

public class Numero6 {
    public static double dividir(int num1, int num2) throws NumberFormatException {
        if ( num2 == 0){
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return (double) num1/num2;
    }

    public static int acessarIndice(int[] array, int indice) throws ArrayIndexOutOfBoundsException {
        if(indice < 0 || indice >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Indice foda dos limites do array");
        }
        return array[indice];
    }

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);


        try {
            System.out.println("Digite o primeiro número");
            int dividendo = scanner.nextInt();
            System.out.println("Digite o segundo numero");
            int divisor = scanner.nextInt();

            double resultado = dividir(dividendo, divisor);

            System.out.println(resultado);

            int[] array = {1, 2, 3, 4};

            System.out.println(array[10]);
        } catch (NumberFormatException e) {
            System.out.println("Divisão por zero erro" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice inexistente");
        } catch (Exception e) {
            System.out.println("Erro inesperado");
        } finally {
            System.out.println("Fim do programa!!");
            scanner.close();
        }
    }
}
