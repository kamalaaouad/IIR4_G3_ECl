package app3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("src/app2/notes.txt");
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String s;
		float somme=0;
		int nbre=0;
		float note=0;
		while((s = br.readLine())!= null) {
			++nbre;
			String[] t =  s.split(";");
			note = Float.parseFloat(t[2]);
			//System.out.println(t[2]);
			somme +=note; 
		}
		System.out.println("la moyenne  est ::"+somme/nbre);
		
	}

}
