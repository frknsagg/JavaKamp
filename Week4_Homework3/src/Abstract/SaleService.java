package Abstract;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public interface SaleService {
	public void saleGame(Game game,Member member);
	public void saleGameWithCampaign(Game game,Member member,Campaign campaign);

}
