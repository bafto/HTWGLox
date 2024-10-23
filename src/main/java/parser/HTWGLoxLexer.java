// Generated from HTWGLoxLexer.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTWGLoxLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Digit", "Alpha", "Alphanumeric", "NUMBER_LITERAL", "STRING_LITERAL", 
			"TRUE", "FALSE", "FUNC", "RETURN", "VAR", "NUM", "STR", "BOOL", "PRINT", 
			"IF", "ELSE", "FOR", "IDENTIFIER", "COMMA", "COLON", "SEMICOLON", "LPAREN", 
			"RPAREN", "LCBRACE", "RCBRACE", "ARROW", "MINUS", "SLASH", "STAR", "PLUS", 
			"UNEQUAL", "EXCLAMATION_MARK", "EQUAL", "ASSIGN", "GREATER_EQUAL", "LESS_EQUAL", 
			"LESS", "GREATER", "PERCENT", "BOOL_AND", "BOOL_OR", "WS", "COMMENT", 
			"LINE_COMMENT"
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


	public HTWGLoxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTWGLoxLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u010d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5c\n\5\r\5\16\5d\3\5\3\5\6\5"+
		"i\n\5\r\5\16\5j\5\5m\n\5\3\6\3\6\7\6q\n\6\f\6\16\6t\13\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u00b4\n\23"+
		"\f\23\16\23\u00b7\13\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\6+\u00ef\n+\r+\16+\u00f0\3+\3+\3,\3,\3"+
		",\3,\7,\u00f9\n,\f,\16,\u00fc\13,\3,\3,\3,\3,\3,\3-\3-\3-\3-\7-\u0107"+
		"\n-\f-\16-\u010a\13-\3-\3-\3\u00fa\2.\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21"+
		"\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/"+
		"\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)"+
		"W*Y+\3\2\b\3\2\62;\f\2C\\aac|\u00c6\u00c6\u00d8\u00d8\u00de\u00de\u00e1"+
		"\u00e1\u00e6\u00e6\u00f8\u00f8\u00fe\u00fe\r\2\62;C\\aac|\u00c6\u00c6"+
		"\u00d8\u00d8\u00de\u00de\u00e1\u00e1\u00e6\u00e6\u00f8\u00f8\u00fe\u00fe"+
		"\3\2$$\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0111\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3\2"+
		"\2\2\tb\3\2\2\2\13n\3\2\2\2\rw\3\2\2\2\17|\3\2\2\2\21\u0082\3\2\2\2\23"+
		"\u0087\3\2\2\2\25\u008e\3\2\2\2\27\u0092\3\2\2\2\31\u0096\3\2\2\2\33\u009a"+
		"\3\2\2\2\35\u009f\3\2\2\2\37\u00a5\3\2\2\2!\u00a8\3\2\2\2#\u00ad\3\2\2"+
		"\2%\u00b1\3\2\2\2\'\u00b8\3\2\2\2)\u00ba\3\2\2\2+\u00bc\3\2\2\2-\u00be"+
		"\3\2\2\2/\u00c0\3\2\2\2\61\u00c2\3\2\2\2\63\u00c4\3\2\2\2\65\u00c6\3\2"+
		"\2\2\67\u00c9\3\2\2\29\u00cb\3\2\2\2;\u00cd\3\2\2\2=\u00cf\3\2\2\2?\u00d1"+
		"\3\2\2\2A\u00d4\3\2\2\2C\u00d6\3\2\2\2E\u00d9\3\2\2\2G\u00db\3\2\2\2I"+
		"\u00de\3\2\2\2K\u00e1\3\2\2\2M\u00e3\3\2\2\2O\u00e5\3\2\2\2Q\u00e7\3\2"+
		"\2\2S\u00ea\3\2\2\2U\u00ee\3\2\2\2W\u00f4\3\2\2\2Y\u0102\3\2\2\2[\\\t"+
		"\2\2\2\\\4\3\2\2\2]^\t\3\2\2^\6\3\2\2\2_`\t\4\2\2`\b\3\2\2\2ac\5\3\2\2"+
		"ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2el\3\2\2\2fh\7\60\2\2gi\5\3\2"+
		"\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lf\3\2\2\2lm\3\2\2"+
		"\2m\n\3\2\2\2nr\7$\2\2oq\n\5\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2"+
		"\2su\3\2\2\2tr\3\2\2\2uv\7$\2\2v\f\3\2\2\2wx\7v\2\2xy\7t\2\2yz\7w\2\2"+
		"z{\7g\2\2{\16\3\2\2\2|}\7h\2\2}~\7c\2\2~\177\7n\2\2\177\u0080\7u\2\2\u0080"+
		"\u0081\7g\2\2\u0081\20\3\2\2\2\u0082\u0083\7h\2\2\u0083\u0084\7w\2\2\u0084"+
		"\u0085\7p\2\2\u0085\u0086\7e\2\2\u0086\22\3\2\2\2\u0087\u0088\7t\2\2\u0088"+
		"\u0089\7g\2\2\u0089\u008a\7v\2\2\u008a\u008b\7w\2\2\u008b\u008c\7t\2\2"+
		"\u008c\u008d\7p\2\2\u008d\24\3\2\2\2\u008e\u008f\7x\2\2\u008f\u0090\7"+
		"c\2\2\u0090\u0091\7t\2\2\u0091\26\3\2\2\2\u0092\u0093\7p\2\2\u0093\u0094"+
		"\7w\2\2\u0094\u0095\7o\2\2\u0095\30\3\2\2\2\u0096\u0097\7u\2\2\u0097\u0098"+
		"\7v\2\2\u0098\u0099\7t\2\2\u0099\32\3\2\2\2\u009a\u009b\7d\2\2\u009b\u009c"+
		"\7q\2\2\u009c\u009d\7q\2\2\u009d\u009e\7n\2\2\u009e\34\3\2\2\2\u009f\u00a0"+
		"\7r\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3"+
		"\u00a4\7v\2\2\u00a4\36\3\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7h\2\2\u00a7"+
		" \3\2\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7u\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7h\2\2\u00ae\u00af\7q\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0$\3\2\2\2\u00b1\u00b5\5\5\3\2\u00b2\u00b4\5\7\4\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6&\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7.\2\2\u00b9(\3\2"+
		"\2\2\u00ba\u00bb\7<\2\2\u00bb*\3\2\2\2\u00bc\u00bd\7=\2\2\u00bd,\3\2\2"+
		"\2\u00be\u00bf\7*\2\2\u00bf.\3\2\2\2\u00c0\u00c1\7+\2\2\u00c1\60\3\2\2"+
		"\2\u00c2\u00c3\7}\2\2\u00c3\62\3\2\2\2\u00c4\u00c5\7\177\2\2\u00c5\64"+
		"\3\2\2\2\u00c6\u00c7\7/\2\2\u00c7\u00c8\7@\2\2\u00c8\66\3\2\2\2\u00c9"+
		"\u00ca\7/\2\2\u00ca8\3\2\2\2\u00cb\u00cc\7\61\2\2\u00cc:\3\2\2\2\u00cd"+
		"\u00ce\7,\2\2\u00ce<\3\2\2\2\u00cf\u00d0\7-\2\2\u00d0>\3\2\2\2\u00d1\u00d2"+
		"\7#\2\2\u00d2\u00d3\7?\2\2\u00d3@\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5B\3"+
		"\2\2\2\u00d6\u00d7\7?\2\2\u00d7\u00d8\7?\2\2\u00d8D\3\2\2\2\u00d9\u00da"+
		"\7?\2\2\u00daF\3\2\2\2\u00db\u00dc\7@\2\2\u00dc\u00dd\7?\2\2\u00ddH\3"+
		"\2\2\2\u00de\u00df\7>\2\2\u00df\u00e0\7?\2\2\u00e0J\3\2\2\2\u00e1\u00e2"+
		"\7>\2\2\u00e2L\3\2\2\2\u00e3\u00e4\7@\2\2\u00e4N\3\2\2\2\u00e5\u00e6\7"+
		"\'\2\2\u00e6P\3\2\2\2\u00e7\u00e8\7(\2\2\u00e8\u00e9\7(\2\2\u00e9R\3\2"+
		"\2\2\u00ea\u00eb\7~\2\2\u00eb\u00ec\7~\2\2\u00ecT\3\2\2\2\u00ed\u00ef"+
		"\t\6\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b+\2\2\u00f3V\3\2\2\2\u00f4"+
		"\u00f5\7\61\2\2\u00f5\u00f6\7,\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f9\13"+
		"\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7,"+
		"\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b,\2\2\u0101"+
		"X\3\2\2\2\u0102\u0103\7\61\2\2\u0103\u0104\7\61\2\2\u0104\u0108\3\2\2"+
		"\2\u0105\u0107\n\7\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010c\b-\2\2\u010cZ\3\2\2\2\13\2djlr\u00b5\u00f0\u00fa\u0108\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}