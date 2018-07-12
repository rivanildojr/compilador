/* This file was generated by SableCC (http://www.sablecc.org/). */

package especificacao.analysis;

import especificacao.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAStartStart(AStartStart node);
    void caseASimplesDecDeclaracaoList(ASimplesDecDeclaracaoList node);
    void caseAMultiploDecDeclaracaoList(AMultiploDecDeclaracaoList node);
    void caseADecMultiploDeclaracao(ADecMultiploDeclaracao node);
    void caseADesConstDeclaracao(ADesConstDeclaracao node);
    void caseADeclaracaoMDeclaracaoMultipla(ADeclaracaoMDeclaracaoMultipla node);
    void caseADeclaracaoMDeclaracaoConstante(ADeclaracaoMDeclaracaoConstante node);
    void caseAVarVVarV(AVarVVarV node);
    void caseASimplesVarVarList(ASimplesVarVarList node);
    void caseAMultiploVarVarList(AMultiploVarVarList node);
    void caseARealTipo(ARealTipo node);
    void caseAInteiroTipo(AInteiroTipo node);
    void caseACaractereTipo(ACaractereTipo node);
    void caseABooleanoTipo(ABooleanoTipo node);
    void caseAIdVar(AIdVar node);
    void caseAVetorVar(AVetorVar node);
    void caseAStringValor(AStringValor node);
    void caseANInteiroValor(ANInteiroValor node);
    void caseANRealValor(ANRealValor node);
    void caseAComandoSCorpo(AComandoSCorpo node);
    void caseAComandoMCorpo(AComandoMCorpo node);
    void caseAExpLExp(AExpLExp node);
    void caseAExpAExp(AExpAExp node);
    void caseAExpVExpV(AExpVExpV node);
    void caseAExpSExpList(AExpSExpList node);
    void caseAExpMExpList(AExpMExpList node);
    void caseASenaoSeSenaoSe(ASenaoSeSenaoSe node);
    void caseACasoAvalieCasoAvalie(ACasoAvalieCasoAvalie node);
    void caseASenaoAvalieSenaoAvalie(ASenaoAvalieSenaoAvalie node);
    void caseAInteiroInicioNInteiroInicio(AInteiroInicioNInteiroInicio node);
    void caseAInteiroFimNInteiroFim(AInteiroFimNInteiroFim node);
    void caseAInteiroPassoNInteiroPasso(AInteiroPassoNInteiroPasso node);
    void caseAAtribuicaoComando(AAtribuicaoComando node);
    void caseALeiaComando(ALeiaComando node);
    void caseAEscrevaComando(AEscrevaComando node);
    void caseASeComando(ASeComando node);
    void caseAAvalieComando(AAvalieComando node);
    void caseAEnquantoComando(AEnquantoComando node);
    void caseARepitaComando(ARepitaComando node);
    void caseAParaComando(AParaComando node);
    void caseAParaPassoComando(AParaPassoComando node);
    void caseASomaExpAritmetica(ASomaExpAritmetica node);
    void caseAMenosExpAritmetica(AMenosExpAritmetica node);
    void caseATermoExpAritmetica(ATermoExpAritmetica node);
    void caseAMultTermoAritmetico(AMultTermoAritmetico node);
    void caseADivTermoAritmetico(ADivTermoAritmetico node);
    void caseAFatorTermoAritmetico(AFatorTermoAritmetico node);
    void caseAExpParentesesFatorAritmetico(AExpParentesesFatorAritmetico node);
    void caseAValorFatorAritmetico(AValorFatorAritmetico node);
    void caseAMenosFatorAritmetico(AMenosFatorAritmetico node);
    void caseAVarFatorAritmetico(AVarFatorAritmetico node);
    void caseAEExpLogica(AEExpLogica node);
    void caseAOuExpLogica(AOuExpLogica node);
    void caseANaoExpLogica(ANaoExpLogica node);
    void caseAXorExpLogica(AXorExpLogica node);
    void caseATermoLExpLogica(ATermoLExpLogica node);
    void caseAExploParentesesTermoLogico(AExploParentesesTermoLogico node);
    void caseARelacionalTermoLogico(ARelacionalTermoLogico node);
    void caseAIgualExpRelacional(AIgualExpRelacional node);
    void caseADiferenteExpRelacional(ADiferenteExpRelacional node);
    void caseAMenorIgualExpRelacional(AMenorIgualExpRelacional node);
    void caseAMaiorIgualExpRelacional(AMaiorIgualExpRelacional node);
    void caseAMenorExpRelacional(AMenorExpRelacional node);
    void caseAMaiorExpRelacional(AMaiorExpRelacional node);

    void caseTMenos(TMenos node);
    void caseTMais(TMais node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTMaior(TMaior node);
    void caseTMenor(TMenor node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTIgual(TIgual node);
    void caseTDiferente(TDiferente node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTNao(TNao node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTXor(TXor node);
    void caseTVirgula(TVirgula node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTEsqColchete(TEsqColchete node);
    void caseTDirColchete(TDirColchete node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTEsqParentese(TEsqParentese node);
    void caseTDirParentese(TDirParentese node);
    void caseTAspasSimples(TAspasSimples node);
    void caseTAspasDupla(TAspasDupla node);
    void caseTPrograma(TPrograma node);
    void caseTInicio(TInicio node);
    void caseTFimPrograma(TFimPrograma node);
    void caseTCaractere(TCaractere node);
    void caseTInteiro(TInteiro node);
    void caseTReal(TReal node);
    void caseTString(TString node);
    void caseTLeia(TLeia node);
    void caseTEscreva(TEscreva node);
    void caseTBooleano(TBooleano node);
    void caseTVerdadeiro(TVerdadeiro node);
    void caseTFalse(TFalse node);
    void caseTSe(TSe node);
    void caseTEntao(TEntao node);
    void caseTSenao(TSenao node);
    void caseTFimSe(TFimSe node);
    void caseTEnquanto(TEnquanto node);
    void caseTFaca(TFaca node);
    void caseTFimEnquanto(TFimEnquanto node);
    void caseTPara(TPara node);
    void caseTDe(TDe node);
    void caseTAte(TAte node);
    void caseTPasso(TPasso node);
    void caseTFimPara(TFimPara node);
    void caseTAvalie(TAvalie node);
    void caseTCaso(TCaso node);
    void caseTFimAvalie(TFimAvalie node);
    void caseTRepita(TRepita node);
    void caseTFimRepita(TFimRepita node);
    void caseTNInteiro(TNInteiro node);
    void caseTNReal(TNReal node);
    void caseTId(TId node);
    void caseTConstante(TConstante node);
    void caseTEmBranco(TEmBranco node);
    void caseTComentarioBloco(TComentarioBloco node);
    void caseTComentarioBlocoFim(TComentarioBlocoFim node);
    void caseTComentarioBlocoCorpo(TComentarioBlocoCorpo node);
    void caseTEstrela(TEstrela node);
    void caseTBarra(TBarra node);
    void caseTComentarioLinha(TComentarioLinha node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}