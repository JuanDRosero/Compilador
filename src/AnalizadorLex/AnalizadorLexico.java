/*
    Analizador Lexico
    Julieth Tatiana Riaño Mora-20181020110
    Juan David Rosero Torres-20181020071
*/


package AnalizadorLex;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorLexico {
    public static void main(String[] args) throws Exception {
        String caminoJFLEX= "src/AnalizadorLex/Lexico.flex";
        String caminoJCUP= "src/AnalizadorLex/LexicoCup.flex";
        String[] caminoSCUP= {"-parser","Sintax","src/AnalizadorLex/Sintax.cup"};
        generarLex(caminoJFLEX, caminoJCUP, caminoSCUP);
        FrmAnalizador form = new FrmAnalizador();
        form.show();
    }
    public static void generarLex(String caminoJFLEX, String caminoJCUP, String[] caminoSCUP) throws IOException, Exception {
        File arc; 
        arc = new File(caminoJFLEX);
        JFlex.Main.generate(arc);
        arc = new File(caminoJCUP);
        JFlex.Main.generate(arc);
        java_cup.Main.main(caminoSCUP);     
        
        
        Path caminoSym = Paths.get("src/AnalizadorLex/sym.java");
        if (Files.exists(caminoSym)) {
            Files.delete(caminoSym);
        }
        Files.move(
                Paths.get("../Compilador/sym.java"), 
                Paths.get("src/AnalizadorLex/sym.java")
        );
        Path caminoSint = Paths.get("src/AnalizadorLex/Sintax.java");
        if (Files.exists(caminoSint)) {
            Files.delete(caminoSint);
        }
        Files.move(
                Paths.get("../Compilador/Sintax.java"), 
                Paths.get("src/AnalizadorLex/Sintax.java")
        ); 
        
    }
}
