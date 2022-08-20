lexer grammar scanner;
IF: 'if'{System.out.println("IF keyword");};
DATATYPE: [int void]{System.out.println("Datatype");};
CONSTANT:[0-9]+{System.out.println("Constant");};
OPERATOR:[+\-*/%=]+{System.out.println("Operator");};
HEADER:[#]{System.out.println("Header inclusion");};
WHITESPACE:[\t\n\r]+ ->skip;
MAIN: [main()]{System.out.println("Main function identifier");};
PARANTHESES_OPEN: [ { ( < ]{System.out.println("Parantheses open");};
PARANTHESES_CLOSE: [ } ) > ]{System.out.printnl("Parantheses close");};
PRINT: [printf]{System.out.println("Print statement")};
PUNCTUATION: [, " ' .]{System.out.println("Punctuation");};
SEMICOLON: [;]{System.out.println("Semicolon");};



