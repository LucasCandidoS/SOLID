public class Salvar{
    MySQLRepositorio repositorio=new MySQLRepositorio();
    public  void salvar(Pedido pedido){
        try {
            repositorio.salvar(pedido);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}