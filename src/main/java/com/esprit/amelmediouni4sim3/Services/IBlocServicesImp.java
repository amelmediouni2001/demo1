package com.esprit.amelmediouni4sim3.Services;

import com.esprit.amelmediouni4sim3.Repositories.BlocRepository;
import com.esprit.amelmediouni4sim3.entities.Bloc;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
@AllArgsConstructor

public class IBlocServicesImp implements IBlocServices {

private final BlocRepository blocRepository;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc getBlocById(Long id) {
        return blocRepository.findById( id).orElse(null);
    }

    @Override
    public void deleteBloc(Long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public List<Bloc> findAll() {
        return blocRepository.findAll();
    }
}
