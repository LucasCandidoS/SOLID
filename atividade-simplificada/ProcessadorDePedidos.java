class ProcessadorDePedidos {
    // Violação do DIP: Depende diretamente da implementação concreta
    private Salvar repositorio = new Salvar();
    private Processar pagamento=new Processar();
    private Enviar email=new Enviar();

    public void processar(Pedido pedido){
        Calcular.calcular(pedido);
    
        pagamento.processar(pedido);

        repositorio.salvar(pedido);

        email.enviar(pedido);
        
    }
    
}