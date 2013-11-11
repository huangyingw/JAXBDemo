import javax.xml.bind.annotation.adapters.XmlAdapter;

public class PageDefAdapter extends XmlAdapter<AdaptedPageDef, ContactMethod> {

	@Override
	public AdaptedPageDef marshal(ContactMethod contactMethod) throws Exception {
		if (null == contactMethod) {
			return null;
		}
		AdaptedPageDef adaptedPageDef = new AdaptedPageDef();
		if (contactMethod instanceof Address) {
			Address address = (Address) contactMethod;
			adaptedPageDef.cssFileName = address.street;
			adaptedPageDef.formPath = address.city;
		} else {
			PhoneNumber phoneNumber = (PhoneNumber) contactMethod;
			adaptedPageDef.path = phoneNumber.number;
		}
		return adaptedPageDef;
	}

	@Override
	public ContactMethod unmarshal(AdaptedPageDef adaptedContactMethod)
			throws Exception {
		if (null == adaptedContactMethod) {
			return null;
		}
		if (null != adaptedContactMethod.path) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.number = adaptedContactMethod.path;
			return phoneNumber;
		} else {
			Address address = new Address();
			address.street = adaptedContactMethod.cssFileName;
			address.city = adaptedContactMethod.formPath;
			return address;
		}
	}

}
