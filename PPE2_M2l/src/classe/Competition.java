package classe;

public class Competition {
	
	private int idCompetition;
	private String labelCompet;
	private String lieu;
	private String Date;
	private String jouabilit�;
	private int idSport;
	private int frais;
	
	
	public Competition(int idCompetition,String labelCompet,String lieu,String Date, String jouabilit�, int idSport,int frais){
		this.idCompetition=idCompetition;
		this.labelCompet=labelCompet;
		this.lieu=lieu;
		this.Date=Date;
		this.jouabilit�=jouabilit�;
		this.idSport=idSport;
		this.frais=frais;
	}
	
	
	public int getIdCompetition() {
		return idCompetition;
	}
	public void setIdCompetition(int idCompetition) {
		this.idCompetition = idCompetition;
	}
	public String getLabelCompet() {
		return labelCompet;
	}
	public void setLabelCompet(String labelCompet) {
		this.labelCompet = labelCompet;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getJouabilit�() {
		return jouabilit�;
	}
	public void setJouabilit�(String jouabilit�) {
		this.jouabilit� = jouabilit�;
	}
	
	
	public String allCompet(){
		
		
		return (this.idCompetition+"-"+this.labelCompet+"-"+this.lieu+"-"+this.Date);
		
	}


	public int getFrais() {
		return frais;
	}


	public void setFrais(int frais) {
		this.frais = frais;
	}


	public int getIdSport() {
		return idSport;
	}


	public void setIdSport(int idSport) {
		this.idSport = idSport;
	}
	
	
	

}

