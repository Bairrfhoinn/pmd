/* Generated By:JJTree: Do not edit this line. ASTContextItemExpr.java */

package net.sourceforge.pmd.jerry.ast.xpath;

public class ASTContextItemExpr extends SimpleNode {
  public ASTContextItemExpr(int id) {
    super(id);
  }

  public ASTContextItemExpr(XPath2Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(XPath2ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}