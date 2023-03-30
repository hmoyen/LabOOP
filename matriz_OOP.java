import java.util.Scanner;
public class Matriz {
//     métodos:
//     1. ler Matriz
//     2. printa a Matriz
//     3. multiplica duas Matrizes

int numLin, numCol;  // Create a class attribute

// Create a class constructor for the Main class
public Matriz(int lin, int col) {
  numLin = lin; 
  numCol = col; 
}

public double[][] leMatriz(int lin, int col) {
    double[][] matriz = new double[lin][col];
    for (int i= 0; i < lin; i++){
        for(int j = 0; j < col; j++) {
            matriz[i][j] = scanner.nextDouble();
        }
    }
    return matriz;

}

public void printaMatriz(double[][] mat, lin, col) {
    for(int i = 0; i < lin; i++){
        for
    }
}

static double[][] multiplicaMatrizes(double[][] mat1, double[][] mat2) {
    
  }

public static void main(String[] args) {
  Matriz first = new Matriz(3,4); // Create an object of class Matriz (This will call the constructor)
  Matriz second = new Matriz(4,3); // Create an object of class Matriz (This will call the constructor)
  first.leMatriz()

}
}