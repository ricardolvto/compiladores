lexer grammar gramatica;

PALAVRA_CHAVE 
	:	'algoritmo' | 'declare' | 'inteiro' | 'leia' | 'escreva' | 'fim_algoritmo' | ':' | '(' | ')'
	;

CADEIA
    : '"' ( ESC_SEQ | ~('\''|'\\') )* '"'
	;
fragment
ESC_SEQ	: '\\"';

IDENT
    : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
    ;

COMENTARIO
    :   '{' ~('\n'|'\r')* '\r'? '}' '\n' {skip();}
    ;

WS  
    :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;
