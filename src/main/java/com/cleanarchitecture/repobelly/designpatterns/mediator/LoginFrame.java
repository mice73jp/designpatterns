package com.cleanarchitecture.repobelly.designpatterns.mediator;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import com.cleanarchitecture.repobelly.designpatterns.mediator.colleague.Colleague;
import com.cleanarchitecture.repobelly.designpatterns.mediator.colleague.ColleagueButton;
import com.cleanarchitecture.repobelly.designpatterns.mediator.colleague.ColleagueCheckbox;
import com.cleanarchitecture.repobelly.designpatterns.mediator.colleague.ColleagueTextField;
import com.cleanarchitecture.repobelly.designpatterns.mediator.mediator.Mediator;

import java.awt.event.ActionEvent;

public class LoginFrame extends Frame implements ActionListener, Mediator{
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOK;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.LIGHT_GRAY);
        setLayout(new GridLayout(4, 2));

        createColleagues();
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username: "));
        add(textUser);
        add(new Label("Password: "));
        add(textPass);
        add(buttonOK);
        add(buttonCancel);

        colleagueChanged(checkGuest);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("" + e);
        System.exit(0);
    }

    @Override
    public void colleagueChanged(Colleague colleague) {
        if ( colleague == checkGuest || colleague == checkLogin ) {
            if ( checkGuest.getState()) {
                textUser.setColleagueEnabled(false);
                textPass.setColleagueEnabled(false);
                buttonOK.setColleagueEnabled(true);
            } else {
                textUser.setColleagueEnabled(true);
                this.userpassChanged();
            }
        } else if ( colleague == textUser || colleague == textPass ) {
            this.userpassChanged();
        } else {
            System.out.println("colleagueChanged: unknow colleague = " + colleague);
        }
    }

    @Override
    public void createColleagues() {
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, true);

        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');

        buttonOK = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        // Set mediator to each visual object
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOK.setMediator(this);
        buttonCancel.setMediator(this);

        // Set Listener
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOK.addActionListener(this);
        buttonCancel.addActionListener(this);
    }
 
    private void userpassChanged() {
        if ( textUser.getText().length() > 0 ) {
            textPass.setColleagueEnabled(true);
            if (textPass.getText().length() > 0 ) {
                buttonOK.setColleagueEnabled(true);
            } else {
                buttonOK.setColleagueEnabled(false);
            }
        } else {
            textPass.setColleagueEnabled(false);
            buttonOK.setColleagueEnabled(false);
        }
    }
}
