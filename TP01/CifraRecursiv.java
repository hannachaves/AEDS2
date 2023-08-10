class CifraRecursiv {
    public static boolean isFim(String linha) {
        return (linha.length() == 3 && linha.charAt(0) == 'F' && linha.charAt(1) == 'I' && linha.charAt(2) == 'M');
    } 

    public String fraseCifrada(String linha) {
        return fraseCifrada(linha, 0);
    }

    public String fraseCifrada(String linha, int i) {
        String cifra = " ";

        if(i < linha.length()) {
            cifra = ((char)(linha.charAt(i) + 3)) + fraseCifrada(linha, i + 1);
        }

        return cifra;
    }

    public static void main(String[]args) {
        String linha;
        linha = MyIO.readLine();

        while(!isFim(linha)) {
            MyIO.println(fraseCifrada(linha));

            linha = MyIO.readLine();
        }
    }
}