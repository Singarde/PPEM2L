package popUp;

import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import sql.CreatListCandidat;

public class SelectionCandidat {
	
	public static String choixCandidatModif;

	public static void popup() {

		JFrame popCompet = new JFrame();
		popCompet.setBounds(100, 100, 450, 300);
		popCompet.setDefaultCloseOperation(1);
		popCompet.getContentPane().setLayout(null);
		popCompet.setVisible(true);

		JLabel lblNewLabel = new JLabel("Selectionner candidat");
		lblNewLabel.setBounds(10, 11, 163, 27);
		popCompet.getContentPane().add(lblNewLabel);

		Choice choice = new Choice();
		CreatListCandidat.listCandidat(choice);
		choice.setBounds(10, 75, 414, 20);
		popCompet.getContentPane().add(choice);

		JButton btnSelectionnerCompetition = new JButton("selectionner candidat");
		btnSelectionnerCompetition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				choixCandidatModif = choice.getSelectedItem();
				
				System.out.println(getnumcompet());
				
				popCompet.setVisible(false);
			}
		});
		btnSelectionnerCompetition.setBounds(226, 228, 198, 23);
		popCompet.getContentPane().add(btnSelectionnerCompetition);

		JButton btnretour = new JButton("Retour");
		btnretour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				popCompet.setVisible(false);
			}
		});
		btnretour.setBounds(10, 228, 198, 23);
		popCompet.getContentPane().add(btnretour);
	}

	public static int getnumcompet() {
		String resultat = choixCandidatModif.substring(0, 1);

		int result = Integer.parseInt(resultat);

		return result;

	}

}
