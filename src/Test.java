/**
 * Created by denis on 03.01.20.
 */
public class Test {
    public static final String[] EXPRESSIONS = {"((X|Y)&(!X|Y) &( !X |!Y)&Z&( Z|Y))|(!X &!Z)",
                                                "(X|Y)&( Y|Z)",
                                                "!!!!!(!!! !!!A |!!!! B)",
                                                "A|V| B |N|M|M &F&T &Y",
                                                "!!( A|B)",
                                                "A->(A- >A)->A",
                                                "A-> A->A",
                                                "(A->A->A)->(A->( A->A)- >A)->A->A",
                                                "!(A|(A F &A))->(A->(AG&(AG|!(U|F))))",
                                                "(A|B)->(A->(A|!B))",
                                                "B|( B->A)",
                                                "B->!A|(B->!A)",
                                                "!A  A&!B12",
                                                "A|!A",
                                                "AA'|JJ->HHJHJH9990980'&JK",
                                                "GF'&GG&HJH->IO|OO|FP",
                                                "P1'-         >!QQ->!R10&S|!T&U&V",
                                                "B->(((X|V)->  (V|X))&Z)"

                                                };
}
