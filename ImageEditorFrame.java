import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class ImageEditorFrame extends JFrame{ public ImageEditorFrame(){
		setDefaultCloseOperation(EXIT_ON_CLOSE); setSize(400, 300);
		setVisible(true);
<<<<<<< HEAD
	} 
=======
		
		createMenuBar();
		
	} 
	
		
private void createMenuBar(){
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu menuFile = new JMenu("File");
		menuBar.add(menuFile);
		JMenuItem menuItemOpen = new JMenuItem("Open");
		menuFile.add(menuItemOpen);
	menuItemOpen.addActionListener(
	new ActionListener() {
public void actionPerformed(ActionEvent e){
 onOpen();
 }
 }
 );
}
private void onOpen(){
 JOptionPane.showMessageDialog(this, "Open Selected");
}

	
	
>>>>>>> af7fdebd87ee57ea985facc9694d8e6882121c3b
}