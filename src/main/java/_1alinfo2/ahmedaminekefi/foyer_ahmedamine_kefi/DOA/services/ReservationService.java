package _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.services;

import _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.repositories.ReservationRepository;
import _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.services.Interfaces.iReservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReservationService implements iReservationService {
    ReservationRepository reservationRepository;
}
