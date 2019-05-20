package sql;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Suprime {

	public static void suprimeCompet(int id) {
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

		System.out.println("Chargement des valeur...");

		try {
			System.out.println("Connexion � la base de donn�es...");
			connexion = DriverManager.getConnection(login.getUrl(), login.getUtilisateur(), login.getMotDePasse());
			System.out.println("Connexion r�ussie !");

			/* Cr�ation de l'objet g�rant les requ�tes */
			statement = connexion.createStatement();
			System.out.println("Objet requ�te cr�� !");
			statement.executeUpdate("DELETE FROM competition WHERE id_Competition=" + id + ";");

			System.out.println("DELET FROM competition WHERE id_Competition=" + id + "; supr ok");
			JOptionPane.showMessageDialog(null, "supression de la compet reussi", "Information",
					JOptionPane.INFORMATION_MESSAGE);
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

	public static void suprimeCandidat(int id) {
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

		System.out.println("Chargement des valeur...");

		try {
			System.out.println("Connexion � la base de donn�es...");
			connexion = DriverManager.getConnection(login.getUrl(), login.getUtilisateur(), login.getMotDePasse());
			System.out.println("Connexion r�ussie !");

			/* Cr�ation de l'objet g�rant les requ�tes */
			statement = connexion.createStatement();
			System.out.println("Objet requ�te cr�� !");
			statement.executeUpdate("DELETE FROM personne WHERE Id_personne_personne =" + id + ";");

			System.out.println("DELET FROM personne WHERE Id_personne_personne =" + id + "; supr ok");
			JOptionPane.showMessageDialog(null, "supression de la personne reussi", "Information",
					JOptionPane.INFORMATION_MESSAGE);
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
