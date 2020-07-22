package kr.co.nfl.quarterback.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
//출력할 속성과 순서를 설정
@XmlType(name = "", propOrder= {"player_name", "position_name", "team_name", "passyds", "att", 
		"cmp", "cmpper", "td", "intercept", "rate", "firstdown", "firstdownper", "twentyyardpasses", 
		"fourtyyardpasses", "longestpass", "sack"})
public class Quarterback {
	//숫자 데이터의 경우 null 이 될 가능성이 있는 경우는 Wrapper 클래스 사용
	private String player_name;
	private String position_name;
	private String team_name;
	private Integer passyds;
	private Integer att;
	private Integer cmp;
	private Double cmpper;
	private Integer td;
	private Integer intercept;
	private Double rate;
	private Integer firstdown;
	private Double firstdownper;
	private Integer twentyyardpasses;
	private Integer fourtyyardpasses;
	private Integer longestpass;
	private Integer sack;
	
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public String getPosition_name() {
		return position_name;
	}
	public void setPosition_name(String position_name) {
		this.position_name = position_name;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public Integer getPassyds() {
		return passyds;
	}
	public void setPassyds(Integer passyds) {
		this.passyds = passyds;
	}
	public Integer getAtt() {
		return att;
	}
	public void setAtt(Integer att) {
		this.att = att;
	}
	public Integer getCmp() {
		return cmp;
	}
	public void setCmp(Integer cmp) {
		this.cmp = cmp;
	}
	public Double getCmpper() {
		return cmpper;
	}
	public void setCmpper(Double cmpper) {
		this.cmpper = cmpper;
	}
	public Integer getTd() {
		return td;
	}
	public void setTd(Integer td) {
		this.td = td;
	}
	public Integer getIntercept() {
		return intercept;
	}
	public void setIntercept(Integer intercept) {
		this.intercept = intercept;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Integer getFirstdown() {
		return firstdown;
	}
	public void setFirstdown(Integer firstdown) {
		this.firstdown = firstdown;
	}
	public Double getFirstdownper() {
		return firstdownper;
	}
	public void setFirstdownper(Double firstdownper) {
		this.firstdownper = firstdownper;
	}
	public Integer getTwentyyardpasses() {
		return twentyyardpasses;
	}
	public void setTwentyyardpasses(Integer twentyyardpasses) {
		this.twentyyardpasses = twentyyardpasses;
	}
	public Integer getFourtyyardpasses() {
		return fourtyyardpasses;
	}
	public void setFourtyyardpasses(Integer fourtyyardpasses) {
		this.fourtyyardpasses = fourtyyardpasses;
	}
	public Integer getLongestpasses() {
		return longestpass;
	}
	public void setLongestpasses(Integer longestpass) {
		this.longestpass = longestpass;
	}
	public Integer getSack() {
		return sack;
	}
	public void setSack(Integer sack) {
		this.sack = sack;
	}
	@Override
	public String toString() {
		return "Quarterback [player_name=" + player_name + ", position_name=" + position_name + ", team_name=" + team_name
				+ ", passyds=" + passyds + ", att=" + att + ", cmp=" + cmp + ", cmpper=" + cmpper + ", td=" + td
				+ ", intercept=" + intercept + ", rate=" + rate + ", firstdown=" + firstdown + ", firstdownper="
				+ firstdownper + ", twentyyardpasses=" + twentyyardpasses + ", fourtyyardpasses=" + fourtyyardpasses
				+ ", longestpass=" + longestpass + ", sack=" + sack + "]";
	}
	
}
