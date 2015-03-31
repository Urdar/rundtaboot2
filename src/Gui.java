/**
 * Created by Per-Olav on 16.03.2015.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

// te
// dfgsgfsf


public class Gui extends JFrame {
    private Gui Roundabout;

    private JPanel processingPanel;

    // Shape Buttons
    private JButton stop;
    private JButton pause;
    private JButton start;

    public Gui(String title) throws HeadlessException {
        this.setTitle(title);
        initiateFrame();
        initiateComponents();

        addComponents();

        setLayout();

        addActionListeners();

    }


    public static void main(String[] args)
    {
        Gui displayFrame = new Gui("Rundkjøring simulator");

    }

    private void initiateFrame()
    {
        this.setSize(1366 , 768 );
        this.setMinimumSize( new Dimension( 1366, 768 ) );

        this.setBackground( new Color( 116, 228, 74) );



        if(this != null)
        {
            this.setResizable( true );
        }
        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        setLocationRelativeTo( null );

      //  setVisible( true );
    }

    private void initiateComponents() {
        // Initiate processing items
        Roundabout = new Gui();
        Roundabout.init();
        processingPanel = new JPanel();

        // Initiate shape buttons
        stop = new JButton("Stop");
        pause = new JButton("Pause");
        start = new JButton("Start");
    }

    private void addComponents()
    {
        this.add( processingPanel );

        this.add( start );
        this.add( stop );
        this.add( pause );
        processingPanel.add( Roundabout );
    }

    private void setLayout() {
        setLayout(null);

        processingPanel.setBounds(getWidth() - 1030, 10, 1000, getHeight() - 500);

        start.setBounds(10, 100, 100, 25);
        start.setBackground(new Color(232, 177, 141));

        stop.setBounds(120, 100, 100, 25);
        stop.setBackground(new Color(232, 177, 141));

        pause.setBounds(230, 100, 100, 25);
        pause.setBackground(new Color(232, 177, 141));
    }

    private void addActionListeners() {
        stop.addActionListener(Roundabout);
        stop.setActionCommand("stop");

        pause.addActionListener(Roundabout);
        pause.setActionCommand("pause");

        start.addActionListener(Roundabout);
        start.setActionCommand("start");
    }

    }