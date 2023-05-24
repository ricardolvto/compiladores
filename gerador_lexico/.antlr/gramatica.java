// Generated from /media/ivancalvo/HD Linux/UFSCar/Compiladores/Trabalhos/trabalho1/compiladores/gerador_lexico/gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramatica extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, NUM_INT=2, NUM_REAL=3, IDENT=4, CADEIA=5, COMENTARIO=6, 
		WS=7, DOIS_PONTOS=8, ABRE_PARENTESES=9, FECHA_PARENTESES=10, VIRGULA=11, 
		OP_RELACIONAL=12, OP_ATRIBUICAO=13, OP_ACESSO=14, OP_ARITMETICO=15, ERR=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "IDENT", "CADEIA", "ESC_SEQ", 
			"COMENTARIO", "WS", "DOIS_PONTOS", "ABRE_PARENTESES", "FECHA_PARENTESES", 
			"VIRGULA", "OP_RELACIONAL", "OP_ATRIBUICAO", "OP_ACESSO", "OP_ARITMETICO", 
			"ERR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "':'", null, null, "','", 
			null, "'<-'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "IDENT", "CADEIA", "COMENTARIO", 
			"WS", "DOIS_PONTOS", "ABRE_PARENTESES", "FECHA_PARENTESES", "VIRGULA", 
			"OP_RELACIONAL", "OP_ATRIBUICAO", "OP_ACESSO", "OP_ARITMETICO", "ERR"
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


	public gramatica(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0171\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\5\2\u011b\n\2\3\3\6\3\u011e\n\3\r\3\16\3\u011f\3\4\6\4\u0123\n"+
		"\4\r\4\16\4\u0124\3\4\3\4\6\4\u0129\n\4\r\4\16\4\u012a\5\4\u012d\n\4\3"+
		"\5\3\5\7\5\u0131\n\5\f\5\16\5\u0134\13\5\3\6\3\6\3\6\7\6\u0139\n\6\f\6"+
		"\16\6\u013c\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\7\b\u0145\n\b\f\b\16\b\u0148"+
		"\13\b\3\b\5\b\u014b\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0167\n\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\2\2\23\3"+
		"\3\5\4\7\5\t\6\13\7\r\2\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37"+
		"\20!\21#\22\3\2\13\5\2C\\aac|\6\2\62;C\\aac|\4\2))^^\4\2\f\f\17\17\5\2"+
		"\13\f\17\17\"\"\4\2**]]\4\2++__\7\2\'(,-//\61\61``\3\2cc\2\u01a1\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3\u011a\3\2\2\2"+
		"\5\u011d\3\2\2\2\7\u0122\3\2\2\2\t\u012e\3\2\2\2\13\u0135\3\2\2\2\r\u013f"+
		"\3\2\2\2\17\u0142\3\2\2\2\21\u0151\3\2\2\2\23\u0155\3\2\2\2\25\u0157\3"+
		"\2\2\2\27\u0159\3\2\2\2\31\u015b\3\2\2\2\33\u0166\3\2\2\2\35\u0168\3\2"+
		"\2\2\37\u016b\3\2\2\2!\u016d\3\2\2\2#\u016f\3\2\2\2%&\7c\2\2&\'\7n\2\2"+
		"\'(\7i\2\2()\7q\2\2)*\7t\2\2*+\7k\2\2+,\7v\2\2,-\7o\2\2-\u011b\7q\2\2"+
		"./\7f\2\2/\60\7g\2\2\60\61\7e\2\2\61\62\7n\2\2\62\63\7c\2\2\63\64\7t\2"+
		"\2\64\u011b\7g\2\2\65\66\7n\2\2\66\67\7k\2\2\678\7v\2\289\7g\2\29:\7t"+
		"\2\2:;\7c\2\2;\u011b\7n\2\2<=\7k\2\2=>\7p\2\2>?\7v\2\2?@\7g\2\2@A\7k\2"+
		"\2AB\7t\2\2B\u011b\7q\2\2CD\7t\2\2DE\7g\2\2EF\7c\2\2F\u011b\7n\2\2GH\7"+
		"n\2\2HI\7q\2\2IJ\7i\2\2JK\7k\2\2KL\7e\2\2L\u011b\7q\2\2MN\7q\2\2N\u011b"+
		"\7w\2\2OP\7p\2\2PQ\7c\2\2Q\u011b\7q\2\2RS\7n\2\2ST\7g\2\2TU\7k\2\2U\u011b"+
		"\7c\2\2VW\7u\2\2W\u011b\7g\2\2XY\7h\2\2YZ\7k\2\2Z[\7o\2\2[\\\7a\2\2\\"+
		"]\7u\2\2]\u011b\7g\2\2^_\7u\2\2_`\7g\2\2`a\7p\2\2ab\7c\2\2b\u011b\7q\2"+
		"\2cd\7g\2\2de\7p\2\2ef\7v\2\2fg\7c\2\2g\u011b\7q\2\2hi\7h\2\2ij\7c\2\2"+
		"jk\7n\2\2kl\7u\2\2l\u011b\7q\2\2mn\7x\2\2no\7g\2\2op\7t\2\2pq\7f\2\2q"+
		"r\7c\2\2rs\7f\2\2st\7g\2\2tu\7k\2\2uv\7t\2\2v\u011b\7q\2\2wx\7e\2\2xy"+
		"\7c\2\2yz\7u\2\2z\u011b\7q\2\2{\u011b\7g\2\2|}\7h\2\2}~\7k\2\2~\177\7"+
		"o\2\2\177\u0080\7a\2\2\u0080\u0081\7e\2\2\u0081\u0082\7c\2\2\u0082\u0083"+
		"\7u\2\2\u0083\u011b\7q\2\2\u0084\u0085\7g\2\2\u0085\u0086\7u\2\2\u0086"+
		"\u0087\7e\2\2\u0087\u0088\7t\2\2\u0088\u0089\7g\2\2\u0089\u008a\7x\2\2"+
		"\u008a\u011b\7c\2\2\u008b\u008c\7u\2\2\u008c\u008d\7g\2\2\u008d\u008e"+
		"\7l\2\2\u008e\u011b\7c\2\2\u008f\u0090\7r\2\2\u0090\u0091\7c\2\2\u0091"+
		"\u0092\7t\2\2\u0092\u011b\7c\2\2\u0093\u0094\7c\2\2\u0094\u0095\7v\2\2"+
		"\u0095\u011b\7g\2\2\u0096\u0097\7h\2\2\u0097\u0098\7c\2\2\u0098\u0099"+
		"\7e\2\2\u0099\u011b\7c\2\2\u009a\u009b\7h\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7o\2\2\u009d\u009e\7a\2\2\u009e\u009f\7r\2\2\u009f\u00a0\7c\2\2"+
		"\u00a0\u00a1\7t\2\2\u00a1\u011b\7c\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4"+
		"\7p\2\2\u00a4\u00a5\7s\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7c\2\2\u00a7"+
		"\u00a8\7p\2\2\u00a8\u00a9\7v\2\2\u00a9\u011b\7q\2\2\u00aa\u00ab\7h\2\2"+
		"\u00ab\u00ac\7k\2\2\u00ac\u00ad\7o\2\2\u00ad\u00ae\7a\2\2\u00ae\u00af"+
		"\7g\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7s\2\2\u00b1\u00b2\7w\2\2\u00b2"+
		"\u00b3\7c\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7v\2\2\u00b5\u011b\7q\2\2"+
		"\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7i\2\2\u00b9\u00ba"+
		"\7k\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7t\2\2\u00bd"+
		"\u011b\7q\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7o\2\2"+
		"\u00c1\u00c2\7a\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5"+
		"\7i\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7v\2\2\u00c8"+
		"\u00c9\7t\2\2\u00c9\u011b\7q\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7k\2\2"+
		"\u00cc\u00cd\7r\2\2\u00cd\u011b\7q\2\2\u00ce\u00cf\7r\2\2\u00cf\u00d0"+
		"\7t\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7g\2\2\u00d3"+
		"\u00d4\7f\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7o\2\2\u00d6\u00d7\7g\2\2"+
		"\u00d7\u00d8\7p\2\2\u00d8\u00d9\7v\2\2\u00d9\u011b\7q\2\2\u00da\u00db"+
		"\7x\2\2\u00db\u00dc\7c\2\2\u00dc\u011b\7t\2\2\u00dd\u00de\7h\2\2\u00de"+
		"\u00df\7k\2\2\u00df\u00e0\7o\2\2\u00e0\u00e1\7a\2\2\u00e1\u00e2\7r\2\2"+
		"\u00e2\u00e3\7t\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6"+
		"\7g\2\2\u00e6\u00e7\7f\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7o\2\2\u00e9"+
		"\u00ea\7g\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7v\2\2\u00ec\u011b\7q\2\2"+
		"\u00ed\u00ee\7h\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1"+
		"\7e\2\2\u00f1\u00f2\7c\2\2\u00f2\u011b\7q\2\2\u00f3\u00f4\7h\2\2\u00f4"+
		"\u00f5\7k\2\2\u00f5\u00f6\7o\2\2\u00f6\u00f7\7a\2\2\u00f7\u00f8\7h\2\2"+
		"\u00f8\u00f9\7w\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7e\2\2\u00fb\u00fc"+
		"\7c\2\2\u00fc\u011b\7q\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7g\2\2\u00ff"+
		"\u0100\7v\2\2\u0100\u0101\7q\2\2\u0101\u0102\7t\2\2\u0102\u0103\7p\2\2"+
		"\u0103\u011b\7g\2\2\u0104\u0105\7e\2\2\u0105\u0106\7q\2\2\u0106\u0107"+
		"\7p\2\2\u0107\u0108\7u\2\2\u0108\u0109\7v\2\2\u0109\u010a\7c\2\2\u010a"+
		"\u010b\7p\2\2\u010b\u010c\7v\2\2\u010c\u011b\7g\2\2\u010d\u010e\7h\2\2"+
		"\u010e\u010f\7k\2\2\u010f\u0110\7o\2\2\u0110\u0111\7a\2\2\u0111\u0112"+
		"\7c\2\2\u0112\u0113\7n\2\2\u0113\u0114\7i\2\2\u0114\u0115\7q\2\2\u0115"+
		"\u0116\7t\2\2\u0116\u0117\7k\2\2\u0117\u0118\7v\2\2\u0118\u0119\7o\2\2"+
		"\u0119\u011b\7q\2\2\u011a%\3\2\2\2\u011a.\3\2\2\2\u011a\65\3\2\2\2\u011a"+
		"<\3\2\2\2\u011aC\3\2\2\2\u011aG\3\2\2\2\u011aM\3\2\2\2\u011aO\3\2\2\2"+
		"\u011aR\3\2\2\2\u011aV\3\2\2\2\u011aX\3\2\2\2\u011a^\3\2\2\2\u011ac\3"+
		"\2\2\2\u011ah\3\2\2\2\u011am\3\2\2\2\u011aw\3\2\2\2\u011a{\3\2\2\2\u011a"+
		"|\3\2\2\2\u011a\u0084\3\2\2\2\u011a\u008b\3\2\2\2\u011a\u008f\3\2\2\2"+
		"\u011a\u0093\3\2\2\2\u011a\u0096\3\2\2\2\u011a\u009a\3\2\2\2\u011a\u00a2"+
		"\3\2\2\2\u011a\u00aa\3\2\2\2\u011a\u00b6\3\2\2\2\u011a\u00be\3\2\2\2\u011a"+
		"\u00ca\3\2\2\2\u011a\u00ce\3\2\2\2\u011a\u00da\3\2\2\2\u011a\u00dd\3\2"+
		"\2\2\u011a\u00ed\3\2\2\2\u011a\u00f3\3\2\2\2\u011a\u00fd\3\2\2\2\u011a"+
		"\u0104\3\2\2\2\u011a\u010d\3\2\2\2\u011b\4\3\2\2\2\u011c\u011e\4\62;\2"+
		"\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\6\3\2\2\2\u0121\u0123\4\62;\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u012c\3\2"+
		"\2\2\u0126\u0128\7\60\2\2\u0127\u0129\4\62;\2\u0128\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2"+
		"\2\2\u012c\u0126\3\2\2\2\u012c\u012d\3\2\2\2\u012d\b\3\2\2\2\u012e\u0132"+
		"\t\2\2\2\u012f\u0131\t\3\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\n\3\2\2\2\u0134\u0132\3\2\2\2"+
		"\u0135\u013a\7$\2\2\u0136\u0139\5\r\7\2\u0137\u0139\n\4\2\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7$"+
		"\2\2\u013e\f\3\2\2\2\u013f\u0140\7^\2\2\u0140\u0141\7)\2\2\u0141\16\3"+
		"\2\2\2\u0142\u0146\7}\2\2\u0143\u0145\n\5\2\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0149\u014b\7\17\2\2\u014a\u0149\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7\177\2\2\u014d\u014e\7"+
		"\f\2\2\u014e\u014f\3\2\2\2\u014f\u0150\b\b\2\2\u0150\20\3\2\2\2\u0151"+
		"\u0152\t\6\2\2\u0152\u0153\3\2\2\2\u0153\u0154\b\t\2\2\u0154\22\3\2\2"+
		"\2\u0155\u0156\7<\2\2\u0156\24\3\2\2\2\u0157\u0158\t\7\2\2\u0158\26\3"+
		"\2\2\2\u0159\u015a\t\b\2\2\u015a\30\3\2\2\2\u015b\u015c\7.\2\2\u015c\32"+
		"\3\2\2\2\u015d\u0167\7@\2\2\u015e\u015f\7@\2\2\u015f\u0167\7?\2\2\u0160"+
		"\u0167\7>\2\2\u0161\u0162\7>\2\2\u0162\u0167\7?\2\2\u0163\u0164\7>\2\2"+
		"\u0164\u0167\7@\2\2\u0165\u0167\7?\2\2\u0166\u015d\3\2\2\2\u0166\u015e"+
		"\3\2\2\2\u0166\u0160\3\2\2\2\u0166\u0161\3\2\2\2\u0166\u0163\3\2\2\2\u0166"+
		"\u0165\3\2\2\2\u0167\34\3\2\2\2\u0168\u0169\7>\2\2\u0169\u016a\7/\2\2"+
		"\u016a\36\3\2\2\2\u016b\u016c\7\60\2\2\u016c \3\2\2\2\u016d\u016e\t\t"+
		"\2\2\u016e\"\3\2\2\2\u016f\u0170\n\n\2\2\u0170$\3\2\2\2\16\2\u011a\u011f"+
		"\u0124\u012a\u012c\u0132\u0138\u013a\u0146\u014a\u0166\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}