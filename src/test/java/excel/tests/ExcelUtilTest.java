package excel.tests;

import com.excel.lib.util.Xls_Reader;

public class ExcelUtilTest {

	public static void main(String[] args) {

		
		Xls_Reader reader = new Xls_Reader("/Users/NaveenKhunteta/Documents/workspace/ExcelUtil/"
				+ "src/main/java/com/excel/lib/util/SampleExcel.xlsx");
		String data = reader.getCellData("login", "username", 3);
		System.out.println(reader.getCellData("login", 1, 3));
		System.out.println(data);
		
		//reader.setCellData("login", "status", 2, "pass");
		
		//reader.addSheet("Naveen2");
	//	reader.removeColumn("login", 2);
		
	}

}
