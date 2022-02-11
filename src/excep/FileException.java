package excep;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileException {

	public static void main(String[] args) {
		File file = new File("1234.txt");//점(".")의 유무로 파일과 폴더 구분
		int data = 0;
		
		FileInputStream fis = null;
		
		try {
			/*FileInputStream*/ fis = new FileInputStream(file);
			
			while((data = fis.read()) != -1/*EOF-파일의 끝이다*/) {
				System.out.println((char)data);
			}
			
	
		} catch (Exception e1) {
			
		}finally{
			if(fis != null)
				try {
					fis.close();
				} catch (IOException e) {
			
					e.printStackTrace();
				}
		}

	}

}
