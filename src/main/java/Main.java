public class Main {
    public static void main(String[] args) {
        Elements elements=new Number();
        int count=0;
        int size=2;
        while (count!=5) {
            Matrix m1 = new IntMatrix(size);
            Matrix m2 = new IntMatrix(size);
            m1.fillMatrix(elements);
            m2.fillMatrix(elements);
            Matrix m3=m1.summaMatrix(m2);
            m1.drawMatrix();
            System.out.println("+");
            m2.drawMatrix();
            System.out.println("=");
            m3.drawMatrix();
            System.out.println();
            count+=1;
            }
    }
}
