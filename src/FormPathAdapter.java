import javax.xml.bind.annotation.adapters.XmlAdapter;

public class FormPathAdapter extends XmlAdapter<String, FormPath> {

	@Override
	public String marshal(FormPath formPath) throws Exception {
		return formPath.toString();
	}

	@Override
	public FormPath unmarshal(String formPathStr) throws Exception {

		return new FormPath(formPathStr);
	}

}
