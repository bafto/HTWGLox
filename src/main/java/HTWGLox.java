import ast.Program;
import ast.Resolver;
import java.io.IOException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.HTWGLoxLexer;
import parser.HTWGLoxParser;

public class HTWGLox {
  public static void main(String[] args) throws IOException {
    HTWGLoxLexer lexer = new HTWGLoxLexer(CharStreams.fromStream(System.in));
    HTWGLoxParser parser = new HTWGLoxParser(new CommonTokenStream(lexer));
    ParseTree tree = parser.program();

    if (parser.getNumberOfSyntaxErrors() > 0) {
      System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
      System.exit(1);
    }

    Program ast = new Program.Builder().build(tree);
    System.out.printf("Program.printString() = %s%n", ast.toString());
    Resolver r = new Resolver(ast);
    for (String e : r.getErrors()) {
      System.out.println(e);
    }
  }
}
