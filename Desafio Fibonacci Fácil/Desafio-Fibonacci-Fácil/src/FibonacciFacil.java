// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class FibonacciFacil {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int n = leitor.nextInt();
        
        int[] fib = new int[n];
        
        for (int i = 0; i < n; i++) {
          if (i > 1) {
            fib[i] = fib[i-1] + fib[i-2];
          }
          else if(i == 0 || i == 1) fib[i] = i;
        }
        
        System.out.print(Arrays.toString(fib).replaceAll("(\\[|\\]|,)",""));
        
        leitor.close();
    }
	
}