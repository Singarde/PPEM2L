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
	        System.out.println( "Driver charg� !" );
	        
	    } catch ( ClassNotFoundException e ) {
	    	System.out.println( "Erreur lors du chargement : le driver n'a pas �t� trouv� dans le classpath ! "+ e.getMessage() );
	    }
	/* Connexion � la base de donn�es */
	LoginSql login = new LoginSql();
	java.sql.Connection connexion = null;
	java.sql.Statement statement = null;
	ResultSet resultat = null;	
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
        resultat = statement.executeQuery( "SELECT id_TypeCompetition, Libell� FROM type_competition;" );
        System.out.println( "Requ�te effectu�e !" ); 
        /* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */        
        while ( resultat.next() ) {
            int id_TypeCompetition = resultat.getInt( "id_TypeCompetition" );
            String Libell� = resultat.getString( "Libell�" );
            Sport sport = new Sport(id_TypeCompetition,Libell�);           
//            listSport.add(sport);           
//            System.out.println(sport.getidSport()+" "+sport.getlabelle());
            /* Formatage des donn�es pour affichage dans la JSP finale. */
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
