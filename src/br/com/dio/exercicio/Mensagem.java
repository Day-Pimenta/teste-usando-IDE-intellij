package br.com.dio.exercicio;

public class Mensagem {

    public static void mensagem(int horario){
        if (horario>=1 && horario<12 ){
            System.out.println("Bom dia");
        }
        if (horario>=12 && horario<18){
            System.out.println("Boa Tarde");
        }
        if(horario>=18) {
            System.out.println("Boa noite");
        }

    }

    public static void main(String[] args) {
        mensagem(7);
        mensagem(12);
        mensagem(23);
    }
}
