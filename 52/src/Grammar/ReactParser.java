// Generated from C:/Users/USER/Desktop/New folder/52/code/52/src/Grammar/ReactParser.g4 by ANTLR 4.13.1
package Grammar;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReactParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, IMPORT=2, CONST=3, DOT=4, MAP=5, IF=6, FOR=7, ELSE=8, STRING_LITERAL=9, 
		INTEGER_LITERAL=10, DIGIT=11, OPENED_BRACES=12, OPENED_SQUERE_BRACES=13, 
		OPENED_CURLY_BRACES=14, CLOSED_CURLY_BRACES=15, CLOSED_SQUERE_BRACES=16, 
		CLOSED_BRACES=17, INT=18, STRING=19, BOOLEAN=20, VAR=21, ONCLICK=22, QU=23, 
		RETURN=24, EXPORT=25, DEFAULT=26, USESTATE=27, USEREF=28, USEEFFECT=29, 
		IDENTIFIERNAME=30, SLASH=31, OPEN_TAG=32, CLOSE_TAG=33, CLOSE_OR_EQUAL=34, 
		OPEN_OR_EQUAL=35, STYLE=36, ANDAND=37, ARROW=38, CLASS=39, LIST=40, DOUBLE_QOUTE=41, 
		SINGLE_QOUTE=42, VOID=43, LETTER=44, MAIN=45, EXTEND=46, EQUAL=47, PLUS=48, 
		MINUS=49, MINUSMINUS=50, MULTI=51, AT_SIGN=52, COMMA=53, COLON=54, SEMICOLON=55, 
		Comment=56, WS=57;
	public static final int
		RULE_program = 0, RULE_withHooks = 1, RULE_hooks = 2, RULE_usestate = 3, 
		RULE_useRef = 4, RULE_useEffect = 5, RULE_export = 6, RULE_list = 7, RULE_litral = 8, 
		RULE_elements = 9, RULE_element = 10, RULE_singlecomponent = 11, RULE_functionalcomponent = 12, 
		RULE_arrowcomponent = 13, RULE_componentBody = 14, RULE_openbraces = 15, 
		RULE_jsxElements = 16, RULE_componentcall = 17, RULE_openTag = 18, RULE_closeTag = 19, 
		RULE_selfclosing = 20, RULE_attribute = 21, RULE_functionattribute = 22, 
		RULE_map = 23, RULE_select = 24, RULE_tagContent = 25, RULE_style = 26, 
		RULE_styleAttributes = 27, RULE_function = 28, RULE_constfunction = 29, 
		RULE_call = 30, RULE_operation = 31, RULE_forloop = 32, RULE_elseIf_condition = 33, 
		RULE_else_condition = 34, RULE_if = 35, RULE_declaration = 36, RULE_assignment = 37, 
		RULE_expression = 38, RULE_type = 39, RULE_statement = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "withHooks", "hooks", "usestate", "useRef", "useEffect", "export", 
			"list", "litral", "elements", "element", "singlecomponent", "functionalcomponent", 
			"arrowcomponent", "componentBody", "openbraces", "jsxElements", "componentcall", 
			"openTag", "closeTag", "selfclosing", "attribute", "functionattribute", 
			"map", "select", "tagContent", "style", "styleAttributes", "function", 
			"constfunction", "call", "operation", "forloop", "elseIf_condition", 
			"else_condition", "if", "declaration", "assignment", "expression", "type", 
			"statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'import React, { useState,useRef, useEffect } from \"react\";'", 
			"'const'", "'.'", "'map'", "'if'", "'for'", "'else'", null, null, null, 
			"'('", "'['", "'{'", "'}'", "']'", "')'", "'int'", "'String'", "'boolean'", 
			"'var'", "'onClick'", "'?'", "'return'", "'export'", "'default'", "'useState'", 
			"'useRef'", "'useEffect'", null, "'/'", "'<'", "'>'", "'>='", "'<='", 
			"'style'", "'&&'", "'=>'", "'class'", "'List'", "'\"'", "'''", "'void'", 
			null, "'main'", "'extends'", "'='", "'+'", "'-'", "'--'", "'*'", "'@'", 
			"','", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTION", "IMPORT", "CONST", "DOT", "MAP", "IF", "FOR", "ELSE", 
			"STRING_LITERAL", "INTEGER_LITERAL", "DIGIT", "OPENED_BRACES", "OPENED_SQUERE_BRACES", 
			"OPENED_CURLY_BRACES", "CLOSED_CURLY_BRACES", "CLOSED_SQUERE_BRACES", 
			"CLOSED_BRACES", "INT", "STRING", "BOOLEAN", "VAR", "ONCLICK", "QU", 
			"RETURN", "EXPORT", "DEFAULT", "USESTATE", "USEREF", "USEEFFECT", "IDENTIFIERNAME", 
			"SLASH", "OPEN_TAG", "CLOSE_TAG", "CLOSE_OR_EQUAL", "OPEN_OR_EQUAL", 
			"STYLE", "ANDAND", "ARROW", "CLASS", "LIST", "DOUBLE_QOUTE", "SINGLE_QOUTE", 
			"VOID", "LETTER", "MAIN", "EXTEND", "EQUAL", "PLUS", "MINUS", "MINUSMINUS", 
			"MULTI", "AT_SIGN", "COMMA", "COLON", "SEMICOLON", "Comment", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ReactParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReactParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IMPORT() { return getToken(ReactParser.IMPORT, 0); }
		public WithHooksContext withHooks() {
			return getRuleContext(WithHooksContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List<ArrowcomponentContext> arrowcomponent() {
			return getRuleContexts(ArrowcomponentContext.class);
		}
		public ArrowcomponentContext arrowcomponent(int i) {
			return getRuleContext(ArrowcomponentContext.class,i);
		}
		public SinglecomponentContext singlecomponent() {
			return getRuleContext(SinglecomponentContext.class,0);
		}
		public HooksContext hooks() {
			return getRuleContext(HooksContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1077674176L) != 0)) {
					{
					{
					setState(82);
					statement();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(88);
				match(IMPORT);
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(89);
					list();
					}
					break;
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(92);
						arrowcomponent();
						}
						} 
					}
					setState(97);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(98);
				withHooks();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				singlecomponent();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				hooks();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WithHooksContext extends ParserRuleContext {
		public ArrowcomponentContext arrowcomponent() {
			return getRuleContext(ArrowcomponentContext.class,0);
		}
		public ComponentBodyContext componentBody() {
			return getRuleContext(ComponentBodyContext.class,0);
		}
		public TerminalNode CLOSED_CURLY_BRACES() { return getToken(ReactParser.CLOSED_CURLY_BRACES, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(ReactParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ReactParser.SEMICOLON, i);
		}
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public WithHooksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withHooks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWithHooks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWithHooks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWithHooks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithHooksContext withHooks() throws RecognitionException {
		WithHooksContext _localctx = new WithHooksContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_withHooks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			arrowcomponent();
			setState(104);
			componentBody();
			setState(105);
			match(CLOSED_CURLY_BRACES);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(106);
				match(SEMICOLON);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(112);
				export();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HooksContext extends ParserRuleContext {
		public UsestateContext usestate() {
			return getRuleContext(UsestateContext.class,0);
		}
		public UseRefContext useRef() {
			return getRuleContext(UseRefContext.class,0);
		}
		public UseEffectContext useEffect() {
			return getRuleContext(UseEffectContext.class,0);
		}
		public HooksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hooks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHooks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHooks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHooks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HooksContext hooks() throws RecognitionException {
		HooksContext _localctx = new HooksContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_hooks);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				usestate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				useRef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				useEffect();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UsestateContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode OPENED_SQUERE_BRACES() { return getToken(ReactParser.OPENED_SQUERE_BRACES, 0); }
		public List<TerminalNode> IDENTIFIERNAME() { return getTokens(ReactParser.IDENTIFIERNAME); }
		public TerminalNode IDENTIFIERNAME(int i) {
			return getToken(ReactParser.IDENTIFIERNAME, i);
		}
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public TerminalNode CLOSED_SQUERE_BRACES() { return getToken(ReactParser.CLOSED_SQUERE_BRACES, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode USESTATE() { return getToken(ReactParser.USESTATE, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(ReactParser.OPENED_BRACES, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ReactParser.STRING_LITERAL, 0); }
		public TerminalNode CLOSED_BRACES() { return getToken(ReactParser.CLOSED_BRACES, 0); }
		public TerminalNode SEMICOLON() { return getToken(ReactParser.SEMICOLON, 0); }
		public ConstfunctionContext constfunction() {
			return getRuleContext(ConstfunctionContext.class,0);
		}
		public UsestateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usestate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUsestate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUsestate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUsestate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsestateContext usestate() throws RecognitionException {
		UsestateContext _localctx = new UsestateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_usestate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(CONST);
			setState(121);
			match(OPENED_SQUERE_BRACES);
			setState(122);
			match(IDENTIFIERNAME);
			setState(123);
			match(COMMA);
			setState(124);
			match(IDENTIFIERNAME);
			setState(125);
			match(CLOSED_SQUERE_BRACES);
			setState(126);
			match(EQUAL);
			setState(127);
			match(USESTATE);
			setState(128);
			match(OPENED_BRACES);
			setState(129);
			match(STRING_LITERAL);
			setState(130);
			match(CLOSED_BRACES);
			setState(131);
			match(SEMICOLON);
			setState(132);
			constfunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UseRefContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode IDENTIFIERNAME() { return getToken(ReactParser.IDENTIFIERNAME, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode USEREF() { return getToken(ReactParser.USEREF, 0); }
		public OpenbracesContext openbraces() {
			return getRuleContext(OpenbracesContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ReactParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ReactParser.SEMICOLON, i);
		}
		public UseRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseRefContext useRef() throws RecognitionException {
		UseRefContext _localctx = new UseRefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_useRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(CONST);
			setState(135);
			match(IDENTIFIERNAME);
			setState(136);
			match(EQUAL);
			setState(137);
			match(USEREF);
			setState(138);
			openbraces();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(139);
				match(SEMICOLON);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UseEffectContext extends ParserRuleContext {
		public TerminalNode USEEFFECT() { return getToken(ReactParser.USEEFFECT, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(ReactParser.OPENED_BRACES, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode OPENED_CURLY_BRACES() { return getToken(ReactParser.OPENED_CURLY_BRACES, 0); }
		public TerminalNode CLOSED_CURLY_BRACES() { return getToken(ReactParser.CLOSED_CURLY_BRACES, 0); }
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public TerminalNode OPENED_SQUERE_BRACES() { return getToken(ReactParser.OPENED_SQUERE_BRACES, 0); }
		public TerminalNode CLOSED_SQUERE_BRACES() { return getToken(ReactParser.CLOSED_SQUERE_BRACES, 0); }
		public TerminalNode CLOSED_BRACES() { return getToken(ReactParser.CLOSED_BRACES, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public UseEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseEffectContext useEffect() throws RecognitionException {
		UseEffectContext _localctx = new UseEffectContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_useEffect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(USEEFFECT);
			setState(146);
			match(OPENED_BRACES);
			setState(147);
			function();
			setState(148);
			match(OPENED_CURLY_BRACES);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1077674176L) != 0)) {
				{
				{
				setState(149);
				statement();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(CLOSED_CURLY_BRACES);
			setState(156);
			match(COMMA);
			setState(157);
			match(OPENED_SQUERE_BRACES);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENED_CURLY_BRACES || _la==IDENTIFIERNAME) {
				{
				{
				setState(158);
				attribute();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(CLOSED_SQUERE_BRACES);
			setState(165);
			match(CLOSED_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(ReactParser.EXPORT, 0); }
		public TerminalNode DEFAULT() { return getToken(ReactParser.DEFAULT, 0); }
		public TerminalNode IDENTIFIERNAME() { return getToken(ReactParser.IDENTIFIERNAME, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(ReactParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ReactParser.SEMICOLON, i);
		}
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_export);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(EXPORT);
			setState(168);
			match(DEFAULT);
			setState(169);
			match(IDENTIFIERNAME);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(170);
				match(SEMICOLON);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERNAME() { return getToken(ReactParser.IDENTIFIERNAME, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode OPENED_SQUERE_BRACES() { return getToken(ReactParser.OPENED_SQUERE_BRACES, 0); }
		public TerminalNode CLOSED_SQUERE_BRACES() { return getToken(ReactParser.CLOSED_SQUERE_BRACES, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(176);
				match(CONST);
				}
			}

			setState(179);
			match(IDENTIFIERNAME);
			setState(180);
			match(EQUAL);
			setState(181);
			match(OPENED_SQUERE_BRACES);
			{
			setState(182);
			elements();
			}
			setState(183);
			match(CLOSED_SQUERE_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LitralContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(ReactParser.INTEGER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ReactParser.STRING_LITERAL, 0); }
		public LitralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_litral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLitral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLitral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLitral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LitralContext litral() throws RecognitionException {
		LitralContext _localctx = new LitralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_litral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==INTEGER_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementsContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<LitralContext> litral() {
			return getRuleContexts(LitralContext.class);
		}
		public LitralContext litral(int i) {
			return getRuleContext(LitralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17920L) != 0)) {
				{
				setState(189);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPENED_CURLY_BRACES:
					{
					setState(187);
					element();
					}
					break;
				case STRING_LITERAL:
				case INTEGER_LITERAL:
					{
					setState(188);
					litral();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(191);
					match(COMMA);
					setState(194);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPENED_CURLY_BRACES:
						{
						setState(192);
						element();
						}
						break;
					case STRING_LITERAL:
					case INTEGER_LITERAL:
						{
						setState(193);
						litral();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public TerminalNode OPENED_CURLY_BRACES() { return getToken(ReactParser.OPENED_CURLY_BRACES, 0); }
		public List<TerminalNode> IDENTIFIERNAME() { return getTokens(ReactParser.IDENTIFIERNAME); }
		public TerminalNode IDENTIFIERNAME(int i) {
			return getToken(ReactParser.IDENTIFIERNAME, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ReactParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ReactParser.COLON, i);
		}
		public List<LitralContext> litral() {
			return getRuleContexts(LitralContext.class);
		}
		public LitralContext litral(int i) {
			return getRuleContext(LitralContext.class,i);
		}
		public TerminalNode CLOSED_CURLY_BRACES() { return getToken(ReactParser.CLOSED_CURLY_BRACES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(OPENED_CURLY_BRACES);
			setState(204);
			match(IDENTIFIERNAME);
			setState(205);
			match(COLON);
			setState(206);
			litral();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(207);
				match(COMMA);
				setState(208);
				match(IDENTIFIERNAME);
				setState(209);
				match(COLON);
				setState(210);
				litral();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(CLOSED_CURLY_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SinglecomponentContext extends ParserRuleContext {
		public ComponentBodyContext componentBody() {
			return getRuleContext(ComponentBodyContext.class,0);
		}
		public ArrowcomponentContext arrowcomponent() {
			return getRuleContext(ArrowcomponentContext.class,0);
		}
		public FunctionalcomponentContext functionalcomponent() {
			return getRuleContext(FunctionalcomponentContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ReactParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ReactParser.SEMICOLON, i);
		}
		public SinglecomponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlecomponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSinglecomponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSinglecomponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSinglecomponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinglecomponentContext singlecomponent() throws RecognitionException {
		SinglecomponentContext _localctx = new SinglecomponentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_singlecomponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(218);
				arrowcomponent();
				}
				break;
			case FUNCTION:
				{
				setState(219);
				functionalcomponent();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(222);
			componentBody();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(223);
				match(SEMICOLON);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionalcomponentContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ReactParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIERNAME() { return getToken(ReactParser.IDENTIFIERNAME, 0); }
		public OpenbracesContext openbraces() {
			return getRuleContext(OpenbracesContext.class,0);
		}
		public TerminalNode OPENED_CURLY_BRACES() { return getToken(ReactParser.OPENED_CURLY_BRACES, 0); }
		public FunctionalcomponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalcomponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionalcomponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionalcomponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionalcomponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionalcomponentContext functionalcomponent() throws RecognitionException {
		FunctionalcomponentContext _localctx = new FunctionalcomponentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionalcomponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(FUNCTION);
			setState(230);
			match(IDENTIFIERNAME);
			setState(231);
			openbraces();
			setState(232);
			match(OPENED_CURLY_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowcomponentContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode IDENTIFIERNAME() { return getToken(ReactParser.IDENTIFIERNAME, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public OpenbracesContext openbraces() {
			return getRuleContext(OpenbracesContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(ReactParser.OPENED_BRACES, 0); }
		public TerminalNode OPENED_CURLY_BRACES() { return getToken(ReactParser.OPENED_CURLY_BRACES, 0); }
		public List<ComponentBodyContext> componentBody() {
			return getRuleContexts(ComponentBodyContext.class);
		}
		public ComponentBodyContext componentBody(int i) {
			return getRuleContext(ComponentBodyContext.class,i);
		}
		public ArrowcomponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowcomponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrowcomponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrowcomponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrowcomponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowcomponentContext arrowcomponent() throws RecognitionException {
		ArrowcomponentContext _localctx = new ArrowcomponentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrowcomponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(CONST);
			setState(235);
			match(IDENTIFIERNAME);
			setState(236);
			match(EQUAL);
			setState(237);
			openbraces();
			setState(238);
			match(ARROW);
			setState(239);
			_la = _input.LA(1);
			if ( !(_la==OPENED_BRACES || _la==OPENED_CURLY_BRACES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(240);
					componentBody();
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentBodyContext extends ParserRuleContext {
		public JsxElementsContext jsxElements() {
			return getRuleContext(JsxElementsContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(ReactParser.CLOSED_BRACES, 0); }
		public HooksContext hooks() {
			return getRuleContext(HooksContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(ReactParser.RETURN, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(ReactParser.OPENED_BRACES, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(ReactParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ReactParser.SEMICOLON, i);
		}
		public ComponentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComponentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComponentBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComponentBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentBodyContext componentBody() throws RecognitionException {
		ComponentBodyContext _localctx = new ComponentBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_componentBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST || _la==USEEFFECT) {
				{
				setState(246);
				hooks();
				}
			}

			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(249);
				match(RETURN);
				setState(250);
				match(OPENED_BRACES);
				}
			}

			setState(253);
			jsxElements();
			setState(254);
			match(CLOSED_BRACES);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255);
					match(SEMICOLON);
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenbracesContext extends ParserRuleContext {
		public TerminalNode OPENED_BRACES() { return getToken(ReactParser.OPENED_BRACES, 0); }
		public TerminalNode CLOSED_BRACES() { return getToken(ReactParser.CLOSED_BRACES, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(ReactParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(ReactParser.STRING_LITERAL, i);
		}
		public OpenbracesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openbraces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOpenbraces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOpenbraces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOpenbraces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenbracesContext openbraces() throws RecognitionException {
		OpenbracesContext _localctx = new OpenbracesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_openbraces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(OPENED_BRACES);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1073758720L) != 0)) {
				{
				setState(264);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPENED_CURLY_BRACES:
				case IDENTIFIERNAME:
					{
					setState(262);
					attribute();
					}
					break;
				case STRING_LITERAL:
					{
					setState(263);
					match(STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(CLOSED_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementsContext extends ParserRuleContext {
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public TagContentContext tagContent() {
			return getRuleContext(TagContentContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public SelfclosingContext selfclosing() {
			return getRuleContext(SelfclosingContext.class,0);
		}
		public JsxElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementsContext jsxElements() throws RecognitionException {
		JsxElementsContext _localctx = new JsxElementsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jsxElements);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				openTag();
				setState(272);
				tagContent();
				setState(273);
				closeTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				selfclosing();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentcallContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG() { return getToken(ReactParser.OPEN_TAG, 0); }
		public List<TerminalNode> IDENTIFIERNAME() { return getTokens(ReactParser.IDENTIFIERNAME); }
		public TerminalNode IDENTIFIERNAME(int i) {
			return getToken(ReactParser.IDENTIFIERNAME, i);
		}
		public TerminalNode SLASH() { return getToken(ReactParser.SLASH, 0); }
		public TerminalNode CLOSE_TAG() { return getToken(ReactParser.CLOSE_TAG, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(ReactParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(ReactParser.EQUAL, i);
		}
		public List<TerminalNode> OPENED_CURLY_BRACES() { return getTokens(ReactParser.OPENED_CURLY_BRACES); }
		public TerminalNode OPENED_CURLY_BRACES(int i) {
			return getToken(ReactParser.OPENED_CURLY_BRACES, i);
		}
		public List<TerminalNode> CLOSED_CURLY_BRACES() { return getTokens(ReactParser.CLOSED_CURLY_BRACES); }
		public TerminalNode CLOSED_CURLY_BRACES(int i) {
			return getToken(ReactParser.CLOSED_CURLY_BRACES, i);
		}
		public ComponentcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComponentcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComponentcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComponentcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentcallContext componentcall() throws RecognitionException {
		ComponentcallContext _localctx = new ComponentcallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_componentcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(OPEN_TAG);
			setState(279);
			match(IDENTIFIERNAME);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIERNAME) {
				{
				{
				setState(280);
				match(IDENTIFIERNAME);
				setState(281);
				match(EQUAL);
				setState(282);
				match(OPENED_CURLY_BRACES);
				setState(283);
				match(IDENTIFIERNAME);
				setState(284);
				match(CLOSED_CURLY_BRACES);
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			match(SLASH);
			setState(291);
			match(CLOSE_TAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenTagContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG() { return getToken(ReactParser.OPEN_TAG, 0); }
		public TerminalNode IDENTIFIERNAME() { return getToken(ReactParser.IDENTIFIERNAME, 0); }
		public TerminalNode CLOSE_TAG() { return getToken(ReactParser.CLOSE_TAG, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<StyleContext> style() {
			return getRuleContexts(StyleContext.class);
		}
		public StyleContext style(int i) {
			return getRuleContext(StyleContext.class,i);
		}
		public List<FunctionattributeContext> functionattribute() {
			return getRuleContexts(FunctionattributeContext.class);
		}
		public FunctionattributeContext functionattribute(int i) {
			return getRuleContext(FunctionattributeContext.class,i);
		}
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(OPEN_TAG);
			setState(294);
			match(IDENTIFIERNAME);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1077952512L) != 0)) {
				{
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(295);
					attribute();
					}
					break;
				case 2:
					{
					setState(296);
					style();
					}
					break;
				case 3:
					{
					setState(297);
					functionattribute();
					}
					break;
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(CLOSE_TAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CloseTagContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG() { return getToken(ReactParser.OPEN_TAG, 0); }
		public TerminalNode SLASH() { return getToken(ReactParser.SLASH, 0); }
		public TerminalNode IDENTIFIERNAME() { return getToken(ReactParser.IDENTIFIERNAME, 0); }
		public TerminalNode CLOSE_TAG() { return getToken(ReactParser.CLOSE_TAG, 0); }
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(OPEN_TAG);
			setState(306);
			match(SLASH);
			setState(307);
			match(IDENTIFIERNAME);
			setState(308);
			match(CLOSE_TAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelfclosingContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG() { return getToken(ReactParser.OPEN_TAG, 0); }
		public TerminalNode IDENTIFIERNAME() { return getToken(ReactParser.IDENTIFIERNAME, 0); }
		public TerminalNode SLASH() { return getToken(ReactParser.SLASH, 0); }
		public TerminalNode CLOSE_TAG() { return getToken(ReactParser.CLOSE_TAG, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<StyleContext> style() {
			return getRuleContexts(StyleContext.class);
		}
		public StyleContext style(int i) {
			return getRuleContext(StyleContext.class,i);
		}
		public SelfclosingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfclosing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSelfclosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSelfclosing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSelfclosing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfclosingContext selfclosing() throws RecognitionException {
		SelfclosingContext _localctx = new SelfclosingContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_selfclosing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(OPEN_TAG);
			setState(311);
			match(IDENTIFIERNAME);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENED_CURLY_BRACES || _la==IDENTIFIERNAME) {
				{
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(312);
					attribute();
					}
					break;
				case 2:
					{
					setState(313);
					style();
					}
					break;
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			match(SLASH);
			setState(320);
			match(CLOSE_TAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	 
		public AttributeContext() { }
		public void copyFrom(AttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualttributeContext extends AttributeContext {
		public List<TerminalNode> IDENTIFIERNAME() { return getTokens(ReactParser.IDENTIFIERNAME); }
		public TerminalNode IDENTIFIERNAME(int i) {
			return getToken(ReactParser.IDENTIFIERNAME, i);
		}
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode OPENED_CURLY_BRACES() { return getToken(ReactParser.OPENED_CURLY_BRACES, 0); }
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public TerminalNode CLOSED_CURLY_BRACES() { return getToken(ReactParser.CLOSED_CURLY_BRACES, 0); }
		public EqualttributeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterEqualttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitEqualttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitEqualttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiattributeContext extends AttributeContext {
		public TerminalNode OPENED_CURLY_BRACES() { return getToken(ReactParser.OPENED_CURLY_BRACES, 0); }
		public List<TerminalNode> IDENTIFIERNAME() { return getTokens(ReactParser.IDENTIFIERNAME); }
		public TerminalNode IDENTIFIERNAME(int i) {
			return getToken(ReactParser.IDENTIFIERNAME, i);
		}
		public TerminalNode CLOSED_CURLY_BRACES() { return getToken(ReactParser.CLOSED_CURLY_BRACES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public MultiattributeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMultiattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMultiattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMultiattribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends AttributeContext {
		public TerminalNode IDENTIFIERNAME() { return getToken(ReactParser.IDENTIFIERNAME, 0); }
		public TextContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotattributeContext extends AttributeContext {
		public TerminalNode OPENED_CURLY_BRACES() { return getToken(ReactParser.OPENED_CURLY_BRACES, 0); }
		public List<TerminalNode> IDENTIFIERNAME() { return getTokens(ReactParser.IDENTIFIERNAME); }
		public TerminalNode IDENTIFIERNAME(int i) {
			return getToken(ReactParser.IDENTIFIERNAME, i);
		}
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public TerminalNode CLOSED_CURLY_BRACES() { return getToken(ReactParser.CLOSED_CURLY_BRACES, 0); }
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public DotattributeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDotattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDotattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDotattribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectatrributeContext extends AttributeContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public SelectatrributeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSelectatrribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSelectatrribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSelectatrribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attribute);
		int _la;
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(IDENTIFIERNAME);
				}
				break;
			case 2:
				_localctx = new MultiattributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(OPENED_CURLY_BRACES);
				setState(324);
				match(IDENTIFIERNAME);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(325);
					match(COMMA);
					setState(326);
					match(IDENTIFIERNAME);
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(332);
				match(CLOSED_CURLY_BRACES);
				}
				break;
			case 3:
				_localctx = new DotattributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(333);
				match(OPENED_CURLY_BRACES);
				setState(334);
				match(IDENTIFIERNAME);
				setState(335);
				match(DOT);
				setState(338);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIERNAME:
					{
					setState(336);
					match(IDENTIFIERNAME);
					}
					break;
				case MAP:
					{
					setState(337);
					map();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(340);
				match(CLOSED_CURLY_BRACES);
				}
				}
				break;
			case 4:
				_localctx = new EqualttributeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
				match(IDENTIFIERNAME);
				setState(342);
				match(EQUAL);
				setState(343);
				match(OPENED_CURLY_BRACES);
				setState(344);
				match(IDENTIFIERNAME);
				setState(345);
				match(DOT);
				setState(346);
				match(IDENTIFIERNAME);
				setState(347);
				match(CLOSED_CURLY_BRACES);
				}
				break;
			case 5:
				_localctx = new SelectatrributeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(348);
				select();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionattributeContext extends ParserRuleContext {
		public TerminalNode ONCLICK() { return getToken(ReactParser.ONCLICK, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode OPENED_CURLY_BRACES() { return getToken(ReactParser.OPENED_CURLY_BRACES, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode CLOSED_CURLY_BRACES() { return getToken(ReactParser.CLOSED_CURLY_BRACES, 0); }
		public FunctionattributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionattribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionattribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionattributeContext functionattribute() throws RecognitionException {
		FunctionattributeContext _localctx = new FunctionattributeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionattribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(ONCLICK);
			setState(352);
			match(EQUAL);
			setState(353);
			match(OPENED_CURLY_BRACES);
			setState(354);
			function();
			setState(355);
			match(CLOSED_CURLY_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(ReactParser.MAP, 0); }
		public List<TerminalNode> OPENED_BRACES() { return getTokens(ReactParser.OPENED_BRACES); }
		public TerminalNode OPENED_BRACES(int i) {
			return getToken(ReactParser.OPENED_BRACES, i);
		}
		public OpenbracesContext openbraces() {
			return getRuleContext(OpenbracesContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public JsxElementsContext jsxElements() {
			return getRuleContext(JsxElementsContext.class,0);
		}
		public List<TerminalNode> CLOSED_BRACES() { return getTokens(ReactParser.CLOSED_BRACES); }
		public TerminalNode CLOSED_BRACES(int i) {
			return getToken(ReactParser.CLOSED_BRACES, i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(MAP);
			setState(358);
			match(OPENED_BRACES);
			setState(359);
			openbraces();
			setState(360);
			match(ARROW);
			setState(361);
			match(OPENED_BRACES);
			setState(362);
			jsxElements();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLOSED_BRACES) {
				{
				{
				setState(363);
				match(CLOSED_BRACES);
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectContext extends ParserRuleContext {
		public TerminalNode OPENED_CURLY_BRACES() { return getToken(ReactParser.OPENED_CURLY_BRACES, 0); }
		public TerminalNode IDENTIFIERNAME() { return getToken(ReactParser.IDENTIFIERNAME, 0); }
		public TerminalNode ANDAND() { return getToken(ReactParser.ANDAND, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(ReactParser.OPENED_BRACES, 0); }
		public JsxElementsContext jsxElements() {
			return getRuleContext(JsxElementsContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(ReactParser.CLOSED_BRACES, 0); }
		public List<TerminalNode> CLOSED_CURLY_BRACES() { return getTokens(ReactParser.CLOSED_CURLY_BRACES); }
		public TerminalNode CLOSED_CURLY_BRACES(int i) {
			return getToken(ReactParser.CLOSED_CURLY_BRACES, i);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(OPENED_CURLY_BRACES);
			setState(370);
			match(IDENTIFIERNAME);
			setState(371);
			match(ANDAND);
			setState(372);
			match(OPENED_BRACES);
			setState(373);
			jsxElements();
			setState(374);
			match(CLOSED_BRACES);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLOSED_CURLY_BRACES) {
				{
				{
				setState(375);
				match(CLOSED_CURLY_BRACES);
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagContentContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<JsxElementsContext> jsxElements() {
			return getRuleContexts(JsxElementsContext.class);
		}
		public JsxElementsContext jsxElements(int i) {
			return getRuleContext(JsxElementsContext.class,i);
		}
		public List<ComponentcallContext> componentcall() {
			return getRuleContexts(ComponentcallContext.class);
		}
		public ComponentcallContext componentcall(int i) {
			return getRuleContext(ComponentcallContext.class,i);
		}
		public TagContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTagContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTagContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTagContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContentContext tagContent() throws RecognitionException {
		TagContentContext _localctx = new TagContentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tagContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(384);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(381);
						attribute();
						}
						break;
					case 2:
						{
						setState(382);
						jsxElements();
						}
						break;
					case 3:
						{
						{
						setState(383);
						componentcall();
						}
						}
						break;
					}
					} 
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERNAME() { return getToken(ReactParser.IDENTIFIERNAME, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public StyleAttributesContext styleAttributes() {
			return getRuleContext(StyleAttributesContext.class,0);
		}
		public List<TerminalNode> OPENED_CURLY_BRACES() { return getTokens(ReactParser.OPENED_CURLY_BRACES); }
		public TerminalNode OPENED_CURLY_BRACES(int i) {
			return getToken(ReactParser.OPENED_CURLY_BRACES, i);
		}
		public List<TerminalNode> CLOSED_CURLY_BRACES() { return getTokens(ReactParser.CLOSED_CURLY_BRACES); }
		public TerminalNode CLOSED_CURLY_BRACES(int i) {
			return getToken(ReactParser.CLOSED_CURLY_BRACES, i);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(IDENTIFIERNAME);
			setState(390);
			match(EQUAL);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENED_CURLY_BRACES) {
				{
				{
				setState(391);
				match(OPENED_CURLY_BRACES);
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
			styleAttributes();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLOSED_CURLY_BRACES) {
				{
				{
				setState(398);
				match(CLOSED_CURLY_BRACES);
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleAttributesContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIERNAME() { return getTokens(ReactParser.IDENTIFIERNAME); }
		public TerminalNode IDENTIFIERNAME(int i) {
			return getToken(ReactParser.IDENTIFIERNAME, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ReactParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ReactParser.COLON, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(ReactParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(ReactParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public StyleAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStyleAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStyleAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStyleAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleAttributesContext styleAttributes() throws RecognitionException {
		StyleAttributesContext _localctx = new StyleAttributesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_styleAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(IDENTIFIERNAME);
			setState(405);
			match(COLON);
			setState(406);
			match(STRING_LITERAL);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(407);
				match(COMMA);
				setState(408);
				match(IDENTIFIERNAME);
				setState(409);
				match(COLON);
				setState(410);
				match(STRING_LITERAL);
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public OpenbracesContext openbraces() {
			return getRuleContext(OpenbracesContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			openbraces();
			setState(417);
			match(ARROW);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIERNAME) {
				{
				setState(418);
				call();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstfunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERNAME() { return getToken(ReactParser.IDENTIFIERNAME, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public OpenbracesContext openbraces() {
			return getRuleContext(OpenbracesContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public TerminalNode OPENED_CURLY_BRACES() { return getToken(ReactParser.OPENED_CURLY_BRACES, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode CLOSED_CURLY_BRACES() { return getToken(ReactParser.CLOSED_CURLY_BRACES, 0); }
		public TerminalNode SEMICOLON() { return getToken(ReactParser.SEMICOLON, 0); }
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public ConstfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterConstfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitConstfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitConstfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstfunctionContext constfunction() throws RecognitionException {
		ConstfunctionContext _localctx = new ConstfunctionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(421);
				match(CONST);
				}
			}

			setState(424);
			match(IDENTIFIERNAME);
			setState(425);
			match(EQUAL);
			setState(426);
			openbraces();
			setState(427);
			match(ARROW);
			setState(428);
			match(OPENED_CURLY_BRACES);
			setState(429);
			call();
			setState(430);
			match(CLOSED_CURLY_BRACES);
			setState(431);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIERNAME() { return getTokens(ReactParser.IDENTIFIERNAME); }
		public TerminalNode IDENTIFIERNAME(int i) {
			return getToken(ReactParser.IDENTIFIERNAME, i);
		}
		public OpenbracesContext openbraces() {
			return getRuleContext(OpenbracesContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(ReactParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ReactParser.SEMICOLON, i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(IDENTIFIERNAME);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(434);
				match(DOT);
				setState(435);
				match(IDENTIFIERNAME);
				}
			}

			setState(438);
			openbraces();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(439);
				match(SEMICOLON);
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERNAME() { return getToken(ReactParser.IDENTIFIERNAME, 0); }
		public LitralContext litral() {
			return getRuleContext(LitralContext.class,0);
		}
		public TerminalNode OPEN_TAG() { return getToken(ReactParser.OPEN_TAG, 0); }
		public TerminalNode CLOSE_TAG() { return getToken(ReactParser.CLOSE_TAG, 0); }
		public TerminalNode PLUS() { return getToken(ReactParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ReactParser.MINUS, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode CLOSE_OR_EQUAL() { return getToken(ReactParser.CLOSE_OR_EQUAL, 0); }
		public TerminalNode OPEN_OR_EQUAL() { return getToken(ReactParser.OPEN_OR_EQUAL, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(IDENTIFIERNAME);
			setState(446);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 985226842996736L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(447);
			litral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ReactParser.FOR, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(ReactParser.OPENED_BRACES, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ReactParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ReactParser.SEMICOLON, i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(ReactParser.CLOSED_BRACES, 0); }
		public TerminalNode IDENTIFIERNAME() { return getToken(ReactParser.IDENTIFIERNAME, 0); }
		public List<TerminalNode> PLUS() { return getTokens(ReactParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ReactParser.PLUS, i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ReactParser.STRING_LITERAL, 0); }
		public List<TerminalNode> MINUS() { return getTokens(ReactParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ReactParser.MINUS, i);
		}
		public List<TerminalNode> OPENED_CURLY_BRACES() { return getTokens(ReactParser.OPENED_CURLY_BRACES); }
		public TerminalNode OPENED_CURLY_BRACES(int i) {
			return getToken(ReactParser.OPENED_CURLY_BRACES, i);
		}
		public List<TerminalNode> CLOSED_CURLY_BRACES() { return getTokens(ReactParser.CLOSED_CURLY_BRACES); }
		public TerminalNode CLOSED_CURLY_BRACES(int i) {
			return getToken(ReactParser.CLOSED_CURLY_BRACES, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitForloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(FOR);
			setState(450);
			match(OPENED_BRACES);
			setState(451);
			declaration();
			setState(452);
			match(SEMICOLON);
			setState(453);
			operation();
			setState(454);
			match(SEMICOLON);
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(455);
				match(IDENTIFIERNAME);
				setState(456);
				match(PLUS);
				setState(457);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				{
				setState(458);
				match(IDENTIFIERNAME);
				setState(459);
				match(MINUS);
				setState(460);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				{
				setState(461);
				match(IDENTIFIERNAME);
				setState(462);
				match(PLUS);
				setState(463);
				match(PLUS);
				}
				break;
			case 4:
				{
				setState(464);
				match(IDENTIFIERNAME);
				setState(465);
				match(MINUS);
				setState(466);
				match(MINUS);
				}
				break;
			}
			setState(469);
			match(CLOSED_BRACES);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENED_CURLY_BRACES) {
				{
				{
				setState(470);
				match(OPENED_CURLY_BRACES);
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1077674176L) != 0)) {
					{
					{
					setState(471);
					statement();
					}
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(477);
				match(CLOSED_CURLY_BRACES);
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIf_conditionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ReactParser.ELSE, 0); }
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ElseIf_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElseIf_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElseIf_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElseIf_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIf_conditionContext elseIf_condition() throws RecognitionException {
		ElseIf_conditionContext _localctx = new ElseIf_conditionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elseIf_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(ELSE);
			setState(484);
			if_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_conditionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ReactParser.ELSE, 0); }
		public List<TerminalNode> OPENED_CURLY_BRACES() { return getTokens(ReactParser.OPENED_CURLY_BRACES); }
		public TerminalNode OPENED_CURLY_BRACES(int i) {
			return getToken(ReactParser.OPENED_CURLY_BRACES, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> CLOSED_CURLY_BRACES() { return getTokens(ReactParser.CLOSED_CURLY_BRACES); }
		public TerminalNode CLOSED_CURLY_BRACES(int i) {
			return getToken(ReactParser.CLOSED_CURLY_BRACES, i);
		}
		public Else_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElse_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElse_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElse_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_conditionContext else_condition() throws RecognitionException {
		Else_conditionContext _localctx = new Else_conditionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_else_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(ELSE);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENED_CURLY_BRACES) {
				{
				{
				setState(487);
				match(OPENED_CURLY_BRACES);
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(493);
					statement();
					}
					} 
				}
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(499);
					match(CLOSED_CURLY_BRACES);
					}
					} 
				}
				setState(504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ReactParser.IF, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(ReactParser.OPENED_BRACES, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(ReactParser.CLOSED_BRACES, 0); }
		public List<TerminalNode> OPENED_CURLY_BRACES() { return getTokens(ReactParser.OPENED_CURLY_BRACES); }
		public TerminalNode OPENED_CURLY_BRACES(int i) {
			return getToken(ReactParser.OPENED_CURLY_BRACES, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> CLOSED_CURLY_BRACES() { return getTokens(ReactParser.CLOSED_CURLY_BRACES); }
		public TerminalNode CLOSED_CURLY_BRACES(int i) {
			return getToken(ReactParser.CLOSED_CURLY_BRACES, i);
		}
		public List<ElseIf_conditionContext> elseIf_condition() {
			return getRuleContexts(ElseIf_conditionContext.class);
		}
		public ElseIf_conditionContext elseIf_condition(int i) {
			return getRuleContext(ElseIf_conditionContext.class,i);
		}
		public Else_conditionContext else_condition() {
			return getRuleContext(Else_conditionContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_if);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(IF);
			setState(506);
			match(OPENED_BRACES);
			setState(507);
			operation();
			setState(508);
			match(CLOSED_BRACES);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENED_CURLY_BRACES) {
				{
				{
				setState(509);
				match(OPENED_CURLY_BRACES);
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(515);
					statement();
					}
					} 
				}
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(521);
					match(CLOSED_CURLY_BRACES);
					}
					} 
				}
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(527);
					elseIf_condition();
					}
					} 
				}
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(533);
				else_condition();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIERNAME() { return getTokens(ReactParser.IDENTIFIERNAME); }
		public TerminalNode IDENTIFIERNAME(int i) {
			return getToken(ReactParser.IDENTIFIERNAME, i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) {
				{
				setState(536);
				type();
				}
			}

			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(539);
				match(IDENTIFIERNAME);
				}
				break;
			case 2:
				{
				setState(540);
				assignment();
				}
				break;
			}
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(543);
				match(COMMA);
				setState(546);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(544);
					match(IDENTIFIERNAME);
					}
					break;
				case 2:
					{
					setState(545);
					assignment();
					}
					break;
				}
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpsionAssignmentContext extends AssignmentContext {
		public TerminalNode IDENTIFIERNAME() { return getToken(ReactParser.IDENTIFIERNAME, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpsionAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpsionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpsionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpsionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralAssignmentContext extends AssignmentContext {
		public TerminalNode IDENTIFIERNAME() { return getToken(ReactParser.IDENTIFIERNAME, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public LitralContext litral() {
			return getRuleContext(LitralContext.class,0);
		}
		public LiteralAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLiteralAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLiteralAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLiteralAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assignment);
		try {
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				_localctx = new LiteralAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				match(IDENTIFIERNAME);
				setState(554);
				match(EQUAL);
				setState(555);
				litral();
				}
				break;
			case 2:
				_localctx = new ExpsionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				match(IDENTIFIERNAME);
				setState(557);
				match(EQUAL);
				setState(558);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<TerminalNode> OPENED_BRACES() { return getTokens(ReactParser.OPENED_BRACES); }
		public TerminalNode OPENED_BRACES(int i) {
			return getToken(ReactParser.OPENED_BRACES, i);
		}
		public List<TerminalNode> CLOSED_BRACES() { return getTokens(ReactParser.CLOSED_BRACES); }
		public TerminalNode CLOSED_BRACES(int i) {
			return getToken(ReactParser.CLOSED_BRACES, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENED_BRACES) {
				{
				{
				setState(561);
				match(OPENED_BRACES);
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(567);
			operation();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLOSED_BRACES) {
				{
				{
				setState(568);
				match(CLOSED_BRACES);
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ReactParser.INT, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(ReactParser.BOOLEAN, 0); }
		public TerminalNode VAR() { return getToken(ReactParser.VAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_statement);
		try {
			int _alt;
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(576);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(579); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				forloop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(582);
				if_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(583);
				call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u024b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0001\u0000\u0005\u0000T\b\u0000\n\u0000\f\u0000W\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000[\b\u0000\u0001\u0000\u0005\u0000^\b\u0000"+
		"\n\u0000\f\u0000a\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"f\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"l\b\u0001\n\u0001\f\u0001o\t\u0001\u0001\u0001\u0003\u0001r\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002w\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u008d\b\u0004\n\u0004\f\u0004\u0090\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0097\b\u0005"+
		"\n\u0005\f\u0005\u009a\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00a0\b\u0005\n\u0005\f\u0005\u00a3\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00ac\b\u0006\n\u0006\f\u0006\u00af\t\u0006\u0001\u0007\u0003"+
		"\u0007\u00b2\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u00be\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00c3\b\t\u0005\t\u00c5\b\t\n\t\f\t\u00c8\t"+
		"\t\u0003\t\u00ca\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00d4\b\n\n\n\f\n\u00d7\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00dd\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00e1\b\u000b\n\u000b\f\u000b\u00e4\t\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00f2\b\r\n\r\f\r\u00f5\t\r\u0001\u000e\u0003\u000e\u00f8\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00fc\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0101\b\u000e\n\u000e\f\u000e\u0104\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u0109\b\u000f\n\u000f\f\u000f\u010c"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0115\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u011e"+
		"\b\u0011\n\u0011\f\u0011\u0121\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u012b\b\u0012\n\u0012\f\u0012\u012e\t\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u013b\b\u0014\n\u0014\f\u0014"+
		"\u013e\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0148\b\u0015\n\u0015"+
		"\f\u0015\u014b\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0153\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u015e\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u016d\b\u0017"+
		"\n\u0017\f\u0017\u0170\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0179\b\u0018\n"+
		"\u0018\f\u0018\u017c\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u0181\b\u0019\n\u0019\f\u0019\u0184\t\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u0189\b\u001a\n\u001a\f\u001a\u018c\t\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u0190\b\u001a\n\u001a\f\u001a\u0193\t\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u019c\b\u001b\n\u001b\f\u001b\u019f\t\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01a4\b\u001c\u0001\u001d\u0003"+
		"\u001d\u01a7\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u01b5\b\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u01b9\b\u001e\n\u001e\f\u001e\u01bc\t\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u01d4\b \u0001 \u0001 \u0001 \u0005 \u01d9\b \n \f \u01dc"+
		"\t \u0001 \u0005 \u01df\b \n \f \u01e2\t \u0001!\u0001!\u0001!\u0001\""+
		"\u0001\"\u0005\"\u01e9\b\"\n\"\f\"\u01ec\t\"\u0001\"\u0005\"\u01ef\b\""+
		"\n\"\f\"\u01f2\t\"\u0001\"\u0005\"\u01f5\b\"\n\"\f\"\u01f8\t\"\u0001#"+
		"\u0001#\u0001#\u0001#\u0001#\u0005#\u01ff\b#\n#\f#\u0202\t#\u0001#\u0005"+
		"#\u0205\b#\n#\f#\u0208\t#\u0001#\u0005#\u020b\b#\n#\f#\u020e\t#\u0001"+
		"#\u0005#\u0211\b#\n#\f#\u0214\t#\u0001#\u0003#\u0217\b#\u0001$\u0003$"+
		"\u021a\b$\u0001$\u0001$\u0003$\u021e\b$\u0001$\u0001$\u0001$\u0003$\u0223"+
		"\b$\u0005$\u0225\b$\n$\f$\u0228\t$\u0001%\u0001%\u0001%\u0001%\u0001%"+
		"\u0001%\u0003%\u0230\b%\u0001&\u0005&\u0233\b&\n&\f&\u0236\t&\u0001&\u0001"+
		"&\u0005&\u023a\b&\n&\f&\u023d\t&\u0001\'\u0001\'\u0001(\u0004(\u0242\b"+
		"(\u000b(\f(\u0243\u0001(\u0001(\u0001(\u0003(\u0249\b(\u0001(\u0000\u0000"+
		")\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNP\u0000\u0004\u0001\u0000\t\n\u0002"+
		"\u0000\f\f\u000e\u000e\u0002\u0000 #/1\u0001\u0000\u0012\u0015\u026e\u0000"+
		"e\u0001\u0000\u0000\u0000\u0002g\u0001\u0000\u0000\u0000\u0004v\u0001"+
		"\u0000\u0000\u0000\u0006x\u0001\u0000\u0000\u0000\b\u0086\u0001\u0000"+
		"\u0000\u0000\n\u0091\u0001\u0000\u0000\u0000\f\u00a7\u0001\u0000\u0000"+
		"\u0000\u000e\u00b1\u0001\u0000\u0000\u0000\u0010\u00b9\u0001\u0000\u0000"+
		"\u0000\u0012\u00c9\u0001\u0000\u0000\u0000\u0014\u00cb\u0001\u0000\u0000"+
		"\u0000\u0016\u00dc\u0001\u0000\u0000\u0000\u0018\u00e5\u0001\u0000\u0000"+
		"\u0000\u001a\u00ea\u0001\u0000\u0000\u0000\u001c\u00f7\u0001\u0000\u0000"+
		"\u0000\u001e\u0105\u0001\u0000\u0000\u0000 \u0114\u0001\u0000\u0000\u0000"+
		"\"\u0116\u0001\u0000\u0000\u0000$\u0125\u0001\u0000\u0000\u0000&\u0131"+
		"\u0001\u0000\u0000\u0000(\u0136\u0001\u0000\u0000\u0000*\u015d\u0001\u0000"+
		"\u0000\u0000,\u015f\u0001\u0000\u0000\u0000.\u0165\u0001\u0000\u0000\u0000"+
		"0\u0171\u0001\u0000\u0000\u00002\u0182\u0001\u0000\u0000\u00004\u0185"+
		"\u0001\u0000\u0000\u00006\u0194\u0001\u0000\u0000\u00008\u01a0\u0001\u0000"+
		"\u0000\u0000:\u01a6\u0001\u0000\u0000\u0000<\u01b1\u0001\u0000\u0000\u0000"+
		">\u01bd\u0001\u0000\u0000\u0000@\u01c1\u0001\u0000\u0000\u0000B\u01e3"+
		"\u0001\u0000\u0000\u0000D\u01e6\u0001\u0000\u0000\u0000F\u01f9\u0001\u0000"+
		"\u0000\u0000H\u0219\u0001\u0000\u0000\u0000J\u022f\u0001\u0000\u0000\u0000"+
		"L\u0234\u0001\u0000\u0000\u0000N\u023e\u0001\u0000\u0000\u0000P\u0248"+
		"\u0001\u0000\u0000\u0000RT\u0003P(\u0000SR\u0001\u0000\u0000\u0000TW\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"Vf\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XZ\u0005\u0002\u0000"+
		"\u0000Y[\u0003\u000e\u0007\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[_\u0001\u0000\u0000\u0000\\^\u0003\u001a\r\u0000]\\\u0001"+
		"\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000bf\u0003\u0002\u0001\u0000cf\u0003\u0016\u000b\u0000df\u0003\u0004"+
		"\u0002\u0000eU\u0001\u0000\u0000\u0000eX\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000f\u0001\u0001\u0000\u0000"+
		"\u0000gh\u0003\u001a\r\u0000hi\u0003\u001c\u000e\u0000im\u0005\u000f\u0000"+
		"\u0000jl\u00057\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nq\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000pr\u0003\f\u0006\u0000qp\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0003\u0001\u0000\u0000\u0000"+
		"sw\u0003\u0006\u0003\u0000tw\u0003\b\u0004\u0000uw\u0003\n\u0005\u0000"+
		"vs\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000"+
		"\u0000w\u0005\u0001\u0000\u0000\u0000xy\u0005\u0003\u0000\u0000yz\u0005"+
		"\r\u0000\u0000z{\u0005\u001e\u0000\u0000{|\u00055\u0000\u0000|}\u0005"+
		"\u001e\u0000\u0000}~\u0005\u0010\u0000\u0000~\u007f\u0005/\u0000\u0000"+
		"\u007f\u0080\u0005\u001b\u0000\u0000\u0080\u0081\u0005\f\u0000\u0000\u0081"+
		"\u0082\u0005\t\u0000\u0000\u0082\u0083\u0005\u0011\u0000\u0000\u0083\u0084"+
		"\u00057\u0000\u0000\u0084\u0085\u0003:\u001d\u0000\u0085\u0007\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0005\u0003\u0000\u0000\u0087\u0088\u0005\u001e"+
		"\u0000\u0000\u0088\u0089\u0005/\u0000\u0000\u0089\u008a\u0005\u001c\u0000"+
		"\u0000\u008a\u008e\u0003\u001e\u000f\u0000\u008b\u008d\u00057\u0000\u0000"+
		"\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000"+
		"\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\t\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0005\u001d\u0000\u0000\u0092\u0093\u0005\f\u0000\u0000\u0093\u0094"+
		"\u00038\u001c\u0000\u0094\u0098\u0005\u000e\u0000\u0000\u0095\u0097\u0003"+
		"P(\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0005\u000f\u0000\u0000\u009c\u009d\u00055\u0000\u0000"+
		"\u009d\u00a1\u0005\r\u0000\u0000\u009e\u00a0\u0003*\u0015\u0000\u009f"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005\u0010\u0000\u0000\u00a5\u00a6\u0005\u0011\u0000\u0000\u00a6"+
		"\u000b\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0019\u0000\u0000\u00a8"+
		"\u00a9\u0005\u001a\u0000\u0000\u00a9\u00ad\u0005\u001e\u0000\u0000\u00aa"+
		"\u00ac\u00057\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\r\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b2\u0005\u0003\u0000\u0000\u00b1\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005\u001e\u0000\u0000\u00b4\u00b5\u0005"+
		"/\u0000\u0000\u00b5\u00b6\u0005\r\u0000\u0000\u00b6\u00b7\u0003\u0012"+
		"\t\u0000\u00b7\u00b8\u0005\u0010\u0000\u0000\u00b8\u000f\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0007\u0000\u0000\u0000\u00ba\u0011\u0001\u0000\u0000"+
		"\u0000\u00bb\u00be\u0003\u0014\n\u0000\u00bc\u00be\u0003\u0010\b\u0000"+
		"\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00c6\u0001\u0000\u0000\u0000\u00bf\u00c2\u00055\u0000\u0000\u00c0"+
		"\u00c3\u0003\u0014\n\u0000\u00c1\u00c3\u0003\u0010\b\u0000\u00c2\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c4\u00bf\u0001\u0000\u0000\u0000\u00c5\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c9\u00bd\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0001\u0000\u0000\u0000\u00ca\u0013\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0005\u000e\u0000\u0000\u00cc\u00cd\u0005\u001e\u0000\u0000\u00cd\u00ce"+
		"\u00056\u0000\u0000\u00ce\u00d5\u0003\u0010\b\u0000\u00cf\u00d0\u0005"+
		"5\u0000\u0000\u00d0\u00d1\u0005\u001e\u0000\u0000\u00d1\u00d2\u00056\u0000"+
		"\u0000\u00d2\u00d4\u0003\u0010\b\u0000\u00d3\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u000f\u0000\u0000"+
		"\u00d9\u0015\u0001\u0000\u0000\u0000\u00da\u00dd\u0003\u001a\r\u0000\u00db"+
		"\u00dd\u0003\u0018\f\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e2"+
		"\u0003\u001c\u000e\u0000\u00df\u00e1\u00057\u0000\u0000\u00e0\u00df\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u0017\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005"+
		"\u0001\u0000\u0000\u00e6\u00e7\u0005\u001e\u0000\u0000\u00e7\u00e8\u0003"+
		"\u001e\u000f\u0000\u00e8\u00e9\u0005\u000e\u0000\u0000\u00e9\u0019\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0005\u0003\u0000\u0000\u00eb\u00ec\u0005"+
		"\u001e\u0000\u0000\u00ec\u00ed\u0005/\u0000\u0000\u00ed\u00ee\u0003\u001e"+
		"\u000f\u0000\u00ee\u00ef\u0005&\u0000\u0000\u00ef\u00f3\u0007\u0001\u0000"+
		"\u0000\u00f0\u00f2\u0003\u001c\u000e\u0000\u00f1\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u001b\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f8\u0003\u0004\u0002"+
		"\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0018\u0000"+
		"\u0000\u00fa\u00fc\u0005\f\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0003 \u0010\u0000\u00fe\u0102\u0005\u0011\u0000\u0000\u00ff"+
		"\u0101\u00057\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0104"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0001\u0000\u0000\u0000\u0103\u001d\u0001\u0000\u0000\u0000\u0104\u0102"+
		"\u0001\u0000\u0000\u0000\u0105\u010a\u0005\f\u0000\u0000\u0106\u0109\u0003"+
		"*\u0015\u0000\u0107\u0109\u0005\t\u0000\u0000\u0108\u0106\u0001\u0000"+
		"\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000"+
		"\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0005\u0011\u0000\u0000\u010e\u001f\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0003$\u0012\u0000\u0110\u0111\u00032\u0019\u0000"+
		"\u0111\u0112\u0003&\u0013\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113"+
		"\u0115\u0003(\u0014\u0000\u0114\u010f\u0001\u0000\u0000\u0000\u0114\u0113"+
		"\u0001\u0000\u0000\u0000\u0115!\u0001\u0000\u0000\u0000\u0116\u0117\u0005"+
		" \u0000\u0000\u0117\u011f\u0005\u001e\u0000\u0000\u0118\u0119\u0005\u001e"+
		"\u0000\u0000\u0119\u011a\u0005/\u0000\u0000\u011a\u011b\u0005\u000e\u0000"+
		"\u0000\u011b\u011c\u0005\u001e\u0000\u0000\u011c\u011e\u0005\u000f\u0000"+
		"\u0000\u011d\u0118\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000"+
		"\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000"+
		"\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0005\u001f\u0000\u0000\u0123\u0124\u0005!\u0000\u0000"+
		"\u0124#\u0001\u0000\u0000\u0000\u0125\u0126\u0005 \u0000\u0000\u0126\u012c"+
		"\u0005\u001e\u0000\u0000\u0127\u012b\u0003*\u0015\u0000\u0128\u012b\u0003"+
		"4\u001a\u0000\u0129\u012b\u0003,\u0016\u0000\u012a\u0127\u0001\u0000\u0000"+
		"\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u0129\u0001\u0000\u0000"+
		"\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000\u0000"+
		"\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0130\u0005!\u0000\u0000"+
		"\u0130%\u0001\u0000\u0000\u0000\u0131\u0132\u0005 \u0000\u0000\u0132\u0133"+
		"\u0005\u001f\u0000\u0000\u0133\u0134\u0005\u001e\u0000\u0000\u0134\u0135"+
		"\u0005!\u0000\u0000\u0135\'\u0001\u0000\u0000\u0000\u0136\u0137\u0005"+
		" \u0000\u0000\u0137\u013c\u0005\u001e\u0000\u0000\u0138\u013b\u0003*\u0015"+
		"\u0000\u0139\u013b\u00034\u001a\u0000\u013a\u0138\u0001\u0000\u0000\u0000"+
		"\u013a\u0139\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000"+
		"\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000"+
		"\u013d\u013f\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0005\u001f\u0000\u0000\u0140\u0141\u0005!\u0000\u0000\u0141"+
		")\u0001\u0000\u0000\u0000\u0142\u015e\u0005\u001e\u0000\u0000\u0143\u0144"+
		"\u0005\u000e\u0000\u0000\u0144\u0149\u0005\u001e\u0000\u0000\u0145\u0146"+
		"\u00055\u0000\u0000\u0146\u0148\u0005\u001e\u0000\u0000\u0147\u0145\u0001"+
		"\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014c\u0001"+
		"\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u015e\u0005"+
		"\u000f\u0000\u0000\u014d\u014e\u0005\u000e\u0000\u0000\u014e\u014f\u0005"+
		"\u001e\u0000\u0000\u014f\u0152\u0005\u0004\u0000\u0000\u0150\u0153\u0005"+
		"\u001e\u0000\u0000\u0151\u0153\u0003.\u0017\u0000\u0152\u0150\u0001\u0000"+
		"\u0000\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000"+
		"\u0000\u0000\u0154\u015e\u0005\u000f\u0000\u0000\u0155\u0156\u0005\u001e"+
		"\u0000\u0000\u0156\u0157\u0005/\u0000\u0000\u0157\u0158\u0005\u000e\u0000"+
		"\u0000\u0158\u0159\u0005\u001e\u0000\u0000\u0159\u015a\u0005\u0004\u0000"+
		"\u0000\u015a\u015b\u0005\u001e\u0000\u0000\u015b\u015e\u0005\u000f\u0000"+
		"\u0000\u015c\u015e\u00030\u0018\u0000\u015d\u0142\u0001\u0000\u0000\u0000"+
		"\u015d\u0143\u0001\u0000\u0000\u0000\u015d\u014d\u0001\u0000\u0000\u0000"+
		"\u015d\u0155\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000"+
		"\u015e+\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u0016\u0000\u0000\u0160"+
		"\u0161\u0005/\u0000\u0000\u0161\u0162\u0005\u000e\u0000\u0000\u0162\u0163"+
		"\u00038\u001c\u0000\u0163\u0164\u0005\u000f\u0000\u0000\u0164-\u0001\u0000"+
		"\u0000\u0000\u0165\u0166\u0005\u0005\u0000\u0000\u0166\u0167\u0005\f\u0000"+
		"\u0000\u0167\u0168\u0003\u001e\u000f\u0000\u0168\u0169\u0005&\u0000\u0000"+
		"\u0169\u016a\u0005\f\u0000\u0000\u016a\u016e\u0003 \u0010\u0000\u016b"+
		"\u016d\u0005\u0011\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016d"+
		"\u0170\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0001\u0000\u0000\u0000\u016f/\u0001\u0000\u0000\u0000\u0170\u016e"+
		"\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u000e\u0000\u0000\u0172\u0173"+
		"\u0005\u001e\u0000\u0000\u0173\u0174\u0005%\u0000\u0000\u0174\u0175\u0005"+
		"\f\u0000\u0000\u0175\u0176\u0003 \u0010\u0000\u0176\u017a\u0005\u0011"+
		"\u0000\u0000\u0177\u0179\u0005\u000f\u0000\u0000\u0178\u0177\u0001\u0000"+
		"\u0000\u0000\u0179\u017c\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000"+
		"\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b1\u0001\u0000\u0000"+
		"\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u0181\u0003*\u0015\u0000"+
		"\u017e\u0181\u0003 \u0010\u0000\u017f\u0181\u0003\"\u0011\u0000\u0180"+
		"\u017d\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180"+
		"\u017f\u0001\u0000\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182"+
		"\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183"+
		"3\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0186"+
		"\u0005\u001e\u0000\u0000\u0186\u018a\u0005/\u0000\u0000\u0187\u0189\u0005"+
		"\u000e\u0000\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0189\u018c\u0001"+
		"\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001"+
		"\u0000\u0000\u0000\u018b\u018d\u0001\u0000\u0000\u0000\u018c\u018a\u0001"+
		"\u0000\u0000\u0000\u018d\u0191\u00036\u001b\u0000\u018e\u0190\u0005\u000f"+
		"\u0000\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000"+
		"\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000"+
		"\u0000\u0000\u01925\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0005\u001e\u0000\u0000\u0195\u0196\u00056\u0000\u0000"+
		"\u0196\u019d\u0005\t\u0000\u0000\u0197\u0198\u00055\u0000\u0000\u0198"+
		"\u0199\u0005\u001e\u0000\u0000\u0199\u019a\u00056\u0000\u0000\u019a\u019c"+
		"\u0005\t\u0000\u0000\u019b\u0197\u0001\u0000\u0000\u0000\u019c\u019f\u0001"+
		"\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001"+
		"\u0000\u0000\u0000\u019e7\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a1\u0003\u001e\u000f\u0000\u01a1\u01a3\u0005&\u0000"+
		"\u0000\u01a2\u01a4\u0003<\u001e\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a49\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a7\u0005\u0003\u0000\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0005\u001e\u0000\u0000\u01a9\u01aa\u0005/\u0000\u0000\u01aa\u01ab"+
		"\u0003\u001e\u000f\u0000\u01ab\u01ac\u0005&\u0000\u0000\u01ac\u01ad\u0005"+
		"\u000e\u0000\u0000\u01ad\u01ae\u0003<\u001e\u0000\u01ae\u01af\u0005\u000f"+
		"\u0000\u0000\u01af\u01b0\u00057\u0000\u0000\u01b0;\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b4\u0005\u001e\u0000\u0000\u01b2\u01b3\u0005\u0004\u0000\u0000"+
		"\u01b3\u01b5\u0005\u001e\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b6\u01ba\u0003\u001e\u000f\u0000\u01b7\u01b9\u00057\u0000\u0000\u01b8"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba"+
		"\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb"+
		"=\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0005\u001e\u0000\u0000\u01be\u01bf\u0007\u0002\u0000\u0000\u01bf\u01c0"+
		"\u0003\u0010\b\u0000\u01c0?\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005"+
		"\u0007\u0000\u0000\u01c2\u01c3\u0005\f\u0000\u0000\u01c3\u01c4\u0003H"+
		"$\u0000\u01c4\u01c5\u00057\u0000\u0000\u01c5\u01c6\u0003>\u001f\u0000"+
		"\u01c6\u01d3\u00057\u0000\u0000\u01c7\u01c8\u0005\u001e\u0000\u0000\u01c8"+
		"\u01c9\u00050\u0000\u0000\u01c9\u01d4\u0005\t\u0000\u0000\u01ca\u01cb"+
		"\u0005\u001e\u0000\u0000\u01cb\u01cc\u00051\u0000\u0000\u01cc\u01d4\u0005"+
		"\t\u0000\u0000\u01cd\u01ce\u0005\u001e\u0000\u0000\u01ce\u01cf\u00050"+
		"\u0000\u0000\u01cf\u01d4\u00050\u0000\u0000\u01d0\u01d1\u0005\u001e\u0000"+
		"\u0000\u01d1\u01d2\u00051\u0000\u0000\u01d2\u01d4\u00051\u0000\u0000\u01d3"+
		"\u01c7\u0001\u0000\u0000\u0000\u01d3\u01ca\u0001\u0000\u0000\u0000\u01d3"+
		"\u01cd\u0001\u0000\u0000\u0000\u01d3\u01d0\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d5\u01e0\u0005\u0011\u0000\u0000\u01d6"+
		"\u01da\u0005\u000e\u0000\u0000\u01d7\u01d9\u0003P(\u0000\u01d8\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8\u0001"+
		"\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dd\u0001"+
		"\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dd\u01df\u0005"+
		"\u000f\u0000\u0000\u01de\u01d6\u0001\u0000\u0000\u0000\u01df\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e1A\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0005\b\u0000\u0000\u01e4\u01e5\u0003F#\u0000"+
		"\u01e5C\u0001\u0000\u0000\u0000\u01e6\u01ea\u0005\b\u0000\u0000\u01e7"+
		"\u01e9\u0005\u000e\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea"+
		"\u01eb\u0001\u0000\u0000\u0000\u01eb\u01f0\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ed\u01ef\u0003P(\u0000\u01ee\u01ed\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f2\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f3\u01f5\u0005"+
		"\u000f\u0000\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f8\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f7E\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f9\u01fa\u0005\u0006\u0000\u0000\u01fa\u01fb\u0005\f\u0000"+
		"\u0000\u01fb\u01fc\u0003>\u001f\u0000\u01fc\u0200\u0005\u0011\u0000\u0000"+
		"\u01fd\u01ff\u0005\u000e\u0000\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000"+
		"\u01ff\u0202\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000"+
		"\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0206\u0001\u0000\u0000\u0000"+
		"\u0202\u0200\u0001\u0000\u0000\u0000\u0203\u0205\u0003P(\u0000\u0204\u0203"+
		"\u0001\u0000\u0000\u0000\u0205\u0208\u0001\u0000\u0000\u0000\u0206\u0204"+
		"\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u020c"+
		"\u0001\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0209\u020b"+
		"\u0005\u000f\u0000\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020b\u020e"+
		"\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020d"+
		"\u0001\u0000\u0000\u0000\u020d\u0212\u0001\u0000\u0000\u0000\u020e\u020c"+
		"\u0001\u0000\u0000\u0000\u020f\u0211\u0003B!\u0000\u0210\u020f\u0001\u0000"+
		"\u0000\u0000\u0211\u0214\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000"+
		"\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0216\u0001\u0000"+
		"\u0000\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0215\u0217\u0003D\""+
		"\u0000\u0216\u0215\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000"+
		"\u0000\u0217G\u0001\u0000\u0000\u0000\u0218\u021a\u0003N\'\u0000\u0219"+
		"\u0218\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a"+
		"\u021d\u0001\u0000\u0000\u0000\u021b\u021e\u0005\u001e\u0000\u0000\u021c"+
		"\u021e\u0003J%\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d\u021c\u0001"+
		"\u0000\u0000\u0000\u021e\u0226\u0001\u0000\u0000\u0000\u021f\u0222\u0005"+
		"5\u0000\u0000\u0220\u0223\u0005\u001e\u0000\u0000\u0221\u0223\u0003J%"+
		"\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0221\u0001\u0000\u0000"+
		"\u0000\u0223\u0225\u0001\u0000\u0000\u0000\u0224\u021f\u0001\u0000\u0000"+
		"\u0000\u0225\u0228\u0001\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000"+
		"\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227I\u0001\u0000\u0000\u0000"+
		"\u0228\u0226\u0001\u0000\u0000\u0000\u0229\u022a\u0005\u001e\u0000\u0000"+
		"\u022a\u022b\u0005/\u0000\u0000\u022b\u0230\u0003\u0010\b\u0000\u022c"+
		"\u022d\u0005\u001e\u0000\u0000\u022d\u022e\u0005/\u0000\u0000\u022e\u0230"+
		"\u0003L&\u0000\u022f\u0229\u0001\u0000\u0000\u0000\u022f\u022c\u0001\u0000"+
		"\u0000\u0000\u0230K\u0001\u0000\u0000\u0000\u0231\u0233\u0005\f\u0000"+
		"\u0000\u0232\u0231\u0001\u0000\u0000\u0000\u0233\u0236\u0001\u0000\u0000"+
		"\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000"+
		"\u0000\u0235\u0237\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000"+
		"\u0000\u0237\u023b\u0003>\u001f\u0000\u0238\u023a\u0005\u0011\u0000\u0000"+
		"\u0239\u0238\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000"+
		"\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000"+
		"\u023cM\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e"+
		"\u023f\u0007\u0003\u0000\u0000\u023fO\u0001\u0000\u0000\u0000\u0240\u0242"+
		"\u0003H$\u0000\u0241\u0240\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000"+
		"\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000"+
		"\u0000\u0000\u0244\u0249\u0001\u0000\u0000\u0000\u0245\u0249\u0003@ \u0000"+
		"\u0246\u0249\u0003F#\u0000\u0247\u0249\u0003<\u001e\u0000\u0248\u0241"+
		"\u0001\u0000\u0000\u0000\u0248\u0245\u0001\u0000\u0000\u0000\u0248\u0246"+
		"\u0001\u0000\u0000\u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0249Q\u0001"+
		"\u0000\u0000\u0000AUZ_emqv\u008e\u0098\u00a1\u00ad\u00b1\u00bd\u00c2\u00c6"+
		"\u00c9\u00d5\u00dc\u00e2\u00f3\u00f7\u00fb\u0102\u0108\u010a\u0114\u011f"+
		"\u012a\u012c\u013a\u013c\u0149\u0152\u015d\u016e\u017a\u0180\u0182\u018a"+
		"\u0191\u019d\u01a3\u01a6\u01b4\u01ba\u01d3\u01da\u01e0\u01ea\u01f0\u01f6"+
		"\u0200\u0206\u020c\u0212\u0216\u0219\u021d\u0222\u0226\u022f\u0234\u023b"+
		"\u0243\u0248";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}