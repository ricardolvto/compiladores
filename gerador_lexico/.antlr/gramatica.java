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
		PALAVRA_CHAVE=1, CADEIA=2, IDENT=3, COMENTARIO=4, WS=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "CADEIA", "ESC_SEQ", "IDENT", "COMENTARIO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "CADEIA", "IDENT", "COMENTARIO", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7h\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2@\n\2\3\3\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\5\3\5\7\5Q\n\5\f\5\16\5T\13\5\3\6\3\6\7\6X\n\6\f\6"+
		"\16\6[\13\6\3\6\5\6^\n\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\2\2\b\3\3"+
		"\5\4\7\2\t\5\13\6\r\7\3\2\b\4\2*+<<\4\2))^^\4\2C\\c|\5\2\62;C\\c|\4\2"+
		"\f\f\17\17\5\2\13\f\17\17\"\"\2q\2\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7K\3\2\2\2\tN\3\2\2\2\13"+
		"U\3\2\2\2\rd\3\2\2\2\17\20\7c\2\2\20\21\7n\2\2\21\22\7i\2\2\22\23\7q\2"+
		"\2\23\24\7t\2\2\24\25\7k\2\2\25\26\7v\2\2\26\27\7o\2\2\27@\7q\2\2\30\31"+
		"\7f\2\2\31\32\7g\2\2\32\33\7e\2\2\33\34\7n\2\2\34\35\7c\2\2\35\36\7t\2"+
		"\2\36@\7g\2\2\37 \7k\2\2 !\7p\2\2!\"\7v\2\2\"#\7g\2\2#$\7k\2\2$%\7t\2"+
		"\2%@\7q\2\2&\'\7n\2\2\'(\7g\2\2()\7k\2\2)@\7c\2\2*+\7g\2\2+,\7u\2\2,-"+
		"\7e\2\2-.\7t\2\2./\7g\2\2/\60\7x\2\2\60@\7c\2\2\61\62\7h\2\2\62\63\7k"+
		"\2\2\63\64\7o\2\2\64\65\7a\2\2\65\66\7c\2\2\66\67\7n\2\2\678\7i\2\289"+
		"\7q\2\29:\7t\2\2:;\7k\2\2;<\7v\2\2<=\7o\2\2=@\7q\2\2>@\t\2\2\2?\17\3\2"+
		"\2\2?\30\3\2\2\2?\37\3\2\2\2?&\3\2\2\2?*\3\2\2\2?\61\3\2\2\2?>\3\2\2\2"+
		"@\4\3\2\2\2AF\7$\2\2BE\5\7\4\2CE\n\3\2\2DB\3\2\2\2DC\3\2\2\2EH\3\2\2\2"+
		"FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7$\2\2J\6\3\2\2\2KL\7^\2\2"+
		"LM\7$\2\2M\b\3\2\2\2NR\t\4\2\2OQ\t\5\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2"+
		"RS\3\2\2\2S\n\3\2\2\2TR\3\2\2\2UY\7}\2\2VX\n\6\2\2WV\3\2\2\2X[\3\2\2\2"+
		"YW\3\2\2\2YZ\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2\\^\7\17\2\2]\\\3\2\2\2]^\3\2"+
		"\2\2^_\3\2\2\2_`\7\177\2\2`a\7\f\2\2ab\3\2\2\2bc\b\6\2\2c\f\3\2\2\2de"+
		"\t\7\2\2ef\3\2\2\2fg\b\7\2\2g\16\3\2\2\2\t\2?DFRY]\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}