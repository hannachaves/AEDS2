class Ciframento {
    public static boolean isFim(String linha) {
        return (linha.length() == 3 && linha.charAt(0) == 'F' && linha.charAt(1) == 'I' && linha.charAt(2) == 'M');
    } 

    public String fraseCifrada(String linha) {
        String cifra = " ";
        char x;
        int chave = 3;

        for(int i = 0; i < linha.length(); i++) {
            x = (char)(linha.charAt(i) + chave);
            cifra += x;
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