package app1;

import java.io.File;
import java.io.IOException;

public class App1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("C:/testblog");
		/*String[] content;
		content = f1.list();
		for(String s:content) {
			File f2 = new File("C:/blog/"+s);
			if(f2.exists()) {
				if(f2.isDirectory()) {
					System.out.println(s+" is directory");
				}else {
					System.out.println(s+" is file the size "+s.length());
				}
			}else {
				System.out.println("n\'existe pas ce elements");
			}
		}
		if(f1.mkdir())
			System.out.println("le rep est bien creer");
		else
			System.out.println("ce chemine deja existe");*/
		File f2= new File(f1, "testfile");
		if(f2.createNewFile())
			System.out.println("le fichier est bien creer");
		else
			System.out.println("le fichier est deja existe");
		String[] contenu = f1.list();
		for(int i=0;i<contenu.length;i++)
		{
			System.out.println(contenu[i]);	
		}
		if(f2.canRead())
			System.out.println("file can read");
		else if(f2.canWrite())
			System.out.println("file can write");
		else if(f2.canExecute())
			System.out.println("file can execute");
		else
			System.out.println("aucune");
		
		System.out.println(f2.getCanonicalPath());
		System.out.println(f2.getCanonicalFile());
		
		
	}

}
