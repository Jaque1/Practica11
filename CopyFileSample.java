import java.io.*;
import java.util.*;

public class CopyFileSample{
	public static void copy(File source, File destination) throws IOException{
	 	try (InputStream in = new FileInputStream(source); OutputStream out = new FileOutputStream (destination)){
	 		int b;
	 		while ((b=in.read())!= -1){
	 		 	out.write(b);
	 		}
	 	}
	}

	public static void main (String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);

		try{
			System.out.println("Ingresa la ruta del archivo: ");
			String ruta=sc.nextLine();
			System.out.println("Ingresa el nombre del archivo: ");
			String nombre=sc.nextLine();
			File file = new File(ruta+"/"+nombre);
			File file1 = new File(ruta+"/archivocopiado.txt");
			file1.createNewFile();
			copy(file, file1);
		}catch(FileNotFoundException e){
			System.out.println("El archivo que se va a copiar no existe.");
		}
	}
}