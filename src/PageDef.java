import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "pagedef")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlJavaTypeAdapter(PageDefAdapter.class)
public class PageDef {

	@XmlElement(name = "javascript")
	private List<Javascript> contactMethods;

	public List<Javascript> getContactMethods() {
		return contactMethods;
	}

}
