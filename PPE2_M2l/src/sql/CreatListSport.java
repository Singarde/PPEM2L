package sql;

import java.awt.Choice;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import classe.Sport;

public class CreatListSport {
	
	public static ArrayList<Sport> listSport = new ArrayList<Sport>();
	public static void listSport(Choice typeCompet) {
		// TODO Auto-generated method stub
		try {

	        System.out.println( "Chargement du driver..." );
	        Class.forName( "com.mysql.jdbc.Driver" );
	        System.out.println( "Driver chargé !" );
	        
	    } catch ( ClassNotFoundException e ) {
	    	System.out.println( "Erreur lors du chargement : le driver n'a pas été trouvé dans le classpath ! "+ e.getMessage() );
	    }
	/* Connexion à la base de données */
	LoginSql login = new LoginSql();
	java.sql.Connection connexion = null;
	java.sql.Statement statement = null;
	ResultSet resultat = null;	
	System.out.println("Chargement des valeur...");
	
	try {
		System.out.println("Connexion à la base de données...");
		connexion = DriverManager.getConnection(login.getUrl(),login.getUtilisateur(),login.getMotDePasse());
		System.out.println("Connexion réussie !");
		/* Création de l'objet gérant les requêtes */
		statement = connexion.createStatement();
		
        System.out.println( "Objet requête créé !" );
        /* Exécution d'une requête de lecture */
        resultat = statement.executeQuery( "SELECT id_Sport, Libellé FROM sport WHERE jouabiliter NOT LIKE 'seul';" );
        System.out.println( "Requête effectuée !" ); 
        /* Récupération des données du résultat de la requête de lecture */        
        while ( resultat.next() ) {
            int id_TypeCompetition = resultat.getInt( "id_Sport" );
            String Libellé = resultat.getString( "Libellé" );
            Sport sport = new Sport(id_TypeCompetition,Libellé);           
//            listSport.add(sport);           
//            System.out.println(sport.getidSport()+" "+sport.getlabelle());
            /* Formatage des données pour affichage dans la JSP finale. */
            typeCompet.add(sport.getlabelle());
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
