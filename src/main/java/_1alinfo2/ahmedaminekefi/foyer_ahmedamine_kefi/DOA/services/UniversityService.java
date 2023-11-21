package _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.services;

import _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.repositories.UniversityRepository;
import _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.services.Interfaces.iUniversityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UniversityService implements iUniversityService {
    UniversityRepository universityRepository;
}
