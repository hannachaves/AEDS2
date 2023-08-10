class Is {
    public static boolean isFim(String linha) {
        return (linha.length() == 3 && linha.charAt(0) == 'F' && linha.charAt(1) == 'I' && linha.charAt(2) == 'M');
    } 

    public boolean isVogal(char c) {
        boolean resp = false;

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            resp = true;
        }

        return resp;
    }

    public boolean vogal(String line) {
        boolean resp = true;
        int i = 0;

        while(resp && (i < line.length())) {
            if(!isVogal(line.charAt(i))) {
                resp = false;
            }

            i++;
        }

        return resp;
    }

    public boolean isConsoante(char c) {
        boolean resp = false;

        if(!isVogal(c)) {
            resp = true;
        }

        return resp;
    }

    public boolean consoante(String line) {
        boolean resp = true;
        int i = 0;

        while(resp && (i < line.length())) {
            if(!isConsoante(line.charAt(i))) {
                resp = false;
            }

            i++;
        }

        return resp;
    }

    public boolean isInteiro(char c) {
        boolean resp = false;

        if(c == '0' || c == '1' || c == '2' || c == '3' || c == '4'
        || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
            resp = true;
        }

        return resp;
    }

    public boolean inteiro(String line) {
        boolean resp = true;
        int i = 0;

        while(resp && (i < line.length())) {
            if(!isInteiro(line.charAt(i))) {
                resp = false;
            }

            i++;
        }

        return resp;
    }

    public boolean isReal(String line) {
        boolean resp = false;
        int num = 0;
        int pontoVirg = 0;

        for(int i = 0; i < line.length(); i++) {
            if(isInteiro(line.charAt(i))) {
                num++;
            } 
            else if((line.charAt(i) == '.') || (line.charAt(i) == ',')) {
                pontoVirg++;
            }
        }

        if((num == line.length()) || (num == (line.length() - 1) && pontoVirg == 1)) {
            resp = true;
        }

        return resp;
    }

    public static void main(String[]args) {
        String linha;
        linha = MyIO.readLine();

        while(!isFim(linha)) {
            if(vogal(linha)) {
                MyIO.print("SIM ");
            } else {
                MyIO.print("NAO ");
            }

            if(consoante(linha)) {
                MyIO.print("SIM ");
            } else {
                MyIO.print("NAO ");
            }

            if(inteiro(linha)) {
                MyIO.print("SIM ");
            } else {
                MyIO.print("NAO ");
            }

            if(isReal(linha)) {
                MyIO.print("SIM ");
            } else {
                MyIO.print("NAO ");
            }

            MyIO.println(" ");

            linha = MyIO.readLine();
        }
    }
} 