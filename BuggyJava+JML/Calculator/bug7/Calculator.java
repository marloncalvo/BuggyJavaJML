
public class Calculator {
  //@ requires Integer.MIN_VALUE <= num1 && num1 <= Integer.MAX_VALUE;
  //@ requires Integer.MIN_VALUE <= num2 && num2 <= Integer.MAX_VALUE;
  //@ requires 37 <= (int)operator && (int)operator <= 47;
  //@ {|
    //@ requires operator == '+';
    //@ requires num1 + num2 <= Integer.MAX_VALUE;
    //@ requires Integer.MIN_VALUE <= num1 + num2;
    //@ ensures \result == num1 + num2;

    //@ also

    //@ requires operator == '*'; 
    //@ requires num1 * num2 <= Integer.MAX_VALUE;
    //@ requires Integer.MIN_VALUE <= num1 * num2;
    //@ ensures \result == num1 * num2;

    //@ also

    //@ requires operator == '-'; 
    //@ requires num1 - num2 <= Integer.MAX_VALUE;
    //@ requires Integer.MIN_VALUE <= num1 - num2;
    //@ ensures \result == num1 - num2;

    //@ also

    //@ requires operator == '/'; 
    //@ requires num2 != 0;
    //@ requires num1 / num2 <= Integer.MAX_VALUE;
    //@ requires num1 / Integer.MIN_VALUE <= num2;
    //@ ensures \result == (num1 / num2);

    //@ also

    //@ requires operator == '%'; 
    //@ requires num2 != 0;
    //@ requires num1 % num2 <= Integer.MAX_VALUE;
    //@ requires 0 <= num1 % num2;
    //@ ensures \result == (num1 % num2);

    //@ also

    //@ requires operator != '+' && operator != '*' && operator != '-' && operator != '/' && operator != '%';
    //@ ensures \result == -1;

  //@ |}
    public int calculate(int num1, int num2, char operator) {


        int output;

	
        switch (operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
		break;

	    case '%':
		output = num1 % num2;
                break;

            default:
                return -1;
        }
        return (output == 0 ? 1 : 0);//output;
    }
}
