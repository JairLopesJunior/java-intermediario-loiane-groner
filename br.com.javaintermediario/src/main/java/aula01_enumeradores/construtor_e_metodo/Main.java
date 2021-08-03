package aula01_enumeradores.construtor_e_metodo;

public class Main {

    // Enums extends a classe java.lang.Enum
    // Podem ser comparadas  usando ==
    // Não podem ser instanciadas com new
    // Podem implementar interfaces
    // Pode ser declarado separadamente ou dentro da classe

    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.DOMINGO;

        System.out.println(dia.toString() + " - " + dia.getValor());
    }
}
