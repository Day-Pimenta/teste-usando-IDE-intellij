package br.com.dio.exercicio;

public class Emprestimo {
    public static double getTaxa() {
        return 0.45;
    }
    public static void calculadorEmprestimo(double valor, int parcela) {
        if (parcela != 0) {
            double valorParcela = (valor / parcela)+((valor / parcela)* getTaxa())/100;
            double valorTotal = parcela * valorParcela;
            System.out.println("Selecionando a opção de "+ parcela +" parcelas, o valor total a ser pago em parcelas de " +
                 valorParcela+ " será de "+ valorTotal);
        }else {
            System.out.println("Selecionando a opção de "+ parcela +" parcelas, o valor total a ser pago será "+ valor );
        }
    }

    public static void main(String[] args) {
        calculadorEmprestimo(1500.,0);
    }
}