// Generated from Educodar.g4 by ANTLR 4.5.2
package educodar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EducodarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CURLY_BRACKET_L=1, CURLY_BRACKET_R=2, COMMAND_SEPARATOR=3, PROGRAM_KW=4, 
		ROUTES_KW=5, FOR_KW=6, DO_KW=7, RETURN_KW=8, LETTER=9, DIGIT=10, SPECIAL_CHAR=11, 
		STRING=12, WHITESPACE=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CURLY_BRACKET_L", "CURLY_BRACKET_R", "COMMAND_SEPARATOR", "PROGRAM_KW", 
		"ROUTES_KW", "FOR_KW", "DO_KW", "RETURN_KW", "LETTER", "DIGIT", "SPECIAL_CHAR", 
		"STRING", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "'programa'", "'endereços'", "'para'", "'faça'", 
		"'retorna'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CURLY_BRACKET_L", "CURLY_BRACKET_R", "COMMAND_SEPARATOR", "PROGRAM_KW", 
		"ROUTES_KW", "FOR_KW", "DO_KW", "RETURN_KW", "LETTER", "DIGIT", "SPECIAL_CHAR", 
		"STRING", "WHITESPACE"
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


	public EducodarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Educodar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17b\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\5\n"+
		"J\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\rU\n\r\f\r\16\rX\13\r\3"+
		"\r\3\r\3\16\6\16]\n\16\r\16\16\16^\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\5\4\2C\\c|\n\2#(*\61"+
		"<B]]__aa}}\177\177\4\2\13\f\"\"f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2"+
		"\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13,\3\2\2\2\r\66\3\2\2\2\17;\3\2\2"+
		"\2\21@\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27M\3\2\2\2\31O\3\2\2\2\33\\\3"+
		"\2\2\2\35\36\7}\2\2\36\4\3\2\2\2\37 \7\177\2\2 \6\3\2\2\2!\"\7=\2\2\""+
		"\b\3\2\2\2#$\7r\2\2$%\7t\2\2%&\7q\2\2&\'\7i\2\2\'(\7t\2\2()\7c\2\2)*\7"+
		"o\2\2*+\7c\2\2+\n\3\2\2\2,-\7g\2\2-.\7p\2\2./\7f\2\2/\60\7g\2\2\60\61"+
		"\7t\2\2\61\62\7g\2\2\62\63\7\u00e9\2\2\63\64\7q\2\2\64\65\7u\2\2\65\f"+
		"\3\2\2\2\66\67\7r\2\2\678\7c\2\289\7t\2\29:\7c\2\2:\16\3\2\2\2;<\7h\2"+
		"\2<=\7c\2\2=>\7\u00e9\2\2>?\7c\2\2?\20\3\2\2\2@A\7t\2\2AB\7g\2\2BC\7v"+
		"\2\2CD\7q\2\2DE\7t\2\2EF\7p\2\2FG\7c\2\2G\22\3\2\2\2HJ\t\2\2\2IH\3\2\2"+
		"\2J\24\3\2\2\2KL\4\62;\2L\26\3\2\2\2MN\t\3\2\2N\30\3\2\2\2OV\7)\2\2PU"+
		"\5\23\n\2QU\5\25\13\2RU\5\27\f\2SU\5\33\16\2TP\3\2\2\2TQ\3\2\2\2TR\3\2"+
		"\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7)"+
		"\2\2Z\32\3\2\2\2[]\t\4\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_"+
		"`\3\2\2\2`a\b\16\2\2a\34\3\2\2\2\7\2ITV^\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}