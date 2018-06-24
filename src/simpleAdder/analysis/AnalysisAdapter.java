/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.analysis;

import java.util.*;
import simpleAdder.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStartStart(AStartStart node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimplesDecDeclaracaoList(ASimplesDecDeclaracaoList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiploDecDeclaracaoList(AMultiploDecDeclaracaoList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecSimplesDeclaracao(ADecSimplesDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecMultiploDeclaracao(ADecMultiploDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADesConstDeclaracao(ADesConstDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracaoSDeclaracaoSimple(ADeclaracaoSDeclaracaoSimple node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracaoMDeclaracaoMultipla(ADeclaracaoMDeclaracaoMultipla node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracaoMDeclaracaoConstante(ADeclaracaoMDeclaracaoConstante node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarVVarV(AVarVVarV node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimplesVarVarList(ASimplesVarVarList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiploVarVarList(AMultiploVarVarList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInteiroTipo(AInteiroTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaractereTipo(ACaractereTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABooleanoTipo(ABooleanoTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdVar(AIdVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVetorVar(AVetorVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANInteiroValor(ANInteiroValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANRealValor(ANRealValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoSCorpo(AComandoSCorpo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoMCorpo(AComandoMCorpo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpVExpV(AExpVExpV node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpSExpList(AExpSExpList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpMExpList(AExpMExpList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASenaoSeSenaoSe(ASenaoSeSenaoSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACasoAvalieCasoAvalie(ACasoAvalieCasoAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASenaoAvalieSenaoAvalie(ASenaoAvalieSenaoAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeiaComando(ALeiaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEscrevaComando(AEscrevaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAvalieComando(AAvalieComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARepitaComando(ARepitaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaPassoComando(AParaPassoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASomaExpAritmetrica(ASomaExpAritmetrica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosExpAritmetrica(AMenosExpAritmetrica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoExpAritmetrica(ATermoExpAritmetrica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultTermoAritmetrico(AMultTermoAritmetrico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivTermoAritmetrico(ADivTermoAritmetrico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFatorTermoAritmetrico(AFatorTermoAritmetrico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpParentesesFatorAritmetrico(AExpParentesesFatorAritmetrico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorFatorAritmetrico(AValorFatorAritmetrico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosFatorAritmetrico(AMenosFatorAritmetrico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEExpLogica(AEExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuExpLogica(AOuExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANaoExpLogica(ANaoExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAXorExpLogica(AXorExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoLExpLogica(ATermoLExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExploParetesesTermoLogico(AExploParetesesTermoLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARelacionalTermoLogico(ARelacionalTermoLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualExpRelacional(AIgualExpRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADiferenteExpRelacional(ADiferenteExpRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorIgualExpRelacional(AMenorIgualExpRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorIgualExpRelacional(AMaiorIgualExpRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorExpRelacional(AMenorExpRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorExpRelacional(AMaiorExpRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMais(TMais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaior(TMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiferente(TDiferente node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtribuicao(TAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXor(TXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoVirgula(TPontoVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEsqColchete(TEsqColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDirColchete(TDirColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEsqParentese(TEsqParentese node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDirParentese(TDirParentese node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAsparSimples(TAsparSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAsparDupla(TAsparDupla node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPrograma(TPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimPrograma(TFimPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteiro(TInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeia(TLeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscreva(TEscreva node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBooleano(TBooleano node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVerdadeiro(TVerdadeiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFalse(TFalse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntao(TEntao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimSe(TFimSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFaca(TFaca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimEnquanto(TFimEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDe(TDe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAte(TAte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPasso(TPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimPara(TFimPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAvalie(TAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaso(TCaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimAvalie(TFimAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepita(TRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimRepita(TFimRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNInteiro(TNInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNReal(TNReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConstante(TConstante node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEmBranco(TEmBranco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioBloco(TComentarioBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioBlocoFim(TComentarioBlocoFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioBlocoCorpo(TComentarioBlocoCorpo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEstrela(TEstrela node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBarra(TBarra node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioLinha(TComentarioLinha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
