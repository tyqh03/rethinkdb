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



public class IndexDrop extends RqlQuery {


    public IndexDrop(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public IndexDrop(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public IndexDrop(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.INDEX_DROP, args, optargs);
    }
    protected IndexDrop(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static IndexDrop fromArgs(Object... args){
        return new IndexDrop(new Arguments(args), null);
    }


}
