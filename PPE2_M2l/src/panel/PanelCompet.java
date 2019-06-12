package panel;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import classe.Competition;
import m2l.ControlAffichePanel;
import m2l.DecoElement;
import popUp.selectCompet;
import sql.CreatChamp;
import sql.CreatListSport;

public class PanelCompet {

	// element panel de gestion competition
	public static void elementPanelGestionCompetition(JPanel accueil, JPanel gestionPersonne, JPanel gestionEquipe,
			JPanel gestionCompetition, JPanel selectPerso, JPanel selectionCompetition) {
		// jtext field
		JTextField date = new JTextField();
		date.setBounds(668, 117, 144, 20);
		gestionCompetition.add(date);
		date.setColumns(10);

		JTextField nom = new JTextField();
		nom.setBounds(668, 207, 144, 20);
		gestionCompetition.add(nom);
		nom.setColumns(10);

		JTextField lieu = new JTextField();
		lieu.setBounds(668, 158, 144, 20);
		gestionCompetition.add(lieu);
		lieu.setColumns(10);
		
		JTextField tfFrais = new JTextField();
		tfFrais.setBounds(668, 322, 86, 20);
		gestionCompetition.add(tfFrais);
		tfFrais.setColumns(10);

		// choix nombre équipe
		Choice choice = new Choice();
		choice.add("seul");
		choice.add("equipe");
		choice.setBounds(668, 250, 92, 20);
		gestionCompetition.add(choice);

		// choix sport
		Choice typeCompet = new Choice();
		CreatListSport.listSport(typeCompet);
		typeCompet.setBounds(668, 294, 144, 20);
		gestionCompetition.add(typeCompet);

		// voir les compet
		JButton GC_candidat = new JButton("Detail comp\u00E9tition");
		DecoElement.decoJbouton(GC_candidat);
		GC_candidat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectCompet.popup(false);

			}
		});
		GC_candidat.setBounds(50, 120, 300, 25);
		GC_candidat.setForeground(Color.BLACK);
		gestionCompetition.add(GC_candidat);

		// ajoute une competition
		JButton GC_button1 = new JButton("ajouter comp\u00E9tition");

		DecoElement.decoJbouton(GC_button1);
		GC_button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (date.getText().isEmpty() && nom.getText().isEmpty() && lieu.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "les valeur rentré ne sont pas correct veiller vérifier",
							"Information", JOptionPane.INFORMATION_MESSAGE);
				} else {
					int sport = choice.getSelectedIndex();
					
					Competition competition = new Competition(0,nom.getText(),lieu.getText(),date.getText(), choice.getSelectedItem(),
							typeCompet.getSelectedIndex(),Integer.parseInt(tfFrais.getText()));
					
					CreatChamp.competition(competition);
					
					
				}

			}
		});
		GC_button1.setBounds(50, 220, 300, 25);
		gestionCompetition.add(GC_button1);
		// bouton selection competition
		JButton GC_button2 = new JButton("selection comp\u00E9tition");
		DecoElement.decoJbouton(GC_button2);
		GC_button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//pop up
				selectCompet.popup(true);
				ControlAffichePanel.afficheSelectionCompetition(gestionCompetition, selectionCompetition);
			}
		});
		GC_button2.setBounds(50, 320, 300, 25);
		gestionCompetition.add(GC_button2);

		// bouton retour
		JButton GC_retour = new JButton("Retour");
		DecoElement.decoJbouton(GC_retour);
		GC_retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControlAffichePanel.afficheAccueil(gestionPersonne, accueil, gestionEquipe, gestionCompetition,
						selectPerso);
			}
		});
		GC_retour.setBounds(700, 381, 160, 35);
		gestionCompetition.add(GC_retour);

		JLabel GC_button3 = new JLabel("GESTION DES COMPETITIONS");
		GC_button3.setHorizontalAlignment(SwingConstants.CENTER);
		GC_button3.setForeground(Color.WHITE);
		GC_button3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		GC_button3.setBackground(Color.WHITE);
		GC_button3.setBounds(50, 25, 900, 23);
		gestionCompetition.add(GC_button3);

		// j labelle
		JLabel labelTyprCompet = new JLabel("type");
		labelTyprCompet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelTyprCompet.setBounds(518, 250, 100, 20);
		gestionCompetition.add(labelTyprCompet);

		JLabel lblDateCompetion = new JLabel("date competion");
		lblDateCompetion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDateCompetion.setBounds(521, 118, 104, 20);
		gestionCompetition.add(lblDateCompetion);

		JLabel obligationDate = new JLabel("*AAAA-MM-JJ");
		obligationDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		obligationDate.setBounds(820, 118, 104, 20);
		gestionCompetition.add(obligationDate);

		JLabel lblLieu = new JLabel("Lieu");
		lblLieu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLieu.setBounds(521, 159, 46, 14);
		gestionCompetition.add(lblLieu);

		JLabel lblNomCompetition = new JLabel("nom competition");
		lblNomCompetition.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomCompetition.setBounds(518, 208, 140, 20);
		gestionCompetition.add(lblNomCompetition);

		JLabel labelJouabiliter = new JLabel("Jouabiliter");
		labelJouabiliter.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelJouabiliter.setBounds(442, 343, 92, 14);
		gestionCompetition.add(labelJouabiliter);

		JLabel labelFrais = new JLabel("Frais d'inscription");
		labelJouabiliter.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelJouabiliter.setBounds(518, 300, 92, 14);
		gestionCompetition.add(labelJouabiliter);
		
	
		
		JLabel lblFraisDinscription = new JLabel("Frais D'inscription");
		lblFraisDinscription.setBounds(521, 325, 114, 20);
		gestionCompetition.add(lblFraisDinscription);
		
		JLabel label = new JLabel("\u20AC");
		label.setBounds(776, 328, 30, 17);
		gestionCompetition.add(label);
		
		
	}

}
