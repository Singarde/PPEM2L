package sql;

import java.awt.Choice;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CreatChamp {

	public static void competition(JTextField date1, JTextField nom1, JTextField lieu1, Choice choice,
			Choice typeCompet) {
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
		System.out.println("Chargement des valeur...");

		try {
			System.out.println("Connexion à la base de données...");
			connexion = DriverManager.getConnection(login.getUrl(), login.getUtilisateur(), login.getMotDePasse());
			System.out.println("Connexion réussie !");

			/* Création de l'objet gérant les requêtes */
			statement = connexion.createStatement();

			System.out.println("Objet requête créé !");

			/* Exécution d'une requête de lecture */
			String date = date1.getText();
			String lieu = lieu1.getText();
			String nom = nom1.getText();
			String jouabiliter = choice.getSelectedItem();
			int sport = choice.getSelectedIndex();

			// a rajouter
			String id_employer;

			statement.executeUpdate(
					"INSERT INTO competition(Date_C,Lieu_C,Nom_Competition,Jouabilite,Id_TypeCompetition,Id_employe ) VALUES ('"
							+ date + "','" + lieu + "','" + nom + "','" + jouabiliter + "'," + (sport + 1) + ",1);");

			System.out.println(
					"INSERT INTO competition(Date_C,Lieu_C,Nom_Competition,Jouabilite,Id_TypeCompetition) VALUES ('"
							+ date + "','" + lieu + "','" + nom + "','" + jouabiliter + "'," + (sport + 1)
							+ ",1); effectuée !");
			JOptionPane.showMessageDialog(null, "competition crée", "Information", JOptionPane.INFORMATION_MESSAGE);
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

	public static void candidat(JTextField nom1, JTextField prenom1, JTextField email1, JTextField tel1,
			JTextField adresse1) {
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
		System.out.println("Chargement des valeur...");

		try {
			System.out.println("Connexion à la base de données...");
			connexion = DriverManager.getConnection(login.getUrl(), login.getUtilisateur(), login.getMotDePasse());
			System.out.println("Connexion réussie !");

			/* Création de l'objet gérant les requêtes */
			statement = connexion.createStatement();

			System.out.println("Objet requête créé !");

			/* Exécution d'une requête de lecture */

			// JTextField nom1,JTextField prenom1,JTextField email1,JTextField
			// tel1,JTextField adresse1
			String nom = nom1.getText();
			String prenom = prenom1.getText();
			String email = email1.getText();
			String tel = tel1.getText();
			String adresse = adresse1.getText();

			// a rajouter

			statement.executeUpdate(
					"INSERT INTO personne(Nom_personne_personne,prenom_personne_personne,Email_personne_personne,Tel__personne_personne,Adresse_personne_personne) VALUES ('"
							+ nom + "','" + prenom + "','" + email + "','" + tel + "','" + adresse+ "');");

			System.out.println(
					"INSERT INTO competition(Nom_personne_personne,prenom_personne_personne,Email_personne_personne,Tel__personne_personne,Adresse_personne_personne) VALUES ('"
							+ nom + "','" + prenom + "','" + email + "','" + tel + "','" + adresse+ "'); effectuée !");
			JOptionPane.showMessageDialog(null, "candidat crée", "Information", JOptionPane.INFORMATION_MESSAGE);
//			System.out.println(
//					"INSERT INTO personne(Nom_personne_personne,prenom_personne_personne,Email_personne_personne,Tel__personne_personne,Adresse_personne_personne) VALUES ('"
//							+ nom + "','" + prenom + "','" + email + "','" + tel + "','" + adresse+ "');");
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
