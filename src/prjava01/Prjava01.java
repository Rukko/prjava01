/* 
 *Tochangethistemplate,chooseTools|Templates 
 *andopenthetemplateintheeditor. 
 */
package prjava01;

/**
 *
 * @authordaw2_m08uf4pr2
 */
import java.io.*;

public class Prjava01 {

    /**
     * @paramargsthecommandlinearguments
     */
    public static void main(String[] args) throws IOException {
        File f = new File("fitxer.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");
            bw.newLine();
            bw.write("<head>");
            bw.newLine();
            bw.write("<title>");
            bw.newLine();
            bw.write("Novap&agrave;ginaweb");
            bw.newLine();
            bw.write("</title>");
            bw.newLine();
            bw.write("</head>");
            bw.newLine();
            bw.write("<body>");
            bw.newLine();
            bw.write("Novap&agrave;ginaweb");
            bw.newLine();
            bw.write("<h1>DAW2m08uf4pr2</h1>");
            bw.newLine();
            bw.write("</body>");
            bw.newLine();
            bw.write("</html>");
            bw.newLine();
            //Hola soy david y esto es para el señor jonatan
            bw.close();
        }
    }
}
