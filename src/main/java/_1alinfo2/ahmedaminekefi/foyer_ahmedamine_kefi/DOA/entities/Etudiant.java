package _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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


}
