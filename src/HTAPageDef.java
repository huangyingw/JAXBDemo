import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "pagedef")
@XmlAccessorType(XmlAccessType.FIELD)
public class HTAPageDef {

	@XmlElement(name = "menuPath")
	private List<MenuPath> menuPaths;

	public List<MenuPath> getMenuPaths() {
		return menuPaths;
	}

}
