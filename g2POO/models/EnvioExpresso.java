package models;

public class EnvioExpresso extends Envio{

    public EnvioExpresso(Encomenda encomenda, String data, Double precoBase){
    super(encomenda, data, precoBase);
    }

    @Override
    public Double calcularPrecoDeEnvio(){
        if(encomenda.getPeso() > 10){
            return this.precoBase+(15*(encomenda.getPeso()-10));
        }
        else {
            return this.precoBase;
        }
    }

}

