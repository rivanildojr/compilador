/* Create an AST, then invoke our interpreter. */ 
import especificacao.lexer.* ;
import especificacao.parser.* ;
import especificacao.node.* ; 
  
import java.io.* ; 
  
public class Main { 
   public static void main(String[] args) throws LexerException, IOException{ 
	   Reader entrada = null;
	   if (args.length > 0) { 
		   try { 
			   entrada = new FileReader(args[0]);
			   MyComentario lexer = new MyComentario (new PushbackReader(entrada, 1024));//Instancia o Lexer
			   Parser parser = new Parser(lexer);
			   Start ast = parser.parse();
// Parte lexica			   
//			   Token t = null;
//			   while(true) {
//				   try {
//					   t = lexer.next();
//					   if(t instanceof TEmBranco) {
//						   System.out.print(t.getText());
//					   }
//					   else if(t instanceof EOF) {
//						   break;
//					   }
//					   else {
//						   System.out.print(t.getClass().getSimpleName());
//					   }
//				   } catch (LexerException l) { 
//					   System.out.print(l.getMessage());					  
//				   } 
//			   }
				   entrada.close();
				   
			System.out.println(ast.toString());
		   } 
		   catch (Exception e) { 
			   System.out.println (e) ; 
		   } 
	   } else { 
		   System.err.println("usage: java simpleAdder inputFile"); 
		   System.exit(1); 
	   } 
   } 
}