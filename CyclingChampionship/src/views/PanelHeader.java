package views;

import controllers.Events;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelHeader extends JPanel {

    private static final String REGISTER_TOURNAMENT = "INSCRIBASE AL TORNEO";
    public static final Color COLOR_TOURNAMENT = Color.decode("#fc4c02");
    public static final Font FONT_TOURNAMENT = new Font("Times New Roman", Font.BOLD, 40);
    private static final String SHOW_AWARD = "Ver Premio";

    
    private JButton jbCheckPrize;

    public PanelHeader(ActionListener controller) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel jl = new JLabel(REGISTER_TOURNAMENT);
        jl.setForeground(COLOR_TOURNAMENT);
        jl.setFont(FONT_TOURNAMENT);
        add(jl);
        
        JPanel jp = new JPanel();

        jbCheckPrize = new JButton(SHOW_AWARD);
        jbCheckPrize.setFont(FONT_TOURNAMENT);
        jbCheckPrize.setBackground(COLOR_TOURNAMENT);
        jbCheckPrize.setForeground(Color.WHITE);
        jbCheckPrize.addActionListener(controller);
        jbCheckPrize.setActionCommand(Events.SHOW_DIALOG_ADWARD.toString());
        jp.add(jbCheckPrize);
       
        add(jp);
    }
    
}
