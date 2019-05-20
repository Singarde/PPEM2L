package sql;

import java.awt.Choice;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import classe.Candidat;

public class CreatListCandidat {

	


	public static void listCandidat(Choice listCandidat) {
		try {

			System.out.println("Chargement du driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver charg� !");

		} catch (ClassNotFoundException e) {
			System.out.println(
					"Erreur lors du chargement : le driver n'a pas �t� trouv� dans le classpath ! " + e.getMessage());

		}
		/* Connexion � la base de donn�es */
		LoginSql login = new LoginSql();
		java.sql.Connection connexion = null;
		java.sql.Statement statement = null;
		ResultSet resultat = null;
		System.out.println("Chargement des valeur...");

		try {
			System.out.println("Connexion � la base de donn�es...");
			connexion = DriverManager.getConnection(login.getUrl(), login.getUtilisateur(), login.getMotDePasse());
			System.out.println("Connexion r�ussie !");
			/* Cr�ation de l'objet g�rant les requ�tes */
			statement = connexion.createStatement();
			/* Cr�ation de l'objet g�rant les requ�tes */
			statement = connexion.createStatement();
			System.out.println("Objet requ�te cr�� !");
			/* Ex�cution d'une requ�te de lecture */
			resultat = statement.executeQuery("SELECT * FROM personne;");
			System.out.println("Requ�te effectu�e !");

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */

			while (resultat.next()) {
// 	 	 	Groupe_personne_personne 
				int id =resultat.getInt("Id_personne_personne");
				String nom =resultat.getString("Nom_personne_personne");
				String prenom = resultat.getString("prenom_personne_personne");
				String email = resultat.getString("Email_personne_personne");
				String tel = resultat.getString("Tel__personne_personne");
				String adresse = resultat.getString("Adresse_personne_personne");

				Candidat allCandi = new Candidat(id, nom, prenom, email, tel, adresse);
				
				listCandidat.add(allCandi.allCandidat());
				
				
			}

		}

		catch (SQLException e) {
			System.out.println("Erreur lors de la connexion : " + e.getMessage());
		} finally {
			System.out.println("Fermeture de l'objet ResultSet.");

			System.out.println("Fermeture de l'objet Statement.");
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException ignore) {

				}
			}
			System.out.println("Fermeture de l'objet Connection.");
			if (connexion != null) {
				try {
					connexion.close();
				} catch (SQLException ignore) {

				}
			}
		}
	}

	

}
