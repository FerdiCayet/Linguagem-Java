/*Desenvolva um algoritmo que receba, do usuário, um valor alfanumérico, verifica e exiba a informação se este caracter é uma vogal*/

package Vogais;

import javax.swing.JOptionPane;

public class Vogais {

    public static void main(String[] args) {
        char vog;
        vog = (JOptionPane.showInputDialog("Digite um valor alfanumérico")).charAt(0);
        if (vog == 'a' || vog == 'e' || vog == 'i' || vog == 'o' || vog == 'u' || vog == 'A' || vog == 'E' || vog == 'I' || vog == 'O' || vog == 'U') {
            JOptionPane.showMessageDialog(null, "O caracter \'" + vog + " é uma vogal!");
        } else {
            JOptionPane.showMessageDialog(null, "O caracter \'" + vog + " não é uma vogal!");
        }
        System.exit(0);
    }
}