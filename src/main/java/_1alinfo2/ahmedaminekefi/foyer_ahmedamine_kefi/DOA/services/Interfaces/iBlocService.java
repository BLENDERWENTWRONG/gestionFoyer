package _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.services.Interfaces;

import _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.entities.Bloc;

import java.util.List;

public interface iBlocService {
    Bloc addBloc(Bloc b);
    List<Bloc> addAllBlocs(List<Bloc> blocs);
    Bloc updateBloc(Bloc b);
    List<Bloc> updateAllBlocs(List<Bloc> blocs);
    List<Bloc> findAllBlocs();
    Bloc findBlocById(long id);
    void deleteBloc(Bloc b);
    void deleteBlocById(long id);
}
