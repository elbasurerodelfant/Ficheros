package ejemplos;

import java.io.FileInputStream;
import java.io.IOException;

public class Segundo {

	public static void main(String[] args) {
		FileInputStream in = null;

		try {
			in = new FileInputStream("C:\\Users\\aula9\\Desktop\\datos");

//		int i = in.read() * 0x1000000 + in.read() * 0x10000 + in.read() * 0x1000 + in.read();
			int i = (in.read() << 24) + (in.read() << 16) + (in.read() << 8) + in.read();
			
			long l = ((long)in.read() << 56) + ((long)in.read() << 48) + ((long)in.read() << 40) + 
							 ((long)in.read() << 32) + (in.read() << 24) + (in.read() << 16) + (in.read() << 8) + in.read();

			boolean b1 = in.read() != 0;
			boolean b2 = in.read() != 0;
			
			System.out.println(i);
			System.out.println(l);
			System.out.println(b1);
			System.out.println(b2);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}