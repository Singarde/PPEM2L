package sql;

import java.awt.Choice;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import classe.Competition;

public class CreatListCompet {
	
//	public static ArrayList<Competition> listSport = new ArrayList<Competition>();

	public static void listCompet(Choice listCompet) {
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
	
//	ArrayList<Sport> listSport = new ArrayList<Sport>();
	
	System.out.println("Chargement des valeur...");

	try {
		System.out.println("Connexion à la base de données...");
		connexion = DriverManager.getConnection(login.getUrl(),login.getUtilisateur(),login.getMotDePasse());
		System.out.println("Connexion réussie !");

		/* Création de l'objet gérant les requêtes */
		statement = connexion.createStatement();
		
		
		 /* Création de l'objet gérant les requêtes */

        statement = connexion.createStatement();

        System.out.println( "Objet requête créé !" );


        /* Exécution d'une requête de lecture */

        resultat = statement.executeQuery( "SELECT * FROM competition;" );

        System.out.println( "Requête effectuée !" );

 

        /* Récupération des données du résultat de la requête de lecture */
        
        

        while ( resultat.next() ) {

            

            resultat.getInt( "id_Competition" );
            resultat.getString( "Nom_Competition" );
            resultat.getString( "Lieu_C" );
            resultat.getString( "Date_C" );
            resultat.getString( "Jouabilite" );
            resultat.getInt( "id_TypeCompetition" );
            resultat.getInt( "id_employe" );


            Competition allcompet = new Competition( resultat.getInt( "id_Competition" ),resultat.getString( "Nom_Competition" ),resultat.getString( "Lieu_C" ),resultat.getString( "Date_C" ),resultat.getString( "Jouabilite" ));
            listCompet.add(allcompet.allCompet());
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

