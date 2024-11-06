// Generated from HTWGLoxParser.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTWGLoxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER_LITERAL=1, STRING_LITERAL=2, TRUE=3, FALSE=4, FUNC=5, RETURN=6, 
		VAR=7, NUM=8, STR=9, BOOL=10, PRINT=11, IF=12, ELSE=13, FOR=14, IDENTIFIER=15, 
		COMMA=16, COLON=17, SEMICOLON=18, LPAREN=19, RPAREN=20, LCBRACE=21, RCBRACE=22, 
		ARROW=23, MINUS=24, SLASH=25, STAR=26, PLUS=27, UNEQUAL=28, EXCLAMATION_MARK=29, 
		EQUAL=30, ASSIGN=31, GREATER_EQUAL=32, LESS_EQUAL=33, LESS=34, GREATER=35, 
		PERCENT=36, BOOL_AND=37, BOOL_OR=38, WS=39, COMMENT=40, LINE_COMMENT=41;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_func_decl = 2, RULE_param_list = 3, 
		RULE_var_decl = 4, RULE_typed_name = 5, RULE_type = 6, RULE_statement = 7, 
		RULE_print_stmt = 8, RULE_if_stmt = 9, RULE_for_stmt = 10, RULE_assign_stmt = 11, 
		RULE_assign = 12, RULE_return_stmt = 13, RULE_expression_stmt = 14, RULE_declaration_stmt = 15, 
		RULE_block_stmt = 16, RULE_expression = 17, RULE_bool_or_expr = 18, RULE_bool_and_expr = 19, 
		RULE_equality_expr = 20, RULE_comparison_expr = 21, RULE_term_expr = 22, 
		RULE_factor_expr = 23, RULE_negation_expr = 24, RULE_call_expr = 25, RULE_arg_list = 26, 
		RULE_primary_expr = 27, RULE_grouping_expr = 28, RULE_literal = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "func_decl", "param_list", "var_decl", "typed_name", 
			"type", "statement", "print_stmt", "if_stmt", "for_stmt", "assign_stmt", 
			"assign", "return_stmt", "expression_stmt", "declaration_stmt", "block_stmt", 
			"expression", "bool_or_expr", "bool_and_expr", "equality_expr", "comparison_expr", 
			"term_expr", "factor_expr", "negation_expr", "call_expr", "arg_list", 
			"primary_expr", "grouping_expr", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'true'", "'false'", "'func'", "'return'", "'var'", 
			"'num'", "'str'", "'bool'", "'print'", "'if'", "'else'", "'for'", null, 
			"','", "':'", "';'", "'('", "')'", "'{'", "'}'", "'->'", "'-'", "'/'", 
			"'*'", "'+'", "'!='", "'!'", "'=='", "'='", "'>='", "'<='", "'<'", "'>'", 
			"'%'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER_LITERAL", "STRING_LITERAL", "TRUE", "FALSE", "FUNC", "RETURN", 
			"VAR", "NUM", "STR", "BOOL", "PRINT", "IF", "ELSE", "FOR", "IDENTIFIER", 
			"COMMA", "COLON", "SEMICOLON", "LPAREN", "RPAREN", "LCBRACE", "RCBRACE", 
			"ARROW", "MINUS", "SLASH", "STAR", "PLUS", "UNEQUAL", "EXCLAMATION_MARK", 
			"EQUAL", "ASSIGN", "GREATER_EQUAL", "LESS_EQUAL", "LESS", "GREATER", 
			"PERCENT", "BOOL_AND", "BOOL_OR", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "HTWGLoxParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTWGLoxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HTWGLoxParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_LITERAL) | (1L << STRING_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << FUNC) | (1L << RETURN) | (1L << VAR) | (1L << PRINT) | (1L << IF) | (1L << FOR) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << LCBRACE) | (1L << MINUS) | (1L << EXCLAMATION_MARK))) != 0)) {
				{
				{
				setState(60);
				statement();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(EOF);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				func_decl();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				var_decl();
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

	public static class Func_declContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(HTWGLoxParser.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTWGLoxParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(HTWGLoxParser.LPAREN, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HTWGLoxParser.RPAREN, 0); }
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(HTWGLoxParser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitFunc_decl(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(FUNC);
			setState(73);
			match(IDENTIFIER);
			setState(74);
			match(LPAREN);
			setState(75);
			param_list();
			setState(76);
			match(RPAREN);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(77);
				match(ARROW);
				setState(78);
				type();
				}
			}

			setState(81);
			block_stmt();
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

	public static class Param_listContext extends ParserRuleContext {
		public List<Typed_nameContext> typed_name() {
			return getRuleContexts(Typed_nameContext.class);
		}
		public Typed_nameContext typed_name(int i) {
			return getRuleContext(Typed_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTWGLoxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTWGLoxParser.COMMA, i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitParam_list(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(83);
				typed_name();
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(84);
					match(COMMA);
					setState(85);
					typed_name();
					}
					}
					setState(90);
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(HTWGLoxParser.VAR, 0); }
		public Typed_nameContext typed_name() {
			return getRuleContext(Typed_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(HTWGLoxParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HTWGLoxParser.SEMICOLON, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(VAR);
			setState(94);
			typed_name();
			setState(95);
			match(ASSIGN);
			setState(96);
			expression();
			setState(97);
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

	public static class Typed_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HTWGLoxParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(HTWGLoxParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Typed_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterTyped_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitTyped_name(this);
		}
	}

	public final Typed_nameContext typed_name() throws RecognitionException {
		Typed_nameContext _localctx = new Typed_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typed_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(IDENTIFIER);
			setState(100);
			match(COLON);
			setState(101);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(HTWGLoxParser.NUM, 0); }
		public TerminalNode STR() { return getToken(HTWGLoxParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(HTWGLoxParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << STR) | (1L << BOOL))) != 0)) ) {
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

	public static class StatementContext extends ParserRuleContext {
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Expression_stmtContext expression_stmt() {
			return getRuleContext(Expression_stmtContext.class,0);
		}
		public Declaration_stmtContext declaration_stmt() {
			return getRuleContext(Declaration_stmtContext.class,0);
		}
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				print_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				for_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				assign_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				return_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
				expression_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
				declaration_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(112);
				block_stmt();
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

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(HTWGLoxParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HTWGLoxParser.SEMICOLON, 0); }
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitPrint_stmt(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(PRINT);
			setState(116);
			expression();
			setState(117);
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(HTWGLoxParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(HTWGLoxParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IF);
			setState(120);
			expression();
			setState(121);
			statement();
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(122);
				match(ELSE);
				setState(123);
				statement();
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

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(HTWGLoxParser.FOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HTWGLoxParser.SEMICOLON, 0); }
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(FOR);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(127);
				var_decl();
				}
			}

			setState(130);
			expression();
			setState(131);
			match(SEMICOLON);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(132);
				assign();
				}
			}

			setState(135);
			block_stmt();
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

	public static class Assign_stmtContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HTWGLoxParser.SEMICOLON, 0); }
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitAssign_stmt(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			assign();
			setState(138);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HTWGLoxParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(HTWGLoxParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IDENTIFIER);
			setState(141);
			match(ASSIGN);
			setState(142);
			expression();
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(HTWGLoxParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HTWGLoxParser.SEMICOLON, 0); }
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(RETURN);
			setState(145);
			expression();
			setState(146);
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

	public static class Expression_stmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HTWGLoxParser.SEMICOLON, 0); }
		public Expression_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterExpression_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitExpression_stmt(this);
		}
	}

	public final Expression_stmtContext expression_stmt() throws RecognitionException {
		Expression_stmtContext _localctx = new Expression_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			expression();
			setState(149);
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

	public static class Declaration_stmtContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Declaration_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterDeclaration_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitDeclaration_stmt(this);
		}
	}

	public final Declaration_stmtContext declaration_stmt() throws RecognitionException {
		Declaration_stmtContext _localctx = new Declaration_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaration_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			declaration();
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

	public static class Block_stmtContext extends ParserRuleContext {
		public TerminalNode LCBRACE() { return getToken(HTWGLoxParser.LCBRACE, 0); }
		public TerminalNode RCBRACE() { return getToken(HTWGLoxParser.RCBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterBlock_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitBlock_stmt(this);
		}
	}

	public final Block_stmtContext block_stmt() throws RecognitionException {
		Block_stmtContext _localctx = new Block_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(LCBRACE);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_LITERAL) | (1L << STRING_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << FUNC) | (1L << RETURN) | (1L << VAR) | (1L << PRINT) | (1L << IF) | (1L << FOR) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << LCBRACE) | (1L << MINUS) | (1L << EXCLAMATION_MARK))) != 0)) {
				{
				{
				setState(154);
				statement();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(RCBRACE);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Bool_or_exprContext bool_or_expr() {
			return getRuleContext(Bool_or_exprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			bool_or_expr(0);
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

	public static class Bool_or_exprContext extends ParserRuleContext {
		public Bool_and_exprContext bool_and_expr() {
			return getRuleContext(Bool_and_exprContext.class,0);
		}
		public List<Bool_or_exprContext> bool_or_expr() {
			return getRuleContexts(Bool_or_exprContext.class);
		}
		public Bool_or_exprContext bool_or_expr(int i) {
			return getRuleContext(Bool_or_exprContext.class,i);
		}
		public TerminalNode BOOL_OR() { return getToken(HTWGLoxParser.BOOL_OR, 0); }
		public Bool_or_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_or_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterBool_or_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitBool_or_expr(this);
		}
	}

	public final Bool_or_exprContext bool_or_expr() throws RecognitionException {
		return bool_or_expr(0);
	}

	private Bool_or_exprContext bool_or_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_or_exprContext _localctx = new Bool_or_exprContext(_ctx, _parentState);
		Bool_or_exprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_bool_or_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(165);
			bool_and_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_or_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_or_expr);
					setState(167);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(168);
					match(BOOL_OR);
					setState(169);
					bool_or_expr(2);
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bool_and_exprContext extends ParserRuleContext {
		public Equality_exprContext equality_expr() {
			return getRuleContext(Equality_exprContext.class,0);
		}
		public List<Bool_and_exprContext> bool_and_expr() {
			return getRuleContexts(Bool_and_exprContext.class);
		}
		public Bool_and_exprContext bool_and_expr(int i) {
			return getRuleContext(Bool_and_exprContext.class,i);
		}
		public TerminalNode BOOL_AND() { return getToken(HTWGLoxParser.BOOL_AND, 0); }
		public Bool_and_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_and_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterBool_and_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitBool_and_expr(this);
		}
	}

	public final Bool_and_exprContext bool_and_expr() throws RecognitionException {
		return bool_and_expr(0);
	}

	private Bool_and_exprContext bool_and_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_and_exprContext _localctx = new Bool_and_exprContext(_ctx, _parentState);
		Bool_and_exprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_bool_and_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(176);
			equality_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_and_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_and_expr);
					setState(178);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(179);
					match(BOOL_AND);
					setState(180);
					bool_and_expr(2);
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Equality_exprContext extends ParserRuleContext {
		public Comparison_exprContext comparison_expr() {
			return getRuleContext(Comparison_exprContext.class,0);
		}
		public List<Equality_exprContext> equality_expr() {
			return getRuleContexts(Equality_exprContext.class);
		}
		public Equality_exprContext equality_expr(int i) {
			return getRuleContext(Equality_exprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(HTWGLoxParser.EQUAL, 0); }
		public TerminalNode UNEQUAL() { return getToken(HTWGLoxParser.UNEQUAL, 0); }
		public Equality_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterEquality_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitEquality_expr(this);
		}
	}

	public final Equality_exprContext equality_expr() throws RecognitionException {
		return equality_expr(0);
	}

	private Equality_exprContext equality_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Equality_exprContext _localctx = new Equality_exprContext(_ctx, _parentState);
		Equality_exprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_equality_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(187);
			comparison_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Equality_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expr);
						setState(189);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(190);
						match(EQUAL);
						setState(191);
						equality_expr(3);
						}
						break;
					case 2:
						{
						_localctx = new Equality_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expr);
						setState(192);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(193);
						match(UNEQUAL);
						setState(194);
						equality_expr(2);
						}
						break;
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Comparison_exprContext extends ParserRuleContext {
		public Term_exprContext term_expr() {
			return getRuleContext(Term_exprContext.class,0);
		}
		public List<Comparison_exprContext> comparison_expr() {
			return getRuleContexts(Comparison_exprContext.class);
		}
		public Comparison_exprContext comparison_expr(int i) {
			return getRuleContext(Comparison_exprContext.class,i);
		}
		public TerminalNode LESS_EQUAL() { return getToken(HTWGLoxParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(HTWGLoxParser.GREATER_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(HTWGLoxParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(HTWGLoxParser.GREATER, 0); }
		public Comparison_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterComparison_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitComparison_expr(this);
		}
	}

	public final Comparison_exprContext comparison_expr() throws RecognitionException {
		return comparison_expr(0);
	}

	private Comparison_exprContext comparison_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Comparison_exprContext _localctx = new Comparison_exprContext(_ctx, _parentState);
		Comparison_exprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_comparison_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(201);
			term_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Comparison_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_expr);
						setState(203);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(204);
						match(LESS_EQUAL);
						setState(205);
						comparison_expr(5);
						}
						break;
					case 2:
						{
						_localctx = new Comparison_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_expr);
						setState(206);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(207);
						match(GREATER_EQUAL);
						setState(208);
						comparison_expr(4);
						}
						break;
					case 3:
						{
						_localctx = new Comparison_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_expr);
						setState(209);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(210);
						match(LESS);
						setState(211);
						comparison_expr(3);
						}
						break;
					case 4:
						{
						_localctx = new Comparison_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_expr);
						setState(212);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(213);
						match(GREATER);
						setState(214);
						comparison_expr(2);
						}
						break;
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Term_exprContext extends ParserRuleContext {
		public Factor_exprContext factor_expr() {
			return getRuleContext(Factor_exprContext.class,0);
		}
		public List<Term_exprContext> term_expr() {
			return getRuleContexts(Term_exprContext.class);
		}
		public Term_exprContext term_expr(int i) {
			return getRuleContext(Term_exprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(HTWGLoxParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HTWGLoxParser.MINUS, 0); }
		public Term_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterTerm_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitTerm_expr(this);
		}
	}

	public final Term_exprContext term_expr() throws RecognitionException {
		return term_expr(0);
	}

	private Term_exprContext term_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term_exprContext _localctx = new Term_exprContext(_ctx, _parentState);
		Term_exprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_term_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(221);
			factor_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(229);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new Term_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term_expr);
						setState(223);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(224);
						match(PLUS);
						setState(225);
						term_expr(3);
						}
						break;
					case 2:
						{
						_localctx = new Term_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term_expr);
						setState(226);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(227);
						match(MINUS);
						setState(228);
						term_expr(2);
						}
						break;
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Factor_exprContext extends ParserRuleContext {
		public Negation_exprContext negation_expr() {
			return getRuleContext(Negation_exprContext.class,0);
		}
		public List<Factor_exprContext> factor_expr() {
			return getRuleContexts(Factor_exprContext.class);
		}
		public Factor_exprContext factor_expr(int i) {
			return getRuleContext(Factor_exprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(HTWGLoxParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(HTWGLoxParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(HTWGLoxParser.PERCENT, 0); }
		public Factor_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterFactor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitFactor_expr(this);
		}
	}

	public final Factor_exprContext factor_expr() throws RecognitionException {
		return factor_expr(0);
	}

	private Factor_exprContext factor_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Factor_exprContext _localctx = new Factor_exprContext(_ctx, _parentState);
		Factor_exprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_factor_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(235);
			negation_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new Factor_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor_expr);
						setState(237);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(238);
						match(STAR);
						setState(239);
						factor_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new Factor_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor_expr);
						setState(240);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(241);
						match(SLASH);
						setState(242);
						factor_expr(3);
						}
						break;
					case 3:
						{
						_localctx = new Factor_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor_expr);
						setState(243);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(244);
						match(PERCENT);
						setState(245);
						factor_expr(2);
						}
						break;
					}
					} 
				}
				setState(250);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Negation_exprContext extends ParserRuleContext {
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(HTWGLoxParser.MINUS, 0); }
		public Negation_exprContext negation_expr() {
			return getRuleContext(Negation_exprContext.class,0);
		}
		public TerminalNode EXCLAMATION_MARK() { return getToken(HTWGLoxParser.EXCLAMATION_MARK, 0); }
		public Negation_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterNegation_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitNegation_expr(this);
		}
	}

	public final Negation_exprContext negation_expr() throws RecognitionException {
		Negation_exprContext _localctx = new Negation_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_negation_expr);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_LITERAL:
			case STRING_LITERAL:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				call_expr();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(MINUS);
				setState(253);
				negation_expr();
				}
				break;
			case EXCLAMATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(EXCLAMATION_MARK);
				setState(255);
				negation_expr();
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

	public static class Call_exprContext extends ParserRuleContext {
		public Primary_exprContext primary_expr() {
			return getRuleContext(Primary_exprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HTWGLoxParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(HTWGLoxParser.LPAREN, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HTWGLoxParser.RPAREN, 0); }
		public Call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterCall_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitCall_expr(this);
		}
	}

	public final Call_exprContext call_expr() throws RecognitionException {
		Call_exprContext _localctx = new Call_exprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_call_expr);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				primary_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(IDENTIFIER);
				setState(260);
				match(LPAREN);
				setState(261);
				arg_list();
				setState(262);
				match(RPAREN);
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

	public static class Arg_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTWGLoxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTWGLoxParser.COMMA, i);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitArg_list(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arg_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_LITERAL) | (1L << STRING_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << MINUS) | (1L << EXCLAMATION_MARK))) != 0)) {
				{
				setState(266);
				expression();
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(267);
					match(COMMA);
					setState(268);
					expression();
					}
					}
					setState(273);
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

	public static class Primary_exprContext extends ParserRuleContext {
		public Grouping_exprContext grouping_expr() {
			return getRuleContext(Grouping_exprContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HTWGLoxParser.IDENTIFIER, 0); }
		public Primary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterPrimary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitPrimary_expr(this);
		}
	}

	public final Primary_exprContext primary_expr() throws RecognitionException {
		Primary_exprContext _localctx = new Primary_exprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primary_expr);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				grouping_expr();
				}
				break;
			case NUMBER_LITERAL:
			case STRING_LITERAL:
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(IDENTIFIER);
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

	public static class Grouping_exprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HTWGLoxParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HTWGLoxParser.RPAREN, 0); }
		public Grouping_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterGrouping_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitGrouping_expr(this);
		}
	}

	public final Grouping_exprContext grouping_expr() throws RecognitionException {
		Grouping_exprContext _localctx = new Grouping_exprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_grouping_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(LPAREN);
			setState(282);
			expression();
			setState(283);
			match(RPAREN);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER_LITERAL() { return getToken(HTWGLoxParser.NUMBER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(HTWGLoxParser.STRING_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(HTWGLoxParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HTWGLoxParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTWGLoxParserListener ) ((HTWGLoxParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_LITERAL) | (1L << STRING_LITERAL) | (1L << TRUE) | (1L << FALSE))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return bool_or_expr_sempred((Bool_or_exprContext)_localctx, predIndex);
		case 19:
			return bool_and_expr_sempred((Bool_and_exprContext)_localctx, predIndex);
		case 20:
			return equality_expr_sempred((Equality_exprContext)_localctx, predIndex);
		case 21:
			return comparison_expr_sempred((Comparison_exprContext)_localctx, predIndex);
		case 22:
			return term_expr_sempred((Term_exprContext)_localctx, predIndex);
		case 23:
			return factor_expr_sempred((Factor_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bool_or_expr_sempred(Bool_or_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bool_and_expr_sempred(Bool_and_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equality_expr_sempred(Equality_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean comparison_expr_sempred(Comparison_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean term_expr_sempred(Term_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean factor_expr_sempred(Factor_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0122\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\5\3I\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4R\n\4\3\4\3\4\3\5\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\5\5^\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\tt\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\177\n\13"+
		"\3\f\3\f\5\f\u0083\n\f\3\f\3\f\3\f\5\f\u0088\n\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\7\22\u009e\n\22\f\22\16\22\u00a1\13\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\7\24\u00ad\n\24\f\24\16\24\u00b0\13\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\7\25\u00b8\n\25\f\25\16\25\u00bb\13\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00c6\n\26\f\26\16\26\u00c9"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u00da\n\27\f\27\16\27\u00dd\13\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u00e8\n\30\f\30\16\30\u00eb\13\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00f9\n\31"+
		"\f\31\16\31\u00fc\13\31\3\32\3\32\3\32\3\32\3\32\5\32\u0103\n\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u010b\n\33\3\34\3\34\3\34\7\34\u0110\n"+
		"\34\f\34\16\34\u0113\13\34\5\34\u0115\n\34\3\35\3\35\3\35\5\35\u011a\n"+
		"\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\2\b&(*,.\60 \2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\4\3\2\n\f\3\2\3\6\2\u0127"+
		"\2A\3\2\2\2\4H\3\2\2\2\6J\3\2\2\2\b]\3\2\2\2\n_\3\2\2\2\fe\3\2\2\2\16"+
		"i\3\2\2\2\20s\3\2\2\2\22u\3\2\2\2\24y\3\2\2\2\26\u0080\3\2\2\2\30\u008b"+
		"\3\2\2\2\32\u008e\3\2\2\2\34\u0092\3\2\2\2\36\u0096\3\2\2\2 \u0099\3\2"+
		"\2\2\"\u009b\3\2\2\2$\u00a4\3\2\2\2&\u00a6\3\2\2\2(\u00b1\3\2\2\2*\u00bc"+
		"\3\2\2\2,\u00ca\3\2\2\2.\u00de\3\2\2\2\60\u00ec\3\2\2\2\62\u0102\3\2\2"+
		"\2\64\u010a\3\2\2\2\66\u0114\3\2\2\28\u0119\3\2\2\2:\u011b\3\2\2\2<\u011f"+
		"\3\2\2\2>@\5\20\t\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2"+
		"CA\3\2\2\2DE\7\2\2\3E\3\3\2\2\2FI\5\6\4\2GI\5\n\6\2HF\3\2\2\2HG\3\2\2"+
		"\2I\5\3\2\2\2JK\7\7\2\2KL\7\21\2\2LM\7\25\2\2MN\5\b\5\2NQ\7\26\2\2OP\7"+
		"\31\2\2PR\5\16\b\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\5\"\22\2T\7\3\2\2\2"+
		"UZ\5\f\7\2VW\7\22\2\2WY\5\f\7\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2"+
		"\2[^\3\2\2\2\\Z\3\2\2\2]U\3\2\2\2]^\3\2\2\2^\t\3\2\2\2_`\7\t\2\2`a\5\f"+
		"\7\2ab\7!\2\2bc\5$\23\2cd\7\24\2\2d\13\3\2\2\2ef\7\21\2\2fg\7\23\2\2g"+
		"h\5\16\b\2h\r\3\2\2\2ij\t\2\2\2j\17\3\2\2\2kt\5\22\n\2lt\5\24\13\2mt\5"+
		"\26\f\2nt\5\30\r\2ot\5\34\17\2pt\5\36\20\2qt\5 \21\2rt\5\"\22\2sk\3\2"+
		"\2\2sl\3\2\2\2sm\3\2\2\2sn\3\2\2\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2"+
		"\2\2t\21\3\2\2\2uv\7\r\2\2vw\5$\23\2wx\7\24\2\2x\23\3\2\2\2yz\7\16\2\2"+
		"z{\5$\23\2{~\5\20\t\2|}\7\17\2\2}\177\5\20\t\2~|\3\2\2\2~\177\3\2\2\2"+
		"\177\25\3\2\2\2\u0080\u0082\7\20\2\2\u0081\u0083\5\n\6\2\u0082\u0081\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\5$\23\2\u0085"+
		"\u0087\7\24\2\2\u0086\u0088\5\32\16\2\u0087\u0086\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\5\"\22\2\u008a\27\3\2\2\2\u008b"+
		"\u008c\5\32\16\2\u008c\u008d\7\24\2\2\u008d\31\3\2\2\2\u008e\u008f\7\21"+
		"\2\2\u008f\u0090\7!\2\2\u0090\u0091\5$\23\2\u0091\33\3\2\2\2\u0092\u0093"+
		"\7\b\2\2\u0093\u0094\5$\23\2\u0094\u0095\7\24\2\2\u0095\35\3\2\2\2\u0096"+
		"\u0097\5$\23\2\u0097\u0098\7\24\2\2\u0098\37\3\2\2\2\u0099\u009a\5\4\3"+
		"\2\u009a!\3\2\2\2\u009b\u009f\7\27\2\2\u009c\u009e\5\20\t\2\u009d\u009c"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\30\2\2\u00a3#\3\2\2\2"+
		"\u00a4\u00a5\5&\24\2\u00a5%\3\2\2\2\u00a6\u00a7\b\24\1\2\u00a7\u00a8\5"+
		"(\25\2\u00a8\u00ae\3\2\2\2\u00a9\u00aa\f\3\2\2\u00aa\u00ab\7(\2\2\u00ab"+
		"\u00ad\5&\24\4\u00ac\u00a9\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\'\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2"+
		"\b\25\1\2\u00b2\u00b3\5*\26\2\u00b3\u00b9\3\2\2\2\u00b4\u00b5\f\3\2\2"+
		"\u00b5\u00b6\7\'\2\2\u00b6\u00b8\5(\25\4\u00b7\u00b4\3\2\2\2\u00b8\u00bb"+
		"\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba)\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bd\b\26\1\2\u00bd\u00be\5,\27\2\u00be\u00c7\3"+
		"\2\2\2\u00bf\u00c0\f\4\2\2\u00c0\u00c1\7 \2\2\u00c1\u00c6\5*\26\5\u00c2"+
		"\u00c3\f\3\2\2\u00c3\u00c4\7\36\2\2\u00c4\u00c6\5*\26\4\u00c5\u00bf\3"+
		"\2\2\2\u00c5\u00c2\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8+\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\b\27\1\2"+
		"\u00cb\u00cc\5.\30\2\u00cc\u00db\3\2\2\2\u00cd\u00ce\f\6\2\2\u00ce\u00cf"+
		"\7#\2\2\u00cf\u00da\5,\27\7\u00d0\u00d1\f\5\2\2\u00d1\u00d2\7\"\2\2\u00d2"+
		"\u00da\5,\27\6\u00d3\u00d4\f\4\2\2\u00d4\u00d5\7$\2\2\u00d5\u00da\5,\27"+
		"\5\u00d6\u00d7\f\3\2\2\u00d7\u00d8\7%\2\2\u00d8\u00da\5,\27\4\u00d9\u00cd"+
		"\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9\u00d3\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc-\3\2\2\2"+
		"\u00dd\u00db\3\2\2\2\u00de\u00df\b\30\1\2\u00df\u00e0\5\60\31\2\u00e0"+
		"\u00e9\3\2\2\2\u00e1\u00e2\f\4\2\2\u00e2\u00e3\7\35\2\2\u00e3\u00e8\5"+
		".\30\5\u00e4\u00e5\f\3\2\2\u00e5\u00e6\7\32\2\2\u00e6\u00e8\5.\30\4\u00e7"+
		"\u00e1\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea/\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed"+
		"\b\31\1\2\u00ed\u00ee\5\62\32\2\u00ee\u00fa\3\2\2\2\u00ef\u00f0\f\5\2"+
		"\2\u00f0\u00f1\7\34\2\2\u00f1\u00f9\5\60\31\6\u00f2\u00f3\f\4\2\2\u00f3"+
		"\u00f4\7\33\2\2\u00f4\u00f9\5\60\31\5\u00f5\u00f6\f\3\2\2\u00f6\u00f7"+
		"\7&\2\2\u00f7\u00f9\5\60\31\4\u00f8\u00ef\3\2\2\2\u00f8\u00f2\3\2\2\2"+
		"\u00f8\u00f5\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\61\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0103\5\64\33\2\u00fe"+
		"\u00ff\7\32\2\2\u00ff\u0103\5\62\32\2\u0100\u0101\7\37\2\2\u0101\u0103"+
		"\5\62\32\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u0100\3\2\2\2"+
		"\u0103\63\3\2\2\2\u0104\u010b\58\35\2\u0105\u0106\7\21\2\2\u0106\u0107"+
		"\7\25\2\2\u0107\u0108\5\66\34\2\u0108\u0109\7\26\2\2\u0109\u010b\3\2\2"+
		"\2\u010a\u0104\3\2\2\2\u010a\u0105\3\2\2\2\u010b\65\3\2\2\2\u010c\u0111"+
		"\5$\23\2\u010d\u010e\7\22\2\2\u010e\u0110\5$\23\2\u010f\u010d\3\2\2\2"+
		"\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u010c\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\67\3\2\2\2\u0116\u011a\5:\36\2\u0117\u011a\5<\37\2\u0118\u011a\7\21\2"+
		"\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a9"+
		"\3\2\2\2\u011b\u011c\7\25\2\2\u011c\u011d\5$\23\2\u011d\u011e\7\26\2\2"+
		"\u011e;\3\2\2\2\u011f\u0120\t\3\2\2\u0120=\3\2\2\2\33AHQZ]s~\u0082\u0087"+
		"\u009f\u00ae\u00b9\u00c5\u00c7\u00d9\u00db\u00e7\u00e9\u00f8\u00fa\u0102"+
		"\u010a\u0111\u0114\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}