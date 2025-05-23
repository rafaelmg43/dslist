package controller;

import dto.GameDto;
import dto.GameListDto;
import dto.GameMinDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.GameListService;
import services.GameService;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;


        @GetMapping
        public List<GameListDto> findAll(){
            List<GameListDto> result = gameListService.findAll();
            return result;
        }

    @GetMapping(value = "/{listId/games}")
    public List<GameMinDto> findByList(@PathVariable Long listId){
        List<GameMinDto> result = gameService.findByList(listId);
        return result;
    }
}
