import java.io.*;

public class Nuke2 {

	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String line = buf.readLine();
		String newline = "";
		for (int i = 0; i < line.length(); ++i) {
			if (i == 1) continue;
			newline += line.charAt(i);
		}
		System.out.println(newline);
	}
}