package _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "universities")
public class University {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    Long idUniversity ;
    String nomUniversity;
    String adresse ;

    @OneToOne
    private Foyer foyer;

}
