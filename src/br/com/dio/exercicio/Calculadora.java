package br.com.dio.exercicio;

public class Calculadora {

    public static void soma (double a,double b){
        double resultado = a + b;
        System.out.println("A soma de "+ a + " mais " + b + " é "+ resultado);
    }

    public static void subtracao (double a,double b){
        double resultado = a - b;
        System.out.println("A subtração de "+ a + " menos " + b + " é "+ resultado);
    }

    public static void multiplicacao (double a,double b){
        double resultado = a * b;
        System.out.println("A multiplicação "+ a + " vezes " + b + " é "+ resultado);
    }

    public static void divisao (double a,double b){
        double resultado = a / b;
        System.out.println("A divisão "+ a + " dividido " + b + " é "+ resultado);
    }

    public static void main(String[] args) {
        System.out.println("Exercício calculadora");

        Calculadora.soma(2,8);
        Calculadora.subtracao(16,8);
        Calculadora.multiplicacao(2,4);
        Calculadora.divisao(2,16);

    }
}
