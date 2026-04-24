
package ariel10;

import java.util.Scanner;

/**
 *
 * @author Ariel
 */
public class mediasuave {

    
    public static void main(String[] args) {
        int n1, n2, n3;
        String nomeAluno;
        int media;
        System.out.println("Conta basica:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nomeAluno =sc.next();
        System.out.println("Dgite n1: ");
        n1 = sc.nextInt();
        System.out.println("Digite n2: ");
        n2 = sc.nextInt();
        System.out.println("Digite n3: ");
        n3 = sc.nextInt();
        
        media = (n1 + n2 + n3) / 3;
        System.out.println("Nome:" + nomeAluno);
        System.out.println("Media:" + media);
        if (media <= 5) {
            System.out.println("Reprovado, estuda mais!"); 
           
        } else if (media >= 5) {
        System.out.println("Aprovado");
        
        }
        
        
        
        
    }
    
}
