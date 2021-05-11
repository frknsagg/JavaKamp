package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public class SaleManager implements SaleService {

	@Override
	public void saleGame(Game game, Member member) {
		System.out.println(member.getFirstName() +" adl� oyuncu" + game.getGameName() + " adl� oyunu sat�n ald�.");
		
	}

	@Override
	public void saleGameWithCampaign(Game game, Member member, Campaign campaign) {
		System.out.println(member.getFirstName() +" adl� oyuncu" + game.getGameName() + " adl� oyunu " +campaign.getCampaignName() +" kampanyas�n� sat�n ald�.");
		
	}

}
