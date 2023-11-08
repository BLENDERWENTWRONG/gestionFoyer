package _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "blocs")
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idBloc ;
    String nomBloc;
    Long capaciteBloc;
}
