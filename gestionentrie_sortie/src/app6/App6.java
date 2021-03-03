package app6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import etd.Etudiant;

public class App6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        File f = new File("eco.txt");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Etudiant e1 = (Etudiant) ois.readObject();
        Etudiant e2 = (Etudiant) ois.readObject();
        System.out.println(e1);
        System.out.println(e2);
        
	}

}
