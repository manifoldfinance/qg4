// Generated from /Users/sbacha/q_antlr/q.g4 by ANTLR 4.8

package com..manifoldfinance.q;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class qParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NEWLINE=15, WS=16, COMMENT=17, 
		LINE_COMMENT=18, NUMLIST=19, NUMNUM=20, NUM=21, BOOL=22, BOOLLIST=23, 
		DATELIST=24, DATE=25, MONTH=26, MONTHLIST=27, DAT=28, MON=29, TIMELIST=30, 
		TIME=31, TIM=32, DD=33, TI=34, MONOP=35, BINOP=36, ID=37, SYMBOL=38, CHAR=39, 
		CHARLIST=40, BYT=41, Digits=42, Digit=43;
	public static final int
		RULE_r = 0, RULE_stat = 1, RULE_expr = 2, RULE_multiExpr = 3, RULE_assign = 4, 
		RULE_multiAssign = 5, RULE_table = 6, RULE_function = 7, RULE_functionBody = 8, 
		RULE_multiID = 9, RULE_csvq = 10, RULE_query = 11, RULE_scmd = 12, RULE_slash = 13, 
		RULE_datatype = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "stat", "expr", "multiExpr", "assign", "multiAssign", "table", "function", 
			"functionBody", "multiID", "csvq", "query", "scmd", "slash", "datatype"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'['", "']'", "'('", "')'", "'where'", "':'", "'{'", "'}'", 
			"','", "'select'", "'by'", "'from'", "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NEWLINE", "WS", "COMMENT", "LINE_COMMENT", "NUMLIST", 
			"NUMNUM", "NUM", "BOOL", "BOOLLIST", "DATELIST", "DATE", "MONTH", "MONTHLIST", 
			"DAT", "MON", "TIMELIST", "TIME", "TIM", "DD", "TI", "MONOP", "BINOP", 
			"ID", "SYMBOL", "CHAR", "CHARLIST", "BYT", "Digits", "Digit"
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
	public String getGrammarFileName() { return "q.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public qParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(qParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				stat();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEWLINE) | (1L << WS))) != 0) );
			setState(35);
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

	public static class StatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(qParser.NEWLINE, 0); }
		public List<TerminalNode> WS() { return getTokens(qParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(qParser.WS, i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(37);
					match(T__0);
					setState(38);
					expr(0);
					}
					break;
				case NEWLINE:
					{
					setState(39);
					match(NEWLINE);
					setState(40);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(43);
						match(WS);
						}
						}
						setState(48);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(49);
					match(NEWLINE);
					}
					break;
				case 2:
					{
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(50);
						match(WS);
						}
						}
						setState(55);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(56);
					match(T__0);
					}
					break;
				}
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssContext extends ExprContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AssContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BinDoContext extends ExprContext {
		public ExprContext left;
		public Token operator;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BINOP() { return getToken(qParser.BINOP, 0); }
		public BinDoContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NestedListContext extends ExprContext {
		public MultiExprContext contents;
		public MultiExprContext multiExpr() {
			return getRuleContext(MultiExprContext.class,0);
		}
		public NestedListContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FuncContext extends ExprContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FuncContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MyidContext extends ExprContext {
		public TerminalNode ID() { return getToken(qParser.ID, 0); }
		public TerminalNode MONOP() { return getToken(qParser.MONOP, 0); }
		public TerminalNode BINOP() { return getToken(qParser.BINOP, 0); }
		public MyidContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ApplyContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ApplyContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class QryContext extends ExprContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QryContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DatatypkContext extends ExprContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public DatatypkContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SlshContext extends ExprContext {
		public SlashContext slash() {
			return getRuleContext(SlashContext.class,0);
		}
		public SlshContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class TblContext extends ExprContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TblContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ApplyBracketContext extends ExprContext {
		public ExprContext left;
		public MultiExprContext contents;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MultiExprContext multiExpr() {
			return getRuleContext(MultiExprContext.class,0);
		}
		public ApplyBracketContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new DatatypkContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(62);
				datatype();
				}
				break;
			case 2:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(T__3);
				setState(64);
				expr(0);
				setState(65);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new NestedListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(T__3);
				setState(68);
				((NestedListContext)_localctx).contents = multiExpr();
				setState(69);
				match(T__4);
				}
				break;
			case 4:
				{
				_localctx = new TblContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				table();
				}
				break;
			case 5:
				{
				_localctx = new FuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				function();
				}
				break;
			case 6:
				{
				_localctx = new AssContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				assign();
				}
				break;
			case 7:
				{
				_localctx = new MyidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << MONOP) | (1L << BINOP) | (1L << ID))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 8:
				{
				_localctx = new QryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				query();
				}
				break;
			case 9:
				{
				_localctx = new SlshContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				slash();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new BinDoContext(new ExprContext(_parentctx, _parentState));
						((BinDoContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(79);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(80);
						((BinDoContext)_localctx).operator = match(BINOP);
						setState(81);
						((BinDoContext)_localctx).right = expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ApplyContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(82);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(84); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(83);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(86); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 3:
						{
						_localctx = new ApplyBracketContext(new ExprContext(_parentctx, _parentState));
						((ApplyBracketContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(89);
						match(T__1);
						setState(90);
						((ApplyBracketContext)_localctx).contents = multiExpr();
						setState(91);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class MultiExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultiExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiExpr; }
	}

	public final MultiExprContext multiExpr() throws RecognitionException {
		MultiExprContext _localctx = new MultiExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multiExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__10) | (1L << T__13) | (1L << NUMLIST) | (1L << NUMNUM) | (1L << BOOL) | (1L << BOOLLIST) | (1L << DATELIST) | (1L << DATE) | (1L << MONTH) | (1L << MONTHLIST) | (1L << TIMELIST) | (1L << TIME) | (1L << MONOP) | (1L << BINOP) | (1L << ID) | (1L << SYMBOL) | (1L << CHAR) | (1L << CHARLIST) | (1L << BYT))) != 0)) {
				{
				setState(98);
				expr(0);
				}
			}

			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(101);
				match(T__0);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__10) | (1L << T__13) | (1L << NUMLIST) | (1L << NUMNUM) | (1L << BOOL) | (1L << BOOLLIST) | (1L << DATELIST) | (1L << DATE) | (1L << MONTH) | (1L << MONTHLIST) | (1L << TIMELIST) | (1L << TIME) | (1L << MONOP) | (1L << BINOP) | (1L << ID) | (1L << SYMBOL) | (1L << CHAR) | (1L << CHARLIST) | (1L << BYT))) != 0)) {
					{
					setState(102);
					expr(0);
					}
				}

				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AssignContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(qParser.ID, 0); }
		public TerminalNode MONOP() { return getToken(qParser.MONOP, 0); }
		public TerminalNode BINOP() { return getToken(qParser.BINOP, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << MONOP) | (1L << BINOP) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(111);
			match(T__6);
			setState(112);
			expr(0);
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

	public static class MultiAssignContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public MultiAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiAssign; }
	}

	public final MultiAssignContext multiAssign() throws RecognitionException {
		MultiAssignContext _localctx = new MultiAssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multiAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << MONOP) | (1L << BINOP) | (1L << ID))) != 0)) {
				{
				{
				setState(114);
				assign();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(120);
				match(T__0);
				setState(121);
				assign();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TableContext extends ParserRuleContext {
		public MultiAssignContext keycols;
		public MultiAssignContext tcols;
		public List<MultiAssignContext> multiAssign() {
			return getRuleContexts(MultiAssignContext.class);
		}
		public MultiAssignContext multiAssign(int i) {
			return getRuleContext(MultiAssignContext.class,i);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__3);
			setState(128);
			match(T__1);
			setState(129);
			((TableContext)_localctx).keycols = multiAssign();
			setState(130);
			match(T__2);
			setState(131);
			((TableContext)_localctx).tcols = multiAssign();
			setState(132);
			match(T__4);
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

	public static class FunctionContext extends ParserRuleContext {
		public MultiIDContext idlist;
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public MultiIDContext multiID() {
			return getRuleContext(MultiIDContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__7);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(135);
				match(T__1);
				setState(136);
				((FunctionContext)_localctx).idlist = multiID();
				setState(137);
				match(T__2);
				}
			}

			setState(141);
			functionBody();
			setState(142);
			match(T__8);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__10) | (1L << T__13) | (1L << NEWLINE) | (1L << WS) | (1L << NUMLIST) | (1L << NUMNUM) | (1L << BOOL) | (1L << BOOLLIST) | (1L << DATELIST) | (1L << DATE) | (1L << MONTH) | (1L << MONTHLIST) | (1L << TIMELIST) | (1L << TIME) | (1L << MONOP) | (1L << BINOP) | (1L << ID) | (1L << SYMBOL) | (1L << CHAR) | (1L << CHARLIST) | (1L << BYT))) != 0)) {
				{
				setState(146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__5:
				case T__7:
				case T__10:
				case T__13:
				case NUMLIST:
				case NUMNUM:
				case BOOL:
				case BOOLLIST:
				case DATELIST:
				case DATE:
				case MONTH:
				case MONTHLIST:
				case TIMELIST:
				case TIME:
				case MONOP:
				case BINOP:
				case ID:
				case SYMBOL:
				case CHAR:
				case CHARLIST:
				case BYT:
					{
					setState(144);
					expr(0);
					}
					break;
				case T__0:
				case NEWLINE:
				case WS:
					{
					setState(145);
					stat();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MultiIDContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(qParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(qParser.ID, i);
		}
		public MultiIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiID; }
	}

	public final MultiIDContext multiID() throws RecognitionException {
		MultiIDContext _localctx = new MultiIDContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(151);
				match(ID);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(157);
				match(T__0);
				setState(158);
				match(ID);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CsvqContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CsvqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csvq; }
	}

	public final CsvqContext csvq() throws RecognitionException {
		CsvqContext _localctx = new CsvqContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_csvq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(164);
					expr(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				{
				setState(167);
				expr(0);
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(168);
						match(T__9);
						setState(169);
						expr(0);
						}
						} 
					}
					setState(174);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
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

	public static class QueryContext extends ParserRuleContext {
		public CsvqContext csel;
		public ExprContext by;
		public ExprContext tbl;
		public CsvqContext wc;
		public List<CsvqContext> csvq() {
			return getRuleContexts(CsvqContext.class);
		}
		public CsvqContext csvq(int i) {
			return getRuleContext(CsvqContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__10);
			setState(178);
			((QueryContext)_localctx).csel = csvq();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(179);
				match(T__11);
				{
				setState(180);
				((QueryContext)_localctx).by = expr(0);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(181);
					match(T__9);
					setState(182);
					expr(0);
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
			}

			setState(190);
			match(T__12);
			setState(191);
			((QueryContext)_localctx).tbl = expr(0);
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(192);
				match(T__5);
				setState(193);
				((QueryContext)_localctx).wc = csvq();
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

	public static class ScmdContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(qParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(qParser.NEWLINE, i);
		}
		public ScmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scmd; }
	}

	public final ScmdContext scmd() throws RecognitionException {
		ScmdContext _localctx = new ScmdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_scmd);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==NEWLINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class SlashContext extends ParserRuleContext {
		public ScmdContext cmd;
		public ScmdContext scmd() {
			return getRuleContext(ScmdContext.class,0);
		}
		public SlashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slash; }
	}

	public final SlashContext slash() throws RecognitionException {
		SlashContext _localctx = new SlashContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_slash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__13);
			setState(203);
			((SlashContext)_localctx).cmd = scmd();
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

	public static class DatatypeContext extends ParserRuleContext {
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
	 
		public DatatypeContext() { }
		public void copyFrom(DatatypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DateContext extends DatatypeContext {
		public TerminalNode DATE() { return getToken(qParser.DATE, 0); }
		public DateContext(DatatypeContext ctx) { copyFrom(ctx); }
	}
	public static class SymbolContext extends DatatypeContext {
		public TerminalNode SYMBOL() { return getToken(qParser.SYMBOL, 0); }
		public SymbolContext(DatatypeContext ctx) { copyFrom(ctx); }
	}
	public static class TimeListContext extends DatatypeContext {
		public TerminalNode TIMELIST() { return getToken(qParser.TIMELIST, 0); }
		public TimeListContext(DatatypeContext ctx) { copyFrom(ctx); }
	}
	public static class BoolContext extends DatatypeContext {
		public TerminalNode BOOL() { return getToken(qParser.BOOL, 0); }
		public BoolContext(DatatypeContext ctx) { copyFrom(ctx); }
	}
	public static class NumContext extends DatatypeContext {
		public TerminalNode NUMNUM() { return getToken(qParser.NUMNUM, 0); }
		public NumContext(DatatypeContext ctx) { copyFrom(ctx); }
	}
	public static class BoolListContext extends DatatypeContext {
		public TerminalNode BOOLLIST() { return getToken(qParser.BOOLLIST, 0); }
		public BoolListContext(DatatypeContext ctx) { copyFrom(ctx); }
	}
	public static class SymbolListContext extends DatatypeContext {
		public List<TerminalNode> SYMBOL() { return getTokens(qParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(qParser.SYMBOL, i);
		}
		public SymbolListContext(DatatypeContext ctx) { copyFrom(ctx); }
	}
	public static class EmptyListContext extends DatatypeContext {
		public EmptyListContext(DatatypeContext ctx) { copyFrom(ctx); }
	}
	public static class MonthContext extends DatatypeContext {
		public TerminalNode MONTH() { return getToken(qParser.MONTH, 0); }
		public MonthContext(DatatypeContext ctx) { copyFrom(ctx); }
	}
	public static class CharContext extends DatatypeContext {
		public TerminalNode CHAR() { return getToken(qParser.CHAR, 0); }
		public CharContext(DatatypeContext ctx) { copyFrom(ctx); }
	}
	public static class CharListContext extends DatatypeContext {
		public TerminalNode CHARLIST() { return getToken(qParser.CHARLIST, 0); }
		public CharListContext(DatatypeContext ctx) { copyFrom(ctx); }
	}
	public static class DateListContext extends DatatypeContext {
		public TerminalNode DATELIST() { return getToken(qParser.DATELIST, 0); }
		public DateListContext(DatatypeContext ctx) { copyFrom(ctx); }
	}
	public static class TimeContext extends DatatypeContext {
		public TerminalNode TIME() { return getToken(qParser.TIME, 0); }
		public TimeContext(DatatypeContext ctx) { copyFrom(ctx); }
	}
	public static class NumListContext extends DatatypeContext {
		public TerminalNode NUMLIST() { return getToken(qParser.NUMLIST, 0); }
		public NumListContext(DatatypeContext ctx) { copyFrom(ctx); }
	}
	public static class BytContext extends DatatypeContext {
		public TerminalNode BYT() { return getToken(qParser.BYT, 0); }
		public BytContext(DatatypeContext ctx) { copyFrom(ctx); }
	}
	public static class MonthListContext extends DatatypeContext {
		public TerminalNode MONTHLIST() { return getToken(qParser.MONTHLIST, 0); }
		public MonthListContext(DatatypeContext ctx) { copyFrom(ctx); }
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_datatype);
		try {
			int _alt;
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new SymbolListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(205);
				match(SYMBOL);
				setState(207); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(206);
						match(SYMBOL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(209); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				break;
			case 2:
				_localctx = new BoolListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(BOOLLIST);
				}
				break;
			case 3:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(BOOL);
				}
				break;
			case 4:
				_localctx = new NumListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(NUMLIST);
				}
				break;
			case 5:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(NUMNUM);
				}
				break;
			case 6:
				_localctx = new CharListContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				match(CHARLIST);
				}
				break;
			case 7:
				_localctx = new EmptyListContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(216);
				match(T__3);
				setState(217);
				match(T__4);
				}
				break;
			case 8:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(218);
				match(CHAR);
				}
				break;
			case 9:
				_localctx = new SymbolContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(219);
				match(SYMBOL);
				}
				break;
			case 10:
				_localctx = new DateListContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(220);
				match(DATELIST);
				}
				break;
			case 11:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(221);
				match(DATE);
				}
				break;
			case 12:
				_localctx = new MonthListContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(222);
				match(MONTHLIST);
				}
				break;
			case 13:
				_localctx = new MonthContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(223);
				match(MONTH);
				}
				break;
			case 14:
				_localctx = new TimeListContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(224);
				match(TIMELIST);
				}
				break;
			case 15:
				_localctx = new TimeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(225);
				match(TIME);
				}
				break;
			case 16:
				_localctx = new BytContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(226);
				match(BYT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2\16"+
		"\2#\3\2\3\2\3\3\3\3\3\3\3\3\5\3,\n\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\3"+
		"\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\5\3<\n\3\5\3>\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\4\3\4\3\4\3"+
		"\4\3\4\6\4W\n\4\r\4\16\4X\3\4\3\4\3\4\3\4\3\4\7\4`\n\4\f\4\16\4c\13\4"+
		"\3\5\5\5f\n\5\3\5\3\5\5\5j\n\5\7\5l\n\5\f\5\16\5o\13\5\3\6\3\6\3\6\3\6"+
		"\3\7\7\7v\n\7\f\7\16\7y\13\7\3\7\3\7\7\7}\n\7\f\7\16\7\u0080\13\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\t\3\t\3\t"+
		"\3\n\3\n\7\n\u0095\n\n\f\n\16\n\u0098\13\n\3\13\7\13\u009b\n\13\f\13\16"+
		"\13\u009e\13\13\3\13\3\13\7\13\u00a2\n\13\f\13\16\13\u00a5\13\13\3\f\5"+
		"\f\u00a8\n\f\3\f\3\f\3\f\7\f\u00ad\n\f\f\f\16\f\u00b0\13\f\5\f\u00b2\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ba\n\r\f\r\16\r\u00bd\13\r\5\r\u00bf"+
		"\n\r\3\r\3\r\3\r\3\r\5\r\u00c5\n\r\3\16\7\16\u00c8\n\16\f\16\16\16\u00cb"+
		"\13\16\3\17\3\17\3\17\3\20\3\20\6\20\u00d2\n\20\r\20\16\20\u00d3\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00e6\n\20\3\20\2\3\6\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\4\4\2\b\b%\'\3\2\21\21\2\u010b\2!\3\2\2\2\4=\3\2\2\2\6O\3\2\2\2"+
		"\be\3\2\2\2\np\3\2\2\2\fw\3\2\2\2\16\u0081\3\2\2\2\20\u0088\3\2\2\2\22"+
		"\u0096\3\2\2\2\24\u009c\3\2\2\2\26\u00b1\3\2\2\2\30\u00b3\3\2\2\2\32\u00c9"+
		"\3\2\2\2\34\u00cc\3\2\2\2\36\u00e5\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2"+
		"\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7\2\2\3&\3\3\2\2\2\'(\7\3\2\2(,\5"+
		"\6\4\2)*\7\21\2\2*,\5\6\4\2+\'\3\2\2\2+)\3\2\2\2,>\3\2\2\2-/\7\22\2\2"+
		".-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3"+
		"\2\2\2\63<\7\21\2\2\64\66\7\22\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2"+
		"\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:<\7\3\2\2;\60\3\2\2\2;\67\3\2\2"+
		"\2<>\3\2\2\2=+\3\2\2\2=;\3\2\2\2>\5\3\2\2\2?@\b\4\1\2@P\5\36\20\2AB\7"+
		"\6\2\2BC\5\6\4\2CD\7\7\2\2DP\3\2\2\2EF\7\6\2\2FG\5\b\5\2GH\7\7\2\2HP\3"+
		"\2\2\2IP\5\16\b\2JP\5\20\t\2KP\5\n\6\2LP\t\2\2\2MP\5\30\r\2NP\5\34\17"+
		"\2O?\3\2\2\2OA\3\2\2\2OE\3\2\2\2OI\3\2\2\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2"+
		"\2OM\3\2\2\2ON\3\2\2\2Pa\3\2\2\2QR\f\13\2\2RS\7&\2\2S`\5\6\4\13TV\f\r"+
		"\2\2UW\5\6\4\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y`\3\2\2\2Z[\f\f"+
		"\2\2[\\\7\4\2\2\\]\5\b\5\2]^\7\5\2\2^`\3\2\2\2_Q\3\2\2\2_T\3\2\2\2_Z\3"+
		"\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\7\3\2\2\2ca\3\2\2\2df\5\6\4\2ed"+
		"\3\2\2\2ef\3\2\2\2fm\3\2\2\2gi\7\3\2\2hj\5\6\4\2ih\3\2\2\2ij\3\2\2\2j"+
		"l\3\2\2\2kg\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\t\3\2\2\2om\3\2\2\2"+
		"pq\t\2\2\2qr\7\t\2\2rs\5\6\4\2s\13\3\2\2\2tv\5\n\6\2ut\3\2\2\2vy\3\2\2"+
		"\2wu\3\2\2\2wx\3\2\2\2x~\3\2\2\2yw\3\2\2\2z{\7\3\2\2{}\5\n\6\2|z\3\2\2"+
		"\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\r\3\2\2\2\u0080~\3\2\2\2"+
		"\u0081\u0082\7\6\2\2\u0082\u0083\7\4\2\2\u0083\u0084\5\f\7\2\u0084\u0085"+
		"\7\5\2\2\u0085\u0086\5\f\7\2\u0086\u0087\7\7\2\2\u0087\17\3\2\2\2\u0088"+
		"\u008d\7\n\2\2\u0089\u008a\7\4\2\2\u008a\u008b\5\24\13\2\u008b\u008c\7"+
		"\5\2\2\u008c\u008e\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\5\22\n\2\u0090\u0091\7\13\2\2\u0091\21\3\2"+
		"\2\2\u0092\u0095\5\6\4\2\u0093\u0095\5\4\3\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\23\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\7\'\2\2\u009a\u0099"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u00a3\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\3\2\2\u00a0\u00a2\7\'"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\25\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\5\6\4"+
		"\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00b2\3\2\2\2\u00a9\u00ae"+
		"\5\6\4\2\u00aa\u00ab\7\f\2\2\u00ab\u00ad\5\6\4\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00a7\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b2"+
		"\27\3\2\2\2\u00b3\u00b4\7\r\2\2\u00b4\u00be\5\26\f\2\u00b5\u00b6\7\16"+
		"\2\2\u00b6\u00bb\5\6\4\2\u00b7\u00b8\7\f\2\2\u00b8\u00ba\5\6\4\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00b5\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\17\2\2\u00c1\u00c4\5"+
		"\6\4\2\u00c2\u00c3\7\b\2\2\u00c3\u00c5\5\26\f\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\31\3\2\2\2\u00c6\u00c8\n\3\2\2\u00c7\u00c6\3\2\2"+
		"\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\33"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\20\2\2\u00cd\u00ce\5\32\16"+
		"\2\u00ce\35\3\2\2\2\u00cf\u00d1\7(\2\2\u00d0\u00d2\7(\2\2\u00d1\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00e6\3\2\2\2\u00d5\u00e6\7\31\2\2\u00d6\u00e6\7\30\2\2\u00d7\u00e6\7"+
		"\25\2\2\u00d8\u00e6\7\26\2\2\u00d9\u00e6\7*\2\2\u00da\u00db\7\6\2\2\u00db"+
		"\u00e6\7\7\2\2\u00dc\u00e6\7)\2\2\u00dd\u00e6\7(\2\2\u00de\u00e6\7\32"+
		"\2\2\u00df\u00e6\7\33\2\2\u00e0\u00e6\7\35\2\2\u00e1\u00e6\7\34\2\2\u00e2"+
		"\u00e6\7 \2\2\u00e3\u00e6\7!\2\2\u00e4\u00e6\7+\2\2\u00e5\u00cf\3\2\2"+
		"\2\u00e5\u00d5\3\2\2\2\u00e5\u00d6\3\2\2\2\u00e5\u00d7\3\2\2\2\u00e5\u00d8"+
		"\3\2\2\2\u00e5\u00d9\3\2\2\2\u00e5\u00da\3\2\2\2\u00e5\u00dc\3\2\2\2\u00e5"+
		"\u00dd\3\2\2\2\u00e5\u00de\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e0\3\2"+
		"\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\37\3\2\2\2\37#+\60\67;=OX_aeimw~\u008d\u0094\u0096"+
		"\u009c\u00a3\u00a7\u00ae\u00b1\u00bb\u00be\u00c4\u00c9\u00d3\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}