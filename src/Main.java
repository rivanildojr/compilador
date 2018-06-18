/* Create an AST, then invoke our interpreter. */ 
import simpleAdder.lexer.* ; 
import simpleAdder.node.* ; 
  
import java.io.* ; 
  
public class Main { 
   public static void main(String[] args) throws LexerException, IOException{ 
	   Reader entrada = null;
	   if (args.length > 0) { 
		   try { 
			   entrada = new FileReader(args[0]);
			   MyComentario lexer = new MyComentario (new PushbackReader(entrada, 1024));//Instancia o Lexer
			   Token t = null;
			   while(true) {
				   try {
					   t = lexer.next();
					   if(t instanceof TEmBranco) {
						   System.out.print(t.getText());
					   }
					   else if(t instanceof EOF) {
						   break;
					   }
					   else {
						   System.out.print(t.getClass().getSimpleName());
					   }
				   } catch (LexerException l) { 
					   System.out.print(l.getMessage());					  
				   } 
			   }
				   entrada.close();
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