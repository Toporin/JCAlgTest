
package algtestjclient;

/**
 *
 * @author Lenka Kunikova
 */
public class CardCommunicationException extends Exception
{
    private int reason;
    public CardCommunicationException(int reason)
    {
        this.reason = reason;
    }
    public int getReason()
    {
        return reason;
    }
    public String toString()
    {
        switch(reason)
            {
                case CardMngr.CANT_BE_MEASURED: 
                    return "CANT_BE_MEASURED";
                case CardMngr.ILLEGAL_USE:
                    return "ILLEGAL_USE";
                case CardMngr.ILLEGAL_VALUE:
                    return "ILLEGAL_VALUE";
                case CardMngr.INVALID_INIT:
                    return "INVALID_INIT";
                case CardMngr.NO_SUCH_ALGORITHM:
                    return "NO_SUCH_ALGORITHM";
                case CardMngr.UNINITIALIZED_KEY:
                    return "UNINITIALIZED_KEY";
                default:
                    return "UNKONWN_ERROR-card_has_return_value_" + reason;                    
            }
    }
}