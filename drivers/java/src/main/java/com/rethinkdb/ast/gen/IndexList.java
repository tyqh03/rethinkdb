// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.ast.RqlAst;
import com.rethinkdb.proto.TermType;
import java.util.*;



public class IndexList extends RqlQuery {


    public IndexList(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public IndexList(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public IndexList(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.INDEX_LIST, args, optargs);
    }
    protected IndexList(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static IndexList fromArgs(Object... args){
        return new IndexList(new Arguments(args), null);
    }


}
