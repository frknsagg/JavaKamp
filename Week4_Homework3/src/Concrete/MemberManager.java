package Concrete;

import Abstract.GameService;
import Abstract.MemberService;
import Adapter.MernisServiceAdapter;
import Entities.Game;
import Entities.Member;

public class MemberManager implements MemberService {

	public MemberManager(MernisServiceAdapter mernisServiceAdapter) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Member member) {
		System.out.println(member.getId()+" numaral� �ye eklendi");
		
	}

	@Override
	public void delete(Member member) {
		System.out.println(member.getId()+" numaral� �ye silindi");
		
	}

	@Override
	public void update(Member member) {
		System.out.println(member.getId()+" numaral� �yenin bilgileri g�ncellendi");
		
	}

	

}
