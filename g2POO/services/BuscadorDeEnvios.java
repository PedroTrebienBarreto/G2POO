package services;

public Interface BuscadorDeEnvios{
    public List<Envio> buscarEnvios();

    // Princípio I -> As interfaces são segregadas de acordo com sua função, sem interfaces com muitos métodos desconexos.
}