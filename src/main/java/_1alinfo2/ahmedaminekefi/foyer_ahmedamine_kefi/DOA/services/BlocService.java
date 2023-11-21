package _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.services;

import _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.repositories.BlocRepository;
import _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.services.Interfaces.iBlocService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BlocService implements iBlocService {
    BlocRepository blocRepository;
}
