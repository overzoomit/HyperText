import org.apache.poi.openxml4j.exceptions.ODFNotOfficeXmlFileException;
import org.junit.Test;

import com.stasbranger.hypertext.service.HyperODSService;
import com.stasbranger.hypertext.service.HyperXLSService;


public class HyperTextTest {

	private static final String SAMPLE_XLS_FILE_PATH = "/home/flavio/workspace/HyperText/src/main/resources/import/delibere_giuntacomunale_2017.xls";
	private static final String SAMPLE_XLS2_FILE_PATH = "/home/flavio/workspace/HyperText/src/main/resources/file2.xls";
	private static final String SAMPLE_PDF2XLSX_FILE_PATH = "/home/flavio/workspace/HyperText/src/main/resources/file-pdf.xlsx";
	private static final String SAMPLE_ODS_FILE_PATH = "/home/flavio/workspace/HyperText/src/main/resources/file.ods";	

	@Test
	public void testXLS() throws Exception {

		HyperXLSService hs = new HyperXLSService();
		hs.processXLSDelibereCC(SAMPLE_XLS_FILE_PATH);
	}

	@Test
	public void testXLS2() throws Exception {

		HyperXLSService hs = new HyperXLSService();
		hs.processXLSDelibereCC(SAMPLE_XLS2_FILE_PATH);
	}
	
	@Test
	public void testPDF2XLSX() throws Exception {

		HyperXLSService hs = new HyperXLSService();
		hs.processXLSDelibereCC(SAMPLE_PDF2XLSX_FILE_PATH);
	}

	@Test
	public void testODS() throws Exception {

		try{
			HyperXLSService hs = new HyperXLSService();
			hs.processXLSDelibereCC(SAMPLE_ODS_FILE_PATH);
		}catch(ODFNotOfficeXmlFileException e){
			HyperODSService hs = new HyperODSService();
			hs.processODS(SAMPLE_ODS_FILE_PATH);
		}
	}
}
