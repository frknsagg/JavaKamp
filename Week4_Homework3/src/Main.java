import java.time.LocalDate;

import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.MemberManager;
import Concrete.SaleManager;
import Entities.Game;
import Entities.Member;
import Entities.Campaign;



public class Main {

	public static void main(String[] args) {
		MemberManager memberManager=new MemberManager(new MernisServiceAdapter());
		memberManager.add(new Member(1,"Furkan","Sağ",LocalDate.of(1998, 11, 18),"1111111"));
		
		
		GameManager gameManager = new GameManager();
		gameManager.add(new Game(1,"CS-GO",1000));
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1, "", 15));
		
		SaleManager saleManager1 = new SaleManager();
		saleManager1.saleGame(new Game(1,"CS-GO",1000),new Member(1, "Furkan", "Sağ",LocalDate.of(1998,11,18), "1111111111"));
		
		

	}

}
