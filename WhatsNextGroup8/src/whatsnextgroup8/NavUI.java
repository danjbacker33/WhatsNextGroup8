package whatsnextgroup8;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NavUI extends JFrame{
    JButton bookSearchButton;
    JButton movieSearchButton;
    JButton logOutButton;
    
    public void NavUI() {
        setTitle("What's Next");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel navPanel = new JPanel();
        navPanel.setBackground(Color.BLACK);
        validate();
        add(navPanel);
        setVisible(true);
        setResizable(true);
        
        GridLayout panelLayout = new GridLayout(0,1);
        navPanel.setLayout(panelLayout);
        
        bookSearchButton = new JButton("Search Books");
        movieSearchButton = new JButton("Search Movies");
        logOutButton = new JButton("Log Out");
        
        navPanel.add(bookSearchButton);
        navPanel.add(movieSearchButton);
        navPanel.add(logOutButton);
        
        revalidate();
    }
}
