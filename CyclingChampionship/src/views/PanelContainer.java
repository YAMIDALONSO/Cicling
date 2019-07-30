package views;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class PanelContainer extends JPanel {

    private PanelHeader panelHeader;
    private PanelRegistor panelRegistor;
    private PanelFooter panelFooter;

    public PanelContainer(ActionListener controller) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        panelHeader = new PanelHeader(controller);
        add(panelHeader,BorderLayout.PAGE_START);
        
        add(new JSeparator());
        
        panelRegistor = new PanelRegistor(controller);
        add(panelRegistor);
        
        add(new JPanel());
        add(new JSeparator());
        
        panelFooter = new PanelFooter();
        add(panelFooter, BorderLayout.PAGE_END);
    }

    public int getApp() {
        return panelRegistor.getAge();
    }

    public void refreshData(int junior, int senior, int master) {
        panelRegistor.refreshData();
        panelFooter.refreshData(junior, senior, master);
    }
}