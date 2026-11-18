class Endereco {
    String rua;
    int numero;
    Endereco(String rua, int numero) { this.rua = rua; this.numero = numero; }
    public String toString() { return rua + ", " + numero; }
}

class Pessoa {
    String nome;
    Endereco endereco;
    Pessoa(String nome, Endereco endereco) { this.nome = nome; this.endereco = endereco; }
}

public class Ex04 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana", new Endereco("Rua A", 100));
        System.out.println(pessoa.nome + " mora em " + pessoa.endereco);
    }
}