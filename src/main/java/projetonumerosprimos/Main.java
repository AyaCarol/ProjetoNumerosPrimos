package projetonumerosprimos;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        while(true){
            System.out.println("Digite um numero de 0 a 1000: ");
            String num = s.nextLine();
            
            if(num.isBlank()){
                throw new IllegalArgumentException("O valor nao pode ser vazio.");
            }
            try{
                int n = Integer.parseInt(num);
                if(n < 0 || n > 1000){
                    throw new IllegalArgumentException("A entrada deve ser entre 0 e 1000");
                }else{
                    CalculadoraNumerosPrimos c = new CalculadoraNumerosPrimos();
                    if(c.ehPrimo(n)){
                        System.out.println(n + " eh primo");
                    }else{
                        System.out.println(n + " nao eh primo");
                    }
                }
            }catch (NumberFormatException e){
                System.out.println("O valor deve ter um numero inteiro!");
                
            }

        }
        
    }
}
