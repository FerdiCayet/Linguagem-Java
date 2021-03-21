/*Desenvolva um algoritmo que receba, do usuário, dois números inteiros, calcule e exiba a média aritmética destes dois números.
Dica: a média aritmética é a soma dos dois números dividido por dois, por isso, o resultado deve ser um número real.*/

package Média;

import javax.swing.JOptionPane;

public class Media {
    public static void main(String[] args) {
        //Declaração de variáveis
        int num1, num2;
        double media;
        //Mensagem ao usuário e entrada de dados
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
        //Processamento de dados
        media = (num1+num2)/2;
        //Saída de resultados
        JOptionPane.showMessageDialog(null, "A média dos dois números ditigadas é: " + media);
    }
}