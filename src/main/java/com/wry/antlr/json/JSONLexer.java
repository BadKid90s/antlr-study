// Generated from /Users/knrt/IdeaProjects/antlr-demo/src/main/java/com/wry/antlr/json/JSON.g4 by ANTLR 4.10.1
package com.wry.antlr.json;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STRING=10, NUMBER=11, INT=12, EXP=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"STRING", "NUMBER", "INT", "EXP", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'", "'{'", "'}'", "':'", "'true'", "'false'", 
			"'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "STRING", 
			"NUMBER", "INT", "EXP", "WS"
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


	public JSONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSON.g4"; }

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
		"\u0004\u0000\u000el\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0005\t<\b\t\n\t\f\t?\t\t\u0001\t\u0001\t\u0001\n\u0003"+
		"\nD\b\n\u0001\n\u0001\n\u0001\n\u0003\nI\b\n\u0001\n\u0003\nL\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\nR\b\n\u0001\n\u0003\nU\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000bZ\b\u000b\n\u000b\f\u000b]\t\u000b"+
		"\u0003\u000b_\b\u000b\u0001\f\u0003\fb\b\f\u0001\f\u0001\f\u0001\r\u0004"+
		"\rg\b\r\u000b\r\f\rh\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0005\u0002"+
		"\u0000\"\"\\\\\u0001\u000019\u0001\u000009\u0002\u0000++--\u0003\u0000"+
		"\t\n\r\r  v\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0001\u001d\u0001\u0000\u0000\u0000\u0003\u001f\u0001\u0000\u0000\u0000"+
		"\u0005!\u0001\u0000\u0000\u0000\u0007#\u0001\u0000\u0000\u0000\t%\u0001"+
		"\u0000\u0000\u0000\u000b\'\u0001\u0000\u0000\u0000\r)\u0001\u0000\u0000"+
		"\u0000\u000f.\u0001\u0000\u0000\u0000\u00114\u0001\u0000\u0000\u0000\u0013"+
		"9\u0001\u0000\u0000\u0000\u0015T\u0001\u0000\u0000\u0000\u0017^\u0001"+
		"\u0000\u0000\u0000\u0019a\u0001\u0000\u0000\u0000\u001bf\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0005[\u0000\u0000\u001e\u0002\u0001\u0000\u0000\u0000"+
		"\u001f \u0005,\u0000\u0000 \u0004\u0001\u0000\u0000\u0000!\"\u0005]\u0000"+
		"\u0000\"\u0006\u0001\u0000\u0000\u0000#$\u0005{\u0000\u0000$\b\u0001\u0000"+
		"\u0000\u0000%&\u0005}\u0000\u0000&\n\u0001\u0000\u0000\u0000\'(\u0005"+
		":\u0000\u0000(\f\u0001\u0000\u0000\u0000)*\u0005t\u0000\u0000*+\u0005"+
		"r\u0000\u0000+,\u0005u\u0000\u0000,-\u0005e\u0000\u0000-\u000e\u0001\u0000"+
		"\u0000\u0000./\u0005f\u0000\u0000/0\u0005a\u0000\u000001\u0005l\u0000"+
		"\u000012\u0005s\u0000\u000023\u0005e\u0000\u00003\u0010\u0001\u0000\u0000"+
		"\u000045\u0005n\u0000\u000056\u0005u\u0000\u000067\u0005l\u0000\u0000"+
		"78\u0005l\u0000\u00008\u0012\u0001\u0000\u0000\u00009=\u0005\"\u0000\u0000"+
		":<\b\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000@A\u0005\"\u0000\u0000A\u0014\u0001\u0000"+
		"\u0000\u0000BD\u0005-\u0000\u0000CB\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0003\u0017\u000b\u0000FH\u0005"+
		".\u0000\u0000GI\u0003\u0019\f\u0000HG\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IU\u0001\u0000\u0000\u0000JL\u0005-\u0000\u0000KJ\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MN\u0003\u0017\u000b\u0000NO\u0003\u0019\f\u0000OU\u0001\u0000\u0000\u0000"+
		"PR\u0005-\u0000\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000SU\u0003\u0017\u000b\u0000TC\u0001\u0000\u0000"+
		"\u0000TK\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000U\u0016\u0001"+
		"\u0000\u0000\u0000V_\u00050\u0000\u0000W[\u0007\u0001\u0000\u0000XZ\u0007"+
		"\u0002\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000^V\u0001\u0000\u0000\u0000^W\u0001\u0000"+
		"\u0000\u0000_\u0018\u0001\u0000\u0000\u0000`b\u0007\u0003\u0000\u0000"+
		"a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000cd\u0003\u0017\u000b\u0000d\u001a\u0001\u0000\u0000\u0000eg\u0007"+
		"\u0004\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jk\u0006\r\u0000\u0000k\u001c\u0001\u0000\u0000\u0000\u000b\u0000"+
		"=CHKQT[^ah\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}