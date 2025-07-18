import java.util.Scanner;


public class main {
    public static void main(String[] args) {

        int xp;
        String nome, nivel = "";

        Scanner scanner = new Scanner(System.in); //Receber valores

        System.out.println("Qual o nome do héroi ?");
        nome = scanner.nextLine();
        //System.out.println("nome: " + nome);

        System.out.println("Qual o XP do héroi " + nome + "?");
        xp = Integer.parseInt(scanner.nextLine());

        if(xp <= 1000){
            nivel = "Ferro";
        } else if (xp > 1000 && xp <= 2000) {
            nivel = "Bronze";
        } else if (xp > 2000 && xp <= 5000) {
            nivel = "Prata";
        } else if (xp > 5000 && xp <= 7000) {
            nivel = "Ouro";
        } else if (xp > 7000 && xp<= 8000) {
            nivel = "Platina";
        } else if (xp > 8000 && xp <= 9000) {
            nivel = "Ascendente";
        } else if (xp > 9000 && xp<= 10000){
            nivel = "Imortal";
        } else if (xp >= 10001){
            nivel = "Radiante";
        }
        System.out.println("O Herói de nome " + nome + " está no nível de " + nivel);


    }
}
