package _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "reservations")
public class Reservation {

    @Id
    String idReservation ;
    LocalDate anneeUniversitaire;
    Boolean estValide;


    @ManyToMany(mappedBy="reservations",cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}
