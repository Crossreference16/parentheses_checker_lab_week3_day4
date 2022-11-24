import java.util.Stack;

public class ParenthesesChecker {

    public static boolean checkParentheses(String parentheses) {


        Stack<Character> pStack = new Stack<>();

        char p;
            for(int i=0; i < parentheses.length(); i++) {
            p = parentheses.charAt(i);




            if(p == '(')
                pStack.push(p);
            else if(p == '{')
                pStack.push(p);
            else if(p == '[')
                pStack.push(p);
            else if(p == '<')
                pStack.push(p);

            else if(p == ')')
                if(pStack.empty())
                    return false;
                else if(pStack.peek() == '(')
                    pStack.pop();
                else
                    return false;

            else if(p == '}')
                if(pStack.empty())
                    return false;
                else if(pStack.peek() == '{')
                    pStack.pop();
                else
                    return false;

            else if(p == ']')
                if(pStack.empty())
                    return false;
                else if(pStack.peek() == '[')
                    pStack.pop();
                else
                    return false;

            else if(p == '>')
                if(pStack.empty())
                    return false;
                else if(pStack.peek() == '<')
                    pStack.pop();
                else
                    return false;



        }
        return pStack.empty();
    }

    //Goal: write method called checkParentheses                               >>>tick
    //what does it do: takes in testString then...                             >>>tick
    // ...returns boolean. (because test shows 'assertTrue')                   >>>tick
    //return true if the string contains "correct" pairs of parentheses        >>>tick
    //return false if not.                                                     >>>tick
    //what is if not? (what are situations to return false?):                  >>>tick
    // more opening or closing brackets of particular type e.g (),<>,{},[]     >>>tick
    // closing bracket at start e,g "hello ) (hi) there()"                     >>>tick
    // opening bracket at end e,g "hello  (hi) there()("                       >>>tick

    //if none of these situations arise, then return true.                     >>>tick

    // also, use stacks. (maybe even an enhanced for loop. but I would have to do something to the string before using the loop)   >>> tick
    //
    //---------------------------------




}
