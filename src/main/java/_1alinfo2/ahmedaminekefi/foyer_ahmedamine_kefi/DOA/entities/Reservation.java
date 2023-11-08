package _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reservations")
public class Reservation {

    @Id
    Long idReservation ;
    LocalDate anneeUniversitaire;
    Boolean estValide;
}
