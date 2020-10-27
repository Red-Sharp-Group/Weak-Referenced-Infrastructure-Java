package WeakReferencedInfrastructureJava.WRI.Interfaces.Utils;

public interface IWriPersonalListener extends IWriListener {

    boolean getIsEnabled();

    void setIsEnabled(boolean value);

    boolean getIsDisposed();
}
