package kr.co.nfl.quarterback.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.co.nfl.quarterback.domain.Quarterback;

public interface QuarterbackMapper {
	@Select("select player_id, position_name, team_name, passyds, att, cmp, cmpper, td, "
			+ "intercept, rate, firstdown, firstdownper, twentyyardpasses, fourtyyardpasses, " 
			+ "longestpass, sack "
			+ " from player_quarterback")
	public List<Quarterback> allquarterback();

	@Select("select player_id, position_name, team_name, passyds, att, cmp, cmpper, td, "
			+ "intercept, rate, firstdown, firstdownper, twentyyardpasses, fourtyyardpasses, " 
			+ "longestpass, sack "
			+ " from player_quarterback where player_id = #{player_id}")
	public Quarterback detailquarterback(Integer player_id);

}
