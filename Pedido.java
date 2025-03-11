import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private List<Item> itens;
    public Pedido() {
        itens = new ArrayList<Item>();
    }
    public void addItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }
    public double calcularSubtotal(Item item) {
        return item.getPreco() * item.getQuantidade();
    }
}
