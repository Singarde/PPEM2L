package sql;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.ResultSet;

public class SelectPersonne {

	public static void selectCandidat(int id) {
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
			System.out.println("Objet requête créé !");
			statement.executeUpdate("DELETE FROM competition WHERE id_Competition=" + id + ";");
			
			while (((ResultSet) statement).next()) {
//	 	 	 	Groupe_personne_personne 
					int idcan =resultat.getInt("Id_personne_personne");
					String nom =resultat.getString("Nom_personne_personne");
					String prenom = resultat.getString("prenom_personne_personne");
					String email = resultat.getString("Email_personne_personne");
					String tel = resultat.getString("Tel__personne_personne");
					String adresse = resultat.getString("Adresse_personne_personne");
					
					JOptionPane.showMessageDialog(null, "id: "+idcan+"\n\rNom:"+nom, "Information",JOptionPane.INFORMATION_MESSAGE);

					
					
					
				}

//			System.out.println("DELET FROM competition WHERE id_Competition=" + id + "; supr ok");
//			JOptionPane.showMessageDialog(null, "supression de la compet reussi", "Information",
//					JOptionPane.INFORMATION_MESSAGE);
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
