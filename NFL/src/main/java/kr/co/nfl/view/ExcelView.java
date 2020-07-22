package kr.co.nfl.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import kr.co.nfl.quarterback.domain.Quarterback;

public class ExcelView extends AbstractXlsView {

	//workbook은 출력할 엑셀 파일
	@Override
	protected void buildExcelDocument(
			Map<String, Object> model, 
			Workbook workbook, 
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//출력할 데이터 가져오기
		List<Quarterback> list = (List<Quarterback>)model.get("list");
		//시트를 생성
		Sheet sheet = workbook.createSheet("QUARTERBACK");
		
		//열 너비 설정
		sheet.setColumnWidth(1, 256*20);
		sheet.setColumnWidth(2, 256*40);
		sheet.setColumnWidth(3, 256*20);
		
		//제목 셀 생성
		
		//0번 행 생성
		Row firstRow = sheet.createRow(0);
		
		//셀 생성 - 일단 3개만해보고
		Cell cell = firstRow.createCell(0);
		cell.setCellValue("선수");
		
		cell = firstRow.createCell(1);
		cell.setCellValue("포지션");
		
		cell = firstRow.createCell(2);
		cell.setCellValue("팀");
		
		//데이터 출력
		
		//행번호를 저장할 변수
		int rowNum = 1;
		for(Quarterback quarterback : list) {
			//행을 생성
			Row row = sheet.createRow(rowNum++);
			//셀을 생성해서 출력
			Cell c = row.createCell(0);
			c.setCellValue(quarterback.getPlayer_name());
			
			c = row.createCell(1);
			c.setCellValue(quarterback.getPosition_name());
			
			c = row.createCell(2);
			c.setCellValue(quarterback.getTeam_name());
		}
		
	}

}