package com.cleanarchitecture.repobelly.designpatterns.command;

import java.awt.event.*;
import javax.swing.*;

import com.cleanarchitecture.repobelly.designpatterns.command.command.Command;
import com.cleanarchitecture.repobelly.designpatterns.command.command.MacroCommand;
import com.cleanarchitecture.repobelly.designpatterns.command.drawer.DrawCanvas;
import com.cleanarchitecture.repobelly.designpatterns.command.drawer.DrawCommand;

public class Main extends JFrame implements ActionListener, WindowListener, MouseMotionListener{
    private MacroCommand history = new MacroCommand();
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    private JButton clearButton = new JButton("clear");

    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource() == clearButton) {
            this.history.clear();
            this.canvas.repaint();
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(this.canvas, e.getPoint());
        this.history.append(cmd);
        cmd.execute();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox = new  Box(BoxLayout.X_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main("Command pattern sample");
    }
}
