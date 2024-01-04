package com.proftelran.org.homework12;

import java.util.Objects;

public enum StringOperator {
    EQUAL{
        public boolean applyString(String a, String b) {
            return a.equals(b);
        }
    },
    NOT_EQUAL{
        public boolean applyString(String a, String b) {
            return !Objects.equals(a, b);
        }
    };

    public abstract boolean applyString(String a, String b);
}
