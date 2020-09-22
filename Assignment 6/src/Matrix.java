public class Matrix {
    private final int M;
    private final int N;
    private int[][] matrix;

    //zero-matrix construktor
    public Matrix(int m,int n) {
        this.M = m;
        this.N = n;
        this.matrix = new int[m][n];
    }
    //nonzero-matrix constructor
    public Matrix(int[][] matrix) {
        this.M = matrix.length;
        this.N = matrix[0].length;
        this.matrix = matrix;
    }

    //gettere
    public int getM() {
        return M;
    }
    public int getN() {
        return N;
    }
    public int[][] getMatrix() {
        return matrix;
    }

    //internemetoder
    private int findValue(int i, int j) {
        return matrix[i][j];
    }
    private void changeValue(int i, int j, int value) {
        matrix[i][j] = value;
    }

    //metoder
    public Matrix add(Matrix in) {
        if(M != in.getM() || N != in.getN()) throw new IndexOutOfBoundsException("Can't add matrixes of different sizes!");
        Matrix sum = new Matrix(M, N);
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                sum.changeValue(i, j, (in.findValue(i, j) + findValue(i, j)));
            }
        }
        return sum;
    }
    
    public Matrix multiply(Matrix in) {
        if(N != in.getM()) throw new IndexOutOfBoundsException("Can't multiply matrixes where N doesn't match M");
        Matrix product = new Matrix(M, in.getN());
        for(int i = 0; i < M; i++) {
            for (int j = 0; j < in.getN(); j++) {
                for (int k = 0; k < N; k++) {
                    int value = product.findValue(i,j) + (findValue(i, k) * in.findValue(k, j));
                    product.changeValue(i, j, value);
                }
            }
        }
        return product;
    }

    public Matrix transmute() {
        Matrix transmuted = new Matrix(N, M);
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                transmuted.changeValue(j, i, findValue(i, j));
            }
        }
        return transmuted;
    }

    public void print(){
        for(int i = 0; i < M; i++){
            String s = "";
            for(int j = 0; j < N; j++){
                s += findValue(i, j) + " ";
            }
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        int[][] m1 = {{1,2,3},{1,2,3},{4,5,6},{4,5,6}};

        Matrix matrix1 = new Matrix(m1);
        Matrix matrix2 = matrix1.transmute();

        System.out.println("The sum of matrix1 with itself:");
        Matrix sum = matrix1.add(matrix1);
        sum.print();

        System.out.println("The product of matrix1 and the transmuted matrix1:");
        Matrix product = matrix1.multiply(matrix2);
        product.print();

        System.out.println("The transmuted matrix1");
        matrix2.print();
    }
}
