package ejemplos;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Primero {

	public static void main(String[] args) {
		DataOutputStream out = null;
		try{
			out = new DataOutputStream (new FileOutputStream("C:\\Users\\aula9\\Desktop"));
			out.writeInt(43291);
			out.writeLong(5564444444444423565233);
			out.writeBoolean(true);
			out.writeBoolean(false);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (out != null)
				try{
					out.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
		}
	}
	
}
