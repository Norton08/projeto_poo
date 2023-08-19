import java.util.ArrayList;

public interface IComercioRepository {
    Comercio consultar_porId(ArrayList<Comercio> comercios, int comercioId);
}
