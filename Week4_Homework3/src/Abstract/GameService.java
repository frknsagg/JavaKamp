package Abstract;

import Entities.Game;

public interface GameService {
	public void add(Game game);
	public void delete(Game game);
	public void update(Game game);
	public void sell(Game game);

}
