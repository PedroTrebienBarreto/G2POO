package services;

public class CentralDeEnvios {

    private String nomeDaCentral;
    private List<Envio>envios = new ArrayList<>();

    public CentralDeEnvios(String nomeDaCentral){
        this.nomeDaCentral = nomeDaCentral;
    }
    

    public CentralDeEnvios(){
    }

    public List<Envio> getEnvios(){
        return this.envios;
    }

    // Um exemplo do uso da Inversão de Dependencia. O método abaixo não depende de uma implementação concreta, mas sim de uma abstração (RegistradorDeEnvios).
    public void registrarNovoEnvio(RegistradorDeEnvios registrador, Envio envio){
        registrador.registrarEnvio(envio);
    }

}