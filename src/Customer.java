import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {

	@XmlElement(name = "menuPath")
	private List<MenuPath> menuPaths;

	public List<MenuPath> getMenuPaths() {
		return menuPaths;
	}

}
