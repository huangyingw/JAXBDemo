import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(MenuPathAdapter.class)
public class MenuPath {
	public String getHilight() {
		return hilight;
	}

	public void setHilight(String hilight) {
		this.hilight = hilight;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	protected String hilight;
	protected String path;
}