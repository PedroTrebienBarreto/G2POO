package services;

public class Funcionario implements BuscadorDeEnvios {

    private CentralDeEnvios central;

    public Funcionario(CentralDeEnvios central){
        this.central = central;
    }

    @Override
    public List<Envio> buscarEnvios(){
        return central.getEnvios;
    }

}