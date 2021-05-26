package tarefa1;
        
import java.util.Scanner;



/**
 *
 * @author bruno
 */
public class exercicio1 {
    
    public static void main(String[] args) {
        
        float gasolina;
        float etanol;
        System.out.println("\n----____Insira o preço da gasolina e etanol e poupe dinheiro_____---\n");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o preço da gasolina:");
        gasolina = sc.nextFloat();
        System.out.println("Insira o preço do etanol:");
        etanol= sc.nextFloat();
        
        float valor = (etanol / gasolina);
        
        if (valor <= 0.7) {
            System.out.println("Abasteça com etanol");
        }else{
            System.out.println("Abasteça com gasolina");
        }
        
        System.out.println("Obrigado por usar os nossos serviços");
        
       
        
    }

}
