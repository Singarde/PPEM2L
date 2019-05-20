package panel;

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

public class PanelAccueil {

	// element panel de Accueil
	public static void elementPanelAccueil(JPanel accueil, JPanel gestionPersonne, JPanel gestionEquipe,
			JPanel gestionCompetition, JPanel selectPerso, JPanel selectionEquipe, JPanel selectionCompetition) {
		JLabel AC_label = new JLabel("M2L accueil");// label de titre
		AC_label.setForeground(Color.WHITE);
		AC_label.setHorizontalAlignment(SwingConstants.CENTER);
		AC_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		AC_label.setBounds(50, 25, 900, 54);
		accueil.add(AC_label);

		JButton AC_gestionCompetition = new JButton("gestion comp\u00E9tition");// button
		DecoElement.decoJbouton(AC_gestionCompetition);
		AC_gestionCompetition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControlAffichePanel.afficheGestionCompetition(selectionCompetition, accueil, gestionCompetition);
			}
		});
		AC_gestionCompetition.setBounds(40, 104, 239, 44);
		accueil.add(AC_gestionCompetition);

		JButton AC_gestionEquipe = new JButton("gestion \u00E9quipe");// button
		DecoElement.decoJbouton(AC_gestionEquipe);
		AC_gestionEquipe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControlAffichePanel.afficheGestionEquipe(accueil, gestionEquipe, selectionEquipe);
			}
		});
		AC_gestionEquipe.setBounds(40, 234, 239, 48);
		accueil.add(AC_gestionEquipe);

		JButton AC_gestionPersonne = new JButton("gestion personne");// button
		DecoElement.decoJbouton(AC_gestionPersonne);
		AC_gestionPersonne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControlAffichePanel.afficheGestionPersonne(gestionPersonne, accueil, gestionEquipe, gestionCompetition,
						selectPerso);
			}
		});
		AC_gestionPersonne.setBounds(40, 360, 239, 48);
		accueil.add(AC_gestionPersonne);
	}

}
