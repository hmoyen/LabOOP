import java.util.Scanner;

class MultiplicaMatrizes {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Use: Exercicio1 num_linA num_colA numlinB num_colB");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        int numLinA = Integer.parseInt(args[0]);
        int numColA = Integer.parseInt(args[1]);
        int numLinB = Integer.parseInt(args[2]);
        int numColB = Integer.parseInt(args[3]);
        if (numColA == numLinB) {
            double[][] first = new double[numLinA][numColA];
            double[][] second = new double[numLinB][numColB];
            double[][] res = new double[numLinA][numColB];

            // System.out.print("args 4: " + args[4]);
            // double valor = scanner.nextDouble();
            for (int i= 0; i < numLinA; i++){
                for(int j = 0; j < numColA; j++) {
                    first[i][j] = scanner.nextDouble();
                    System.out.println("Ma[" + i + "," + j + "] = " + first[i][j]);
                }
            }
            for (int i= 0; i < numLinB; i++){
                for(int j = 0; j < numColB; j++) {
                    second[i][j] = scanner.nextDouble();
                    System.out.println("Mb[" + i + "," + j + "] = " + second[i][j]);
                }
            }
            scanner.close();
            
            for (int i = 0; i<numLinA; i++){
                for(int j = 0; j< numColB; j++){
                    double anterior = 0;
                    double soma = 0;
                    for (int k = 0; k < numLinB; k++){
                        soma = first[i][k]*second[k][j] + anterior;
                        anterior = soma;
                        
                    }
                    res[i][j] = soma;
                    System.out.println("Mc[" + i + "," + j + "] = " + res[i][j]);

                }
            } 
    } 
    else {
        System.out.println("Nao foi possivel realizar a operacao.");
        return;
    }
}
}