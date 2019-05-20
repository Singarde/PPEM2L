package panel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import m2l.ControlAffichePanel;
import m2l.DecoElement;
import popUp.SelectionCandidat;
import sql.Suprime;

public class PanelSelectPersonne {

	// element panel de selection personne dans le gestion personne
	public static void elementPanelSelectionPersonneInPanelGestionPersonne(JPanel accueil, JPanel gestionPersonne,
			JPanel gestionEquipe, JPanel gestionCompetition, JPanel selectPerso) {
		
		JButton SP_button9 = new JButton("ajouter competition");
		DecoElement.decoJbouton(SP_button9);
		SP_button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				

			}
		});
		SP_button9.setBounds(50, 30, 300, 25);
		selectPerso.add(SP_button9);
		
		JButton SP_button = new JButton("Voir les equipes");
		DecoElement.decoJbouton(SP_button);
		SP_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		SP_button.setBounds(50, 90, 300, 25);
		selectPerso.add(SP_button);

		JButton SP_button1 = new JButton("Ajouter une équipe");
		DecoElement.decoJbouton(SP_button1);
		SP_button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		SP_button1.setBounds(50, 150, 300, 25);
		selectPerso.add(SP_button1);

		JButton SP_button2 = new JButton("Supprimer une personne");
		DecoElement.decoJbouton(SP_button2);
		SP_button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Suprime.suprimeCandidat(SelectionCandidat.getnumcompet());
				ControlAffichePanel.afficheGestionPersonne(gestionPersonne, accueil, gestionEquipe, gestionCompetition,
						selectPerso);
				

			}
		});
		SP_button2.setBounds(50, 210, 300, 25);
		selectPerso.add(SP_button2);

		JButton SP_button3 = new JButton("Voir les competitions");
		DecoElement.decoJbouton(SP_button3);
		SP_button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		SP_button3.setBounds(50, 270, 300, 25);
		selectPerso.add(SP_button3);

		JButton SP_button4 = new JButton("Modifier une personne");
		DecoElement.decoJbouton(SP_button4);
		SP_button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		SP_button4.setBounds(50, 330, 300, 25);
		selectPerso.add(SP_button4);

		JButton SP_button5 = new JButton("suprimer une équipe");
		DecoElement.decoJbouton(SP_button5);
		SP_button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				

			}
		});
		SP_button5.setBounds(50, 390, 300, 25);
		selectPerso.add(SP_button5);

		JButton SP_button6 = new JButton("Contactez la personne");
		SP_button6.setBounds(700, 90, 236, 23);
		DecoElement.decoJbouton(SP_button6);
		SP_button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		selectPerso.add(SP_button6);

		JLabel SP_label = new JLabel("Personne");
		SP_label.setForeground(Color.WHITE);
		SP_label.setHorizontalAlignment(SwingConstants.CENTER);
		SP_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		SP_label.setBounds(50, 25, 900, 54);
		selectPerso.add(SP_label);

		JButton SP_retour = new JButton("Retour");
		DecoElement.decoJbouton(SP_retour);
		SP_retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControlAffichePanel.afficheGestionPersonne(gestionPersonne, accueil, gestionEquipe, gestionCompetition,
						selectPerso);
			}
		});
		SP_retour.setBounds(700, 381, 160, 35);
		selectPerso.add(SP_retour);
	}

}
