package _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.controllers;

import _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.entities.Bloc;
import _1alinfo2.ahmedaminekefi.foyer_ahmedamine_kefi.DOA.services.Interfaces.iBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
public class BlocController {
    iBlocService iBlocService;

    @GetMapping("getAll")
    public List<Bloc> getAll(){
        return iBlocService.findAllBlocs();
    }
    @PostMapping("addBloc")
    public Bloc addBloc(@RequestBody Bloc b){
        return iBlocService.addBloc(b);
    }
    //http://localhost:8081/getById?id=1
    @GetMapping("getById")
    public Bloc getById(@RequestParam long id ){
        return iBlocService.findBlocById(id);
    }

    //http://localhost:8081/getById/1

    @GetMapping("getById2/{id}")
    public Bloc getById2(@PathVariable long id ){
        return iBlocService.findBlocById(id);
    }
    @PostMapping("addAllBlocs")
    public List<Bloc> addBloc(@RequestBody List<Bloc> bs){
        return iBlocService.addAllBlocs(bs);
    }
}
