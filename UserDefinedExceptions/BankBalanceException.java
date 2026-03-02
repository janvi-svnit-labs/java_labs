package UserDefinedExceptions;

public class BankBalanceException extends Exception{
    BankBalanceException(String msg)
    {
        super(msg);
    }
}
