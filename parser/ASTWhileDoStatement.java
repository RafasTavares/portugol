/* Generated By:JJTree: Do not edit this line. ASTWhileDoStatement.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
public class ASTWhileDoStatement extends SimpleNode {
  public ASTWhileDoStatement(int id) {
    super(id);
  }

  public ASTWhileDoStatement(PortugolParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PortugolParserVisitor visitor, Object data) throws Exception {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=a9b26b97c60e4fdc36b1fab7ebba28a8 (do not edit this line) */