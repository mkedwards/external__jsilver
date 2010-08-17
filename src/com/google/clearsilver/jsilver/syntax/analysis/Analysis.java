/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.google.clearsilver.jsilver.syntax.analysis;

import com.google.clearsilver.jsilver.syntax.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAMultipleCommand(AMultipleCommand node);
    void caseACommentCommand(ACommentCommand node);
    void caseADataCommand(ADataCommand node);
    void caseAVarCommand(AVarCommand node);
    void caseALvarCommand(ALvarCommand node);
    void caseAEvarCommand(AEvarCommand node);
    void caseAUvarCommand(AUvarCommand node);
    void caseASetCommand(ASetCommand node);
    void caseANameCommand(ANameCommand node);
    void caseAEscapeCommand(AEscapeCommand node);
    void caseAAutoescapeCommand(AAutoescapeCommand node);
    void caseAWithCommand(AWithCommand node);
    void caseALoopToCommand(ALoopToCommand node);
    void caseALoopCommand(ALoopCommand node);
    void caseALoopIncCommand(ALoopIncCommand node);
    void caseAEachCommand(AEachCommand node);
    void caseADefCommand(ADefCommand node);
    void caseACallCommand(ACallCommand node);
    void caseAIfCommand(AIfCommand node);
    void caseAAltCommand(AAltCommand node);
    void caseAIncludeCommand(AIncludeCommand node);
    void caseAHardIncludeCommand(AHardIncludeCommand node);
    void caseALincludeCommand(ALincludeCommand node);
    void caseAHardLincludeCommand(AHardLincludeCommand node);
    void caseAContentTypeCommand(AContentTypeCommand node);
    void caseAInlineCommand(AInlineCommand node);
    void caseANoopCommand(ANoopCommand node);
    void caseACsOpenPosition(ACsOpenPosition node);
    void caseAStringExpression(AStringExpression node);
    void caseANumericExpression(ANumericExpression node);
    void caseADecimalExpression(ADecimalExpression node);
    void caseAHexExpression(AHexExpression node);
    void caseAVariableExpression(AVariableExpression node);
    void caseAFunctionExpression(AFunctionExpression node);
    void caseASequenceExpression(ASequenceExpression node);
    void caseANegativeExpression(ANegativeExpression node);
    void caseANotExpression(ANotExpression node);
    void caseAExistsExpression(AExistsExpression node);
    void caseACommaExpression(ACommaExpression node);
    void caseAEqExpression(AEqExpression node);
    void caseANumericEqExpression(ANumericEqExpression node);
    void caseANeExpression(ANeExpression node);
    void caseANumericNeExpression(ANumericNeExpression node);
    void caseALtExpression(ALtExpression node);
    void caseAGtExpression(AGtExpression node);
    void caseALteExpression(ALteExpression node);
    void caseAGteExpression(AGteExpression node);
    void caseAAndExpression(AAndExpression node);
    void caseAOrExpression(AOrExpression node);
    void caseAAddExpression(AAddExpression node);
    void caseANumericAddExpression(ANumericAddExpression node);
    void caseASubtractExpression(ASubtractExpression node);
    void caseAMultiplyExpression(AMultiplyExpression node);
    void caseADivideExpression(ADivideExpression node);
    void caseAModuloExpression(AModuloExpression node);
    void caseANoopExpression(ANoopExpression node);
    void caseANameVariable(ANameVariable node);
    void caseADecNumberVariable(ADecNumberVariable node);
    void caseAHexNumberVariable(AHexNumberVariable node);
    void caseADescendVariable(ADescendVariable node);
    void caseAExpandVariable(AExpandVariable node);

    void caseTData(TData node);
    void caseTComment(TComment node);
    void caseTVar(TVar node);
    void caseTLvar(TLvar node);
    void caseTEvar(TEvar node);
    void caseTUvar(TUvar node);
    void caseTSet(TSet node);
    void caseTIf(TIf node);
    void caseTElseIf(TElseIf node);
    void caseTElse(TElse node);
    void caseTWith(TWith node);
    void caseTEscape(TEscape node);
    void caseTAutoescape(TAutoescape node);
    void caseTLoop(TLoop node);
    void caseTEach(TEach node);
    void caseTAlt(TAlt node);
    void caseTName(TName node);
    void caseTDef(TDef node);
    void caseTCall(TCall node);
    void caseTInclude(TInclude node);
    void caseTLinclude(TLinclude node);
    void caseTContentType(TContentType node);
    void caseTInline(TInline node);
    void caseTComma(TComma node);
    void caseTBang(TBang node);
    void caseTAssignment(TAssignment node);
    void caseTEq(TEq node);
    void caseTNe(TNe node);
    void caseTLt(TLt node);
    void caseTGt(TGt node);
    void caseTLte(TLte node);
    void caseTGte(TGte node);
    void caseTAnd(TAnd node);
    void caseTOr(TOr node);
    void caseTString(TString node);
    void caseTHash(THash node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTStar(TStar node);
    void caseTPercent(TPercent node);
    void caseTBracketOpen(TBracketOpen node);
    void caseTBracketClose(TBracketClose node);
    void caseTParenOpen(TParenOpen node);
    void caseTParenClose(TParenClose node);
    void caseTDot(TDot node);
    void caseTDollar(TDollar node);
    void caseTQuestion(TQuestion node);
    void caseTDecNumber(TDecNumber node);
    void caseTHexNumber(THexNumber node);
    void caseTWord(TWord node);
    void caseTArgWhitespace(TArgWhitespace node);
    void caseTSlash(TSlash node);
    void caseTCsOpen(TCsOpen node);
    void caseTCommentStart(TCommentStart node);
    void caseTCommandDelimiter(TCommandDelimiter node);
    void caseTHardDelimiter(THardDelimiter node);
    void caseTCsClose(TCsClose node);
    void caseEOF(EOF node);
}