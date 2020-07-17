package kr.co.nfl.quarterback.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
//전체 태그를 설정
@XmlRootElement(name="QUARTERBACKLIST")
public class QuarterbackReport {
	//DTO 1개만 출력될 태그 설정
	@XmlElement(name="QUARTERBACK")
	private List<Quarterback> list;

	public List<Quarterback> getList() {
		return list;
	}

	public void setList(List<Quarterback> list) {
		this.list = list;
	}
}
