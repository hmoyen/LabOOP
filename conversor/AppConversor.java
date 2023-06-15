import java.util.Scanner; 

public class AppConversor {
    public static void main(String[] args) {
        Conversor conv; // Criaremos um conversor dependento das entradas e saídas.
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a unidade da temperatura a ser convertida [F, C ou K]: ");
        char unidadeEntrada = sc.next().charAt(0);   
        System.out.print("Digite para qual unidade da temperatura convertê-la [F, C ou K]: ");
        char unidadeSaída = sc.next().charAt(0);   
        System.out.print("Digite a temperatura de entrada (em " + unidadeEntrada + "): ");
        double tempEntrada = sc.nextDouble();
        sc.close();

        char[] ca = {unidadeEntrada, unidadeSaída};
		String str = String.valueOf(ca);
        FabricaConversor factory = new FabricaConversor();
        
        //get the shape which has 4 sides
        conv = factory.newConversor(str);
        double tempSaída = conv.converte(tempEntrada);
        System.out.printf("%.2f%c -> %.2f%c\n", tempEntrada, unidadeEntrada, tempSaída, unidadeSaída);
    }
}
