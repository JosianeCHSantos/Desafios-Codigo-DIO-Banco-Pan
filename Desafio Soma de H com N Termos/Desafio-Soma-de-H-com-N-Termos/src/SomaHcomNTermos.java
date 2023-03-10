// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  


import java.util.Scanner;

public class SomaHcomNTermos {

    public static void main(String[] Args) {

     double h = 0;
     Scanner sc = new Scanner(System.in);
     double n = sc.nextDouble();

      for (double i = 1; i <= n; i++) {
      h += 1/i;
      }
    
    System.out.println(Math.round(h));

    sc.close(); 
   }
}


