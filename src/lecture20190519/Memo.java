package lecture20190519;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class Memo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();
		f.setSize(700,400);
		f.setTitle("Yw Memo");
		
		JTextArea t = new JTextArea();
		f.add(t);
		
		f.setVisible(true);
		
		JMenuBar m = new JMenuBar();
		f.setJMenuBar( m );
		
		JMenu m_file = new JMenu("FILE");
		m.add(m_file);
		
		JMenuItem i_save = new JMenuItem("SAVE");
		JMenuItem i_load = new JMenuItem("LOAD");
		m_file.add(i_save);
		m_file.add(i_load);
		
		i_save.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 System.out.println("저장을 실행합니다");
				 
				 FileDialog dialog = new FileDialog(f, "코드", FileDialog.SAVE);
				 dialog.setVisible(true);
				 
				 
				 String path = dialog.getDirectory() + dialog.getFile();
				 
				 try {
					 FileWriter w = new FileWriter( path );
					 String s = t.getText();
					 s = s.replace("\n","\r\n");
					 w.write( s);;
					 w.close();
				 } catch (Exception e2) {
					 System.out.println("저장오류 "+e2);
				 
				 }
			 }
		});
		
		
		i_load.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 System.out.println("코드를 실행합니다");
				 
				 FileDialog dialog = new FileDialog(f, "저장", FileDialog.LOAD);
				 dialog.setVisible(true);
				 
				 String path = dialog.getDirectory() + dialog.getFile();
				 
				 String s ="";
				 
				 try {
					 FileReader r = new FileReader( path );
					 
					 int k;
					 for( ; ; ) {
						 k = r.read();
						 if( k == -1)break;
						 s +=(char)k;
					 }
					 
					 r.close();
				 } catch(Exception e2)	{
					 System.out.println("오류"+e);
				 }
				 t.setText(s);
			 }
		});
		
	}
}