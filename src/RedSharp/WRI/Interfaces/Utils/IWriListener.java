package RedSharp.WRI.Interfaces.Utils;

public interface IWriListener {
    <TModel> void raise(TModel model);
}
