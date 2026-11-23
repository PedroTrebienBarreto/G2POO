package services;

public class Transportadora {

    private String nome;

    public Transportadora(String nome){
        this.nome = nome;
    }

    // Princípio D -> Os métodos recebem uma abstração como argumento. Dependem de uma abstração e não de uma classe concreta. Não importa quem implementa

    public void calcularFaturamento(BuscadorDeEnvios buscador){
        Double faturamento = 0.0;
        for (Envio envio : buscador.buscarEnvios()){
            // Princípio L -> As filhas (subclasses de Envio) honram o contrato calcularPrecoDeEnvio() sem surpresas.
            // A  classe mãe consegue ser substituida sem causar qualquer tipo de erro.
            faturamento+=envio.calcularPrecoDeEnvio();
        }
        return faturamento;
    }

    public Envio envioMaisCaro(BuscadorDeEnvios buscador){
        Envio maisCaro = null;
        int i = 0;
        for (Envio envio : buscador.buscarEnvios()){
            if (i == 0){
                maisCaro = envio;
                i+=1;
            } else {
                if (maisCaro.calcularPrecoDeEnvio < envio.calcularPrecoDeEnvio) {
                    maisCaro = envio;
                }
            }
        }
        return maisCaro;
    }

}