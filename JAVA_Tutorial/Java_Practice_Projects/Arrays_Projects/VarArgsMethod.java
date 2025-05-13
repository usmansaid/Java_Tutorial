package Arrays_Projects;

public class VarArgsMethod {
    public static void variableArguments(int... numbers){
        for(int i : numbers){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        variableArguments(1, 2, 3, 4, 5);
        
    }
}


/* A smart explanation of the varargs:
    => In JS, ... is called spread operator, which is used to spread the    array values or separate them in individual values.

    => In Java, it is called varargs (variable arguments), which collects the values. Rather to make an array or declare, we just give some values, which are collected to make an array itself through varargs.

    So, in JS and Java, both serve completely opposite roles.

    REMEMBER! 
    => ONE VARARGS WILL BE USED IN A SINGLE METHOD, MORE THAN ONE IS NOT ACCEPTABLE.
    => VARARGS WILL ALWAYS BE THE LAST PARAMETER. e.g.
    method(int variable1, int... variable2) IS ACCEPTED, NOT method(int... variable2, int variable1)

*/