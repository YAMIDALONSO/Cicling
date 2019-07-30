package views;

import javax.swing.JLabel;
import javax.swing.JPanel;
import models.Category;
import static models.CyclingApp.QUOTAS_BY_CATEGORY;

public class PanelFooter extends JPanel {

    private static final String DEFAULT_QUOTES = " Cupos               ";
    private static final String FOR_TEXT = "Para ";

    private JLabel jlYouthQuotas;
    private JLabel jlSeniorQuotas;
    private JLabel jlMasterQuotas;

    public PanelFooter() {
        jlYouthQuotas = new JLabel(FOR_TEXT + Category.JUNIOR + " " + QUOTAS_BY_CATEGORY + DEFAULT_QUOTES);
        add(jlYouthQuotas);

        jlSeniorQuotas = new JLabel(FOR_TEXT + Category.SENIOR + " " + QUOTAS_BY_CATEGORY + DEFAULT_QUOTES);
        add(jlSeniorQuotas);

        jlMasterQuotas = new JLabel(FOR_TEXT + Category.MASTER + " " + QUOTAS_BY_CATEGORY + DEFAULT_QUOTES);
        add(jlMasterQuotas);
    }

    public void refreshData(int junior, int senior, int master) {
        jlYouthQuotas.setText(FOR_TEXT + Category.JUNIOR + " " + (QUOTAS_BY_CATEGORY - junior) + DEFAULT_QUOTES);
        jlSeniorQuotas.setText(FOR_TEXT + Category.SENIOR + " " + (QUOTAS_BY_CATEGORY - senior) + DEFAULT_QUOTES);
        jlMasterQuotas.setText(FOR_TEXT + Category.MASTER + " " + (QUOTAS_BY_CATEGORY - master) + DEFAULT_QUOTES);
    }
}
