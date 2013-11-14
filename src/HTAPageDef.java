import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "pagedef")
@XmlAccessorType(XmlAccessType.FIELD)
public class HTAPageDef {

	@XmlElement(name = "menuPath")
	private List<MenuPath> contactMethods;

	public List<MenuPath> getContactMethods() {
		return contactMethods;
	}

}
