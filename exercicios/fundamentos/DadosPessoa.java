public class DadosPessoa {
    public static void main(String[] args){
        String nome = "João";
        int idade = 25;
        double altura = 1.70;
        double salario = 10000;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.printf("Salário: %.2f%n", salario);
    }
}
