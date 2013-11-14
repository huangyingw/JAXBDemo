import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {

	@XmlElement(name = "menuPath")
	private List<MenuPath> contactMethods;

	public List<MenuPath> getContactMethods() {
		return contactMethods;
	}

}
