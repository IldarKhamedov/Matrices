public class IntMatrix extends Matrix<Integer>{

    public IntMatrix(int size) {
        super(size);
        matrix=new Integer[size][size];
    }

    @Override
    public Matrix summaMatrix(Matrix m2) {
        IntMatrix summa=new IntMatrix(size);
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                summa.matrix[i][j]=this.matrix[i][j] + (Integer) m2.matrix[i][j];
            }
        }
        return summa;
    }
}
