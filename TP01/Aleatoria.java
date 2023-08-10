class Aleatoria {
    public static boolean isFim(String linha) {
        return (linha.length() == 3 && linha.charAt(0) == 'F' && linha.charAt(1) == 'I' && linha.charAt(2) == 'M');
    } 

    public char[] letrasAleat(Random gerador) {
        char[] letras = {' ', ' '};

        letras[0] = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
        letras[1] = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
        
        return letras;
    }

    public String fraseTroc(String frase, char[] troca) {
        String x = " ";

        for(int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == troca[0]) {
                x += troca[1];
            }
            else {
                x += frase.charAt(i);
            }
        }

        return x;
    }

    public static void main(String[]args) {
        String linha;
        char[] troca;

        Random gerador = new Random();
        gerador.setSeed(4);

        linha = MyIO.readLine();

        while(!isFim(linha)) {
            troca = letrasAleat(gerador);
            MyIO.println(fraseTroc(linha, troca));

            linha = MyIO.readLine();
        }
    }
}