import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MenuPathAdapter extends XmlAdapter<AdaptedMenuPath, MenuPath> {

	@Override
	public AdaptedMenuPath marshal(MenuPath menuPath) throws Exception {
		if (null == menuPath) {
			return null;
		}
		AdaptedMenuPath adaptedMenuPath = new AdaptedMenuPath();
		adaptedMenuPath.hilight = menuPath.hilight;
		adaptedMenuPath.path = menuPath.path;
		return adaptedMenuPath;
	}

	@Override
	public MenuPath unmarshal(AdaptedMenuPath adaptedContactMethod)
			throws Exception {
		if (null == adaptedContactMethod) {
			return null;
		} else {
			MenuPath menuPath = new MenuPath();
			menuPath.hilight = adaptedContactMethod.hilight;
			menuPath.path = adaptedContactMethod.path;
			return menuPath;
		}
	}

}
