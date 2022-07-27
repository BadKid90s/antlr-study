// Generated from /Users/knrt/IdeaProjects/antlr-demo/src/main/java/com/wry/antlr/json/JSON.g4 by ANTLR 4.10.1
package com.wry.antlr.json;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STRING=10, NUMBER=11, INT=12, EXP=13, WS=14;
	public static final int
		RULE_file = 0, RULE_array = 1, RULE_object = 2, RULE_pair = 3, RULE_value = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "array", "object", "pair", "value"
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

	@Override
	public String getGrammarFileName() { return "JSON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			setState(12);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				object();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				array();
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

	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_array);
		int _la;
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(T__0);
				setState(15);
				value();
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(16);
					match(T__1);
					setState(17);
					value();
					}
					}
					setState(22);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(23);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(T__0);
				setState(26);
				match(T__2);
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

	public static class ObjectContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_object);
		int _la;
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(T__3);
				setState(30);
				pair();
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(31);
					match(T__1);
					setState(32);
					pair();
					}
					}
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(38);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(T__3);
				setState(41);
				match(T__4);
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

	public static class PairContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(STRING);
			setState(45);
			match(T__5);
			setState(46);
			value();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(JSONParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(STRING);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				object();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				array();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				match(T__8);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000e:\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\r\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001\u0013\b\u0001\n\u0001\f\u0001\u0016\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001c\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\"\b\u0002"+
		"\n\u0002\f\u0002%\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002+\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u00048\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000"+
		"\u0002\u0004\u0006\b\u0000\u0000?\u0000\f\u0001\u0000\u0000\u0000\u0002"+
		"\u001b\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u0006,\u0001"+
		"\u0000\u0000\u0000\b7\u0001\u0000\u0000\u0000\n\r\u0003\u0004\u0002\u0000"+
		"\u000b\r\u0003\u0002\u0001\u0000\f\n\u0001\u0000\u0000\u0000\f\u000b\u0001"+
		"\u0000\u0000\u0000\r\u0001\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0001"+
		"\u0000\u0000\u000f\u0014\u0003\b\u0004\u0000\u0010\u0011\u0005\u0002\u0000"+
		"\u0000\u0011\u0013\u0003\b\u0004\u0000\u0012\u0010\u0001\u0000\u0000\u0000"+
		"\u0013\u0016\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000"+
		"\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0017\u0001\u0000\u0000\u0000"+
		"\u0016\u0014\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0003\u0000\u0000"+
		"\u0018\u001c\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0001\u0000\u0000"+
		"\u001a\u001c\u0005\u0003\u0000\u0000\u001b\u000e\u0001\u0000\u0000\u0000"+
		"\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005\u0004\u0000\u0000\u001e#\u0003\u0006\u0003\u0000\u001f"+
		" \u0005\u0002\u0000\u0000 \"\u0003\u0006\u0003\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000"+
		"&\'\u0005\u0005\u0000\u0000\'+\u0001\u0000\u0000\u0000()\u0005\u0004\u0000"+
		"\u0000)+\u0005\u0005\u0000\u0000*\u001d\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000+\u0005\u0001\u0000\u0000\u0000,-\u0005\n\u0000\u0000"+
		"-.\u0005\u0006\u0000\u0000./\u0003\b\u0004\u0000/\u0007\u0001\u0000\u0000"+
		"\u000008\u0005\u000b\u0000\u000018\u0005\n\u0000\u000028\u0003\u0004\u0002"+
		"\u000038\u0003\u0002\u0001\u000048\u0005\u0007\u0000\u000058\u0005\b\u0000"+
		"\u000068\u0005\t\u0000\u000070\u0001\u0000\u0000\u000071\u0001\u0000\u0000"+
		"\u000072\u0001\u0000\u0000\u000073\u0001\u0000\u0000\u000074\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u00008\t\u0001"+
		"\u0000\u0000\u0000\u0006\f\u0014\u001b#*7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}