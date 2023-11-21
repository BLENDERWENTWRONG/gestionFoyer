package _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.services;

import _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.repositories.ChambreRepository;
import _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.services.Interfaces.iChambreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChambreService implements iChambreService {
    ChambreRepository chambreRepository;
}
