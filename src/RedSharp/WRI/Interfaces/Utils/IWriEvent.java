package RedSharp.WRI.Interfaces.Utils;

import java.util.function.Consumer;

public interface IWriEvent<TModel> extends IWriEventDescriptor {

    IWriPersonalListener register(Consumer<TModel> handler);

    void subscribe(IWriListener listener);

    void unsubscribe(IWriListener listener);
}
