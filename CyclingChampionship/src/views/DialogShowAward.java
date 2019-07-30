package views;

import controllers.Events;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import models.Category;
import static views.PanelHeader.COLOR_TOURNAMENT;
import static views.PanelHeader.FONT_TOURNAMENT;

public class DialogShowAward extends JDialog {

    private static final String CONSULT = "Consultar";
    private static final String REGISTER_CATEGORY = "Cateogria a Participar";
    private static final String ADD_GAME = "Premio Segun Categoria";
    private static final String CONSULT_COLOR = "#4584ef";

    private JLabel jlCategory;
    private JComboBox jcbCategory;
    private JButton jbSearch;
    private JLabel jlAdward;

    public DialogShowAward(JFrame frame, ActionListener controller) {
        super(frame, true);
        setTitle(ADD_GAME);
        setSize(500, 600);
        setLocationRelativeTo(frame);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        getContentPane().setBackground(Color.decode(CONSULT_COLOR));

        jlCategory = new JLabel(REGISTER_CATEGORY);
        jlCategory.setFont(FONT_TOURNAMENT);
        jlCategory.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(jlCategory);

        JPanel jp = new JPanel();
        jp.setBackground(Color.decode(CONSULT_COLOR));
        add(jp);

        jcbCategory = new JComboBox(Category.values());
        jcbCategory.setFont(FONT_TOURNAMENT);
        jcbCategory.setForeground(COLOR_TOURNAMENT);
        jcbCategory.setBackground(Color.WHITE);
        jcbCategory.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(jcbCategory);

        JPanel jp1 = new JPanel();
        jp1.setBackground(Color.decode(CONSULT_COLOR));

        add(new JSeparator());

        jlAdward = new JLabel("Premio no consultado");
        jlAdward.setFont(FONT_TOURNAMENT);
        jlAdward.setForeground(Color.WHITE);
        jp1.add(jlAdward);

        add(jp1);

        jbSearch = new JButton(CONSULT);
        jbSearch.setFont(FONT_TOURNAMENT);
        jbSearch.setForeground(Color.WHITE);
        jbSearch.setBackground(COLOR_TOURNAMENT);
        jbSearch.setAlignmentX(Component.CENTER_ALIGNMENT);
        jbSearch.addActionListener(controller);
        jbSearch.setActionCommand(Events.SHOW_ADWARD.toString());
        add(jbSearch);
    }

    public Category getCategory() {
        return (Category) jcbCategory.getSelectedItem();
    }

    public void showAdward(double awardValue) {
        jlAdward.setText("El premio es de: $" + awardValue);
    }
}