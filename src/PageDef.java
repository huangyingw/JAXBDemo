import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "pagedef")
@XmlAccessorType(XmlAccessType.FIELD)
public class PageDef {

	@XmlElement(name = "javascript")
	private List<Javascript> contactMethods;

	public List<Javascript> getContactMethods() {
		return contactMethods;
	}

}
