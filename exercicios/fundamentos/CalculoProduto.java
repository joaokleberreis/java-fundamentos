public class CalculoProduto {
    public static void main(String[] args){
        String produto = "Iphone";
        double preco = 3800;
        int quantidadeComprada = 5;
        double valorTotal = preco * quantidadeComprada;

        System.out.println("Produto: " + produto);
        System.out.println("Preço unitário: " + preco);
        System.out.println("Quantidade comprada: " + quantidadeComprada);
        System.out.printf("Valor total: %.2f%n", valorTotal);
    }
}
