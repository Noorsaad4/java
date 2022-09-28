package vucudkitleendeksi;

public class Main {

	public static void main(String[] args) {
    double agirlik=60;
    double boy=1.57;
    double vki=agirlik/(boy*boy);
    if(vki>0&&vki<18.5) {
    	System.out.println("zayýf");	
	}
    if(vki>18.5&&vki<24.9) {
    System.out.println("Normal");	
    }
    if(vki>25.0&&vki<29.9) {
    System.out.println("fazla kilolu");	
    }
    if(vki>30.0&&vki<34.9) {
    System.out.println("obez");	
    }
    if(vki>35.0&&vki<44.9) {
    System.out.println("fazla obez");	 	
    }
    if(vki>=45.0) {
    System.out.println("aþýrý fazla obez");	 		
       }
	}
}