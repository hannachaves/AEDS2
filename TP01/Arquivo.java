import java.io.RandomAccessFile;

class Arquivo {
        public static boolean isFim(String linha) {
        return (linha.length() == 3 && linha.charAt(0) == 'F' && linha.charAt(1) == 'I' && linha.charAt(2) == 'M');
    } 

    public static void main(String[]args) {
        int n = MyIO.readInt();
        double val;

        RandomAccessFile RAF = new RandomAccessFile("val.txt", "rw");

        for(int i = 0; i < n; i++) {
            val = MyIO.readDouble();
            RAF.writeDouble(val);
        }

        RAF.close();

        RAF = new RandomAccessFile("val.txt", "r");

        RAF.seek(RAF.length());

        for(int i = 0; i < n; i++) {
            RAF.seek(8 * (n - i - 1));
            val = RAF.readDouble();

            if((val % 1) == 0) {
                MyIO.println((int)val);
            }
            else {
                MyIO.println(val);
            }

            RAF.close();
        }
    }
}