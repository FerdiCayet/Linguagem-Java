/* Desenvolva um algoritmo que recebe quatro notas bimestrais, calcula e mostra a média aritmética destas quatro notas, bem como,
se o aluno foi aprovado (media >= 7), reprovado (media < 3), em exame (media >= 3 ou media <7) ou aprovado com louvor (media == 10).*/

package MédiaAritmética;

import javax.swing.JOptionPane;

public class MédiaAritmética {
    public static void main(String[] args) {
        //Declaração de variáveis e/ou constantes
        double n1, n2, n3, n4, media;
        int op = 0;
        //Mensagem ao usuário e entrada de dados
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral: "));
        media = (n1 + n2 + n3 + n4) / 4; //Processamento de dados
        System.out.println("A média é: " + media); //Saída de resultados
        //Processamentos de dados
        if (media >= 7 && media <= 10) {
            op = 1;
        } else {
            if (media < 7 && media >= 3) {
                op = 3;
            } else {
                if (media >= 0 && media < 3) {
                    op = 2;
                }
            }
        }
        switch (op) {
            case 1:
                if (media == 10) {
                    System.out.println("Aluno aprovado com louvor!"); //Saída de resultados
                } else {
                    System.out.println("Aluno aprovado!"); //Saída de resultados
                }
                break;
            case 2:
                System.out.println("Aluno reprovado!"); //Saída de resultados
                break;
            case 3:
                System.out.println("Aluno em exame."); //Saída de resultados
                break;
            default:
                System.out.println("Média inválida!"); //Saída de resultados
        } //fim do switch
        System.exit(0);
    } //fim do void main
} //fim da classe