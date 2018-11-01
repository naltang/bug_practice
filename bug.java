import java.util.Scanner;

class Bug
{
    public static void bug_stack_overflow()
    {

    }

    public static void bug_buffer_overflow()
    {

    }

    public static void bug_arithmetic_overflow()
    {

    }

    public static void bug_arithmetic_underflow()
    {

    }

    public static void bug_loss_of_arithmetic_precision()
    {

    }

    public static void bug_infinite_loop()
    {
        int n;
        n = 1;
        while (n < 10)
        {
            n = 2;
        }
    }

    public static void bug_null_pointer_exception()
    {

    }

    public static void bug_divide_by_zero()
    {
        int n1, n2;

        n1 = 0;
        n2 = 1 / n1;
    }

    public static void bug_use_of_uninitialized_variable()
    {

    }

    public static void bug_off_by_one()
    {

    }

    public static void bug_out_of_memory()
    {

    }

    public static void bug_deadlock()
    {

    }

    public static void bug_unprotected_critical_section()
    {

    }

    public static void bug_unreachable_code()
    {

    }

    public static void main(String[] args)
    {
        String sUserInput;
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        do
        {
            System.out.println(" a) Stack overflow");
            System.out.println(" b) Buffer overflow");
            System.out.println(" c) Arithmetic overflow");
            System.out.println(" d) Arithmetic underflow");
            System.out.println(" e) Loss of arithmetic precision");
            System.out.println(" f) Infinite loop");
            System.out.println(" g) Null pointer exception");
            System.out.println(" h) Divide by zero exception");
            System.out.println(" i) Use of uninitialized variable");
            System.out.println(" j) off-by-one error");
            System.out.println(" k) Out of memory error");
            System.out.println(" l) Deadlock");
            System.out.println(" m) Unprotected critical section");
            System.out.println(" n) Unreachable code");

            System.out.print("Select Bug Type:");
            sUserInput = scanner.nextLine();
            if (sUserInput.length() != 1)
            {
                sUserInput = "";
                continue;
            }

            switch(sUserInput.charAt(0))
            {
                case 'a': bug_stack_overflow(); break;
                case 'b': bug_buffer_overflow(); break;
                case 'c': bug_arithmetic_overflow(); break;
                case 'd': bug_arithmetic_underflow(); break;
                case 'e': bug_loss_of_arithmetic_precision(); break;
                case 'f': bug_infinite_loop(); break;
                case 'g': bug_null_pointer_exception(); break;
                case 'h': bug_divide_by_zero(); break;
                case 'i': bug_use_of_uninitialized_variable(); break;
                case 'j': bug_off_by_one(); break;
                case 'k': bug_out_of_memory(); break;
                case 'l': bug_deadlock(); break;
                case 'm': bug_unprotected_critical_section(); break;
                case 'n': bug_unreachable_code(); break;
                default: sUserInput = "";
            }

        } while (sUserInput.length() == 0);
    }
}
