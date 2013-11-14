import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MenuPathAdapter extends XmlAdapter<AdaptedMenuPath, MenuPath> {

	@Override
	public AdaptedMenuPath marshal(MenuPath contactMethod) throws Exception {
		if (null == contactMethod) {
			return null;
		}
		AdaptedMenuPath adaptedContactMethod = new AdaptedMenuPath();
		MenuPath address = (MenuPath) contactMethod;
		adaptedContactMethod.street = address.street;
		adaptedContactMethod.city = address.city;
		return adaptedContactMethod;
	}

	@Override
	public MenuPath unmarshal(AdaptedMenuPath adaptedContactMethod)
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
