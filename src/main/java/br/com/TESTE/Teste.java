package br.com.TESTE;

public class Teste {
	
	public static void main(String[] args) {
		
	      
	      String sIdEquipamento = "504696";
	      int idComando = 12052;
	      
	      String senha1 = "3300";
	      String senha2 = "44FF";
	      String senha3 = "FDF2";
	      String senha4 = "08D4";
	      
	      String vr0 = senha1.substring(0,2);
	      String vr1 = senha1.substring(2,4);
	      String vr2 = senha2.substring(0,2);
	      String vr3 = senha2.substring(2,4);
	      String vr4 = senha3.substring(0,2);
	      String vr5 = senha3.substring(2,4);
	      String vr6 = senha4.substring(0,2);
	      String vr7 = senha4.substring(2,4);
	      
	      String sLatitude = vr3+vr4+vr2+vr5;
	      String sLongitude = vr1+vr6+vr0+vr7;
	      
	      long latitude = Long.parseLong(sLatitude, 16);
	      long longitude = Long.parseLong(sLongitude, 16);
	      
	      long contrasenha = ((latitude|Integer.parseInt(sIdEquipamento))<<16) &((longitude|Integer.parseInt(sIdEquipamento))<<8);
	      
	      vr0 = Long.toHexString(idComando);
	      if (vr0.length()>4) {
	        vr0 = vr0.substring(vr0.length()-4);
	      }
	      
	      vr1 = Long.toHexString(contrasenha);
	      if (vr1.length()>8) {
	        vr1 = vr1.substring(vr1.length()-8);        
	      }
	      
	      vr3 = vr0.substring(3,4)+vr0.substring(0,1)+vr1.substring(2,3)+vr1.substring(3,4)+vr1.substring(4,5)+
		  vr1.substring(5,6)+vr0.substring(1,2)+vr0.substring(2,3); 
	      
	      contrasenha = Long.parseLong(vr3,16);
	      System.out.println("Contrasenha = "+contrasenha);
	  
	  
}


}
