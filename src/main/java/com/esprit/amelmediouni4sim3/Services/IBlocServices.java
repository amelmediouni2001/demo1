package com.esprit.amelmediouni4sim3.Services;


import com.esprit.amelmediouni4sim3.entities.Bloc;

import java.util.List;

public interface IBlocServices {
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    Bloc getBlocById(Long id);
    void deleteBloc(Long id);
    List<Bloc> findAll();

}
