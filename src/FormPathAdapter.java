import javax.xml.bind.annotation.adapters.XmlAdapter;

public class FormPathAdapter extends XmlAdapter<String, FormPath> {

	@Override
	public String marshal(FormPath contactMethod) throws Exception {
		return contactMethod.toString();
	}

	@Override
	public FormPath unmarshal(String adaptedContactMethod) throws Exception {

		return new FormPath(adaptedContactMethod);
	}

}
