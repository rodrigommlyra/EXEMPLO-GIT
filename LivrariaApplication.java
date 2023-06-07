import java.util.Scanner;

public class LivrariaApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Usuario usuario = new Usuario();

        System.out.println("Digite o seu nome:");
        usuario.setNome(sc.nextLine());

        System.out.println("Digite a sua idade:");
        usuario.setIdade(sc.nextInt());

        sc.close();

        System.out.println("Olá, " + usuario.getNome() + "!");

        if (usuario.getIdade() >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
    }

}