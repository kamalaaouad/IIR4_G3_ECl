package test;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f= new File("C:\\Users\\Toufiq\\Desktop\\angular\\test-template");
		if(f.exists()) {
			String[] contenu=f.list();
			for(int i=0;i<contenu.length;i++) {
				File f1= new File("C:\\Users\\Toufiq\\Desktop\\angular\\test-template\\"+contenu[i]);
				if(f1.isDirectory()) {
					System.out.println(contenu[i]+"est un rep");
					String[] content=f1.list();
					for(int j=0 ;j<content.length;j++) {
						File f2= new File("C:\\Users\\Toufiq\\Desktop\\angular\\test-template\\"+contenu[i]+"\\"+content[j]);
						if(f2.isDirectory()) {
							System.out.println(content[j]+"est un rep");
						}else {
							System.out.println(content[j]+" est un fichier, size "+f2.length());
						}
					}
				}else {
					System.out.println(contenu[i]+" est un fichier, size "+f1.length());
				}
			}
		}

	}

}
