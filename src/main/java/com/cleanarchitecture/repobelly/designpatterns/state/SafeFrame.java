package com.cleanarchitecture.repobelly.designpatterns.state;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.cleanarchitecture.repobelly.designpatterns.state.context.Context;
import com.cleanarchitecture.repobelly.designpatterns.state.state.DayState;
import com.cleanarchitecture.repobelly.designpatterns.state.state.State;

public class SafeFrame extends Frame implements ActionListener, Context {
    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);
    private Button buttonUse = new Button("금고사용");
    private Button buttonAlarm = new Button("비상벨");
    private Button buttonPhone = new Button("일반 통화");
    private Button buttonExit = new Button("종료");

    private State state = DayState.getInstance();

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.LIGHT_GRAY);
        setLayout(new BorderLayout());

        add(textClock, BorderLayout.NORTH);
        textClock.setEnabled(false);

        add(textScreen, BorderLayout.CENTER);
        textScreen.setEnabled(false);

        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);

        pack();
        setVisible(true);

        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("" + e);

        if (e.getSource() == buttonUse) {
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if ( e.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if ( e.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("Call!! " + msg + "\n");
    }

    @Override
    public void changeState(State state) {
        System.out.println(this.state + "에서 " + state + "로 상태가 변했습니다.");
        this.state = state;
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("record... " + msg + "\n");
    }

    @Override
    public void setClock(int hour) {
        String clockstring = "현재 시각은 ";
        if(hour < 10 ) {
            clockstring += "0" + hour + ":00";
        } else {
            clockstring += hour + ":00";
        }
        System.out.println(clockstring);
        textClock.setText(clockstring);
        state.doClock(this, hour);
    }
    
}
