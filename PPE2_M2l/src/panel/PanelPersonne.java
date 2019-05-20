package panel;

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

import m2l.ControlAffichePanel;
import m2l.DecoElement;
import popUp.SelectionCandidat;
import sql.CreatChamp;
import sql.SelectPersonne;

public class PanelPersonne {

	// element panel de gestion personne
	public static void elementPanelGestionPersonne(JPanel accueil, JPanel gestionPersonne, JPanel gestionEquipe,
			JPanel gestionCompetition, JPanel selectPerso) {
		JLabel GP_label = new JLabel("Gestion des personnes");
		GP_label.setForeground(Color.WHITE);
		GP_label.setHorizontalAlignment(SwingConstants.CENTER);
		GP_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		GP_label.setBounds(50, 25, 900, 54);
		gestionPersonne.add(GP_label);

		// jtext field
		JTextField nom = new JTextField();
		nom.setBounds(668, 120, 144, 20);
		gestionPersonne.add(nom);
		nom.setColumns(10);

		JTextField prenom = new JTextField();
		prenom.setBounds(668, 160, 144, 20);
		gestionPersonne.add(prenom);
		prenom.setColumns(10);

		JTextField email = new JTextField();
		email.setBounds(668, 200, 144, 20);
		gestionPersonne.add(email);
		email.setColumns(10);

		JTextField tel = new JTextField();
		tel.setBounds(668, 240, 144, 20);
		gestionPersonne.add(tel);
		tel.setColumns(10);

		JTextField adresse = new JTextField();
		adresse.setBounds(668, 280, 144, 20);
		gestionPersonne.add(adresse);
		adresse.setColumns(10);

		// j labelle
		JLabel nomp = new JLabel("Nom");
		nomp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nomp.setBounds(521, 120, 110, 20);
		gestionPersonne.add(nomp);

		JLabel lblLieu = new JLabel("Prenom");
		lblLieu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLieu.setBounds(521, 160, 110, 14);
		gestionPersonne.add(lblLieu);

		JLabel lblNomCompetition = new JLabel("email");
		lblNomCompetition.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomCompetition.setBounds(518, 200, 140, 20);
		gestionPersonne.add(lblNomCompetition);

		JLabel labelJouabiliter = new JLabel("Tel");
		labelJouabiliter.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelJouabiliter.setBounds(518, 240, 110, 14);
		gestionPersonne.add(labelJouabiliter);

		JLabel labelTyprCompet = new JLabel("adresse");
		labelTyprCompet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelTyprCompet.setBounds(518, 280, 100, 20);
		gestionPersonne.add(labelTyprCompet);

		// bouton
		JButton GP_button1 = new JButton("Details des personnes");
		DecoElement.decoJbouton(GP_button1);
		GP_button1.setBounds(50, 110, 300, 25);
		GP_button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SelectionCandidat.popup();
				// atendre SelectionCandidat.getnumcompet()
				// SelectPersonne.selectCandidat(1);
			}
		});
		gestionPersonne.add(GP_button1);

		JButton GP_button2 = new JButton("Ajouter une personne ");
		DecoElement.decoJbouton(GP_button2);
		GP_button2.setBounds(50, 310, 300, 25);
		GP_button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (nom.getText().isEmpty() || prenom.getText().isEmpty() || email.getText().isEmpty()
						|| tel.getText().isEmpty() || adresse.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "les valeur rentré ne sont pas correct veiller vérifier",
							"Information", JOptionPane.INFORMATION_MESSAGE);
				} else {
					CreatChamp.candidat(nom, prenom, email, tel, adresse);
				}

			}
		});
		gestionPersonne.add(GP_button2);

		JButton GP_button3 = new JButton("Selectionner une personne");
		DecoElement.decoJbouton(GP_button3);
		GP_button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SelectionCandidat.popup();
				ControlAffichePanel.afficheSelectionPersonne(gestionPersonne, accueil, gestionEquipe,
						gestionCompetition, selectPerso);
			}
		});

		GP_button3.setBounds(50, 210, 300, 25);
		gestionPersonne.add(GP_button3);

		JButton GP_retour = new JButton("Retour");
		DecoElement.decoJbouton(GP_retour);
		GP_retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControlAffichePanel.afficheAccueil(gestionPersonne, accueil, gestionEquipe, gestionCompetition,
						selectPerso);
			}
		});
		GP_retour.setBounds(700, 381, 160, 35);
		gestionPersonne.add(GP_retour);
	}

}
