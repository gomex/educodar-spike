import educodar.EducodarLexer;
import educodar.EducodarParser;
import generator.RubySinatraGenerator;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Application {
    public static void main(String[] args) throws IOException {
        if(args.length != 1) {
            System.out.println("usage: java -jar <path_to_jar> <input_file>");
            System.exit(1);
        }

        InputStream educodarExample = new FileInputStream(args[0]);

        EducodarLexer lexer = new EducodarLexer(new ANTLRInputStream(educodarExample));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EducodarParser parser = new EducodarParser(tokens);
        EducodarParser.ProgramContext programContext = parser.program();

        RubySinatraGenerator rubySinatraGenerator = new RubySinatraGenerator();
        String result = (String) rubySinatraGenerator.visit(programContext);

        OutputStream outputStream = new FileOutputStream("compiled.rb");
        outputStream.write(result.getBytes());
    }
}
