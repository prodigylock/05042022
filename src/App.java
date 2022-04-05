import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.*;

public class App {

    public static void main(String[] args) throws Exception {
        JFrame f = new JFrame("File test");

        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("Menu");

        ArrayList<String> list = new ArrayList<String>();

        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");

        for (String string : list) {
            JMenuItem menuItem = new JMenuItem(string);
            menuItem.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println(string);
                }
            });

            menu.add(string);
        }

        menubar.add(menu);

        f.setJMenuBar(menubar);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
