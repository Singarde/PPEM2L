package classe;

public class Candidat {
	
	private int idcandidat;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	private String adresse;
	
	
	public Candidat(int id,String nom,String prenom,String email,String tel, String adresse){
		this.idcandidat=id;
		this.nom=nom;
		this.prenom=prenom;
		this.email=email;
		this.tel=tel;
		this.adresse=adresse;
	}
	
public String allCandidat(){
		
		
		return (this.idcandidat+" - "+this.nom+" - "+this.prenom);
		
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getIdcandidat() {
		return idcandidat;
	}

	public void setIdcandidat(int idcandidat) {
		this.idcandidat = idcandidat;
	}

}
