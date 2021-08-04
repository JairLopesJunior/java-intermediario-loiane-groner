package aula01_enumeradores.exercicio_proposto;

public enum OperacaoMatematica {

    SOMAR("+"){
        double executarOperacao(double x, double y){
            return x + y;
        }
    }, SUBTRAIR("-"){
        double executarOperacao(double x, double y){
            return x - y;
        }
    }, MULTIPLICAR("*"){
        double executarOperacao(double x, double y){
            return x * y;
        }
    }, DIVIDIR("/"){
        double executarOperacao(double x, double y){
            return x / y;
        }
    };

    private String simboloOperacao;

    abstract double executarOperacao(double x, double y);

    OperacaoMatematica(String simboloOperacao){
        this.simboloOperacao = simboloOperacao;
    }

    public String getSimboloOperacao() {
        return simboloOperacao;
    }

    @Override
    public String toString() {
        return "OperacaoMatematica{" +
                "simboloOperacao='" + simboloOperacao + '\'' +
                '}';
    }
}
