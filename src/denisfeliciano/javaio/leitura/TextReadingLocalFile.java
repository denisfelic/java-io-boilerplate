package denisfeliciano.javaio.leitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextReadingLocalFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String DISC = "D" + ":" + File.separator;
		String filePath = DISC + "Workspace\\Java\\java_io\\src\\teste.txt";

		FileInputStream fileInputStream = new FileInputStream(filePath);
		// Reader inputStreamReader = new InputStreamReader(fileInputStream);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line = "";
		while (line != null) {
			line = bufferedReader.readLine();
			System.out.println(line);
		}

		bufferedReader.close();

	}

}
