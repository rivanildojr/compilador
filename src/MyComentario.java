import java.io.IOException;

import simpleAdder.lexer.*;
import simpleAdder.node.*;
public class MyComentario extends Lexer{
	private int count;
	private TComentarioBloco comentario;
	//private TComentarioBlocoFim comentario_fim;
	private StringBuffer text;
	// We define a constructor
	public MyComentario(java.io.PushbackReader in){
		super(in);
	}
	// We define a filter that recognizes nested comments.
	protected void filter() throws LexerException, IOException{
		//checking for lone closing comments
		// if we are in the comment state
		if(state.equals(State.COMENTARIO)){
			// if we are just entering this state
			if(comentario == null){
				// The token is supposed to be a comment.
				// We keep a reference to it and set the count to one
				if(token instanceof TComentarioBlocoFim) {
					state = State.NORMAL;
					String mensagem = "Erro de comentario de bloco. Linha: " + token.getLine() + ", posicao: " + token.getPos() + ". : TComentarioBlocoFimErrado";
					token = null;
	    			throw new LexerException(null , mensagem );
				} else {					
					comentario = (TComentarioBloco) token;
					text = new StringBuffer(comentario.getText());
					count = 1;
					token = null; // continue to scan the input.
				} 
			} else {
				text.append(token.getText()); // accumulate the text.
				if(token instanceof TComentarioLinha);
				if(token instanceof TComentarioBloco)
					count++;
				else if(token instanceof TComentarioBlocoFim)	  
					count--; 
				if(count != 0) {
					if(token instanceof EOF){
						state = State.NORMAL;
						String mensagem = "Erro de comentario de bloco. Linha: " + comentario.getLine() + ", posicao: " + comentario.getPos() + ".";
						token = null;
						throw new LexerException(null , mensagem);
					} 
					token = null;// continue to scan the input.
				} else { 
					//comentario.setText(text.toString());
					token = comentario; //return a comment with the full text.
    				state = State.NORMAL; //go back to normal.
    				comentario = null; // We release this reference.
				}
			}
		}
	}
}