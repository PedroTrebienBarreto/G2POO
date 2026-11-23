package models;

public class Encomenda {

    private String descricao;
    private Integer peso;
    private Remetente remetente;

    public Encomenda(String descricao, Integer peso, Remetente remetente){
        this.descricao = descricao;
        if(peso <= 0){
            throw new IllegalArgumentException("O peso da encomenda deve ser um valor positivo!")
        }
        this.peso = peso;
        this.remetente = remetente;
    }

    public Integer getPeso(){
        return this.peso;
    }

}