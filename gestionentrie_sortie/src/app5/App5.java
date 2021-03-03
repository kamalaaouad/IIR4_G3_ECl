package app5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import etd.Etudiant;

public class App5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Etudiant e1 = new Etudiant("xxx","yyy",13);
		Etudiant e2 = new Etudiant("rrr","jjj",11);
		File f = new File("eco.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.close();
	}

}
