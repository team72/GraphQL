// Generated from Graphql.g4 by ANTLR 4.5.1

    package graphql.parser.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BooleanValue=15, NullValue=16, 
		FRAGMENT=17, QUERY=18, MUTATION=19, SUBSCRIPTION=20, SCHEMA=21, SCALAR=22, 
		TYPE=23, INTERFACE=24, IMPLEMENTS=25, ENUM=26, UNION=27, INPUT=28, EXTEND=29, 
		DIRECTIVE=30, NAME=31, IntValue=32, FloatValue=33, Sign=34, IntegerPart=35, 
		NonZeroDigit=36, ExponentPart=37, Digit=38, StringValue=39, Comment=40, 
		Ignored=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "BooleanValue", "NullValue", 
		"FRAGMENT", "QUERY", "MUTATION", "SUBSCRIPTION", "SCHEMA", "SCALAR", "TYPE", 
		"INTERFACE", "IMPLEMENTS", "ENUM", "UNION", "INPUT", "EXTEND", "DIRECTIVE", 
		"NAME", "IntValue", "FloatValue", "Sign", "IntegerPart", "NonZeroDigit", 
		"ExponentPart", "Digit", "StringValue", "Comment", "Ignored", "EscapedChar", 
		"Unicode", "Hex", "LineTerminator", "Whitespace", "Comma"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "':'", "'$'", "'='", "'{'", "'}'", "'...'", "'on'", 
		"'['", "']'", "'@'", "'!'", "'|'", null, "'null'", "'fragment'", "'query'", 
		"'mutation'", "'subscription'", "'schema'", "'scalar'", "'type'", "'interface'", 
		"'implements'", "'enum'", "'union'", "'input'", "'extend'", "'directive'", 
		null, null, null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "BooleanValue", "NullValue", "FRAGMENT", "QUERY", "MUTATION", 
		"SUBSCRIPTION", "SCHEMA", "SCALAR", "TYPE", "INTERFACE", "IMPLEMENTS", 
		"ENUM", "UNION", "INPUT", "EXTEND", "DIRECTIVE", "NAME", "IntValue", "FloatValue", 
		"Sign", "IntegerPart", "NonZeroDigit", "ExponentPart", "Digit", "StringValue", 
		"Comment", "Ignored"
	};
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


	public GraphqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Graphql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u0161\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u008a\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \7 \u0102\n \f \16 \u0105\13"+
		" \3!\5!\u0108\n!\3!\3!\3\"\5\"\u010d\n\"\3\"\3\"\3\"\7\"\u0112\n\"\f\""+
		"\16\"\u0115\13\"\5\"\u0117\n\"\3\"\5\"\u011a\n\"\3#\3#\3$\3$\3$\3$\6$"+
		"\u0122\n$\r$\16$\u0123\5$\u0126\n$\3%\3%\3&\3&\5&\u012c\n&\3&\6&\u012f"+
		"\n&\r&\16&\u0130\3\'\3\'\3(\3(\3(\7(\u0138\n(\f(\16(\u013b\13(\3(\3(\3"+
		")\3)\7)\u0141\n)\f)\16)\u0144\13)\3)\3)\3*\3*\3*\5*\u014b\n*\3*\3*\3+"+
		"\3+\3+\5+\u0152\n+\3,\3,\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\2\2\61"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W\2Y\2[\2]\2_\2\3\2\n\5\2C\\aac|\6\2\62;"+
		"C\\aac|\4\2GGgg\7\2\f\f\17\17$$^^\u202a\u202b\5\2\f\f\17\17\u202a\u202b"+
		"\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\6\2\13\13\r\16\"\"\u00a2\u00a2\u016c"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3"+
		"a\3\2\2\2\5c\3\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13i\3\2\2\2\rk\3\2\2\2\17m"+
		"\3\2\2\2\21o\3\2\2\2\23s\3\2\2\2\25v\3\2\2\2\27x\3\2\2\2\31z\3\2\2\2\33"+
		"|\3\2\2\2\35~\3\2\2\2\37\u0089\3\2\2\2!\u008b\3\2\2\2#\u0090\3\2\2\2%"+
		"\u0099\3\2\2\2\'\u009f\3\2\2\2)\u00a8\3\2\2\2+\u00b5\3\2\2\2-\u00bc\3"+
		"\2\2\2/\u00c3\3\2\2\2\61\u00c8\3\2\2\2\63\u00d2\3\2\2\2\65\u00dd\3\2\2"+
		"\2\67\u00e2\3\2\2\29\u00e8\3\2\2\2;\u00ee\3\2\2\2=\u00f5\3\2\2\2?\u00ff"+
		"\3\2\2\2A\u0107\3\2\2\2C\u010c\3\2\2\2E\u011b\3\2\2\2G\u0125\3\2\2\2I"+
		"\u0127\3\2\2\2K\u0129\3\2\2\2M\u0132\3\2\2\2O\u0134\3\2\2\2Q\u013e\3\2"+
		"\2\2S\u014a\3\2\2\2U\u014e\3\2\2\2W\u0153\3\2\2\2Y\u0159\3\2\2\2[\u015b"+
		"\3\2\2\2]\u015d\3\2\2\2_\u015f\3\2\2\2ab\7*\2\2b\4\3\2\2\2cd\7+\2\2d\6"+
		"\3\2\2\2ef\7<\2\2f\b\3\2\2\2gh\7&\2\2h\n\3\2\2\2ij\7?\2\2j\f\3\2\2\2k"+
		"l\7}\2\2l\16\3\2\2\2mn\7\177\2\2n\20\3\2\2\2op\7\60\2\2pq\7\60\2\2qr\7"+
		"\60\2\2r\22\3\2\2\2st\7q\2\2tu\7p\2\2u\24\3\2\2\2vw\7]\2\2w\26\3\2\2\2"+
		"xy\7_\2\2y\30\3\2\2\2z{\7B\2\2{\32\3\2\2\2|}\7#\2\2}\34\3\2\2\2~\177\7"+
		"~\2\2\177\36\3\2\2\2\u0080\u0081\7v\2\2\u0081\u0082\7t\2\2\u0082\u0083"+
		"\7w\2\2\u0083\u008a\7g\2\2\u0084\u0085\7h\2\2\u0085\u0086\7c\2\2\u0086"+
		"\u0087\7n\2\2\u0087\u0088\7u\2\2\u0088\u008a\7g\2\2\u0089\u0080\3\2\2"+
		"\2\u0089\u0084\3\2\2\2\u008a \3\2\2\2\u008b\u008c\7p\2\2\u008c\u008d\7"+
		"w\2\2\u008d\u008e\7n\2\2\u008e\u008f\7n\2\2\u008f\"\3\2\2\2\u0090\u0091"+
		"\7h\2\2\u0091\u0092\7t\2\2\u0092\u0093\7c\2\2\u0093\u0094\7i\2\2\u0094"+
		"\u0095\7o\2\2\u0095\u0096\7g\2\2\u0096\u0097\7p\2\2\u0097\u0098\7v\2\2"+
		"\u0098$\3\2\2\2\u0099\u009a\7s\2\2\u009a\u009b\7w\2\2\u009b\u009c\7g\2"+
		"\2\u009c\u009d\7t\2\2\u009d\u009e\7{\2\2\u009e&\3\2\2\2\u009f\u00a0\7"+
		"o\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4"+
		"\7v\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7p\2\2\u00a7"+
		"(\3\2\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7d\2\2\u00ab"+
		"\u00ac\7u\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7k\2\2"+
		"\u00af\u00b0\7r\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3"+
		"\7q\2\2\u00b3\u00b4\7p\2\2\u00b4*\3\2\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7"+
		"\7e\2\2\u00b7\u00b8\7j\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7o\2\2\u00ba"+
		"\u00bb\7c\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7e\2\2\u00be"+
		"\u00bf\7c\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7t\2\2"+
		"\u00c2.\3\2\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7{\2\2\u00c5\u00c6\7r\2"+
		"\2\u00c6\u00c7\7g\2\2\u00c7\60\3\2\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca"+
		"\7p\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7t\2\2\u00cd"+
		"\u00ce\7h\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7g\2\2"+
		"\u00d1\62\3\2\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7o\2\2\u00d4\u00d5\7"+
		"r\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7o\2\2\u00d8\u00d9"+
		"\7g\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7u\2\2\u00dc"+
		"\64\3\2\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7w\2\2\u00e0"+
		"\u00e1\7o\2\2\u00e1\66\3\2\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7p\2\2\u00e4"+
		"\u00e5\7k\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7p\2\2\u00e78\3\2\2\2\u00e8"+
		"\u00e9\7k\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7r\2\2\u00eb\u00ec\7w\2\2"+
		"\u00ec\u00ed\7v\2\2\u00ed:\3\2\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7z\2"+
		"\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4"+
		"\7f\2\2\u00f4<\3\2\2\2\u00f5\u00f6\7f\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8"+
		"\7t\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7e\2\2\u00fa\u00fb\7v\2\2\u00fb"+
		"\u00fc\7k\2\2\u00fc\u00fd\7x\2\2\u00fd\u00fe\7g\2\2\u00fe>\3\2\2\2\u00ff"+
		"\u0103\t\2\2\2\u0100\u0102\t\3\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104@\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0106\u0108\5E#\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\5G$\2\u010aB\3\2\2\2\u010b\u010d\5E#\2\u010c"+
		"\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0116\5G"+
		"$\2\u010f\u0113\7\60\2\2\u0110\u0112\5M\'\2\u0111\u0110\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0117\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0116\u010f\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0119\3\2\2\2\u0118\u011a\5K&\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2"+
		"\2\u011aD\3\2\2\2\u011b\u011c\7/\2\2\u011cF\3\2\2\2\u011d\u0126\7\62\2"+
		"\2\u011e\u0126\5I%\2\u011f\u0121\5I%\2\u0120\u0122\5M\'\2\u0121\u0120"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u011d\3\2\2\2\u0125\u011e\3\2\2\2\u0125\u011f\3\2"+
		"\2\2\u0126H\3\2\2\2\u0127\u0128\4\63;\2\u0128J\3\2\2\2\u0129\u012b\t\4"+
		"\2\2\u012a\u012c\5E#\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e"+
		"\3\2\2\2\u012d\u012f\5M\'\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131L\3\2\2\2\u0132\u0133\4\62;\2"+
		"\u0133N\3\2\2\2\u0134\u0139\7$\2\2\u0135\u0138\n\5\2\2\u0136\u0138\5U"+
		"+\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013c\u013d\7$\2\2\u013dP\3\2\2\2\u013e\u0142\7%\2\2\u013f\u0141"+
		"\n\6\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\b)"+
		"\2\2\u0146R\3\2\2\2\u0147\u014b\5]/\2\u0148\u014b\5_\60\2\u0149\u014b"+
		"\5[.\2\u014a\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014d\b*\3\2\u014dT\3\2\2\2\u014e\u0151\7^\2\2\u014f"+
		"\u0152\t\7\2\2\u0150\u0152\5W,\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2"+
		"\2\u0152V\3\2\2\2\u0153\u0154\7w\2\2\u0154\u0155\5Y-\2\u0155\u0156\5Y"+
		"-\2\u0156\u0157\5Y-\2\u0157\u0158\5Y-\2\u0158X\3\2\2\2\u0159\u015a\t\b"+
		"\2\2\u015aZ\3\2\2\2\u015b\u015c\t\6\2\2\u015c\\\3\2\2\2\u015d\u015e\t"+
		"\t\2\2\u015e^\3\2\2\2\u015f\u0160\7.\2\2\u0160`\3\2\2\2\23\2\u0089\u0103"+
		"\u0107\u010c\u0113\u0116\u0119\u0123\u0125\u012b\u0130\u0137\u0139\u0142"+
		"\u014a\u0151\4\2\4\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}