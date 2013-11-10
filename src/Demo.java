import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Demo {

	public static void main(String[] args) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(PageDef.class);

		Unmarshaller unmarshaller = jc.createUnmarshaller();
		File xml = new File("src/pageset.xml");
		PageDef pageDef = (PageDef) unmarshaller.unmarshal(xml);

		for (Javascript javascript : pageDef.getJavascripts()) {
			System.out.println(javascript.getClass());
		}

		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(pageDef, System.out);
	}

}
