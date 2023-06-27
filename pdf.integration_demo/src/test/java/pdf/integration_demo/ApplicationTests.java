package pdf.integration_demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import pdf.integration_demo.utility.Excel_Reader;
import pdf.integration_demo.utility.pdf_generator;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
		
		
		
		Excel_Reader read = new Excel_Reader();
		read.readExcel();
	}

}
