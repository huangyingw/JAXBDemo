import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "pagedef")
@XmlAccessorType(XmlAccessType.FIELD)
public class PageDef {

	@XmlAttribute
	public String path;

	@XmlAttribute
	public String cssFileName;

	@XmlAttribute
	@XmlJavaTypeAdapter(FormPathAdapter.class)
	public FormPath formPath;

	public FormPath getFormPath() {
		return formPath;
	}

	public void setFormPath(FormPath formPath) {
		this.formPath = formPath;
	}

	@XmlElement(name = "javascript")
	private List<Javascript> javascripts;

	public List<Javascript> getJavascripts() {
		return javascripts;
	}

}
