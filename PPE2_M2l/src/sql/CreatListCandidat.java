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
			System.out.println("Driver chargé !");

		} catch (ClassNotFoundException e) {
			System.out.println(
					"Erreur lors du chargement : le driver n'a pas été trouvé dans le classpath ! " + e.getMessage());

		}
		/* Connexion à la base de données */
		LoginSql login = new LoginSql();
		java.sql.Connection connexion = null;
		java.sql.Statement statement = null;
		ResultSet resultat = null;
		System.out.println("Chargement des valeur...");

		try {
			System.out.println("Connexion à la base de données...");
			connexion = DriverManager.getConnection(login.getUrl(), login.getUtilisateur(), login.getMotDePasse());
			System.out.println("Connexion réussie !");
			/* Création de l'objet gérant les requêtes */
			statement = connexion.createStatement();
			/* Création de l'objet gérant les requêtes */
			statement = connexion.createStatement();
			System.out.println("Objet requête créé !");
			/* Exécution d'une requête de lecture */
			resultat = statement.executeQuery("SELECT * FROM personne;");
			System.out.println("Requête effectuée !");

			/* Récupération des données du résultat de la requête de lecture */

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
