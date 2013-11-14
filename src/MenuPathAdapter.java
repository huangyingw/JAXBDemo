import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MenuPathAdapter extends XmlAdapter<AdaptedContactMethod, MenuPath> {

	@Override
	public AdaptedContactMethod marshal(MenuPath contactMethod)
			throws Exception {
		if (null == contactMethod) {
			return null;
		}
		AdaptedContactMethod adaptedContactMethod = new AdaptedContactMethod();
		if (contactMethod instanceof MenuPath) {
			MenuPath address = (MenuPath) contactMethod;
			adaptedContactMethod.street = address.street;
			adaptedContactMethod.city = address.city;
		}
		return adaptedContactMethod;
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
