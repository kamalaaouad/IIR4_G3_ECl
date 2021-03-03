package app2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("src/app2/notes.txt");
		FileReader fr = new FileReader(f1);
		File f2 = new File("copier.txt");
		FileWriter fw = new FileWriter(f2);
		int c;
		while((c=fr.read())!=-1) {
			//pour crypter le contenu de fichier en sortier fw.write(c+1);
			fw.write(c);
		}
		fw.close();
		fr.close();
	}

}
