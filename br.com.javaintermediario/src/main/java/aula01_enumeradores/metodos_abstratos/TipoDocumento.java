package aula01_enumeradores.metodos_abstratos;

public enum TipoDocumento {

    CPF{
        public String geraNumeroTeste(){
            return null;
        }
    }, CNPJ{
        public String geraNumeroTeste() {
            return null;
        }
    };

    public abstract String geraNumeroTeste();
    
}
