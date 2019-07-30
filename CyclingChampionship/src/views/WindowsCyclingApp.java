package views;

import java.awt.FlowLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

public class WindowsCyclingApp extends JFrame {

    private static final String TITLE = "SOFTWARE DE CICLISMO";
    private static final String ICON = "/data/Icon.png";
    private static final String LANDSCAPE_IMAGE = "/data/Landscape.jpg";

    private PanelContainer panelContainer;

    public WindowsCyclingApp(ActionListener controller) {
        setTitle(TITLE);
        setIconImage(new ImageIcon(getClass().getResource(ICON)).getImage());
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(new JLabel(new ImageIcon(getClass().getResource(LANDSCAPE_IMAGE))));
        setLayout(new FlowLayout());

        panelContainer = new PanelContainer(controller);
        add(panelContainer);

        setVisible(Boolean.TRUE);
    }

    public int getAge() {
        return panelContainer.getApp();
    }

    public void refreshData(int junior, int senior, int master) {
        panelContainer.refreshData(junior, senior, master);
    }
}
