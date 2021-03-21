/*Desenvolva um algoritmo que recebe dois valores inteiro e o símbolo da operação conforme tabela abaixo,
calcula e mostra a operação efetuada: */
//SÍMBOLO DA OPERAÇÃO  |    NOME DA OPERAÇÃO
//         +           |         adição
//         -           |         subtração
//         *           |         multiplicação
//         /           |         divisão

package Cálculo;

import javax.swing.JOptionPane;

public class Calculo {
    //Módulo função Mais que recebe dois valores inteiros e retorna um valor inteiro
    static int Mais(int n1, int n2) {
        //Declaração de variáveis que só podem ser usados dentro deste módulo
        int res;
        res = n1 + n2; //Processamento de dados
        return res; //Retorno do módulo
    } //fim do módulo Mais

    //Módulo procedimento Menos que recebe dois valores inteiros
    static void Menos(int n1, int n2) {
        //Declaração de variáveis que só podem ser usados dentro deste módulo
        int res;
        res = n1 - n2; //Processamento de dados
        System.out.println("A diferença de " + n1 + " com " + n2 + " é " + res); //Saída de resultados
    } //fim do módulo Menos

    //Módulo procedimento Vezes que recebe dois valores inteiros e retorna um valor inteiro
    static void Vezes(int n1, int n2) {
        //Declaração de variáveis que só podem ser usados dentro deste módulo
        int res;
        res = n1 * n2; //Processamento de dados
        System.out.println("O produto de " + n1 + " com " + n2 + " é " + res); //Saída de resultados
    } //fim do módulo Vezes

    //Módulo função Dividido que recebe dois valores inteiros e retorna um valor inteiro
    static double Dividido(int n1, int n2) {
        //Declaração de variáveis que só podem ser usados dentro deste módulo
        double res;
        res = n1 / n2; //Processamento de dados
        return res; //Retorno do módulo
    } //fim do módulo Dividido

    //Módulo procedimento Resto que recebe dois valores inteiros e retorna um valor inteiro
    static double Resto(int n1, int n2) {
        //Declaração de variáveis que só podem ser usados dentro deste módulo
        double res;
        res = n1 % n2; //Processamento de dados
        System.out.println(n1 + " dividido por " + n2 + " = " + res);
        System.out.println("O resto da divisão é: " + res);
        return res; //Retorno do módulo
    } //fim do módulo Resto

    public static void main(String[] args) { //Módulo principal
        //Declaração de variáveis e/ou constantes que podem ser usados no algoritmo Calculo
        double div;
        int op, soma, num1, num2;
        //Mensagem ao usuário e entrada de dados
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
        op = Integer.parseInt(JOptionPane.showInputDialog("Cálculo\n1 para somar\n2 para subtrair\n3 para multiplicar\n4 para dividir\n5 para obter o resto de uma divisão\nDigite a operação:\n"));
        //Processamento de dados
        switch (op) {
            case 1: //Chamada do módulo função Mais, passando num1 e num2 como parâmetro e atribuindo o retorno do módulo na variável soma
                soma = Mais(num1, num2);
                System.out.println("A soma de " + num1 + " com " + num2 + " é " + soma); //Saída de resultados
                break;
            case 2: //Chamada do módulo procedimento Menos, passando num1 e num2 como parâmetro
                Menos(num1, num2);
                break;
            case 3: //Chamada do módulo procedimento Vezes, passando num1 e num2 como parâmetro
                Vezes(num1, num2);
                break;
            case 4: //Chamada do módulo função Mais, passando num1 e num2 como parâmetro e atribuindo o retorno do módulo na variável div
                div = Dividido(num1, num2);
                System.out.println("A divisão de " + num1 + " com " + num2 + " é " + div); //Saída de resultados
                break;
            case 5: //Chamada do módulo procedimento Resto, passando num1 e num2 como parâmetro
                Resto(num1, num2);
                break;
            default:
                System.out.println("Operação inválida!"); //Saída de resultados
        } //fim do switch
    } //fim do void main
} //fim da classe
