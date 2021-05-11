package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " oyun eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " oyun silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " oyun güncellendi");
		
	}

	@Override
	public void sell(Game game) {
		System.out.println(game.getGameName() + " oyun satýldý");
		
	}

}
