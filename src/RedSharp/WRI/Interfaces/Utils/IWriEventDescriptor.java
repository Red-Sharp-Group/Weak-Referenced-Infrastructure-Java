package RedSharp.WRI.Interfaces.Utils;

import java.lang.reflect.Type;

/**
 * Simple event descriptor, so you can recognize it if you set the event in a collection f.e.
 */
public interface IWriEventDescriptor {

    /**
     * Strongly recommend to use the same name as event.
     * @return event name
     */
    String getName();

    /**
     * Object that contain the event,
     * because this event is an object and can be got
     * it would be nice to know who it hold.
     * @return object owner
     */
    Object getOwner();

    /**
     * Type of argument.
     * @return argument type
     */
    Type getType();
}
