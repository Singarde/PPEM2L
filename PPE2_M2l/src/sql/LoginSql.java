package sql;

public class LoginSql {

	
	private String url;
	private String utilisateur;
	private String motDePasse;
	
	public LoginSql(){
		   this.url="jdbc:mysql://localhost:3306/ppe_m2l";
		   this.utilisateur="root";
		   this.motDePasse="";
	   }
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	

	
	
}
