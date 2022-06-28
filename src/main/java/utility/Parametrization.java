package utility;


	import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

    import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class Parametrization {
		public static String getData(int row,int cell) throws EncryptedDocumentException, IOException 
		{


                FileInputStream file = new FileInputStream("C:\\Users\\resea\\Desktop\\Zerodha\\ZerodhauserCRED.xlsx");
				String str = WorkbookFactory.create(file).getSheet("credentials").getRow(row).getCell(cell).getStringCellValue();
				return str;
		}
		}

