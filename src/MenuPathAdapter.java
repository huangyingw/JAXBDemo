import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MenuPathAdapter extends XmlAdapter<AdaptedMenuPath, MenuPath> {

	@Override
	public AdaptedMenuPath marshal(MenuPath contactMethod) throws Exception {
		if (null == contactMethod) {
			return null;
		}
		AdaptedMenuPath adaptedContactMethod = new AdaptedMenuPath();
		MenuPath menuPath = (MenuPath) contactMethod;
		adaptedContactMethod.street = menuPath.street;
		adaptedContactMethod.city = menuPath.city;
		return adaptedContactMethod;
	}

	@Override
	public MenuPath unmarshal(AdaptedMenuPath adaptedContactMethod)
			throws Exception {
		if (null == adaptedContactMethod) {
			return null;
		} else {
			MenuPath menuPath = new MenuPath();
			menuPath.street = adaptedContactMethod.street;
			menuPath.city = adaptedContactMethod.city;
			return menuPath;
		}
	}

}
