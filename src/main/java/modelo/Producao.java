package modelo;

import org.bson.codecs.pojo.annotations.BsonProperty;

public class Producao {
    @BsonProperty(value="producaoDiariaVaca")
    private String producaoDiariaVaca; 
    
    @BsonProperty(value="producaoDiariaFazenda")
    private String prooducaoDiariaFazenda;

    @BsonProperty(value="producaoMensalFazenda")
    private String producaoMensalFazenda; 
    
    public Producao(){}

    public Producao(String producaoDiariaVaca, String producaoDiariaFazenda, String producaoMensalFazenda){
        this.producaoDiariaVaca= producaoDiariaVaca;
        this.prooducaoDiariaFazenda = producaoDiariaFazenda;
        this.producaoMensalFazenda = producaoMensalFazenda;
    }

    public String getProducaoDiariaVaca() {
        return producaoDiariaVaca;
    }

    public String setProducaoiariaFazenda() {
        return prooducaoDiariaFazenda;
    }

    public String getProducaoMensalFazenda() {
        return producaoMensalFazenda;
    }

    public void setProducaoMensalFazenda(String login) {
        this.producaoMensalFazenda = producaoMensalFazenda;
    }

    public void setProducaoDiariaFazenda(String senha) {
        this.producaoDiariaVaca = producaoDiariaVaca;
    }

    public void getProducaoDiariaFazenda(String senha) {
        this.producaoDiariaVaca = producaoDiariaVaca;
    }
    
    
    
}
