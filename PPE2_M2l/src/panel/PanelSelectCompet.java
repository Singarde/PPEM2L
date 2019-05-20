package panel;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import m2l.ControlAffichePanel;
import m2l.DecoElement;
import popUp.selectCompet;
import sql.CreatListSport;
import sql.Suprime;

public class PanelSelectCompet {

	// element panel de selection competition dans compet
	public static void elementPanelSelectionCompetitionInPanelCompetition(JPanel accueil, JPanel gestionCompetition,
			JPanel selectionCompetition) {
		JLabel SC_label = new JLabel("COMPETITION");
		SC_label.setForeground(Color.WHITE);
		SC_label.setBackground(Color.WHITE);
		SC_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		SC_label.setHorizontalAlignment(SwingConstants.CENTER);
		SC_label.setBounds(50, 25, 900, 23);
		selectionCompetition.add(SC_label);

		JButton SC_button1 = new JButton("Voir les candidats");
		DecoElement.decoJbouton(SC_button1);
		SC_button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		SC_button1.setBounds(49, 90, 300, 25);
		selectionCompetition.add(SC_button1);

		JButton SC_button2 = new JButton("Ajouter un candidat");
		DecoElement.decoJbouton(SC_button2);
		SC_button2.setBounds(49, 150, 300, 25);
		selectionCompetition.add(SC_button2);

		JButton SC_suprimer = new JButton("Supprimer un candidat");
		DecoElement.decoJbouton(SC_suprimer);
		SC_suprimer.setBounds(49, 210, 300, 25);
		selectionCompetition.add(SC_suprimer);

		JTextField date = new JTextField();
		date.setBounds(668, 117, 144, 20);
		selectionCompetition.add(date);
		date.setColumns(10);

		JTextField nom = new JTextField();
		nom.setBounds(668, 207, 144, 20);
		selectionCompetition.add(nom);
		nom.setColumns(10);

		JTextField lieu = new JTextField();
		lieu.setBounds(668, 158, 144, 20);
		selectionCompetition.add(lieu);
		lieu.setColumns(10);

		// choix nombre équipe
		Choice choice = new Choice();
		choice.add("seul");
		choice.add("equipe");
		choice.setBounds(668, 269, 92, 20);
		selectionCompetition.add(choice);

		// choix sport
		Choice typeCompet = new Choice();
		CreatListSport.listSport(typeCompet);
		typeCompet.setBounds(668, 300, 144, 20);
		selectionCompetition.add(typeCompet);

		// jlabel
		JLabel lblDateCompetion = new JLabel("date competion");
		lblDateCompetion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDateCompetion.setBounds(521, 118, 104, 20);
		selectionCompetition.add(lblDateCompetion);

		JLabel obli = new JLabel("*AAAA-MM-JJ");
		obli.setFont(new Font("Tahoma", Font.PLAIN, 15));
		obli.setBounds(820, 118, 104, 20);
		selectionCompetition.add(obli);

		JLabel lblLieu = new JLabel("Lieu");
		lblLieu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLieu.setBounds(521, 159, 46, 14);
		selectionCompetition.add(lblLieu);

		JLabel lblNomCompetition = new JLabel("nom competition");
		lblNomCompetition.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomCompetition.setBounds(518, 208, 140, 20);
		selectionCompetition.add(lblNomCompetition);

		JLabel labelJouabiliter = new JLabel("Jouabiliter");
		labelJouabiliter.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelJouabiliter.setBounds(518, 275, 92, 14);
		selectionCompetition.add(labelJouabiliter);

		JButton SC_modif = new JButton("Modifier la comp\u00E9titon");
		DecoElement.decoJbouton(SC_modif);
		SC_modif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("hello world");

			}
		});
		SC_modif.setBounds(50, 270, 300, 25);
		selectionCompetition.add(SC_modif);

		JButton SC_supr = new JButton("Supprimer la comp\u00E9tition");
		DecoElement.decoJbouton(SC_supr);
		SC_supr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Suprime.suprimeCompet(selectCompet.getnumcompet());
				ControlAffichePanel.afficheGestionCompetition(selectionCompetition, accueil, gestionCompetition);

			}
		});
		SC_supr.setBounds(49, 330, 300, 25);
		selectionCompetition.add(SC_supr);

		JButton SC_retour = new JButton("Retour");
		DecoElement.decoJbouton(SC_retour);
		SC_retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControlAffichePanel.afficheGestionCompetition(selectionCompetition, accueil, gestionCompetition);
			}
		});
		SC_retour.setBounds(700, 381, 160, 35);
		selectionCompetition.add(SC_retour);
	}

}
