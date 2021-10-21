
MONOP:('til'|'desc'|'asc'|'++'|'--'|'til'|'get'|'abs'|'all'|'any'|'avg'|'avgs'|'exp'|'floor'|'ceiling'
    |'cos'|'sin'|'tan'|'acos'|'asin'|'atan'|'exp'|'log'|'except'|'fills'|'flip'
    |'first'|'last'|'distinct'|'count'|'type'|'attr'|'reciprocal'|'sqrt'
    |'svar'|'sdev'|'var'|'dev'|'differ'|'getenv'|'setenv'|'group'|'iasc'
    |'idesc'|'key');
BINOP:(':'|'<'|'>'|'<='|'>='|'&'|'|'|'~'|'?'|'='|'<>'|'+:'|'!'|'*:'|'^'|'+'|'-'|'*'|'%'|'@'|'and'|'or'|'set'|'mod'
    |'$'|'_'|'div'|'each'|'peach'|'except'|'inter'|'union'|'deltas'|'cut'|'cross'|'bin');
ID:	Letter LetterOrDigit*;


SYMBOL: '`' (Letter|Digit|'_'|'.'|'/'|':')*;