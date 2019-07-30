package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.CyclingApp;
import views.DialogShowAward;
import views.WindowsCyclingApp;

public class Controller implements ActionListener {

    private CyclingApp cyclingApp;
    private WindowsCyclingApp windowsCyclingApp;
    private DialogShowAward dialogShowAward;

    public Controller() {
        cyclingApp = new CyclingApp();
        windowsCyclingApp = new WindowsCyclingApp(this);
        dialogShowAward = new DialogShowAward(windowsCyclingApp, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (Events.valueOf(e.getActionCommand())) {
            case REGISTER_PARTICIPANT:
                registerParticipant();
                break;
            case SHOW_DIALOG_ADWARD:
                showDialogAdward();
                break;
            case SHOW_ADWARD:
                showAdward();
                break;
        }
    }

    private void registerParticipant() {
        cyclingApp.registerParticipant(windowsCyclingApp.getAge());
        windowsCyclingApp.refreshData(cyclingApp.getYouthQuotas(), cyclingApp.getSeniorhQuotas(), cyclingApp.getMasterQuotas());
    }

    private void showDialogAdward() {
        dialogShowAward.setVisible(true);
    }

    private void showAdward() {
        double adward = cyclingApp.getAwardValue(dialogShowAward.getCategory());
        dialogShowAward.showAdward(adward);
    }
}
