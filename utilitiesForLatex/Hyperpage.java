import java.io.*;

class Hyperpage {
	public static void main(String[] args) throws Exception {
		File fin = new File(args[0]);
		File fout = new File(args[0] + ".tmp");
		
		BufferedReader br = new BufferedReader(new FileReader(fin));
		PrintWriter pw = new PrintWriter(fout);
		pw.println("\\begin{multicols}{2}");
		String line = null;
		
		while ((line = br.readLine()) != null) {
			if (line.matches("\\s+\\\\item.*")) {
				String[] _sa = line.split(",");
				StringBuilder sb = new StringBuilder();
				sb.append(_sa[0] + "\\dotfill");
				
				for (int i = 1; i < _sa.length; i++) {
					if (i == _sa.length - 1) {
						sb.append("\\hyperpage{" + _sa[i].trim() + "}");
						continue;
					}
					sb.append("\\hyperpage{" + _sa[i].trim() + "}, ");
				}
				
				pw.println(sb.toString());
				System.out.println(sb.toString());
			} else {
				pw.println(line);
				System.out.println(line);
			}
				
			pw.flush();
		}
		pw.println("\\end{multicols}");
		
		pw.close();
		br.close();
		
		System.out.println("fin delete: " + fin.delete());
		fout.renameTo(fin);
	}
}			
			
