package _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table (name = "foyers")
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idFoyer ;
    String nomFoyer;
    Long capaciteFoyer;

    @OneToOne
    private University university;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="entreprise")
    private Set<Bloc> blocs;

}
