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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1077678272L) != 0)) {
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
			match(IDENTIFIERNAME);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1077678272L) != 0)) {
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
		public LitralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_litral; }
	 
		public LitralContext() { }
		public void copyFrom(LitralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends LitralContext {
		public TerminalNode STRING_LITERAL() { return getToken(ReactParser.STRING_LITERAL, 0); }
		public StringLiteralContext(LitralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerLiteralContext extends LitralContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(ReactParser.INTEGER_LITERAL, 0); }
		public IntegerLiteralContext(LitralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LitralContext litral() throws RecognitionException {
		LitralContext _localctx = new LitralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_litral);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(INTEGER_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17920L) != 0)) {
				{
				setState(191);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPENED_CURLY_BRACES:
					{
					setState(189);
					element();
					}
					break;
				case STRING_LITERAL:
				case INTEGER_LITERAL:
					{
					setState(190);
					litral();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(193);
					match(COMMA);
					setState(196);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPENED_CURLY_BRACES:
						{
						setState(194);
						element();
						}
						break;
					case STRING_LITERAL:
					case INTEGER_LITERAL:
						{
						setState(195);
						litral();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(202);
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
			setState(205);
			match(OPENED_CURLY_BRACES);
			setState(206);
			match(IDENTIFIERNAME);
			setState(207);
			match(COLON);
			setState(208);
			litral();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(209);
				match(COMMA);
				setState(210);
				match(IDENTIFIERNAME);
				setState(211);
				match(COLON);
				setState(212);
				litral();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
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
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(220);
				arrowcomponent();
				}
				break;
			case FUNCTION:
				{
				setState(221);
				functionalcomponent();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(224);
			componentBody();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(225);
				match(SEMICOLON);
				}
				}
				setState(230);
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
			setState(231);
			match(FUNCTION);
			setState(232);
			match(IDENTIFIERNAME);
			setState(233);
			openbraces();
			setState(234);
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
		public ComponentBodyContext componentBody() {
			return getRuleContext(ComponentBodyContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(CONST);
			setState(237);
			match(IDENTIFIERNAME);
			setState(238);
			match(EQUAL);
			setState(239);
			openbraces();
			setState(240);
			match(ARROW);
			setState(241);
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
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(242);
				componentBody();
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
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST || _la==USEEFFECT) {
				{
				setState(245);
				hooks();
				}
			}

			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(248);
				match(RETURN);
				setState(249);
				match(OPENED_BRACES);
				}
			}

			setState(252);
			jsxElements();
			setState(253);
			match(CLOSED_BRACES);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(254);
					match(SEMICOLON);
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			setState(260);
			match(OPENED_BRACES);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1073758720L) != 0)) {
				{
				setState(263);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPENED_CURLY_BRACES:
				case IDENTIFIERNAME:
					{
					setState(261);
					attribute();
					}
					break;
				case STRING_LITERAL:
					{
					setState(262);
					match(STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
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
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				openTag();
				setState(271);
				tagContent();
				setState(272);
				closeTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
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
			setState(277);
			match(OPEN_TAG);
			setState(278);
			match(IDENTIFIERNAME);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIERNAME) {
				{
				{
				setState(279);
				match(IDENTIFIERNAME);
				setState(280);
				match(EQUAL);
				setState(281);
				match(OPENED_CURLY_BRACES);
				setState(282);
				match(IDENTIFIERNAME);
				setState(283);
				match(CLOSED_CURLY_BRACES);
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			match(SLASH);
			setState(290);
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
			setState(292);
			match(OPEN_TAG);
			setState(293);
			match(IDENTIFIERNAME);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1077952512L) != 0)) {
				{
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(294);
					attribute();
					}
					break;
				case 2:
					{
					setState(295);
					style();
					}
					break;
				case 3:
					{
					setState(296);
					functionattribute();
					}
					break;
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
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
			setState(304);
			match(OPEN_TAG);
			setState(305);
			match(SLASH);
			setState(306);
			match(IDENTIFIERNAME);
			setState(307);
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
			setState(309);
			match(OPEN_TAG);
			setState(310);
			match(IDENTIFIERNAME);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENED_CURLY_BRACES || _la==IDENTIFIERNAME) {
				{
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(311);
					attribute();
					}
					break;
				case 2:
					{
					setState(312);
					style();
					}
					break;
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			match(SLASH);
			setState(319);
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
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(IDENTIFIERNAME);
				}
				break;
			case 2:
				_localctx = new MultiattributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(OPENED_CURLY_BRACES);
				setState(323);
				match(IDENTIFIERNAME);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(324);
					match(COMMA);
					setState(325);
					match(IDENTIFIERNAME);
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(331);
				match(CLOSED_CURLY_BRACES);
				}
				break;
			case 3:
				_localctx = new DotattributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(332);
				match(OPENED_CURLY_BRACES);
				setState(333);
				match(IDENTIFIERNAME);
				setState(334);
				match(DOT);
				setState(337);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIERNAME:
					{
					setState(335);
					match(IDENTIFIERNAME);
					}
					break;
				case MAP:
					{
					setState(336);
					map();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(339);
				match(CLOSED_CURLY_BRACES);
				}
				}
				break;
			case 4:
				_localctx = new EqualttributeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				match(IDENTIFIERNAME);
				setState(341);
				match(EQUAL);
				setState(342);
				match(OPENED_CURLY_BRACES);
				setState(343);
				match(IDENTIFIERNAME);
				setState(344);
				match(DOT);
				setState(345);
				match(IDENTIFIERNAME);
				setState(346);
				match(CLOSED_CURLY_BRACES);
				}
				break;
			case 5:
				_localctx = new SelectatrributeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(347);
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
			setState(350);
			match(ONCLICK);
			setState(351);
			match(EQUAL);
			setState(352);
			match(OPENED_CURLY_BRACES);
			setState(353);
			function();
			setState(354);
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
			setState(356);
			match(MAP);
			setState(357);
			match(OPENED_BRACES);
			setState(358);
			openbraces();
			setState(359);
			match(ARROW);
			setState(360);
			match(OPENED_BRACES);
			setState(361);
			jsxElements();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLOSED_BRACES) {
				{
				{
				setState(362);
				match(CLOSED_BRACES);
				}
				}
				setState(367);
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
			setState(368);
			match(OPENED_CURLY_BRACES);
			setState(369);
			match(IDENTIFIERNAME);
			setState(370);
			match(ANDAND);
			setState(371);
			match(OPENED_BRACES);
			setState(372);
			jsxElements();
			setState(373);
			match(CLOSED_BRACES);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLOSED_CURLY_BRACES) {
				{
				{
				setState(374);
				match(CLOSED_CURLY_BRACES);
				}
				}
				setState(379);
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
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(383);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(380);
						attribute();
						}
						break;
					case 2:
						{
						setState(381);
						jsxElements();
						}
						break;
					case 3:
						{
						{
						setState(382);
						componentcall();
						}
						}
						break;
					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
			setState(388);
			match(IDENTIFIERNAME);
			setState(389);
			match(EQUAL);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENED_CURLY_BRACES) {
				{
				{
				setState(390);
				match(OPENED_CURLY_BRACES);
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			styleAttributes();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLOSED_CURLY_BRACES) {
				{
				{
				setState(397);
				match(CLOSED_CURLY_BRACES);
				}
				}
				setState(402);
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
			setState(403);
			match(IDENTIFIERNAME);
			setState(404);
			match(COLON);
			setState(405);
			match(STRING_LITERAL);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(406);
				match(COMMA);
				setState(407);
				match(IDENTIFIERNAME);
				setState(408);
				match(COLON);
				setState(409);
				match(STRING_LITERAL);
				}
				}
				setState(414);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			openbraces();
			setState(416);
			match(ARROW);
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(417);
				call();
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
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(420);
				match(CONST);
				}
			}

			setState(423);
			match(IDENTIFIERNAME);
			setState(424);
			match(EQUAL);
			setState(425);
			openbraces();
			setState(426);
			match(ARROW);
			setState(427);
			match(OPENED_CURLY_BRACES);
			setState(428);
			call();
			setState(429);
			match(CLOSED_CURLY_BRACES);
			setState(430);
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
			setState(432);
			match(IDENTIFIERNAME);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(433);
				match(DOT);
				setState(434);
				match(IDENTIFIERNAME);
				}
			}

			setState(437);
			openbraces();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(438);
				match(SEMICOLON);
				}
				}
				setState(443);
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
			setState(444);
			match(IDENTIFIERNAME);
			setState(445);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 985226842996736L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(446);
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
			setState(448);
			match(FOR);
			setState(449);
			match(OPENED_BRACES);
			setState(450);
			declaration();
			setState(451);
			match(SEMICOLON);
			setState(452);
			operation();
			setState(453);
			match(SEMICOLON);
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(454);
				match(IDENTIFIERNAME);
				setState(455);
				match(PLUS);
				setState(456);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				{
				setState(457);
				match(IDENTIFIERNAME);
				setState(458);
				match(MINUS);
				setState(459);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				{
				setState(460);
				match(IDENTIFIERNAME);
				setState(461);
				match(PLUS);
				setState(462);
				match(PLUS);
				}
				break;
			case 4:
				{
				setState(463);
				match(IDENTIFIERNAME);
				setState(464);
				match(MINUS);
				setState(465);
				match(MINUS);
				}
				break;
			}
			setState(468);
			match(CLOSED_BRACES);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENED_CURLY_BRACES) {
				{
				{
				setState(469);
				match(OPENED_CURLY_BRACES);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1077678272L) != 0)) {
					{
					{
					setState(470);
					statement();
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(476);
				match(CLOSED_CURLY_BRACES);
				}
				}
				setState(481);
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
			setState(482);
			match(ELSE);
			setState(483);
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
			setState(485);
			match(ELSE);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENED_CURLY_BRACES) {
				{
				{
				setState(486);
				match(OPENED_CURLY_BRACES);
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(492);
					statement();
					}
					} 
				}
				setState(497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(501);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(498);
					match(CLOSED_CURLY_BRACES);
					}
					} 
				}
				setState(503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
			setState(504);
			match(IF);
			setState(505);
			match(OPENED_BRACES);
			setState(506);
			operation();
			setState(507);
			match(CLOSED_BRACES);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENED_CURLY_BRACES) {
				{
				{
				setState(508);
				match(OPENED_CURLY_BRACES);
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(514);
					statement();
					}
					} 
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(520);
					match(CLOSED_CURLY_BRACES);
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(526);
					elseIf_condition();
					}
					} 
				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(532);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
			setState(535);
			type();
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(536);
				match(IDENTIFIERNAME);
				}
				break;
			case 2:
				{
				setState(537);
				assignment();
				}
				break;
			}
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(540);
				match(COMMA);
				setState(543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(541);
					match(IDENTIFIERNAME);
					}
					break;
				case 2:
					{
					setState(542);
					assignment();
					}
					break;
				}
				}
				}
				setState(549);
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
	public static class ExpressionAssignmentContext extends AssignmentContext {
		public List<TerminalNode> IDENTIFIERNAME() { return getTokens(ReactParser.IDENTIFIERNAME); }
		public TerminalNode IDENTIFIERNAME(int i) {
			return getToken(ReactParser.IDENTIFIERNAME, i);
		}
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public ExpressionAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpressionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpressionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralAssignmentContext extends AssignmentContext {
		public List<TerminalNode> IDENTIFIERNAME() { return getTokens(ReactParser.IDENTIFIERNAME); }
		public TerminalNode IDENTIFIERNAME(int i) {
			return getToken(ReactParser.IDENTIFIERNAME, i);
		}
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public LitralContext litral() {
			return getRuleContext(LitralContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
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
		int _la;
		try {
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new LiteralAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				match(IDENTIFIERNAME);
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(551);
					match(DOT);
					setState(552);
					match(IDENTIFIERNAME);
					}
				}

				setState(555);
				match(EQUAL);
				setState(556);
				litral();
				}
				break;
			case 2:
				_localctx = new ExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				match(IDENTIFIERNAME);
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(558);
					match(DOT);
					setState(559);
					match(IDENTIFIERNAME);
					}
				}

				setState(562);
				match(EQUAL);
				setState(563);
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
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENED_BRACES) {
				{
				{
				setState(566);
				match(OPENED_BRACES);
				}
				}
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(572);
			operation();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLOSED_BRACES) {
				{
				{
				setState(573);
				match(CLOSED_BRACES);
				}
				}
				setState(578);
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
			setState(579);
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
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case BOOLEAN:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(582); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(581);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(584); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				forloop();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(587);
				if_();
				}
				break;
			case IDENTIFIERNAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(588);
				call();
				}
				break;
			case OPENED_BRACES:
				enterOuterAlt(_localctx, 5);
				{
				setState(589);
				function();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\u0004\u00019\u0251\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u00bc\b\b\u0001\t\u0001\t\u0003"+
		"\t\u00c0\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c5\b\t\u0005\t\u00c7\b"+
		"\t\n\t\f\t\u00ca\t\t\u0003\t\u00cc\b\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00d6\b\n\n\n\f\n\u00d9\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u00df\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00e3\b\u000b\n\u000b\f\u000b\u00e6\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00f4\b\r\u0001\u000e\u0003\u000e\u00f7\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00fb\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0100\b\u000e\n\u000e\f\u000e\u0103\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0108\b\u000f\n\u000f\f\u000f"+
		"\u010b\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0114\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u011d\b\u0011\n\u0011\f\u0011\u0120\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u012a\b\u0012\n\u0012\f\u0012\u012d\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u013a\b\u0014\n\u0014"+
		"\f\u0014\u013d\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0147\b\u0015"+
		"\n\u0015\f\u0015\u014a\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0152\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u015d\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u016c"+
		"\b\u0017\n\u0017\f\u0017\u016f\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0178\b\u0018"+
		"\n\u0018\f\u0018\u017b\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u0180\b\u0019\n\u0019\f\u0019\u0183\t\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u0188\b\u001a\n\u001a\f\u001a\u018b\t\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u018f\b\u001a\n\u001a\f\u001a\u0192\t\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u019b\b\u001b\n\u001b\f\u001b\u019e\t\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01a3\b\u001c\u0001\u001d\u0003"+
		"\u001d\u01a6\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u01b4\b\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u01b8\b\u001e\n\u001e\f\u001e\u01bb\t\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u01d3\b \u0001 \u0001 \u0001 \u0005 \u01d8\b \n \f \u01db"+
		"\t \u0001 \u0005 \u01de\b \n \f \u01e1\t \u0001!\u0001!\u0001!\u0001\""+
		"\u0001\"\u0005\"\u01e8\b\"\n\"\f\"\u01eb\t\"\u0001\"\u0005\"\u01ee\b\""+
		"\n\"\f\"\u01f1\t\"\u0001\"\u0005\"\u01f4\b\"\n\"\f\"\u01f7\t\"\u0001#"+
		"\u0001#\u0001#\u0001#\u0001#\u0005#\u01fe\b#\n#\f#\u0201\t#\u0001#\u0005"+
		"#\u0204\b#\n#\f#\u0207\t#\u0001#\u0005#\u020a\b#\n#\f#\u020d\t#\u0001"+
		"#\u0005#\u0210\b#\n#\f#\u0213\t#\u0001#\u0003#\u0216\b#\u0001$\u0001$"+
		"\u0001$\u0003$\u021b\b$\u0001$\u0001$\u0001$\u0003$\u0220\b$\u0005$\u0222"+
		"\b$\n$\f$\u0225\t$\u0001%\u0001%\u0001%\u0003%\u022a\b%\u0001%\u0001%"+
		"\u0001%\u0001%\u0001%\u0003%\u0231\b%\u0001%\u0001%\u0003%\u0235\b%\u0001"+
		"&\u0005&\u0238\b&\n&\f&\u023b\t&\u0001&\u0001&\u0005&\u023f\b&\n&\f&\u0242"+
		"\t&\u0001\'\u0001\'\u0001(\u0004(\u0247\b(\u000b(\f(\u0248\u0001(\u0001"+
		"(\u0001(\u0001(\u0003(\u024f\b(\u0001(\u0000\u0000)\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNP\u0000\u0003\u0002\u0000\f\f\u000e\u000e\u0002"+
		"\u0000 #/1\u0001\u0000\u0012\u0015\u0277\u0000e\u0001\u0000\u0000\u0000"+
		"\u0002g\u0001\u0000\u0000\u0000\u0004v\u0001\u0000\u0000\u0000\u0006x"+
		"\u0001\u0000\u0000\u0000\b\u0086\u0001\u0000\u0000\u0000\n\u0091\u0001"+
		"\u0000\u0000\u0000\f\u00a7\u0001\u0000\u0000\u0000\u000e\u00b1\u0001\u0000"+
		"\u0000\u0000\u0010\u00bb\u0001\u0000\u0000\u0000\u0012\u00cb\u0001\u0000"+
		"\u0000\u0000\u0014\u00cd\u0001\u0000\u0000\u0000\u0016\u00de\u0001\u0000"+
		"\u0000\u0000\u0018\u00e7\u0001\u0000\u0000\u0000\u001a\u00ec\u0001\u0000"+
		"\u0000\u0000\u001c\u00f6\u0001\u0000\u0000\u0000\u001e\u0104\u0001\u0000"+
		"\u0000\u0000 \u0113\u0001\u0000\u0000\u0000\"\u0115\u0001\u0000\u0000"+
		"\u0000$\u0124\u0001\u0000\u0000\u0000&\u0130\u0001\u0000\u0000\u0000("+
		"\u0135\u0001\u0000\u0000\u0000*\u015c\u0001\u0000\u0000\u0000,\u015e\u0001"+
		"\u0000\u0000\u0000.\u0164\u0001\u0000\u0000\u00000\u0170\u0001\u0000\u0000"+
		"\u00002\u0181\u0001\u0000\u0000\u00004\u0184\u0001\u0000\u0000\u00006"+
		"\u0193\u0001\u0000\u0000\u00008\u019f\u0001\u0000\u0000\u0000:\u01a5\u0001"+
		"\u0000\u0000\u0000<\u01b0\u0001\u0000\u0000\u0000>\u01bc\u0001\u0000\u0000"+
		"\u0000@\u01c0\u0001\u0000\u0000\u0000B\u01e2\u0001\u0000\u0000\u0000D"+
		"\u01e5\u0001\u0000\u0000\u0000F\u01f8\u0001\u0000\u0000\u0000H\u0217\u0001"+
		"\u0000\u0000\u0000J\u0234\u0001\u0000\u0000\u0000L\u0239\u0001\u0000\u0000"+
		"\u0000N\u0243\u0001\u0000\u0000\u0000P\u024e\u0001\u0000\u0000\u0000R"+
		"T\u0003P(\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US"+
		"\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000Vf\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000XZ\u0005\u0002\u0000\u0000Y[\u0003\u000e"+
		"\u0007\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[_\u0001"+
		"\u0000\u0000\u0000\\^\u0003\u001a\r\u0000]\\\u0001\u0000\u0000\u0000^"+
		"a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bf\u0003\u0002"+
		"\u0001\u0000cf\u0003\u0016\u000b\u0000df\u0003\u0004\u0002\u0000eU\u0001"+
		"\u0000\u0000\u0000eX\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000f\u0001\u0001\u0000\u0000\u0000gh\u0003\u001a"+
		"\r\u0000hi\u0003\u001c\u000e\u0000im\u0005\u000f\u0000\u0000jl\u00057"+
		"\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000pr\u0003\f\u0006\u0000qp\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000r\u0003\u0001\u0000\u0000\u0000sw\u0003\u0006"+
		"\u0003\u0000tw\u0003\b\u0004\u0000uw\u0003\n\u0005\u0000vs\u0001\u0000"+
		"\u0000\u0000vt\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000w\u0005"+
		"\u0001\u0000\u0000\u0000xy\u0005\u0003\u0000\u0000yz\u0005\r\u0000\u0000"+
		"z{\u0005\u001e\u0000\u0000{|\u00055\u0000\u0000|}\u0005\u001e\u0000\u0000"+
		"}~\u0005\u0010\u0000\u0000~\u007f\u0005/\u0000\u0000\u007f\u0080\u0005"+
		"\u001b\u0000\u0000\u0080\u0081\u0005\f\u0000\u0000\u0081\u0082\u0005\u001e"+
		"\u0000\u0000\u0082\u0083\u0005\u0011\u0000\u0000\u0083\u0084\u00057\u0000"+
		"\u0000\u0084\u0085\u0003:\u001d\u0000\u0085\u0007\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005\u0003\u0000\u0000\u0087\u0088\u0005\u001e\u0000\u0000"+
		"\u0088\u0089\u0005/\u0000\u0000\u0089\u008a\u0005\u001c\u0000\u0000\u008a"+
		"\u008e\u0003\u001e\u000f\u0000\u008b\u008d\u00057\u0000\u0000\u008c\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\t\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		"\u001d\u0000\u0000\u0092\u0093\u0005\f\u0000\u0000\u0093\u0094\u00038"+
		"\u001c\u0000\u0094\u0098\u0005\u000e\u0000\u0000\u0095\u0097\u0003P(\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005\u000f\u0000\u0000\u009c\u009d\u00055\u0000\u0000\u009d"+
		"\u00a1\u0005\r\u0000\u0000\u009e\u00a0\u0003*\u0015\u0000\u009f\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005\u0010\u0000\u0000\u00a5\u00a6\u0005\u0011\u0000\u0000\u00a6\u000b"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0019\u0000\u0000\u00a8\u00a9"+
		"\u0005\u001a\u0000\u0000\u00a9\u00ad\u0005\u001e\u0000\u0000\u00aa\u00ac"+
		"\u00057\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ae\r\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b2\u0005\u0003\u0000\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005\u001e\u0000\u0000\u00b4\u00b5\u0005/\u0000"+
		"\u0000\u00b5\u00b6\u0005\r\u0000\u0000\u00b6\u00b7\u0003\u0012\t\u0000"+
		"\u00b7\u00b8\u0005\u0010\u0000\u0000\u00b8\u000f\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bc\u0005\n\u0000\u0000\u00ba\u00bc\u0005\t\u0000\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u0011\u0001\u0000\u0000\u0000\u00bd\u00c0\u0003\u0014\n\u0000\u00be\u00c0"+
		"\u0003\u0010\b\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c8\u0001\u0000\u0000\u0000\u00c1\u00c4\u0005"+
		"5\u0000\u0000\u00c2\u00c5\u0003\u0014\n\u0000\u00c3\u00c5\u0003\u0010"+
		"\b\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00bf\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u0013\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0005\u000e\u0000\u0000\u00ce\u00cf\u0005\u001e\u0000"+
		"\u0000\u00cf\u00d0\u00056\u0000\u0000\u00d0\u00d7\u0003\u0010\b\u0000"+
		"\u00d1\u00d2\u00055\u0000\u0000\u00d2\u00d3\u0005\u001e\u0000\u0000\u00d3"+
		"\u00d4\u00056\u0000\u0000\u00d4\u00d6\u0003\u0010\b\u0000\u00d5\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0005\u000f\u0000\u0000\u00db\u0015\u0001\u0000\u0000\u0000\u00dc\u00df"+
		"\u0003\u001a\r\u0000\u00dd\u00df\u0003\u0018\f\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e4\u0003\u001c\u000e\u0000\u00e1\u00e3\u0005"+
		"7\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e5\u0017\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0005\u0001\u0000\u0000\u00e8\u00e9\u0005\u001e"+
		"\u0000\u0000\u00e9\u00ea\u0003\u001e\u000f\u0000\u00ea\u00eb\u0005\u000e"+
		"\u0000\u0000\u00eb\u0019\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u0003"+
		"\u0000\u0000\u00ed\u00ee\u0005\u001e\u0000\u0000\u00ee\u00ef\u0005/\u0000"+
		"\u0000\u00ef\u00f0\u0003\u001e\u000f\u0000\u00f0\u00f1\u0005&\u0000\u0000"+
		"\u00f1\u00f3\u0007\u0000\u0000\u0000\u00f2\u00f4\u0003\u001c\u000e\u0000"+
		"\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f4\u001b\u0001\u0000\u0000\u0000\u00f5\u00f7\u0003\u0004\u0002\u0000"+
		"\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0018\u0000\u0000"+
		"\u00f9\u00fb\u0005\f\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0003 \u0010\u0000\u00fd\u0101\u0005\u0011\u0000\u0000\u00fe\u0100"+
		"\u00057\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0103\u0001"+
		"\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001"+
		"\u0000\u0000\u0000\u0102\u001d\u0001\u0000\u0000\u0000\u0103\u0101\u0001"+
		"\u0000\u0000\u0000\u0104\u0109\u0005\f\u0000\u0000\u0105\u0108\u0003*"+
		"\u0015\u0000\u0106\u0108\u0005\t\u0000\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000"+
		"\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0005\u0011\u0000\u0000\u010d\u001f\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0003$\u0012\u0000\u010f\u0110\u00032\u0019\u0000\u0110"+
		"\u0111\u0003&\u0013\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0114"+
		"\u0003(\u0014\u0000\u0113\u010e\u0001\u0000\u0000\u0000\u0113\u0112\u0001"+
		"\u0000\u0000\u0000\u0114!\u0001\u0000\u0000\u0000\u0115\u0116\u0005 \u0000"+
		"\u0000\u0116\u011e\u0005\u001e\u0000\u0000\u0117\u0118\u0005\u001e\u0000"+
		"\u0000\u0118\u0119\u0005/\u0000\u0000\u0119\u011a\u0005\u000e\u0000\u0000"+
		"\u011a\u011b\u0005\u001e\u0000\u0000\u011b\u011d\u0005\u000f\u0000\u0000"+
		"\u011c\u0117\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000"+
		"\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000"+
		"\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0005\u001f\u0000\u0000\u0122\u0123\u0005!\u0000\u0000\u0123"+
		"#\u0001\u0000\u0000\u0000\u0124\u0125\u0005 \u0000\u0000\u0125\u012b\u0005"+
		"\u001e\u0000\u0000\u0126\u012a\u0003*\u0015\u0000\u0127\u012a\u00034\u001a"+
		"\u0000\u0128\u012a\u0003,\u0016\u0000\u0129\u0126\u0001\u0000\u0000\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000"+
		"\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012e\u0001\u0000\u0000\u0000"+
		"\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u012f\u0005!\u0000\u0000\u012f"+
		"%\u0001\u0000\u0000\u0000\u0130\u0131\u0005 \u0000\u0000\u0131\u0132\u0005"+
		"\u001f\u0000\u0000\u0132\u0133\u0005\u001e\u0000\u0000\u0133\u0134\u0005"+
		"!\u0000\u0000\u0134\'\u0001\u0000\u0000\u0000\u0135\u0136\u0005 \u0000"+
		"\u0000\u0136\u013b\u0005\u001e\u0000\u0000\u0137\u013a\u0003*\u0015\u0000"+
		"\u0138\u013a\u00034\u001a\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b"+
		"\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c"+
		"\u013e\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0005\u001f\u0000\u0000\u013f\u0140\u0005!\u0000\u0000\u0140)\u0001"+
		"\u0000\u0000\u0000\u0141\u015d\u0005\u001e\u0000\u0000\u0142\u0143\u0005"+
		"\u000e\u0000\u0000\u0143\u0148\u0005\u001e\u0000\u0000\u0144\u0145\u0005"+
		"5\u0000\u0000\u0145\u0147\u0005\u001e\u0000\u0000\u0146\u0144\u0001\u0000"+
		"\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014b\u0001\u0000"+
		"\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u015d\u0005\u000f"+
		"\u0000\u0000\u014c\u014d\u0005\u000e\u0000\u0000\u014d\u014e\u0005\u001e"+
		"\u0000\u0000\u014e\u0151\u0005\u0004\u0000\u0000\u014f\u0152\u0005\u001e"+
		"\u0000\u0000\u0150\u0152\u0003.\u0017\u0000\u0151\u014f\u0001\u0000\u0000"+
		"\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000"+
		"\u0000\u0153\u015d\u0005\u000f\u0000\u0000\u0154\u0155\u0005\u001e\u0000"+
		"\u0000\u0155\u0156\u0005/\u0000\u0000\u0156\u0157\u0005\u000e\u0000\u0000"+
		"\u0157\u0158\u0005\u001e\u0000\u0000\u0158\u0159\u0005\u0004\u0000\u0000"+
		"\u0159\u015a\u0005\u001e\u0000\u0000\u015a\u015d\u0005\u000f\u0000\u0000"+
		"\u015b\u015d\u00030\u0018\u0000\u015c\u0141\u0001\u0000\u0000\u0000\u015c"+
		"\u0142\u0001\u0000\u0000\u0000\u015c\u014c\u0001\u0000\u0000\u0000\u015c"+
		"\u0154\u0001\u0000\u0000\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015d"+
		"+\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u0016\u0000\u0000\u015f\u0160"+
		"\u0005/\u0000\u0000\u0160\u0161\u0005\u000e\u0000\u0000\u0161\u0162\u0003"+
		"8\u001c\u0000\u0162\u0163\u0005\u000f\u0000\u0000\u0163-\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0005\u0005\u0000\u0000\u0165\u0166\u0005\f\u0000\u0000"+
		"\u0166\u0167\u0003\u001e\u000f\u0000\u0167\u0168\u0005&\u0000\u0000\u0168"+
		"\u0169\u0005\f\u0000\u0000\u0169\u016d\u0003 \u0010\u0000\u016a\u016c"+
		"\u0005\u0011\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c\u016f"+
		"\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0001\u0000\u0000\u0000\u016e/\u0001\u0000\u0000\u0000\u016f\u016d\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0005\u000e\u0000\u0000\u0171\u0172\u0005"+
		"\u001e\u0000\u0000\u0172\u0173\u0005%\u0000\u0000\u0173\u0174\u0005\f"+
		"\u0000\u0000\u0174\u0175\u0003 \u0010\u0000\u0175\u0179\u0005\u0011\u0000"+
		"\u0000\u0176\u0178\u0005\u000f\u0000\u0000\u0177\u0176\u0001\u0000\u0000"+
		"\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000"+
		"\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a1\u0001\u0000\u0000\u0000"+
		"\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u0180\u0003*\u0015\u0000\u017d"+
		"\u0180\u0003 \u0010\u0000\u017e\u0180\u0003\"\u0011\u0000\u017f\u017c"+
		"\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u017e"+
		"\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f"+
		"\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u01823\u0001"+
		"\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0185\u0005"+
		"\u001e\u0000\u0000\u0185\u0189\u0005/\u0000\u0000\u0186\u0188\u0005\u000e"+
		"\u0000\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000"+
		"\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000"+
		"\u0000\u0000\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000"+
		"\u0000\u0000\u018c\u0190\u00036\u001b\u0000\u018d\u018f\u0005\u000f\u0000"+
		"\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f\u0192\u0001\u0000\u0000"+
		"\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000"+
		"\u0000\u01915\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000"+
		"\u0193\u0194\u0005\u001e\u0000\u0000\u0194\u0195\u00056\u0000\u0000\u0195"+
		"\u019c\u0005\t\u0000\u0000\u0196\u0197\u00055\u0000\u0000\u0197\u0198"+
		"\u0005\u001e\u0000\u0000\u0198\u0199\u00056\u0000\u0000\u0199\u019b\u0005"+
		"\t\u0000\u0000\u019a\u0196\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000"+
		"\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000"+
		"\u0000\u0000\u019d7\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000"+
		"\u0000\u019f\u01a0\u0003\u001e\u000f\u0000\u01a0\u01a2\u0005&\u0000\u0000"+
		"\u01a1\u01a3\u0003<\u001e\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a39\u0001\u0000\u0000\u0000\u01a4\u01a6"+
		"\u0005\u0003\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\u0005\u001e\u0000\u0000\u01a8\u01a9\u0005/\u0000\u0000\u01a9\u01aa\u0003"+
		"\u001e\u000f\u0000\u01aa\u01ab\u0005&\u0000\u0000\u01ab\u01ac\u0005\u000e"+
		"\u0000\u0000\u01ac\u01ad\u0003<\u001e\u0000\u01ad\u01ae\u0005\u000f\u0000"+
		"\u0000\u01ae\u01af\u00057\u0000\u0000\u01af;\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b3\u0005\u001e\u0000\u0000\u01b1\u01b2\u0005\u0004\u0000\u0000\u01b2"+
		"\u01b4\u0005\u001e\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b9\u0003\u001e\u000f\u0000\u01b6\u01b8\u00057\u0000\u0000\u01b7\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba=\u0001"+
		"\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005"+
		"\u001e\u0000\u0000\u01bd\u01be\u0007\u0001\u0000\u0000\u01be\u01bf\u0003"+
		"\u0010\b\u0000\u01bf?\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005\u0007"+
		"\u0000\u0000\u01c1\u01c2\u0005\f\u0000\u0000\u01c2\u01c3\u0003H$\u0000"+
		"\u01c3\u01c4\u00057\u0000\u0000\u01c4\u01c5\u0003>\u001f\u0000\u01c5\u01d2"+
		"\u00057\u0000\u0000\u01c6\u01c7\u0005\u001e\u0000\u0000\u01c7\u01c8\u0005"+
		"0\u0000\u0000\u01c8\u01d3\u0005\t\u0000\u0000\u01c9\u01ca\u0005\u001e"+
		"\u0000\u0000\u01ca\u01cb\u00051\u0000\u0000\u01cb\u01d3\u0005\t\u0000"+
		"\u0000\u01cc\u01cd\u0005\u001e\u0000\u0000\u01cd\u01ce\u00050\u0000\u0000"+
		"\u01ce\u01d3\u00050\u0000\u0000\u01cf\u01d0\u0005\u001e\u0000\u0000\u01d0"+
		"\u01d1\u00051\u0000\u0000\u01d1\u01d3\u00051\u0000\u0000\u01d2\u01c6\u0001"+
		"\u0000\u0000\u0000\u01d2\u01c9\u0001\u0000\u0000\u0000\u01d2\u01cc\u0001"+
		"\u0000\u0000\u0000\u01d2\u01cf\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d4\u01df\u0005\u0011\u0000\u0000\u01d5\u01d9\u0005"+
		"\u000e\u0000\u0000\u01d6\u01d8\u0003P(\u0000\u01d7\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01dc\u0001\u0000\u0000"+
		"\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc\u01de\u0005\u000f\u0000"+
		"\u0000\u01dd\u01d5\u0001\u0000\u0000\u0000\u01de\u01e1\u0001\u0000\u0000"+
		"\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000"+
		"\u0000\u01e0A\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e3\u0005\b\u0000\u0000\u01e3\u01e4\u0003F#\u0000\u01e4C\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e9\u0005\b\u0000\u0000\u01e6\u01e8\u0005\u000e"+
		"\u0000\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e8\u01eb\u0001\u0000"+
		"\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ea\u01ef\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ee\u0003P(\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000"+
		"\u01ee\u01f1\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000"+
		"\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f2\u01f4\u0005\u000f\u0000\u0000"+
		"\u01f3\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f7\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f6E\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f9\u0005\u0006\u0000\u0000\u01f9\u01fa\u0005\f\u0000\u0000\u01fa\u01fb"+
		"\u0003>\u001f\u0000\u01fb\u01ff\u0005\u0011\u0000\u0000\u01fc\u01fe\u0005"+
		"\u000e\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000\u01fe\u0201\u0001"+
		"\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200\u0001"+
		"\u0000\u0000\u0000\u0200\u0205\u0001\u0000\u0000\u0000\u0201\u01ff\u0001"+
		"\u0000\u0000\u0000\u0202\u0204\u0003P(\u0000\u0203\u0202\u0001\u0000\u0000"+
		"\u0000\u0204\u0207\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000"+
		"\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u020b\u0001\u0000\u0000"+
		"\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0208\u020a\u0005\u000f\u0000"+
		"\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u020a\u020d\u0001\u0000\u0000"+
		"\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000"+
		"\u0000\u020c\u0211\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000"+
		"\u0000\u020e\u0210\u0003B!\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u0210"+
		"\u0213\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211"+
		"\u0212\u0001\u0000\u0000\u0000\u0212\u0215\u0001\u0000\u0000\u0000\u0213"+
		"\u0211\u0001\u0000\u0000\u0000\u0214\u0216\u0003D\"\u0000\u0215\u0214"+
		"\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216G\u0001"+
		"\u0000\u0000\u0000\u0217\u021a\u0003N\'\u0000\u0218\u021b\u0005\u001e"+
		"\u0000\u0000\u0219\u021b\u0003J%\u0000\u021a\u0218\u0001\u0000\u0000\u0000"+
		"\u021a\u0219\u0001\u0000\u0000\u0000\u021b\u0223\u0001\u0000\u0000\u0000"+
		"\u021c\u021f\u00055\u0000\u0000\u021d\u0220\u0005\u001e\u0000\u0000\u021e"+
		"\u0220\u0003J%\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f\u021e\u0001"+
		"\u0000\u0000\u0000\u0220\u0222\u0001\u0000\u0000\u0000\u0221\u021c\u0001"+
		"\u0000\u0000\u0000\u0222\u0225\u0001\u0000\u0000\u0000\u0223\u0221\u0001"+
		"\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224I\u0001\u0000"+
		"\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0226\u0229\u0005\u001e"+
		"\u0000\u0000\u0227\u0228\u0005\u0004\u0000\u0000\u0228\u022a\u0005\u001e"+
		"\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000"+
		"\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022c\u0005/\u0000"+
		"\u0000\u022c\u0235\u0003\u0010\b\u0000\u022d\u0230\u0005\u001e\u0000\u0000"+
		"\u022e\u022f\u0005\u0004\u0000\u0000\u022f\u0231\u0005\u001e\u0000\u0000"+
		"\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000"+
		"\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0233\u0005/\u0000\u0000\u0233"+
		"\u0235\u0003L&\u0000\u0234\u0226\u0001\u0000\u0000\u0000\u0234\u022d\u0001"+
		"\u0000\u0000\u0000\u0235K\u0001\u0000\u0000\u0000\u0236\u0238\u0005\f"+
		"\u0000\u0000\u0237\u0236\u0001\u0000\u0000\u0000\u0238\u023b\u0001\u0000"+
		"\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000"+
		"\u0000\u0000\u023a\u023c\u0001\u0000\u0000\u0000\u023b\u0239\u0001\u0000"+
		"\u0000\u0000\u023c\u0240\u0003>\u001f\u0000\u023d\u023f\u0005\u0011\u0000"+
		"\u0000\u023e\u023d\u0001\u0000\u0000\u0000\u023f\u0242\u0001\u0000\u0000"+
		"\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000"+
		"\u0000\u0241M\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000"+
		"\u0243\u0244\u0007\u0002\u0000\u0000\u0244O\u0001\u0000\u0000\u0000\u0245"+
		"\u0247\u0003H$\u0000\u0246\u0245\u0001\u0000\u0000\u0000\u0247\u0248\u0001"+
		"\u0000\u0000\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0248\u0249\u0001"+
		"\u0000\u0000\u0000\u0249\u024f\u0001\u0000\u0000\u0000\u024a\u024f\u0003"+
		"@ \u0000\u024b\u024f\u0003F#\u0000\u024c\u024f\u0003<\u001e\u0000\u024d"+
		"\u024f\u00038\u001c\u0000\u024e\u0246\u0001\u0000\u0000\u0000\u024e\u024a"+
		"\u0001\u0000\u0000\u0000\u024e\u024b\u0001\u0000\u0000\u0000\u024e\u024c"+
		"\u0001\u0000\u0000\u0000\u024e\u024d\u0001\u0000\u0000\u0000\u024fQ\u0001"+
		"\u0000\u0000\u0000CUZ_emqv\u008e\u0098\u00a1\u00ad\u00b1\u00bb\u00bf\u00c4"+
		"\u00c8\u00cb\u00d7\u00de\u00e4\u00f3\u00f6\u00fa\u0101\u0107\u0109\u0113"+
		"\u011e\u0129\u012b\u0139\u013b\u0148\u0151\u015c\u016d\u0179\u017f\u0181"+
		"\u0189\u0190\u019c\u01a2\u01a5\u01b3\u01b9\u01d2\u01d9\u01df\u01e9\u01ef"+
		"\u01f5\u01ff\u0205\u020b\u0211\u0215\u021a\u021f\u0223\u0229\u0230\u0234"+
		"\u0239\u0240\u0248\u024e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}