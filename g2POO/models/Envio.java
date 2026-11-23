package models;

public class Envio {

    // Princípio O -> A classe Envio está fechada para alterações, todos os outros tipos de envio partem desta classe, cada uma com suas peculiaridades
    // Princípio L -> Todas 

    private Encomenda encomenda;
    private String data;
    private Double precoBase;

    public Envio(Encomenda encomenda, String data, Double precoBase){
        if (encomenda == null){
            throw new EnvioSemEncomendaException("O envio deve conter uma encomenda!")
        }
        this.encomenda = encomenda;
        this.data = data;
        if (precoBase == 0 || precoBase < 0){
            throw new PrecoInvalidoException("O valor do envio deve ser positivo!")
        }
        this.precoBase = precoBase;
    }

    public Double calcularPrecoDeEnvio(){
        return precoBase;
    }

}