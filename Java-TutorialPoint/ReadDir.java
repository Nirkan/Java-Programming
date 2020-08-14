
import java.io.File;

class CreatDir {

	public static void main(String args[]) {

		String dirname = "/home/lokesh/Desktop/Github/Java-Programming/Java-TutorialPoint";
		File d = new File(dirname);

		// Create directory now.
		d.mkdirs();

	}
}



public class ReadDir {

	public static void main(String[] args) {

		File file = null;
		String [] paths;

		try {

			// create new file object
			file = new File("/tmp");

			// array of files and directory
			paths = file.list();


			// for each name in the path array
			for(String path:paths) {
			
				// prints filename and directory name
				System.out.println(path);		
			
				}

			} catch (Exception e) {

				// if any error occurs
				e.printStackTrace();

				}

	}

}


