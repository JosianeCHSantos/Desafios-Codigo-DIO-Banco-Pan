import java.io.IOException;
import java.util.Scanner;

public class PositivoMedia {
	
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    int cont = 0;
    double soma = 0d;
    double media = 0d;
     
    for (int i = 0; i<6; i++) {
      double x = leitor.nextDouble();
      if (x > 0) {
        soma += x;
        cont++;
      }
    }
        
    media = soma / cont;
    
    System.out.println(cont + " valores positivos");
    System.out.println(String.format("%.1f", media));
        
    leitor.close();
    
  }
	
}

