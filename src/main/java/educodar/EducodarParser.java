// Generated from Educodar.g4 by ANTLR 4.5.2
package educodar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EducodarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CURLY_BRACKET_L=1, CURLY_BRACKET_R=2, COMMAND_SEPARATOR=3, PROGRAM_KW=4, 
		ROUTES_KW=5, FOR_KW=6, DO_KW=7, RETURN_KW=8, LETTER=9, DIGIT=10, SPECIAL_CHAR=11, 
		STRING=12, WHITESPACE=13;
	public static final int
		RULE_program = 0, RULE_routesBlock = 1, RULE_routeDef = 2, RULE_expression = 3;
	public static final String[] ruleNames = {
		"program", "routesBlock", "routeDef", "expression"
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

	@Override
	public String getGrammarFileName() { return "Educodar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EducodarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM_KW() { return getToken(EducodarParser.PROGRAM_KW, 0); }
		public TerminalNode CURLY_BRACKET_L() { return getToken(EducodarParser.CURLY_BRACKET_L, 0); }
		public TerminalNode CURLY_BRACKET_R() { return getToken(EducodarParser.CURLY_BRACKET_R, 0); }
		public RoutesBlockContext routesBlock() {
			return getRuleContext(RoutesBlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EducodarVisitor ) return ((EducodarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(PROGRAM_KW);
			setState(9);
			match(CURLY_BRACKET_L);
			setState(11);
			_la = _input.LA(1);
			if (_la==ROUTES_KW) {
				{
				setState(10);
				routesBlock();
				}
			}

			setState(13);
			match(CURLY_BRACKET_R);
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

	public static class RoutesBlockContext extends ParserRuleContext {
		public TerminalNode ROUTES_KW() { return getToken(EducodarParser.ROUTES_KW, 0); }
		public TerminalNode CURLY_BRACKET_L() { return getToken(EducodarParser.CURLY_BRACKET_L, 0); }
		public TerminalNode CURLY_BRACKET_R() { return getToken(EducodarParser.CURLY_BRACKET_R, 0); }
		public List<RouteDefContext> routeDef() {
			return getRuleContexts(RouteDefContext.class);
		}
		public RouteDefContext routeDef(int i) {
			return getRuleContext(RouteDefContext.class,i);
		}
		public RoutesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routesBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EducodarVisitor ) return ((EducodarVisitor<? extends T>)visitor).visitRoutesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutesBlockContext routesBlock() throws RecognitionException {
		RoutesBlockContext _localctx = new RoutesBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_routesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(ROUTES_KW);
			setState(16);
			match(CURLY_BRACKET_L);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FOR_KW) {
				{
				{
				setState(17);
				routeDef();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
			match(CURLY_BRACKET_R);
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

	public static class RouteDefContext extends ParserRuleContext {
		public TerminalNode FOR_KW() { return getToken(EducodarParser.FOR_KW, 0); }
		public TerminalNode STRING() { return getToken(EducodarParser.STRING, 0); }
		public TerminalNode DO_KW() { return getToken(EducodarParser.DO_KW, 0); }
		public TerminalNode CURLY_BRACKET_L() { return getToken(EducodarParser.CURLY_BRACKET_L, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CURLY_BRACKET_R() { return getToken(EducodarParser.CURLY_BRACKET_R, 0); }
		public RouteDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EducodarVisitor ) return ((EducodarVisitor<? extends T>)visitor).visitRouteDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteDefContext routeDef() throws RecognitionException {
		RouteDefContext _localctx = new RouteDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_routeDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(FOR_KW);
			setState(26);
			match(STRING);
			setState(27);
			match(DO_KW);
			setState(28);
			match(CURLY_BRACKET_L);
			setState(29);
			expression();
			setState(30);
			match(CURLY_BRACKET_R);
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
		public TerminalNode RETURN_KW() { return getToken(EducodarParser.RETURN_KW, 0); }
		public TerminalNode STRING() { return getToken(EducodarParser.STRING, 0); }
		public TerminalNode COMMAND_SEPARATOR() { return getToken(EducodarParser.COMMAND_SEPARATOR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EducodarVisitor ) return ((EducodarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(RETURN_KW);
			setState(33);
			match(STRING);
			setState(34);
			match(COMMAND_SEPARATOR);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17\'\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\5\2\16\n\2\3\2\3\2\3\3\3\3\3\3\7\3\25"+
		"\n\3\f\3\16\3\30\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\2\2\6\2\4\6\b\2\2$\2\n\3\2\2\2\4\21\3\2\2\2\6\33\3\2\2\2\b\""+
		"\3\2\2\2\n\13\7\6\2\2\13\r\7\3\2\2\f\16\5\4\3\2\r\f\3\2\2\2\r\16\3\2\2"+
		"\2\16\17\3\2\2\2\17\20\7\4\2\2\20\3\3\2\2\2\21\22\7\7\2\2\22\26\7\3\2"+
		"\2\23\25\5\6\4\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2"+
		"\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\7\4\2\2\32\5\3\2\2\2\33\34\7\b\2"+
		"\2\34\35\7\16\2\2\35\36\7\t\2\2\36\37\7\3\2\2\37 \5\b\5\2 !\7\4\2\2!\7"+
		"\3\2\2\2\"#\7\n\2\2#$\7\16\2\2$%\7\5\2\2%\t\3\2\2\2\4\r\26";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}