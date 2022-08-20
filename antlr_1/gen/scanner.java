// Generated from C:/Users/nirma/IdeaProjects/antlr_1/src\scanner.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class scanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, DATATYPE=2, CONSTANT=3, OPERATOR=4, HEADER=5, WHITESPACE=6, MAIN=7, 
		PARANTHESES_OPEN=8, PARANTHESES_CLOSE=9, PRINT=10, PUNCTUATION=11, SEMICOLON=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "DATATYPE", "CONSTANT", "OPERATOR", "HEADER", "WHITESPACE", "MAIN", 
			"PARANTHESES_OPEN", "PARANTHESES_CLOSE", "PRINT", "PUNCTUATION", "SEMICOLON"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "DATATYPE", "CONSTANT", "OPERATOR", "HEADER", "WHITESPACE", 
			"MAIN", "PARANTHESES_OPEN", "PARANTHESES_CLOSE", "PRINT", "PUNCTUATION", 
			"SEMICOLON"
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


	public scanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "scanner.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			DATATYPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			CONSTANT_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			OPERATOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			HEADER_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			MAIN_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			PARANTHESES_OPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			PARANTHESES_CLOSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			PRINT_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			PUNCTUATION_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			SEMICOLON_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("IF keyword");
			break;
		}
	}
	private void DATATYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("Datatype");
			break;
		}
	}
	private void CONSTANT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("Constant");
			break;
		}
	}
	private void OPERATOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println("Operator");
			break;
		}
	}
	private void HEADER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.println("Header inclusion");
			break;
		}
	}
	private void MAIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.println("Main function identifier");
			break;
		}
	}
	private void PARANTHESES_OPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			System.out.println("Parantheses open");
			break;
		}
	}
	private void PARANTHESES_CLOSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			System.out.printnl("Parantheses close");
			break;
		}
	}
	private void PRINT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			System.out.println("Print statement")
			break;
		}
	}
	private void PUNCTUATION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			System.out.println("Punctuation");
			break;
		}
	}
	private void SEMICOLON_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			System.out.println("Semicolon");
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\fX\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002#\b\u0002"+
		"\u000b\u0002\f\u0002$\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003"+
		"*\b\u0003\u000b\u0003\f\u0003+\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0005\u00042\b\u0004\n\u0004\f\u00045\t\u0004\u0001\u0004\u0005"+
		"\u00048\b\u0004\n\u0004\f\u0004;\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0004\u0005A\b\u0005\u000b\u0005\f\u0005B\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001\u0000\u000e\u0006\u0000 "+
		" ddiinottvv\u0001\u000009\u0005\u0000%%*+--//==\u0001\u0000##\u0003\u0000"+
		"  AZaz\u0002\u0000<<>>\u0001\u0000..\u0002\u0000\t\n\r\r\u0004\u0000("+
		")aaiimn\u0003\u0000  (({{\u0003\u0000  ))}}\u0006\u0000ffiinnpprrtt\u0004"+
		"\u0000  \"\"\'\',,\u0001\u0000;;\\\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003\u001e"+
		"\u0001\u0000\u0000\u0000\u0005\"\u0001\u0000\u0000\u0000\u0007)\u0001"+
		"\u0000\u0000\u0000\t/\u0001\u0000\u0000\u0000\u000b@\u0001\u0000\u0000"+
		"\u0000\rF\u0001\u0000\u0000\u0000\u000fI\u0001\u0000\u0000\u0000\u0011"+
		"L\u0001\u0000\u0000\u0000\u0013O\u0001\u0000\u0000\u0000\u0015R\u0001"+
		"\u0000\u0000\u0000\u0017U\u0001\u0000\u0000\u0000\u0019\u001a\u0005i\u0000"+
		"\u0000\u001a\u001b\u0005f\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0006\u0000\u0000\u0000\u001d\u0002\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0007\u0000\u0000\u0000\u001f \u0006\u0001\u0001\u0000 \u0004"+
		"\u0001\u0000\u0000\u0000!#\u0007\u0001\u0000\u0000\"!\u0001\u0000\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0006\u0002\u0002\u0000\'\u0006"+
		"\u0001\u0000\u0000\u0000(*\u0007\u0002\u0000\u0000)(\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0006\u0003\u0003\u0000.\b\u0001"+
		"\u0000\u0000\u0000/3\u0007\u0003\u0000\u000002\u0007\u0004\u0000\u0000"+
		"10\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u000049\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000068\u0007\u0005\u0000\u000076\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0007\u0006\u0000"+
		"\u0000=>\u0006\u0004\u0004\u0000>\n\u0001\u0000\u0000\u0000?A\u0007\u0007"+
		"\u0000\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DE\u0006\u0005\u0005\u0000E\f\u0001\u0000\u0000\u0000FG\u0007\b\u0000"+
		"\u0000GH\u0006\u0006\u0006\u0000H\u000e\u0001\u0000\u0000\u0000IJ\u0007"+
		"\t\u0000\u0000JK\u0006\u0007\u0007\u0000K\u0010\u0001\u0000\u0000\u0000"+
		"LM\u0007\n\u0000\u0000MN\u0006\b\b\u0000N\u0012\u0001\u0000\u0000\u0000"+
		"OP\u0007\u000b\u0000\u0000PQ\u0006\t\t\u0000Q\u0014\u0001\u0000\u0000"+
		"\u0000RS\u0007\f\u0000\u0000ST\u0006\n\n\u0000T\u0016\u0001\u0000\u0000"+
		"\u0000UV\u0007\r\u0000\u0000VW\u0006\u000b\u000b\u0000W\u0018\u0001\u0000"+
		"\u0000\u0000\u0006\u0000$+39B\f\u0001\u0000\u0000\u0001\u0001\u0001\u0001"+
		"\u0002\u0002\u0001\u0003\u0003\u0001\u0004\u0004\u0006\u0000\u0000\u0001"+
		"\u0006\u0005\u0001\u0007\u0006\u0001\b\u0007\u0001\t\b\u0001\n\t\u0001"+
		"\u000b\n";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}