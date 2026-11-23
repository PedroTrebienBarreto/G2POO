package services;

public class Gerente extends Funcionario, implements RegistradorDeEnvios{

    public Gerente(CentralDeEnvios central){
        super(central);
    }

    @Override
    public void registrarEnvio(Envio envio){
        central.getEnvios().add(envio);
    }
}