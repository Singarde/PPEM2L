package classe;

public class Sport {
	
	int idSport;
	String labelle;
	
	public Sport(int idSport,String labelle){
		   this.idSport=idSport;
		   this.labelle=labelle;
		   
		   
	   }
	
	public void setidSport (int idSport){
		 this.idSport=idSport;
	 }
	 public void setlabelle (String labelle){
		 this.labelle=labelle;
	 }
	 
	 public int getidSport(){
		 return this.idSport;
	 }
	 public String getlabelle(){
		 return this.labelle;
	 }

}
