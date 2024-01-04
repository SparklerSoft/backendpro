package com.proftelran.org.homework12;

public enum IntegerOperator {
    LESS_THAN {
        public boolean apply(int a, int b) {
            return a < b;
        }
    },
    EQUAL {
        public boolean apply(int a, int b) {
            return a == b;
        }
    },
    NOT_EQUAL {
        public boolean apply(int a, int b) {
            return a != b;
        }
    },
    GREATER_THAN {
        public boolean apply(int a, int b) {
            return a > b;
        }
    },
    LESS_OR_EQUAL_THAN {
        public boolean apply(int a, int b) {
            return a <= b;
        }
    },
    GREATER_OR_EQUAL_THAN {
        public boolean apply(int a, int b) {
            return a >= b;
        }
    };

    public abstract boolean apply(int a, int b);

}

