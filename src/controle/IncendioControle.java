package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.CortinaDAO;
import dao.IncendioDAO;
import modelo.Cortina;
import modelo.Incendio;
import visao.JanelaPrincipal;

public class IncendioControle implements ActionListener {

	private Incendio inc;
	private JanelaPrincipal jan;
	private IncendioDAO incdao;

	public IncendioControle(JanelaPrincipal j, Incendio incendio) {
		jan = j;
		inc = incendio;
		incdao = new IncendioDAO();
		registraListeners();
	}

	public void registraListeners() {
		jan.getT2().getButtonCancelar().addActionListener(this);
		jan.getT2().getButtonEnviar().addActionListener(this);
	}

	public void enviarIncendio() {
		inc.setIrreg(jan.getT2().getIrregArea().getText());
		inc.setSist(jan.getT2().getComboSist().getSelectedItem().toString());
		inc.setLocal(jan.getT2().getFieldLocal().getText());
		inc.setFone(jan.getT2().getFieldContato().getText());
		inc.setObs(jan.getT2().getObsArea().getText());

		if (inc.verficaCampo()) {
			JOptionPane.showMessageDialog(jan.getContentPane(), "Preencha todos os campos obrigatórios!");
		} else {
			if (incdao.cadastraIncendio(inc)) {
				System.out.println("Solicitação enviada!");
				JOptionPane.showMessageDialog(jan.getContentPane(), "Solicitação enviada!");
			} else {
				JOptionPane.showMessageDialog(jan.getContentPane(), "Falha ao enviar!");
			}
		}
	}

	public void limpaTela() {
		jan.getT2().getIrregArea().setText(null);
		jan.getT2().getComboSist().setSelectedItem("");
		jan.getT2().getFieldLocal().setText(null);
		jan.getT2().getFieldContato().setText(null);
		jan.getT2().getObsArea().setText(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Envio")) {
			enviarIncendio();
		} else if (e.getActionCommand().equals("Cancelar")) {
			limpaTela();
		}

	}

}
