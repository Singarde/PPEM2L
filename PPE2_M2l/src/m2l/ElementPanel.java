package m2l;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ElementPanel {

	// element panel de gestion equipe
	public static void elementPanelGestionEquipe(JPanel accueil, JPanel gestionPersonne, JPanel gestionEquipe,
			JPanel gestionCompetition, JPanel selectPerso, JPanel selectionEquipe) {
		JLabel GE_label = new JLabel("Gestion des \u00E9quipes");
		GE_label.setHorizontalAlignment(SwingConstants.CENTER);
		GE_label.setForeground(Color.WHITE);
		GE_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		GE_label.setBounds(50, 25, 900, 54);
		gestionEquipe.add(GE_label);

		JButton GE_detailEquipe = new JButton("D\u00E9tail des \u00E9quipes");
		DecoElement.decoJbouton(GE_detailEquipe);
		gestionEquipe.add(GE_detailEquipe);

		JButton GE_selectionEquipe = new JButton("S\u00E9lectionner une \u00E9quipe");
		DecoElement.decoJbouton(GE_selectionEquipe);
		GE_selectionEquipe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControlAffichePanel.afficheSelectionEquipe(gestionEquipe, selectionEquipe);
			}
		});

		GE_selectionEquipe.setBounds(50, 320, 300, 25);
		gestionEquipe.add(GE_selectionEquipe);

		JButton GE_ajoutEquipe = new JButton("Ajouter une \u00E9quipe");
		DecoElement.decoJbouton(GE_ajoutEquipe);
		GE_ajoutEquipe.setBounds(50, 220, 300, 25);
		gestionEquipe.add(GE_ajoutEquipe);

		JButton GE_retour = new JButton("Retour");
		DecoElement.decoJbouton(GE_retour);
		GE_retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControlAffichePanel.afficheAccueil(gestionPersonne, accueil, gestionEquipe, gestionCompetition,
						selectPerso);
			}
		});
		GE_retour.setBounds(700, 381, 160, 35);
		gestionEquipe.add(GE_retour);
	}


	// element panel de selection equipe dans la gestion equipe
	public static void elementPanelSelectionEquipeInPanelGestionEquipe(JPanel accueil, JPanel gestionEquipe,
			JPanel selectionEquipe) {
		JLabel SE_label = new JLabel("Equipe");
		SE_label.setForeground(Color.WHITE);
		SE_label.setHorizontalAlignment(SwingConstants.CENTER);
		SE_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		SE_label.setBounds(50, 25, 900, 54);
		selectionEquipe.add(SE_label);

		JButton SE_button = new JButton("Voir les membres");
		DecoElement.decoJbouton(SE_button);
		SE_button.setBounds(50, 90, 300, 25);
		selectionEquipe.add(SE_button);

		JButton SE_button1 = new JButton("Ajouter des membres");
		DecoElement.decoJbouton(SE_button1);
		SE_button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		SE_button1.setBounds(50, 150, 300, 25);
		selectionEquipe.add(SE_button1);

		JButton SE_button2 = new JButton("Supprimer un membres");
		DecoElement.decoJbouton(SE_button2);
		SE_button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		SE_button2.setBounds(50, 210, 300, 25);
		selectionEquipe.add(SE_button2);

		JButton SE_button3 = new JButton("Les comp\u00E9titions");
		DecoElement.decoJbouton(SE_button3);
		SE_button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		SE_button3.setBounds(50, 270, 300, 25);
		selectionEquipe.add(SE_button3);

		JButton SE_button4 = new JButton("Modifier l'\u00E9quipe");
		DecoElement.decoJbouton(SE_button4);
		SE_button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		SE_button4.setBounds(50, 330, 300, 25);
		selectionEquipe.add(SE_button4);

		JButton SE_button5 = new JButton("Supprimer l'\u00E9quipe");
		DecoElement.decoJbouton(SE_button5);
		SE_button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		SE_button5.setBounds(50, 390, 300, 25);
		selectionEquipe.add(SE_button5);

		JButton SE_retour = new JButton("Retour");
		DecoElement.decoJbouton(SE_retour);
		SE_retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControlAffichePanel.afficheGestionEquipe(accueil, gestionEquipe, selectionEquipe);
			}
		});
		SE_retour.setBounds(700, 381, 160, 35);
		selectionEquipe.add(SE_retour);
	}

	 

}
