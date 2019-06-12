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
	        System.out.println( "Driver charg� !" );
	        
	    } catch ( ClassNotFoundException e ) {
	    	System.out.println( "Erreur lors du chargement : le driver n'a pas �t� trouv� dans le classpath ! "+ e.getMessage() );

	    }
	 
	/* Connexion � la base de donn�es */
	LoginSql login = new LoginSql();
	
	java.sql.Connection connexion = null;
	java.sql.Statement statement = null;
	ResultSet resultat = null;
	
//	ArrayList<Sport> listSport = new ArrayList<Sport>();
	
	System.out.println("Chargement des valeur...");

	try {
		System.out.println("Connexion � la base de donn�es...");
		connexion = DriverManager.getConnection(login.getUrl(),login.getUtilisateur(),login.getMotDePasse());
		System.out.println("Connexion r�ussie !");

		/* Cr�ation de l'objet g�rant les requ�tes */
		statement = connexion.createStatement();
		
		
		 /* Cr�ation de l'objet g�rant les requ�tes */

        statement = connexion.createStatement();

        System.out.println( "Objet requ�te cr�� !" );


        /* Ex�cution d'une requ�te de lecture */

        resultat = statement.executeQuery( "SELECT * FROM competition;" );

        System.out.println( "Requ�te effectu�e !" );

 

        /* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
        
        

        while ( resultat.next() ) {

            

            resultat.getInt( "id_Competition" );
            resultat.getString( "Nom_Competition" );
            resultat.getString( "Lieu_C" );
            resultat.getString( "Date_C" );
            resultat.getString( "Jouabilite" );
            resultat.getInt( "id_Sport" );
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

