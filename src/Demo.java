import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Demo {

	public static void main(String[] args) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(HTAPageDef.class);

		Unmarshaller unmarshaller = jc.createUnmarshaller();
		File xml = new File("src/input.xml");
		HTAPageDef hTAPageDef = (HTAPageDef) unmarshaller.unmarshal(xml);

		for (MenuPath menuPath : hTAPageDef.getMenuPaths()) {
			System.out.println(menuPath.getPath());
		}

		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(hTAPageDef, System.out);
	}

}
