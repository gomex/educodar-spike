import educodar.EducodarLexer;
import educodar.EducodarParser;
import generator.RubySinatraGenerator;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException {
        if(args.length != 1) {
            System.out.println("usage: java -jar <path_to_jar> <input_file>");
            System.exit(1);
        }

        InputStream educodarExample = new FileInputStream(args[0]);

        // Get our lexer
        EducodarLexer lexer = new EducodarLexer(new ANTLRInputStream(educodarExample));
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass the tokens to the parser
        EducodarParser parser = new EducodarParser(tokens);
        // Specify our entry point
        EducodarParser.ProgramContext programContext = parser.program();

        // Walks the AST and generates code
        RubySinatraGenerator rubySinatraGenerator = new RubySinatraGenerator();
        String result = (String) rubySinatraGenerator.visit(programContext);

        OutputStream outputStream = new FileOutputStream("compiled.rb");
        outputStream.write(result.getBytes());
    }
}
