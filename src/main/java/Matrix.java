public abstract class Matrix <T>{
int size;
T[][] matrix;

    public Matrix(int size) {
        this.size = size;
    }

    public abstract Matrix summaMatrix(Matrix m2);

    public void fillMatrix(Elements elements) {
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                matrix[i][j]=(T)elements.createElement();
            }
        }
    }

    public void drawMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
  }
