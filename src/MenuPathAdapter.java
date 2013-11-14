import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MenuPathAdapter extends XmlAdapter<AdaptedContactMethod, MenuPath> {

	@Override
	public AdaptedContactMethod marshal(MenuPath menuPath) throws Exception {
		if (null == menuPath) {
			return null;
		}
		AdaptedContactMethod adaptedMenuPath = new AdaptedContactMethod();
		MenuPath address = (MenuPath) menuPath;
		adaptedMenuPath.street = address.street;
		adaptedMenuPath.city = address.city;
		return adaptedMenuPath;
	}

	@Override
	public MenuPath unmarshal(AdaptedContactMethod adaptedContactMethod)
			throws Exception {
		if (null == adaptedContactMethod) {
			return null;
		} else {
			MenuPath address = new MenuPath();
			address.street = adaptedContactMethod.street;
			address.city = adaptedContactMethod.city;
			return address;
		}
	}

}
