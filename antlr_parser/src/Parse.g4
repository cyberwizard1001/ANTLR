grammar Parse;

equation
    :exp {System.out.println("success.");}
    ;

    exp
        : exp (PLUS) term
        | term
        ;

    term
        : term (TIMES) factor
        | factor
        ;

    factor
        : LPAREN exp RPAREN
        | NUM
        ;

    LPAREN
        : '('
        ;

    RPAREN
        : ')'
        ;

    PLUS
        : '+'
        ;

    TIMES
        : '*'
        ;

    NUM
        : [0,9]+
        ;

    WS
        : [\r\n\t] + -> skip
        ;

