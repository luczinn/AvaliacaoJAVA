package Exercicios;
import java.util.Scanner;
public class Exs {

    Scanner sc = new Scanner(System.in);
    public void Exercicio1() {
        System.out.println("============================================================================");
        System.out.println(" ");
        System.out.println("Escreva o primeiro número: ");
        double numeroUm = sc.nextDouble();
        System.out.println("Escreva o segundo número: ");
        double numeroDois = sc.nextDouble();
        System.out.println("Escolha a operação desejada, 1 = Adição, 2 = Subtração, 3 = Divisão, 4 = Multiplicação");
        int operacao = sc.nextInt();
        double resultado;
        if (operacao == 1) {
            resultado = numeroUm + numeroDois;
            System.out.println("O resultado da adição " + numeroUm + " + " + numeroDois + " é igual a: " + resultado);
        }
        else if (operacao == 2) {
            resultado = numeroUm - numeroDois;
            System.out.println("O resultado da subtração " + numeroUm + " - " + numeroDois + " é igual a: " + resultado);
        }
        else if (operacao == 3) {
            resultado = numeroUm / numeroDois;
            System.out.println("O resultado da divisão " + numeroUm + " / " + numeroDois + " é igual a: " + resultado);
        }
        else if (operacao == 4) {
            resultado = numeroUm * numeroDois;
            System.out.println("O resultado da multiplicação " + numeroUm + " * " + numeroDois + " é igual a: " + resultado);
        }
        else {
            System.out.println("O número digito não corresponde a nenhuma operação!");
        }
    }
    public void Exercicio2() {
        System.out.println(" ");
        System.out.println("============================================================================");
        System.out.println(" ");
        System.out.println("Informe o número da matricúla do aluno: ");
        int matricula = sc.nextInt();
        int escolhaTime = matricula % 4;
        String time;
        
        if (escolhaTime == 0) {
            time = "Time do Chris";
            System.out.println("O aluno foi determinado para o " + time);                        
        }
        else if (escolhaTime == 1) {
            time = "Time do Greg";
            System.out.println("O aluno foi determinado para o " + time); 
        }
        else if (escolhaTime == 2) {
            time = "Time do Caruso";
            System.out.println("O aluno foi determinado para o " + time); 
        }
        else if (escolhaTime == 3) {
            time = "Time do Jerome";
            System.out.println("O aluno foi determinado para o " + time); 
        }
        else {
            System.out.println("O número digito não corresponde a nenhuma operação!");
        }
    }
    public void Exercicio3() {
        System.out.println(" ");
        System.out.println("============================================================================");
        System.out.println(" ");
        System.out.println("Morangos – R$ 3,50 o kilo; Maças – R$2,30 o kilo; Bananas – R$ 1,80 o kilo");
        System.out.println("Informe o peso dos morangos (em KG):");
        double pesoMorango = sc.nextDouble();
        System.out.println("Informe o peso das maçãs (em KG):");
        double pesoMacas = sc.nextDouble();
        System.out.println("Informe o peso das bananas (em KG):");
        double pesoBananas = sc.nextDouble();
        double precoMorango = pesoMorango * 3.50;
        double precoMacas = pesoMorango * 2.30;
        double precoBananas = pesoMorango * 1.80;
        double pesoFinal = pesoMorango + pesoMacas + pesoBananas;
        double subTotal = precoMorango + precoMacas + precoBananas;
        int desconto = 0;
        double valorFinal;


        if (pesoFinal > 15 || subTotal > 30) {
            desconto = 10;
            valorFinal = subTotal-(subTotal/10);
            System.out.println("==========================================================");
            System.out.println("=====================CAIXA DE MERCADO=====================");
            System.out.println("==========================================================");
            System.out.println(" ");
            System.out.println("Morango " + pesoMorango + "Kg = " + "R$" + precoMorango);
            System.out.println("Maçã " + pesoMacas + "Kg = " + "R$" + precoMacas);
            System.out.println("Banana " + pesoBananas + "Kg = " + "R$" + precoBananas);
            System.out.println("----------------------------------------------------------");
            System.out.println("SUBTOTAL = R$" + subTotal);
            System.out.println("DESCONTO = " + desconto);
            System.out.println("VALOR FINAL = R$" + valorFinal);
        }else{
            valorFinal = subTotal-(subTotal/10);
            System.out.println("==========================================================");
            System.out.println("=====================CAIXA DE MERCADO=====================");
            System.out.println("==========================================================");
            System.out.println(" ");
            System.out.println("Morango " + pesoMorango + "Kg = " + "R$" + precoMorango);
            System.out.println("Maçã " + pesoMacas + "Kg = " + "R$" + precoMacas);
            System.out.println("Banana " + pesoBananas + "Kg = " + "R$" + precoBananas);
            System.out.println("----------------------------------------------------------");
            System.out.println("SUBTOTAL = R$" + subTotal);
            System.out.println("DESCONTO = " + desconto);
            System.out.println("VALOR FINAL = R$" + valorFinal);
        }
    }
}