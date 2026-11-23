package app;

public class Main{
    public static void Main(String[] args){

        // Princípio S -> As classes são separadas em pacotes segregados de acordo com sua função na estrutura do modelo de negócio.

        Transportadora speedBox = new Transportadora("SpeedBox");
        CentralDeEnvios central = new CentralDeEnvios("Central SpeedBox");

        Funcionario gerente = new Gerente(central);
        Funcionario funcionario = new Funcionario(central);

        Remetente remetente1 = new Remetente("João", "3341-6731");
        Remetente remetente2 = new Remetente("Maria", "1132-9076")

        Encomenda encomenda1 = new Encomenda("Bomba Relógio", 8, remetente1);
        Encomenda encomenda2 = new Encomenda("Piano", 320, remetente2);
        Encomenda encomenda3 = new Encomenda("Guitarra", 8, remetente2);
        Encomenda encomenda4 = new Encomenda("Panela de Ferro", 5, remetente1);

        Envio envio1 = new EnvioExpresso(encomenda2, "20/11/2026", 400);
        try{
            Envio envio3 = new EnvioExpresso(null "20/11/2026", 312);
        } catch (EnvioSemEncomendaException e){
            throw new EnvioSemEncomendaException(e.getMessage());
        }

        Envio envio2 = new EnvioInternacional(encomenda1, "25/12/2026", 100);

        try {
            Envio envio4 = new EnvioEconomico(encomenda3, "25/12/2026", -45);
        } catch (PrecoInvalidoException e){
            throw new PrecoInvalidoException(e.getMessage());
        }

        Envio envio5 = new EnvioEconomico(encomenda4, "30/11/2026", 20);

        central.registrarNovoEnvio(gerente, envio1);
        central.registrarNovoEnvio(gerente, envio2);
        central.registrarNovoEnvio(gerente, envio5);

        speedBox.envioMaisCaro(gerente);
        speedBox.calcularFaturamento(funcionario);

    }
}