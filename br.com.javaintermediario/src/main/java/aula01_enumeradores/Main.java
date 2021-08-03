package aula01_enumeradores;

public class Main {

    public static void main(String[] args) {

        usandoConstantes();
    }

    private static void usandoConstantes(){

        DiaSemanaEnum segunda = DiaSemanaEnum.SEGUNDA;
        DiaSemanaEnum terca = DiaSemanaEnum.TERCA;
        DiaSemanaEnum quarta = DiaSemanaEnum.QUARTA;
        DiaSemanaEnum quinta = DiaSemanaEnum.QUINTA;
        DiaSemanaEnum sexta = DiaSemanaEnum.SEXTA;
        DiaSemanaEnum sabado = DiaSemanaEnum.SABADO;
        DiaSemanaEnum domingo = DiaSemanaEnum.DOMINGO;

        System.out.println("Teste utilizando constantes no Java");
//        imprimeDiaSemana(segunda);
//        imprimeDiaSemana(terca);
//        imprimeDiaSemana(quarta);
//        imprimeDiaSemana(quinta);
//        imprimeDiaSemana(sexta);
//        imprimeDiaSemana(sabado);
//        imprimeDiaSemana(domingo);

        System.out.println("Teste utilizando enum no Java");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }

    private static void imprimeDiaSemana(DiaSemanaEnum dia){
        switch (dia){
            case SEGUNDA:
                System.out.println("Segunda-Feira");
                break;
            case TERCA:
                System.out.println("Terça-Feira");
                break;
            case QUARTA:
                System.out.println("Quarta-Feira");
                break;
            case QUINTA:
                System.out.println("Quinta-Feira");
                break;
            case SEXTA:
                System.out.println("Sexta-Feira");
                break;
            case SABADO:
                System.out.println("Sabado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }

    private void usandoEnum(){

        DiaSemanaEnum segunda = DiaSemanaEnum.SEGUNDA;
        DiaSemanaEnum terca = DiaSemanaEnum.TERCA;
        DiaSemanaEnum quarta = DiaSemanaEnum.QUARTA;
        DiaSemanaEnum quinta = DiaSemanaEnum.QUINTA;
        DiaSemanaEnum sexta = DiaSemanaEnum.SEXTA;
        DiaSemanaEnum sabado = DiaSemanaEnum.SABADO;
        DiaSemanaEnum domingo = DiaSemanaEnum.DOMINGO;
    }
}
