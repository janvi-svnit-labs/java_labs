public class Q1l4_Matrix {
    static int X = 3; //no. of layers(volume)
    static int Y = 3; //no. of rows
    static int Z = 3; //no. of columns

    //storing value in 1D array using set method
    static void set(int value, int indexX, int indexY, int indexZ, int []oneDArray) {
        int index = indexX*(Y*Z) + indexY*Z + indexZ;
        oneDArray[index] = value;
    }

    //getting value from 1D array using get method
    static void get(int indexX, int indexY, int indexZ, int []oneDArray) {
        int index = indexX*(Y*Z) + indexY*Z + indexZ;
        System.out.println("Value at ["+indexX+"]["+indexY+"]["+indexZ+"] = "+oneDArray[index]);
    }
    public static void main(String[]args) {
        int []oneDArray = new int[X*Y*Z]; //creating 1d array

        set(10, 0, 1, 2, oneDArray);
        set(20, 1, 0, 2, oneDArray);
        set(30, 2, 1, 0, oneDArray);

        get(0, 1, 2, oneDArray);
        get(1, 0, 2, oneDArray);
        get(2, 1, 0, oneDArray);
    }
}