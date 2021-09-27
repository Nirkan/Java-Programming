// Downloading and Uploading images.

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;


public class Download{
	
	public static void main(String[] args) throws Exception{

		try{
			String fileName = "VSy6kJDNq2pSXsCzb6cvYF.jpg";
			String website = "https://cdn.mos.cms.futurecdn.net/"+fileName;
			
			System.out.println("Downloading File From " + website);
			
			URL url = new URL(website);

			InputStream inputStream = url.openStream();
			OutputStream outputStream = new FileOutputStream(fileName);

			byte[] buffer = new byte[2048];

			int length = 0;

			while ((length = inputStream.read(buffer)) != -1){

				System.out.println("Buffer Read of length: " + length);

				outputStream.write(buffer, 0, length);
			}

			inputStream.close();
			outputStream.close();

		} catch(Exception e){

			System.out.println("Exception: " + e.getMessage());
		}

	}
}
