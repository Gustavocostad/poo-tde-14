import java.util.ArrayList;

class Item {
    String nome;
    double preco;
    Item(String nome, double preco) { this.nome = nome; this.preco = preco; }
}

class Pedido {
    private ArrayList<Item> itens = new ArrayList<>();
    void adicionar(Item item) { itens.add(item); }
    double total() {
        double soma = 0;
        for (Item item : itens) soma += item.preco;
        return soma;
    }
}

public class Ex05 {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionar(new Item("Cafe", 8));
        pedido.adicionar(new Item("Bolo", 12.5));
        System.out.printf("Total: R$ %.2f%n", pedido.total());
    }
}