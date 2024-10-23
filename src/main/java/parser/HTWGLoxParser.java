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
		RULE_assign = 12, RULE_return_stmt = 13, RULE_block_stmt = 14, RULE_expression = 15, 
		RULE_bool_or_expr = 16, RULE_bool_and_expr = 17, RULE_equality_expr = 18, 
		RULE_comparison_expr = 19, RULE_term_expr = 20, RULE_factor_expr = 21, 
		RULE_negation_expr = 22, RULE_call_expr = 23, RULE_arg_list = 24, RULE_primary_expr = 25, 
		RULE_grouping_expr = 26, RULE_literal = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "func_decl", "param_list", "var_decl", "typed_name", 
			"type", "statement", "print_stmt", "if_stmt", "for_stmt", "assign_stmt", 
			"assign", "return_stmt", "block_stmt", "expression", "bool_or_expr", 
			"bool_and_expr", "equality_expr", "comparison_expr", "term_expr", "factor_expr", 
			"negation_expr", "call_expr", "arg_list", "primary_expr", "grouping_expr", 
			"literal"
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
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_LITERAL) | (1L << STRING_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << FUNC) | (1L << RETURN) | (1L << VAR) | (1L << PRINT) | (1L << IF) | (1L << FOR) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << LCBRACE) | (1L << MINUS) | (1L << EXCLAMATION_MARK))) != 0)) {
				{
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(56);
					declaration();
					}
					break;
				case 2:
					{
					setState(57);
					statement();
					}
					break;
				case 3:
					{
					setState(58);
					expression();
					}
					break;
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				func_decl();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
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
			setState(70);
			match(FUNC);
			setState(71);
			match(IDENTIFIER);
			setState(72);
			match(LPAREN);
			setState(73);
			param_list();
			setState(74);
			match(RPAREN);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(75);
				match(ARROW);
				setState(76);
				type();
				}
			}

			setState(79);
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
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(81);
				typed_name();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(82);
					match(COMMA);
					setState(83);
					typed_name();
					}
					}
					setState(88);
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
			setState(91);
			match(VAR);
			setState(92);
			typed_name();
			setState(93);
			match(ASSIGN);
			setState(94);
			expression();
			setState(95);
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
			setState(97);
			match(IDENTIFIER);
			setState(98);
			match(COLON);
			setState(99);
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
			setState(101);
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
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				print_stmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				if_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				for_stmt();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				assign_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				return_stmt();
				}
				break;
			case LCBRACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				block_stmt();
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
			setState(111);
			match(PRINT);
			setState(112);
			expression();
			setState(113);
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
			setState(115);
			match(IF);
			setState(116);
			expression();
			setState(117);
			statement();
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(118);
				match(ELSE);
				setState(119);
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
			setState(122);
			match(FOR);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(123);
				var_decl();
				}
			}

			setState(126);
			expression();
			setState(127);
			match(SEMICOLON);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(128);
				assign();
				}
			}

			setState(131);
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
			setState(133);
			assign();
			setState(134);
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
			setState(136);
			match(IDENTIFIER);
			setState(137);
			match(ASSIGN);
			setState(138);
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
			setState(140);
			match(RETURN);
			setState(141);
			expression();
			setState(142);
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
		enterRule(_localctx, 28, RULE_block_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(LCBRACE);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << FOR) | (1L << IDENTIFIER) | (1L << LCBRACE))) != 0)) {
				{
				{
				setState(145);
				statement();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
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
		enterRule(_localctx, 30, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_bool_or_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(156);
			bool_and_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_or_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_or_expr);
					setState(158);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(159);
					match(BOOL_OR);
					setState(160);
					bool_or_expr(2);
					}
					} 
				}
				setState(165);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_bool_and_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(167);
			equality_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_and_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_and_expr);
					setState(169);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(170);
					match(BOOL_AND);
					setState(171);
					bool_and_expr(2);
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_equality_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(178);
			comparison_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Equality_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expr);
						setState(180);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(181);
						match(EQUAL);
						setState(182);
						equality_expr(3);
						}
						break;
					case 2:
						{
						_localctx = new Equality_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expr);
						setState(183);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(184);
						match(UNEQUAL);
						setState(185);
						equality_expr(2);
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_comparison_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(192);
			term_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new Comparison_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_expr);
						setState(194);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(195);
						match(LESS_EQUAL);
						setState(196);
						comparison_expr(5);
						}
						break;
					case 2:
						{
						_localctx = new Comparison_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_expr);
						setState(197);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(198);
						match(GREATER_EQUAL);
						setState(199);
						comparison_expr(4);
						}
						break;
					case 3:
						{
						_localctx = new Comparison_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_expr);
						setState(200);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(201);
						match(LESS);
						setState(202);
						comparison_expr(3);
						}
						break;
					case 4:
						{
						_localctx = new Comparison_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_expr);
						setState(203);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(204);
						match(GREATER);
						setState(205);
						comparison_expr(2);
						}
						break;
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_term_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(212);
			factor_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(220);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Term_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term_expr);
						setState(214);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(215);
						match(PLUS);
						setState(216);
						term_expr(3);
						}
						break;
					case 2:
						{
						_localctx = new Term_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term_expr);
						setState(217);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(218);
						match(MINUS);
						setState(219);
						term_expr(2);
						}
						break;
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_factor_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(226);
			negation_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new Factor_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor_expr);
						setState(228);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(229);
						match(STAR);
						setState(230);
						factor_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new Factor_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor_expr);
						setState(231);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(232);
						match(SLASH);
						setState(233);
						factor_expr(3);
						}
						break;
					case 3:
						{
						_localctx = new Factor_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor_expr);
						setState(234);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(235);
						match(PERCENT);
						setState(236);
						factor_expr(2);
						}
						break;
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 44, RULE_negation_expr);
		try {
			setState(247);
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
				setState(242);
				call_expr();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(MINUS);
				setState(244);
				negation_expr();
				}
				break;
			case EXCLAMATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				match(EXCLAMATION_MARK);
				setState(246);
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
		enterRule(_localctx, 46, RULE_call_expr);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				primary_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(IDENTIFIER);
				setState(251);
				match(LPAREN);
				setState(252);
				arg_list();
				setState(253);
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
		enterRule(_localctx, 48, RULE_arg_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_LITERAL) | (1L << STRING_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << MINUS) | (1L << EXCLAMATION_MARK))) != 0)) {
				{
				setState(257);
				expression();
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(258);
					match(COMMA);
					setState(259);
					expression();
					}
					}
					setState(264);
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
		enterRule(_localctx, 50, RULE_primary_expr);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				grouping_expr();
				}
				break;
			case NUMBER_LITERAL:
			case STRING_LITERAL:
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
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
		enterRule(_localctx, 52, RULE_grouping_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(LPAREN);
			setState(273);
			expression();
			setState(274);
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
		enterRule(_localctx, 54, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		case 16:
			return bool_or_expr_sempred((Bool_or_exprContext)_localctx, predIndex);
		case 17:
			return bool_and_expr_sempred((Bool_and_exprContext)_localctx, predIndex);
		case 18:
			return equality_expr_sempred((Equality_exprContext)_localctx, predIndex);
		case 19:
			return comparison_expr_sempred((Comparison_exprContext)_localctx, predIndex);
		case 20:
			return term_expr_sempred((Term_exprContext)_localctx, predIndex);
		case 21:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0119\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\7\2>\n\2\f\2\16\2"+
		"A\13\2\3\2\3\2\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3"+
		"\4\3\4\3\5\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\5\5\\\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13{\n\13\3\f\3\f\5\f\177\n\f\3\f"+
		"\3\f\3\f\5\f\u0084\n\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\7\20\u0095\n\20\f\20\16\20\u0098\13\20\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00a4\n\22\f\22\16\22"+
		"\u00a7\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00af\n\23\f\23\16\23"+
		"\u00b2\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00bd\n"+
		"\24\f\24\16\24\u00c0\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00d1\n\25\f\25\16\25\u00d4\13\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00df\n\26\f\26\16"+
		"\26\u00e2\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u00f0\n\27\f\27\16\27\u00f3\13\27\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u00fa\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0102\n\31\3\32\3"+
		"\32\3\32\7\32\u0107\n\32\f\32\16\32\u010a\13\32\5\32\u010c\n\32\3\33\3"+
		"\33\3\33\5\33\u0111\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\2\b\"$&(*"+
		",\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\4"+
		"\3\2\n\f\3\2\3\6\2\u0120\2?\3\2\2\2\4F\3\2\2\2\6H\3\2\2\2\b[\3\2\2\2\n"+
		"]\3\2\2\2\fc\3\2\2\2\16g\3\2\2\2\20o\3\2\2\2\22q\3\2\2\2\24u\3\2\2\2\26"+
		"|\3\2\2\2\30\u0087\3\2\2\2\32\u008a\3\2\2\2\34\u008e\3\2\2\2\36\u0092"+
		"\3\2\2\2 \u009b\3\2\2\2\"\u009d\3\2\2\2$\u00a8\3\2\2\2&\u00b3\3\2\2\2"+
		"(\u00c1\3\2\2\2*\u00d5\3\2\2\2,\u00e3\3\2\2\2.\u00f9\3\2\2\2\60\u0101"+
		"\3\2\2\2\62\u010b\3\2\2\2\64\u0110\3\2\2\2\66\u0112\3\2\2\28\u0116\3\2"+
		"\2\2:>\5\4\3\2;>\5\20\t\2<>\5 \21\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>A\3"+
		"\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\2\2\3C\3\3\2\2\2DG"+
		"\5\6\4\2EG\5\n\6\2FD\3\2\2\2FE\3\2\2\2G\5\3\2\2\2HI\7\7\2\2IJ\7\21\2\2"+
		"JK\7\25\2\2KL\5\b\5\2LO\7\26\2\2MN\7\31\2\2NP\5\16\b\2OM\3\2\2\2OP\3\2"+
		"\2\2PQ\3\2\2\2QR\5\36\20\2R\7\3\2\2\2SX\5\f\7\2TU\7\22\2\2UW\5\f\7\2V"+
		"T\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[S\3\2\2\2"+
		"[\\\3\2\2\2\\\t\3\2\2\2]^\7\t\2\2^_\5\f\7\2_`\7!\2\2`a\5 \21\2ab\7\24"+
		"\2\2b\13\3\2\2\2cd\7\21\2\2de\7\23\2\2ef\5\16\b\2f\r\3\2\2\2gh\t\2\2\2"+
		"h\17\3\2\2\2ip\5\22\n\2jp\5\24\13\2kp\5\26\f\2lp\5\30\r\2mp\5\34\17\2"+
		"np\5\36\20\2oi\3\2\2\2oj\3\2\2\2ok\3\2\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2"+
		"\2p\21\3\2\2\2qr\7\r\2\2rs\5 \21\2st\7\24\2\2t\23\3\2\2\2uv\7\16\2\2v"+
		"w\5 \21\2wz\5\20\t\2xy\7\17\2\2y{\5\20\t\2zx\3\2\2\2z{\3\2\2\2{\25\3\2"+
		"\2\2|~\7\20\2\2}\177\5\n\6\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\u0081\5 \21\2\u0081\u0083\7\24\2\2\u0082\u0084\5\32\16\2\u0083"+
		"\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\5\36"+
		"\20\2\u0086\27\3\2\2\2\u0087\u0088\5\32\16\2\u0088\u0089\7\24\2\2\u0089"+
		"\31\3\2\2\2\u008a\u008b\7\21\2\2\u008b\u008c\7!\2\2\u008c\u008d\5 \21"+
		"\2\u008d\33\3\2\2\2\u008e\u008f\7\b\2\2\u008f\u0090\5 \21\2\u0090\u0091"+
		"\7\24\2\2\u0091\35\3\2\2\2\u0092\u0096\7\27\2\2\u0093\u0095\5\20\t\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\30\2\2\u009a"+
		"\37\3\2\2\2\u009b\u009c\5\"\22\2\u009c!\3\2\2\2\u009d\u009e\b\22\1\2\u009e"+
		"\u009f\5$\23\2\u009f\u00a5\3\2\2\2\u00a0\u00a1\f\3\2\2\u00a1\u00a2\7("+
		"\2\2\u00a2\u00a4\5\"\22\4\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6#\3\2\2\2\u00a7\u00a5\3\2\2\2"+
		"\u00a8\u00a9\b\23\1\2\u00a9\u00aa\5&\24\2\u00aa\u00b0\3\2\2\2\u00ab\u00ac"+
		"\f\3\2\2\u00ac\u00ad\7\'\2\2\u00ad\u00af\5$\23\4\u00ae\u00ab\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1%\3\2\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b3\u00b4\b\24\1\2\u00b4\u00b5\5(\25\2\u00b5\u00be"+
		"\3\2\2\2\u00b6\u00b7\f\4\2\2\u00b7\u00b8\7 \2\2\u00b8\u00bd\5&\24\5\u00b9"+
		"\u00ba\f\3\2\2\u00ba\u00bb\7\36\2\2\u00bb\u00bd\5&\24\4\u00bc\u00b6\3"+
		"\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\'\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\b\25\1"+
		"\2\u00c2\u00c3\5*\26\2\u00c3\u00d2\3\2\2\2\u00c4\u00c5\f\6\2\2\u00c5\u00c6"+
		"\7#\2\2\u00c6\u00d1\5(\25\7\u00c7\u00c8\f\5\2\2\u00c8\u00c9\7\"\2\2\u00c9"+
		"\u00d1\5(\25\6\u00ca\u00cb\f\4\2\2\u00cb\u00cc\7$\2\2\u00cc\u00d1\5(\25"+
		"\5\u00cd\u00ce\f\3\2\2\u00ce\u00cf\7%\2\2\u00cf\u00d1\5(\25\4\u00d0\u00c4"+
		"\3\2\2\2\u00d0\u00c7\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3)\3\2\2\2"+
		"\u00d4\u00d2\3\2\2\2\u00d5\u00d6\b\26\1\2\u00d6\u00d7\5,\27\2\u00d7\u00e0"+
		"\3\2\2\2\u00d8\u00d9\f\4\2\2\u00d9\u00da\7\35\2\2\u00da\u00df\5*\26\5"+
		"\u00db\u00dc\f\3\2\2\u00dc\u00dd\7\32\2\2\u00dd\u00df\5*\26\4\u00de\u00d8"+
		"\3\2\2\2\u00de\u00db\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1+\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\b\27\1\2"+
		"\u00e4\u00e5\5.\30\2\u00e5\u00f1\3\2\2\2\u00e6\u00e7\f\5\2\2\u00e7\u00e8"+
		"\7\34\2\2\u00e8\u00f0\5,\27\6\u00e9\u00ea\f\4\2\2\u00ea\u00eb\7\33\2\2"+
		"\u00eb\u00f0\5,\27\5\u00ec\u00ed\f\3\2\2\u00ed\u00ee\7&\2\2\u00ee\u00f0"+
		"\5,\27\4\u00ef\u00e6\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ec\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2-\3\2\2\2"+
		"\u00f3\u00f1\3\2\2\2\u00f4\u00fa\5\60\31\2\u00f5\u00f6\7\32\2\2\u00f6"+
		"\u00fa\5.\30\2\u00f7\u00f8\7\37\2\2\u00f8\u00fa\5.\30\2\u00f9\u00f4\3"+
		"\2\2\2\u00f9\u00f5\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa/\3\2\2\2\u00fb\u0102"+
		"\5\64\33\2\u00fc\u00fd\7\21\2\2\u00fd\u00fe\7\25\2\2\u00fe\u00ff\5\62"+
		"\32\2\u00ff\u0100\7\26\2\2\u0100\u0102\3\2\2\2\u0101\u00fb\3\2\2\2\u0101"+
		"\u00fc\3\2\2\2\u0102\61\3\2\2\2\u0103\u0108\5 \21\2\u0104\u0105\7\22\2"+
		"\2\u0105\u0107\5 \21\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u0103\3\2\2\2\u010b\u010c\3\2\2\2\u010c\63\3\2\2\2\u010d\u0111\5\66\34"+
		"\2\u010e\u0111\58\35\2\u010f\u0111\7\21\2\2\u0110\u010d\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\65\3\2\2\2\u0112\u0113\7\25\2"+
		"\2\u0113\u0114\5 \21\2\u0114\u0115\7\26\2\2\u0115\67\3\2\2\2\u0116\u0117"+
		"\t\3\2\2\u01179\3\2\2\2\34=?FOX[oz~\u0083\u0096\u00a5\u00b0\u00bc\u00be"+
		"\u00d0\u00d2\u00de\u00e0\u00ef\u00f1\u00f9\u0101\u0108\u010b\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}