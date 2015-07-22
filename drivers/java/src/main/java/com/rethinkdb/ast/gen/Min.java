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



public class Min extends RqlQuery {


    public Min(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Min(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Min(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.MIN, args, optargs);
    }
    protected Min(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static Min fromArgs(Object... args){
        return new Min(new Arguments(args), null);
    }


}
