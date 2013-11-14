import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(MenuPathAdapter.class)
public class MenuPath {
	protected String street;
	protected String city;
}