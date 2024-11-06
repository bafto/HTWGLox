package ast;

public class PrettyPrinter extends FullVisitor<String> {
  StringBuilder builder;

  public String prettyPrint(Program p) {
    this.builder = new StringBuilder();

    // for (var stmt : p.nodes) {
    // }
    //   stmt

    return builder.toString();
  }
}
