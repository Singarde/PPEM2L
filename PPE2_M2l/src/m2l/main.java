package m2l;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import panel.PanelAccueil;
import panel.PanelCompet;
import panel.PanelPersonne;
import panel.PanelSelectCompet;
import panel.PanelSelectPersonne;
import sql.LoginSql;

public class main {

	private JFrame frame;
//Launch the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//Create the application.

	public main() {
		
		initialize();
	}

//Initialize the contents of the frame.
	private void initialize() {
		// la frame ou tout les panel sera initialiser
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setBounds(0, 0, 1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// panel accueil
		JPanel accueil = new JPanel();
		DecoElement.decoJpanel(accueil,frame);

		// panel gestion personne
		JPanel gestionPersonne = new JPanel();
		DecoElement.decoJpanel(gestionPersonne,frame);

		// pannel gestion equipe
		JPanel gestionEquipe = new JPanel();
		DecoElement.decoJpanel(gestionEquipe,frame);

		// pannel gestion competition
		JPanel gestionCompetition = new JPanel();
		DecoElement.decoJpanel(gestionCompetition,frame);

		// pannel selection personne dans gestion personne
		JPanel selectPerso = new JPanel();
		DecoElement.decoJpanel(selectPerso,frame);

		// pannel selection equipe dans gestion equipe
		JPanel selectionEquipe = new JPanel();
		DecoElement.decoJpanel(selectionEquipe,frame);

		// pannel selection competition dans gestion competition
		JPanel selectionCompetition = new JPanel();
		DecoElement.decoJpanel(selectionCompetition,frame);	
		

		// élément du panel accueil
		PanelAccueil.elementPanelAccueil(accueil, gestionPersonne, gestionEquipe, gestionCompetition, selectPerso,
				selectionEquipe, selectionCompetition);

		// élément du panel gestion personne
		PanelPersonne.elementPanelGestionPersonne(accueil, gestionPersonne, gestionEquipe, gestionCompetition,
				selectPerso);

		// élément du panel gestion equipe
		ElementPanel.elementPanelGestionEquipe(accueil, gestionPersonne, gestionEquipe, gestionCompetition, selectPerso,
				selectionEquipe);

		// élément du panel gestion competition
		PanelCompet.elementPanelGestionCompetition(accueil, gestionPersonne, gestionEquipe, gestionCompetition,
				selectPerso, selectionCompetition);

		// élément du panel selection personne dans gestion personne

		PanelSelectPersonne.elementPanelSelectionPersonneInPanelGestionPersonne(accueil, gestionPersonne, gestionEquipe,
				gestionCompetition, selectPerso);

		// élément du panel selection equipe du panel gestion equipe

		ElementPanel.elementPanelSelectionEquipeInPanelGestionEquipe(accueil, gestionEquipe, selectionEquipe);

		// élément du panel selection competition du panel competition

		PanelSelectCompet.elementPanelSelectionCompetitionInPanelCompetition(accueil, gestionCompetition,
				selectionCompetition);

		// test
		accueil.setVisible(true);
		gestionPersonne.setVisible(false);
		gestionEquipe.setVisible(false);
		gestionCompetition.setVisible(false);
		selectPerso.setVisible(false);
		selectionEquipe.setVisible(false);
		selectionCompetition.setVisible(false);

	}

	

}
