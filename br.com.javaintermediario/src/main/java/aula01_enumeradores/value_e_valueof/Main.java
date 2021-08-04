package aula01_enumeradores.value_e_valueof;

import aula01_enumeradores.construtor_e_metodo.DiaSemana;
import aula01_enumeradores.declaracao.DiaSemanaEnum;

public class Main {

    public static void main(String[] args) {

        DiaSemana[] dias = DiaSemana.values();

        for(int i = 0; i < dias.length; i++){
            System.out.println(dias[i].getValor());
        }

        for(DiaSemana dia : dias){
            System.out.println(dia.getValor());
        }

        System.out.println("METODO VALUEOF");

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
        System.out.println(dia);
    }
}
