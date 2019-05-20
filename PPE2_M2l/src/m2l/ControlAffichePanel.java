package m2l;

import javax.swing.JPanel;

public class ControlAffichePanel {

	// commande pour switch les pannels
	public static void afficheGestionPersonne(JPanel gestionPersonne, JPanel accueil, JPanel gestionEquipe,
			JPanel gestionCompetition, JPanel selectPerso) {
		gestionPersonne.setVisible(true);
		accueil.setVisible(false);
		gestionEquipe.setVisible(false);
		gestionCompetition.setVisible(false);
		selectPerso.setVisible(false);
	}

	public static void afficheAccueil(JPanel gestionPersonne, JPanel accueil, JPanel gestionEquipe,
			JPanel gestionCompetition, JPanel selectPerso) {
		gestionPersonne.setVisible(false);
		accueil.setVisible(true);
		gestionEquipe.setVisible(false);
		gestionCompetition.setVisible(false);
		selectPerso.setVisible(false);
	}

	public static void afficheGestionEquipe(JPanel accueil, JPanel gestionEquipe, JPanel selectionEquipe) {
		accueil.setVisible(false);
		gestionEquipe.setVisible(true);
		selectionEquipe.setVisible(false);
	}

	public static void afficheGestionCompetition(JPanel selectionCompetition, JPanel accueil,
			JPanel gestionCompetition) {

		accueil.setVisible(false);
		selectionCompetition.setVisible(false);
		gestionCompetition.setVisible(true);

	}

	public static void afficheSelectionPersonne(JPanel gestionPersonne, JPanel accueil, JPanel gestionEquipe,
			JPanel gestionCompetition, JPanel selectPerso) {
		gestionPersonne.setVisible(false);
		accueil.setVisible(false);
		gestionEquipe.setVisible(false);
		gestionCompetition.setVisible(false);
		selectPerso.setVisible(true);
	}

	public static void afficheSelectionEquipe(JPanel gestionEquipe, JPanel selectionEquipe) {
		gestionEquipe.setVisible(false);
		selectionEquipe.setVisible(true);

	}

	public static void afficheSelectionCompetition(JPanel gestionCompetition, JPanel selectionCompetition) {
		gestionCompetition.setVisible(false);
		selectionCompetition.setVisible(true);

	}

}
