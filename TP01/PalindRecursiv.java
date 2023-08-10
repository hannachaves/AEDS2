class Palindromo {
    public static void main(String[] args) {
        String line = MyIO.readLine();

        while(!isFim(line)) {
            if(palind(line)) {
                MyIO.println("SIM");
            }
            else {
                MyIO.println("NAO");
            }

            line = MyIO.readLine();
        }
    } 

    public static boolean palind(String line) {
        return palind(line, 0, (line.length() - 1));
    }
    
    public static boolean palind(String palavra, int i, int j){
        boolean resp = true;

        if(i < j) {
            // testar se as letras sao iguais
            if(palavra.charAt(i) == palavra.charAt(j)) {
                resp = palind(palavra, i + 1; j - 1);
            }
            else {
                resp = false;
            }
        }

        return resp;
    } 

    public static boolean isFim(String palavra){
        return (palavra.length() == 3 && palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' 
        && palavra.charAt(2) == 'M');
    }
} // end Palindromo ()