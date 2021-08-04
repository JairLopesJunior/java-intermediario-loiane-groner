package aula01_enumeradores.exercicio_proposto;

public enum OperacaoMatematica {

    SOMAR("+"), SUBTRAIR("-"), MULTIPLICAR("*"), DIVIDIR("/");

    private String simboloOperacao;

    OperacaoMatematica(String simboloOperacao){
        this.simboloOperacao = simboloOperacao;
    }

    public String getSimboloOperacao() {
        return simboloOperacao;
    }
}
