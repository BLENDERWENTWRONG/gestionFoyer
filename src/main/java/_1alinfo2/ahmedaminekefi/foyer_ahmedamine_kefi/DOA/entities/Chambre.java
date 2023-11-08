package _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.entities;


import _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.enums.TypeChambre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "blocs")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idChambre;
    Long numeroChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre typeChambre;
}
