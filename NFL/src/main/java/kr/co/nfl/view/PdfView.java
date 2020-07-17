package kr.co.nfl.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfWriter;

import kr.co.nfl.quarterback.domain.Quarterback;

public class PdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(
			Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		//데이터 가져오기
		List<Quarterback> list = (List<Quarterback>)model.get("list");
		
		//테이블을 생성 - 앞의 숫자는 열의 수이고 뒤의 숫자는 행의 수
		Table table = new Table(3, list.size()+1);
		//패딩 설정
		table.setPadding(5);
		
		//폰트 생성 - 이 작업을 하지 않으면 한글 출력 안됨
		BaseFont bfKorean = BaseFont.createFont(request.getServletContext().getRealPath("/font") 
				+ "/malgun.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
		Font font = new Font(bfKorean);
		
		//셀을 생성 - 제목 셀을 생성해서 설정
		Cell cell = new Cell(new Paragraph("선수명", font));
		cell.setHeader(true);
		table.addCell(cell);
		
		cell = new Cell(new Paragraph("포지션명", font));
		cell.setHeader(true);
		table.addCell(cell);
		
		cell = new Cell(new Paragraph("팀명", font));
		cell.setHeader(true);
		table.addCell(cell);
		
		cell = new Cell(new Paragraph("패스거리", font));
		cell.setHeader(true);
		table.addCell(cell);
		
		cell = new Cell(new Paragraph("패스시도", font));
		cell.setHeader(true);
		table.addCell(cell);
		
		cell = new Cell(new Paragraph("패스성공", font));
		cell.setHeader(true);
		table.addCell(cell);
		
		cell = new Cell(new Paragraph("패스성공률", font));
		cell.setHeader(true);
		table.addCell(cell);
		
		cell = new Cell(new Paragraph("터치다운", font));
		cell.setHeader(true);
		table.addCell(cell);
		
		cell = new Cell(new Paragraph("인터셉트", font));
		cell.setHeader(true);
		table.addCell(cell);
		
		cell = new Cell(new Paragraph("rate", font));
		cell.setHeader(true);
		table.addCell(cell);
		
		cell = new Cell(new Paragraph("퍼스트다운", font));
		cell.setHeader(true);
		table.addCell(cell);
		
		cell = new Cell(new Paragraph("퍼스트다운성공률", font));
		cell.setHeader(true);
		table.addCell(cell);
		
		cell = new Cell(new Paragraph("20야드전진", font));
		cell.setHeader(true);
		table.addCell(cell);
		
		cell = new Cell(new Paragraph("40야드 전진", font));
		cell.setHeader(true);
		table.addCell(cell);
		
		cell = new Cell(new Paragraph("최장거리 패스", font));
		cell.setHeader(true);
		table.addCell(cell);
		
		cell = new Cell(new Paragraph("색", font));
		cell.setHeader(true);
		table.addCell(cell);
		
		table.endHeaders();
		
		//데이터 출력
		for(Quarterback quarterback : list) {
			Cell imsi = new Cell(new Paragraph(quarterback.getPlayer_id().toString(), font));
			table.addCell(imsi);
			
			imsi = new Cell(new Paragraph(quarterback.getPosition_name(), font));
			table.addCell(imsi);
			
			imsi = new Cell(new Paragraph(quarterback.getTeam_name(), font));
			table.addCell(imsi);
			
			imsi = new Cell(new Paragraph(quarterback.getPassyds().toString(), font));
			table.addCell(imsi);
			
			imsi = new Cell(new Paragraph(quarterback.getAtt().toString(), font));
			table.addCell(imsi);
			
			imsi = new Cell(new Paragraph(quarterback.getCmp().toString(), font));
			table.addCell(imsi);
			
			imsi = new Cell(new Paragraph(quarterback.getCmpper().toString(), font));
			table.addCell(imsi);
			
			imsi = new Cell(new Paragraph(quarterback.getTd().toString(), font));
			table.addCell(imsi);
			
			imsi = new Cell(new Paragraph(quarterback.getIntercept().toString(), font));
			table.addCell(imsi);
			
			imsi = new Cell(new Paragraph(quarterback.getFirstdown().toString(), font));
			table.addCell(imsi);
			
			imsi = new Cell(new Paragraph(quarterback.getFirstdownper().toString(), font));
			table.addCell(imsi);
			
			imsi = new Cell(new Paragraph(quarterback.getTwentyyardpasses().toString(), font));
			table.addCell(imsi);
			
			imsi = new Cell(new Paragraph(quarterback.getFourtyyardpasses().toString(), font));
			table.addCell(imsi);
			
			imsi = new Cell(new Paragraph(quarterback.getLongestpasses().toString(), font));
			table.addCell(imsi);
			
			imsi = new Cell(new Paragraph(quarterback.getSack().toString(), font));
			table.addCell(imsi);
		}
		//테이블을 문서에 추가
		document.add(table);

	}

}