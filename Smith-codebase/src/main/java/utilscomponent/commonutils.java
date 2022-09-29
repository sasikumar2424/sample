package utilscomponent;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class commonutils {
	
	
	public static String getpropvalue(String key) {
		String value = null;
		try {
			Properties prop = new Properties();
			FileInputStream ip = new FileInputStream( System.getProperty("user.dir") + "//input.properties");
			prop.load(ip);
			value = prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	
	
	public static String getExceldata(String sheetname, int row, int col) throws Exception

	{
		String celldata = null;
		try {
			String FilePath = System.getProperty("user.dir") + "\\Datasheet\\input.xlsx";
			System.out.println(FilePath);
			FileInputStream fis = new FileInputStream(FilePath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetname);
			DataFormatter formatter = new DataFormatter();
			Cell cellformat = sh.getRow(row).getCell(col);
			celldata = formatter.formatCellValue(cellformat);
			System.out.println(celldata);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return celldata;

	}

}
