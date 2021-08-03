package aula01_enumeradores;

public class Main {

    public static void main(String[] args) {

        usandoConstantes();
    }

    private static void usandoConstantes(){

        int segunda = DiaSemanaConstantes.SEGUNDA;
        int terca = DiaSemanaConstantes.TERCA;
        int quarta = DiaSemanaConstantes.QUARTA;
        int quinta = DiaSemanaConstantes.QUINTA;
        int sexta = DiaSemanaConstantes.SEXTA;
        int sabado = DiaSemanaConstantes.SABADO;
        int domingo = DiaSemanaConstantes.DOMINGO;

        System.out.println("Teste utilizando constantes no Java");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }

    private static void imprimeDiaSemana(int dia){
        switch (dia){
            case 1:
                System.out.println("Segunda-Feira");
            case 2:
                System.out.println("Terça-Feira");
            case 3:
                System.out.println("Quarta-Feira");
            case 4:
                System.out.println("Quinta-Feira");
            case 5:
                System.out.println("Sexta-Feira");
            case 6:
                System.out.println("Sabado");
            case 7:
                System.out.println("Domingo");
        }
    }
}
