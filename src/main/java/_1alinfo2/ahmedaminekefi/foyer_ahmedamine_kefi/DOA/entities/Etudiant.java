package _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Set;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "etudiants")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEtudiant ;
    String nomEt;
    String prenomEt;
    Long cin ;
    String ecole ;
    LocalDate dateNaissance ;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;


}
