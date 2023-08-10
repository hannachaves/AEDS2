#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

bool isVogal(char c);
bool vogal(char line[]);
bool isConsoante(char c);
bool consoante(char line[]);
bool isInteiro(char c);
bool inteiro(char line[]);
bool isReal(char line[]);
bool isFim(char line[]);

    bool isFim(char line[]) {
        return (strlen(line) == 3 && line[0] == 'F' && line[1] == 'I' && line[2] == 'M');
    } 

    bool isVogal(char c) {
        bool resp = false;

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            resp = true;
        }

        return resp;
    }

    bool vogal(char line[]) {
        bool resp = true;
        int i = 0;

        while(resp && (i < strlen(line))) {
            if(!isVogal(line[i])) {
                resp = false;
            }

            i++;
        }

        return resp;
    }

    bool isConsoante(char c) {
        bool resp = false;

        if(!isVogal(c)) {
            resp = true;
        }

        return resp;
    }

    bool consoante(char line[]) {
        bool resp = true;
        int i = 0;

        while(resp && (i < strlen(line))) {
            if(!isConsoante(line[i])) {
                resp = false;
            }

            i++;
        }

        return resp;
    }

    bool isInteiro(char c) {
        bool resp = false;

        if(c == '0' || c == '1' || c == '2' || c == '3' || c == '4'
        || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
            resp = true;
        }

        return resp;
    }

    bool inteiro(char line[]) {
        bool resp = true;
        int i = 0;

        while(resp && (i < strlen(line))) {
            if(!isInteiro(line[i])) {
                resp = false;
            }

            i++;
        }

        return resp;
    }

    bool isReal(char line[]) {
        bool resp = false;
        int num = 0;
        int pontoVirg = 0;

        for(int i = 0; i < strlen(line); i++) {
            if(isInteiro(line[i])) {
                num++;
            } 
            else if((line[i] == '.') || (line[i] == ',')) {
                pontoVirg++;
            }
        }

        if((num == strlen(line)) || (num == (strlen(line) - 1) && pontoVirg == 1)) {
            resp = true;
        }

        return resp;
    }

    int main() {
        char linha[500];
        scanf(" %500[^\n]", linha);

        while(!isFim(linha)) {
            if(vogal(linha)) {
                printf("SIM ");
            } else {
                printf("NAO ");
            }

            if(consoante(linha)) {
                printf("SIM ");
            } else {
                printf("NAO ");
            }

            if(inteiro(linha)) {
                printf("SIM ");
            } else {
                printf("NAO ");
            }

            if(isReal(linha)) {
                printf("SIM ");
            } else {
                printf("NAO ");
            }

            println(" ");

            scanf(" %500[^\n]", linha);
        }
    }
