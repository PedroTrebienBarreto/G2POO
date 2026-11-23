package models;

public class EnvioInternacional extends Envio {
    
    public EnvioInternacional(Encomenda encomenda, String data, Double precoBase){
    super(encomenda, data, precoBase);
    }

    @Override
    public Double calcularPrecoDeEnvio(){
        return this.precoBase*2.5;
    }
}