class Palindromo {
    public static void main(String[] args) {
        String palavra[] = new String[1000];
        int cont = 0;

        do{
            palavra[cont] = MyIO.readLine();
            cont++;
        } while (!isFim(palavra[cont - 1]));

        cont--;

        // se a palavra for palindromo mostrar "SIM", caso contrario
        // mostrar "NAO"
        for(int a = 0; a < cont; a++) {
            if(palind(palavra[a])) {
                MyIO.println("SIM");
            }
            else {
                MyIO.println("NAO");
            }
        }
    } // end main ()
    
    // metodo para verificar se a string e' um palindromo
    public static boolean palind(String palavra){
        int a = palavra.length() - 1;

        for(int i = 0; i < palavra.length(); i++, a--) {
            // testar se as letras sao iguais
            if(palavra.charAt(i) != palavra.charAt(a)) {
                return false;
            }
            else {
                return true;
            }
        }

        return false;
    } 

    public static boolean isFim(String palavra){
        return (palavra.length() == 3 && palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' 
        && palavra.charAt(2) == 'M');
    }
} // end Palindromo ()