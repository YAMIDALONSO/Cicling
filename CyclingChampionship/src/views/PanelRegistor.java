package views;

import controllers.Events;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import static views.PanelHeader.COLOR_TOURNAMENT;
import static views.PanelHeader.FONT_TOURNAMENT;

public class PanelRegistor extends JPanel {

    private static final String SING_IN_NAME = "Ingrese su Nombre";
    private static final String SING_IN_AGE = "Ingrese su Edad";
    private static final String SING_IN = "Registrarse";

    private JLabel jlName;
    private JTextField jtfName;
    private JLabel jlAge;
    private JSpinner jsAge;

    public PanelRegistor(ActionListener controller) {
        setLayout(new GridLayout(7, 1));

        jlName = new JLabel(SING_IN_NAME);
        jlName.setFont(FONT_TOURNAMENT);
        add(jlName);

        jtfName = new JTextField();
        jtfName.setFont(FONT_TOURNAMENT);
        add(jtfName);

        jlAge = new JLabel(SING_IN_AGE);
        jlAge.setFont(FONT_TOURNAMENT);
        add(jlAge);

        jsAge = new JSpinner();
        jsAge.setFont(FONT_TOURNAMENT);
        add(jsAge);

        JButton jbSingIn = new JButton(SING_IN);
        jbSingIn.setBackground(COLOR_TOURNAMENT);
        jbSingIn.setForeground(Color.WHITE);
        jbSingIn.setFont(FONT_TOURNAMENT);
        jbSingIn.addActionListener(controller);
        jbSingIn.setActionCommand(Events.REGISTER_PARTICIPANT.toString());
        add(jbSingIn);
    }

    public int getAge() {
        return (int) jsAge.getValue();
    }

    public void refreshData() {
        jsAge.setValue(0);
        jtfName.setText("");
    }
}