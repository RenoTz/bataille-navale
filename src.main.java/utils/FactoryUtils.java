package utils;

public class FactoryUtils {
	
	public static int convertirCharToInt(char lettre){
		int indice = 0;
		if(lettre == 'A'){
			indice = 1;
		}
		if(lettre == 'B'){
			indice = 2;
		}
		if(lettre == 'C'){
			indice = 3;
		}
		if(lettre == 'D'){
			indice = 4;
		}
		if(lettre == 'E'){
			indice = 5;
		}
		if(lettre == 'F'){
			indice = 6;
		}
		if(lettre == 'G'){
			indice = 7;
		}
		if(lettre == 'H'){
			indice = 8;
		}
		if(lettre == 'I'){
			indice = 9;
		}
		if(lettre == 'J'){
			indice = 10;
		}
		return indice;
	}
	
	public static char convertirIntToChar(int indice){
		char lettre = ' ';
		if(indice == 1){
			lettre = 'A';
		}
		if(indice == 2){
			lettre = 'B';
		}
		if(indice == 3){
			lettre = 'C';
		}
		if(indice == 4){
			lettre = 'D';
		}
		if(indice == 5){
			lettre = 'E';
		}
		if(indice == 6){
			lettre = 'F';
		}
		if(indice == 7){
			lettre = 'G';
		}
		if(indice == 8){
			lettre = 'H';
		}
		if(indice == 9){
			lettre = 'I';
		}
		if(indice == 10){
			lettre = 'J';
		}
		return lettre;
	}

}