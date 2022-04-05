import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.*; 
import java.io.*;
import java.nio.charset.StandardCharsets;


public class App {

    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("src\\list.txt", StandardCharsets.UTF_8);
        BufferedReader br=new BufferedReader(fr);    
        String fileRow;
        ArrayList<String> list = new ArrayList<String>();
        while ((fileRow = br.readLine()) !=null) {
            list.add(fileRow);
        }

        fr.close();
        br.close();


        JFrame f = new JFrame("File test");
        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("Menu");


        


        for (String string : list) {
            JMenuItem menuItem = new JMenuItem(string);
            menuItem.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println(string);
                }
            });

            menu.add(menuItem);
        }

        menubar.add(menu);

        f.setJMenuBar(menubar);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
