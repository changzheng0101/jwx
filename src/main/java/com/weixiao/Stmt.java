package com.weixiao;

import java.util.List;

/**
 * @Date 2024/1/10 21:03
 * @Created by weixiao
 * handle statement
 */
abstract class Stmt {
    interface Visitor<R> {
        R visitExpressionStmt(Expression stmt);

        R visitPrintStmt(Print stmt);
    }

    static class Expression extends Stmt {
        Expression(Expr expression) {
            this.expression = expression;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitExpressionStmt(this);
        }

        final Expr expression;
    }

    static class Print extends Stmt {
        Print(Expr expression) {
            this.expression = expression;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitPrintStmt(this);
        }

        final Expr expression;
    }

    abstract <R> R accept(Visitor<R> visitor);
}
