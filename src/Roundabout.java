import processing.core.*;

import java.awt.Dimension;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Arrays;
/**
 * Created by Per-Olav on 31.03.2015.
 */


public class Roundabout extends PApplet implements ActionListener, MouseListener {

    public void setup() {
        size(1000, 680);

        background(255);
        noStroke();

        frameRate(60);

    }

    @Override
    public void draw() {
        time = millis() / 1000;

    }


    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "pause":

                break;
            case "start":

                break;
            case "stop":

                break;
        }
    }
}