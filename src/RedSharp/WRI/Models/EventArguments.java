package RedSharp.WRI.Models;

import RedSharp.WRI.Interfaces.Models.IEventArguments;

public class EventArguments implements IEventArguments {

    private final String SENDER_IS_NULL_ERROR_MESSAGE = "Given argument is invalid.";

    private  Object _sender;

    public EventArguments(Object sender){
        if(sender == null)
            throw new IllegalArgumentException(SENDER_IS_NULL_ERROR_MESSAGE);

        _sender = sender;
    }

    @Override
    public Object getSender() {
        return _sender;
    }
}
