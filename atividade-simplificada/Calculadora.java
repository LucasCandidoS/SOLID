public class Calculadora{
    public static void Calculadora{
        public void processar(Pedido pedido) {
            // 1. Responsabilidade: Calcular o total
            double total = 0;
                for (Item item : pedido.getItens()) {
                total += item.getPreco();
            }
            System.out.println("Total do pedido: " + total);
        }
    }
}
