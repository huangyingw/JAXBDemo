import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MenuPathAdapter extends XmlAdapter<AdaptedMenuPath, MenuPath> {

	@Override
	public AdaptedMenuPath marshal(MenuPath contactMethod) throws Exception {
		if (null == contactMethod) {
			return null;
		}
		AdaptedMenuPath adaptedContactMethod = new AdaptedMenuPath();
		MenuPath menuPath = (MenuPath) contactMethod;
		adaptedContactMethod.hilight = menuPath.hilight;
		adaptedContactMethod.path = menuPath.path;
		return adaptedContactMethod;
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
