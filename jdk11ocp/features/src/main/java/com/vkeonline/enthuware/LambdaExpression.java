package com.vkeonline.enthuware;

import java.util.function.Predicate;
import java.util.function.Supplier;

class Employee {
    int age ;
}

public class LambdaExpression {
    /**
     * The variable in lambda expression shall be final or treated as final
     */
    public void checkSupplier() {
        int value = 0 ;
        Supplier<Integer> s = () -> {return value+1 ;}  ;
        // value can not changed here
        // value++ ;

    }

    /**
     * This is a very tough question,
     * Parameter list part of a lambda expression declares new variables that are used
     * in the body part of that lambda expression. However, a lambda expression does
     * not create a new scope for variables. Therefore, you cannot reuse the local
     * variable names that have already been used in the enclosing method to declare
     * the variables in you lambda expression. It would be like declaring the same variable
     * twice. Here, the main method has already declared a variable named e.
     * Therefore, the parameter list part of the lambda expression must not declare
     * another variable with the same name. You need to use another name.
     * For example, if you change //3 to the following, it will work.
     */

    public void checkLambdaExpScope() {
        Employee e = new Employee() ;
        // System.out.println(validateEmployee(e, e->e.age < 1000)) ;
        System.out.println(validateEmployee(e, x->x.age < 1000)) ;
    }

    static boolean validateEmployee(Employee e, Predicate<Employee> p) {
        return p.test(e) ;
    }

}
