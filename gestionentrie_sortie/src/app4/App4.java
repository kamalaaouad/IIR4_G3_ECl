package app4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class App4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f1 = new File("src/app4/f.doc");
		FileInputStream fis = new FileInputStream(f1);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		File f2 = new File("f.zip");
		FileOutputStream fos = new FileOutputStream(f2);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ZipOutputStream zos = new ZipOutputStream(bos);
		
		
		zos.setMethod(ZipOutputStream.DEFLATED);
		zos.putNextEntry(new ZipEntry(f1.getName()));
		
		int c;
		while((c=bis.read())!= -1) {
			zos.write(c);
		}
		zos.close();
	}

}
